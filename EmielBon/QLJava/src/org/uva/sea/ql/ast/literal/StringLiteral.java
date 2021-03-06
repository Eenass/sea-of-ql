package org.uva.sea.ql.ast.literal;

import org.uva.sea.ql.ast.ExpressionVisitor;
import org.uva.sea.ql.ast.type.Str;
import org.uva.sea.ql.ast.type.Type;
import org.uva.sea.ql.typechecker.TypeEnvironment;

/**
 * A class representing all possible string (i.e. textual) literals
 */
public class StringLiteral extends Literal<String> {

	public StringLiteral(String s) {
		super(s);
	}
	
	public Type typeOf(TypeEnvironment env) {
		return new Str();
	}
	
	public <T> T accept(ExpressionVisitor<T> visitor) {
		return visitor.visit(this);
	}
	
}
