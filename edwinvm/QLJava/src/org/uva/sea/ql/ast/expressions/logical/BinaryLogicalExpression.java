package org.uva.sea.ql.ast.expressions.logical;

import org.uva.sea.ql.ast.expressions.BinaryExpression;
import org.uva.sea.ql.ast.expressions.Expression;
import org.uva.sea.ql.ast.types.Bool;
import org.uva.sea.ql.ast.types.Type;
import org.uva.sea.ql.check.TypeEnvironment;

public abstract class BinaryLogicalExpression extends BinaryExpression {
	protected BinaryLogicalExpression(Expression leftHandSide, Expression rightHandSide) {
		super(leftHandSide, rightHandSide);
	}
	
	@Override
	public Type typeOf(TypeEnvironment typeEnvironment) {
		return new Bool();
	}
}