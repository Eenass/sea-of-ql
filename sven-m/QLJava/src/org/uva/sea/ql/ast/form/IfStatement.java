package org.uva.sea.ql.ast.form;

import org.uva.sea.ql.ast.expression.Expr;

public class IfStatement extends FormElement {
	private final Expr condition;
	private final Body body;
	
	public IfStatement(Expr condition, Body body) {
		this.condition = condition;
		this.body = body;
	}
	
	public Expr getCondition() {
		return condition;
	}
	
	public Body getBody() {
		return body;
	}
	
}
