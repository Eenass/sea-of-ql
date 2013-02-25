package org.uva.sea.ql.ast.expressions.unary;

import org.uva.sea.ql.ast.expressions.Expression;
import org.uva.sea.ql.ast.types.Type;
import org.uva.sea.ql.ast.visitors.typechecker.Visitor;
import org.uva.sea.ql.parser.TypeEnvironment;

public class NegationalExpression extends UnaryExpression {
	public NegationalExpression(Expression expression) {
		super(expression);
	}
	
	@Override
	public Type typeOf(TypeEnvironment typeEnvironment) {
		return new org.uva.sea.ql.ast.types.Bool();
	}
	
	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}
}