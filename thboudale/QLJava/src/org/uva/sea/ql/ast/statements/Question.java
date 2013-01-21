package org.uva.sea.ql.ast.statements;

import org.uva.sea.ql.ast.expressions.Ident;

public class Question extends Statement {
	private final Ident ident;
	private final String strLit;
	private final String type;

	public Question(Ident ident, String strLit, String type) {
		this.ident = ident;
		this.strLit = strLit;
		this.type = type;
	}
	
	public Ident getIdentifier() {
		return ident;
	}
	
	public String getStrLit() {
		return strLit;
	}
	
	public String getType() {
		return type;
	}
}