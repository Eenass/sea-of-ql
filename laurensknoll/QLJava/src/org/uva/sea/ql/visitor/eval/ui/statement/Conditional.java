package org.uva.sea.ql.visitor.eval.ui.statement;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.uva.sea.ql.ast.expr.AbstractExpr;
import org.uva.sea.ql.ast.expr.atom.Ident;
import org.uva.sea.ql.visitor.IExpression;
import org.uva.sea.ql.visitor.eval.Environment;
import org.uva.sea.ql.visitor.eval.Expression;
import org.uva.sea.ql.visitor.eval.ui.expr.Dependency;
import org.uva.sea.ql.visitor.eval.ui.expr.DependencySet;
import org.uva.sea.ql.visitor.eval.value.AbstractValue;
import org.uva.sea.ql.visitor.eval.value.Bool;

public class Conditional extends Panel implements Observer {

	private static final long serialVersionUID = -439191048556369910L;
	private final AbstractExpr expression;
	private final Panel truePanel;

	public Conditional(Environment environment, AbstractExpr expr,
			Panel truePanel) {
		super(environment);
		this.add(truePanel);

		this.expression = expr;
		this.truePanel = truePanel;

		// Observe identifiers in expression
		this.observeDependencies();

		// Initially the condition is evaluated as false.
		this.truePanel.setVisible(false);
	}

	@Override
	public void update(Observable o, Object arg) {
		IExpression<AbstractValue> evaluator = new Expression(
				this.getEnvironment());
		Bool result = (Bool) this.expression.accept(evaluator);

		this.truePanel.setVisible(result.getValue());

		JFrame window = (JFrame) SwingUtilities.getRoot(this.truePanel);
		window.pack();
	}

	private void observeDependencies() {
		IExpression<DependencySet> dependencyVisitor = new Dependency();
		DependencySet dependencies = this.expression.accept(dependencyVisitor);

		for (Ident ident : dependencies.getDependencies()) {
			this.getEnvironment().addObserver(ident, this);
		}
	}

}
