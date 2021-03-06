package org.uva.sea.ql.ast.literal;

import org.uva.sea.ql.ast.ExpressionVisitor;
import org.uva.sea.ql.ast.type.Int;
import org.uva.sea.ql.ast.type.Type;
import org.uva.sea.ql.typechecker.TypeEnvironment;

/**
 * A class representing all possible integer literals
 */
public class IntegerLiteral extends Literal<Integer> {

	public IntegerLiteral(int n) {
		super(n);
	}

	public Type typeOf(TypeEnvironment typeEnv) {
		return new Int();
	}
	
	public <T> T accept(ExpressionVisitor<T> visitor) {
		return visitor.visit(this);
	}
	
}
