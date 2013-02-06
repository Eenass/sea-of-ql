package org.uva.sea.ql.ast.form;

public class AbstractIfThenElse extends FormElement {
	private Body body;
	
	public AbstractIfThenElse(Body body) {
		this.body = body;
	}
	
	public Body getBody() {
		return body;
	}
	
}
