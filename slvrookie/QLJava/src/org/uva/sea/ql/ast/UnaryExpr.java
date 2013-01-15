package org.uva.sea.ql.ast;

public abstract class UnaryExpr extends Expr {

	private final Expr arg;

	protected UnaryExpr(Expr arg) {
		this.arg = arg;
	}
	public Expr getArg() {
		return arg;
	}

}
