package org.uva.sea.ql.ast.form;

import org.uva.sea.ql.ast.Ident;
import org.uva.sea.ql.ast.literals.StrLiteral;
import org.uva.sea.ql.ast.types.Type;
import org.uva.sea.ql.visitor.Visitor;

/**
 * class: Question
 * @author Danny
 *
 */
public class Question extends FormElement {
	
	private final Ident identifier;
	private final StrLiteral question;
	
	/**
	 * Constructor
	 * @param id 	- Identifier
	 * @param q 	- Question
	 */
	public Question(Ident id, StrLiteral q, Type type) {
		super(type);
		this.identifier = id;
		this.question = q;

	}
	/**
	 * getIdentifier
	 * @return identifier
	 */
	public Ident getIdentifier(){
		return this.identifier;
	}
	/**
	 * getQuestion()
	 * @return question
	 */
	public StrLiteral getQuestion(){
		return this.question;
	}
	/**
	 * getDescription
	 * @return question.getValue();
	 */
	public String getDescription(){
		return this.question.getValue();
	}
	/**
	 * accept()
	 * @param visitor
	 * @return type
	 */
	@Override
	public <T> T accept(Visitor<T> visitor){
		return visitor.visit(this);
	}
}
