package org.uva.sea.ql.ast.expression;

public class Positive extends UnaryExpression {

	public Positive(Expression expression) {
		super(expression);
	}

	@Override
	public <ReturnType, ParameterType> ReturnType accept(ExpressionVisitor<ReturnType, ParameterType> visitor, ParameterType param) {
		return visitor.visit(this, param);
	}
}