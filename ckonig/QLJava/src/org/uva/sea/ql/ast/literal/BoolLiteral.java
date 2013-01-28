package org.uva.sea.ql.ast.literal;

import org.uva.sea.ql.ast.Expr;

public class BoolLiteral extends Expr{
	private boolean value;
	public BoolLiteral(Boolean b) {
		this.value = b;
	}
	public boolean getValue(){
		return value;
	}
}