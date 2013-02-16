package org.uva.sea.ql.ast.expressions;

public class Str extends Expr {
	private final String value;

	public Str(String n) {
		this.value = n;
	}

	public String getValue() {
		return value;
	}
}
