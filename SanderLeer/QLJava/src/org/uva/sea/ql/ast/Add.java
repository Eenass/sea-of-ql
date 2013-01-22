package org.uva.sea.ql.ast;

public class Add extends BinaryExpression {
	public Add(Expression lhs, Expression rhs) {
		super(lhs, rhs);
	}

	@Override
	public void accept(ASTNodeVisitor visitor) {
		visitor.visit(this);
	}
}