package org.uva.sea.ql.ast.expression.value;

import org.uva.sea.ql.ast.expression.Literal;
import org.uva.sea.ql.visitor.Visitor;

/**
 * Represents a string literal expression.
 */
public class Str extends Literal {
	/**
	 * Holds the value of the literal.
	 */
	private final String value;
	
	/**
	 * Constructs a new String literal.
	 * 
	 * @param value
	 */
	public Str( String value ) {
		this.value = value;
	}
	
	/**
	 * Retrieves the value of the literal.
	 * 
	 * @return The value.
	 */
	public String getValue() {
		return this.value;
	}

	@Override
	public String toString() {
		return this.value;
	}

	@Override
	public void accept( Visitor visitor ) {
		visitor.visit( this );
	}
}
