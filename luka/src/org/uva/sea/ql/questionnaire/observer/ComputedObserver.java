package org.uva.sea.ql.questionnaire.observer;

import java.util.Observable;

import org.uva.sea.ql.ast.nodes.values.Value;
import org.uva.sea.ql.ast.stat.ComputedStat;
import org.uva.sea.ql.questionnaire.State;
import org.uva.sea.ql.questionnaire.check.Evaluator;
import org.uva.sea.ql.questionnaire.ui.swing.control.AbstractControl;

public class ComputedObserver extends StatementObserver {

	private final AbstractControl control;
	private final State state;
	private final ComputedStat stat;

	//observer which has computed statement and type specific control
	public ComputedObserver(AbstractControl ctl, State state, ComputedStat stat) {
		super(state, stat.getExpr());
		this.control = ctl;
		this.state = state;
		this.stat = stat;
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		Value value = stat.getExpr().accept(new Evaluator(state.getEnv()));
		if (value.isDefined()) {
			if (this.stat.getType().isCompatibleToNumeric()) {
				value = this.stat.getType().getNumberOfType(
						(Number) value.getValue());
			}
			this.control.setValue(value);
		}
	}
}
