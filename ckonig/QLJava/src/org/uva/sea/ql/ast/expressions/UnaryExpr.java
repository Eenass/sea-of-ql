package org.uva.sea.ql.ast.expressions;

public class UnaryExpr extends Expr {
	private Expr adjacent;

	public UnaryExpr(Expr ex) {
		this.adjacent = ex;
	}

	public final Expr getAdjacent() {
		return this.adjacent;
	}
}