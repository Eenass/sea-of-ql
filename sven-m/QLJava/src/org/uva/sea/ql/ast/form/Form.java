package org.uva.sea.ql.ast.form;

import org.uva.sea.ql.ast.ASTNode;

public class Form implements ASTNode {
	private final String name;
	private final Body body;
	
	public Form(String name, Body body) {
		this.name = name;
		this.body = body;
	}
	
	public String getName() {
		return name;
	}
	
	public Body getBody() {
		return body;
	}
	
}
