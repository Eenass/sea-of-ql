package org.uva.sea.ql.ast;

import org.uva.sea.ql.ASTNodeVisitor;

public class Question extends FormElement {

	private final String question;
	private final Declaration declaration;
	
	public Question(String question, Declaration declaration) {
		this.question = question;
		this.declaration = declaration;
	}
	
	public String getQuestion() { return question; }
	public Declaration getDeclaration() { return declaration; }

	@Override
	public <ReturnType, ParameterType> ReturnType accept(ASTNodeVisitor<ReturnType, ParameterType> visitor, ParameterType param) {
		return visitor.visit(this, param);
	}
}