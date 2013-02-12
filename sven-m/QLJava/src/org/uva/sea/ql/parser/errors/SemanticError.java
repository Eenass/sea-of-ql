package org.uva.sea.ql.parser.errors;

import org.uva.sea.ql.ast.form.FormElement;

public abstract class SemanticError {
	private final FormElement formElement;
	private final String message;
	
	public SemanticError(String message, FormElement formElement) {
		this.formElement = formElement;
		this.message = message;
	}
	
	public FormElement getFormElement() {
		return formElement;
	}
	
	public String getMessage() {
		return message;
	}
}