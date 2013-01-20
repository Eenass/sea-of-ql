package org.uva.sea.ql.ast.statement;

import org.uva.sea.ql.ast.expr.AbstractExpr;

public class IfStatement extends AbstractStatement {

	private final AbstractExpr condition;
	private final AbstractStatement truePath;

	public IfStatement(AbstractExpr condition, AbstractStatement truePath) {
		this.condition = condition;
		this.truePath = truePath;
	}

	public AbstractStatement getTruePath() {
		return this.truePath;
	}

	public AbstractExpr getCondition() {
		return this.condition;
	}
}
