package org.uva.sea.ql.ast;

public class Pos extends UnaryExpression {
	public Pos(Expression operand) {
		super(operand);
	}

	@Override
	public void accept(ASTNodeVisitor visitor) {
		visitor.visit(this);
	}
}