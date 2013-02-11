package org.uva.sea.ql.ast.expression;

public abstract class Binary extends Expr {
	private final Expr lhs;
	private final Expr rhs;

	public Binary(Expr lhs, Expr rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}

	public Expr getLhs() {
		return lhs;
	}

	public Expr getRhs() {
		return rhs;
	}

}
