package org.uva.sea.ql.ast.expression;


public class Or extends BinaryExpression {
	
	public Or(final Expression lhs, final Expression rhs){
		super(lhs, rhs);
	}
	
	public <T> T accept(final ExpressionVisitor<T> v){
		return v.visit(this);
	}
	
}
