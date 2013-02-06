package org.uva.sea.ql.ast.form;

import java.util.List;

import org.uva.sea.ql.ast.ASTNode;

public class Body implements ASTNode {
	private final List<FormElement> formElements;
	
	public Body(List<FormElement> formElements) {
		this.formElements = formElements;
	}
	
	public List<FormElement> getElements() {
		return formElements;
	}
	
}
