package org.uva.sea.ql.ast.statements.conditions;

import org.uva.sea.ql.ast.expressions.Expression;
import org.uva.sea.ql.ast.statements.StatementBody;
import org.uva.sea.ql.ast.visitors.statementchecker.Visitor;

public class IfThenStatement extends ConditionBlock {
	public IfThenStatement(Expression condition, StatementBody body) {
		super(condition, body);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}