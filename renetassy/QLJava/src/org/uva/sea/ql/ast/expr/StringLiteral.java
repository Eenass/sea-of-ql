package org.uva.sea.ql.ast.expr;


public class StringLiteral extends Expr {
	
	private final String value;
	
	public StringLiteral(String value) {
		this.value=value;
	}
	
	public String getValue() {
		return value;
	}

}
