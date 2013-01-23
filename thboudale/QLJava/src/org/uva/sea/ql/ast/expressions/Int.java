package org.uva.sea.ql.ast.expressions;

public class Int extends Expr {
	private final int value;

	public Int(int n) {
		this.value = n;
	}

	public int getValue() {
		return value;
	}
}