package org.uva.sea.ql.ast.expression;

public abstract class Unary extends Expr {
	private final Expr op;

	public Unary(Expr op) {
		this.op = op;
	}

	public Expr getOp() {
		return op;
	}
	
}