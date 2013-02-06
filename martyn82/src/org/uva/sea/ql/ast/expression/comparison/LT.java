package org.uva.sea.ql.ast.expression.comparison;

import org.uva.sea.ql.ast.expression.ComparisonExpression;
import org.uva.sea.ql.ast.expression.Expression;
import org.uva.sea.ql.visitor.IExpressionVisitor;

/**
 * Represents a less-than expression.
 */
public class LT extends ComparisonExpression {
	/**
	 * Constructs a new lesser-than expression.
	 *
	 * @param lhs The left-hand side.
	 * @param rhs The right-hand side.
	 */
	public LT( Expression lhs, Expression rhs ) {
		super( lhs, rhs );
	}

	@Override
	public <T> T accept( IExpressionVisitor<T> visitor ) {
		return visitor.visit( this );
	}
}