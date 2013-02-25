package org.uva.sea.ql.gui.dependencies;

import java.util.Observable;
import java.util.Observer;

import org.uva.sea.ql.ast.form.Computed;
import org.uva.sea.ql.gui.InputSource;
import org.uva.sea.ql.gui.InputSourceDelegate;
import org.uva.sea.ql.gui.State;
import org.uva.sea.ql.gui.control.display.DisplayControl;
import org.uva.sea.ql.parser.evaluator.ExpressionEvaluator;
import org.uva.sea.ql.parser.evaluator.result.Value;

public class ComputedObserver implements Observer, InputSource {
	private final Computed question;
	private final DisplayControl control;
	private final State state;
	private Value value;
	private InputSourceDelegate delegate;
	
	
	public ComputedObserver(Computed question, DisplayControl control,
			State state)
	{
		this.question = question;
		this.control = control;
		this.state = state;
	}

	private State getState() {
		return state;
	}

	@Override
	public void update(Observable o, Object arg) {
		/* (Re-)Evaluate expression */
		ExpressionEvaluator eval =
				new ExpressionEvaluator(getState().getSymbolTable());
		
		value = question.getExpression().accept(eval);
		
		/* signal delegate that value has changed */
		signalDelegate();
		
		/* update UI */
		control.setValue(value);
	}

	private void signalDelegate() {
		if (getDelegate() != null) {
			delegate.valueChanged(this);
		}
	}

	@Override
	public Value getValue() {
		return value;
	}

	@Override
	public void setDelegate(InputSourceDelegate delegate) {
		this.delegate = delegate;
	}

	@Override
	public InputSourceDelegate getDelegate() {
		return delegate;
	}

}