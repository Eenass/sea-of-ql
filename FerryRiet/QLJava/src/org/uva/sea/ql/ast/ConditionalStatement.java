package org.uva.sea.ql.ast;

import org.uva.sea.ql.ast.nodevisitor.Visitor;
import org.uva.sea.ql.ast.nodevisitor.VisitorResult;

public class ConditionalStatement extends Statement {

	private final Expr expression;
	private final Statement trueCompound;
	private final Statement falseCompound;

	public ConditionalStatement(Expr expr, Statement ctrue, Statement cfalse) {
		expression = expr;
		trueCompound = ctrue;
		falseCompound = cfalse;
	}

	public Expr getExpression() {
		return expression;
	}

	public Statement getFalseCompound() {
		return falseCompound;
	}

	public Statement getTrueCompound() {
		return trueCompound;
	}

	@Override
	public VisitorResult accept(Visitor visitor) {
		return visitor.visit(this);
	}
}
