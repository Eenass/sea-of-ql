package org.uva.sea.ql.ast;

public class LEq extends ExprBinary {
	public LEq(Expr lhs, Expr rhs) {
		super(lhs, rhs);
	}

	@Override
	public void accept(ASTNodeVisitor visitor) {
		visitor.visit(this);
	}
}