package org.uva.sea.ql.ast.expression;


/**
 * Represents a greater-than expression.
 */
public class GT extends ComparisonExpression {
	/**
	 * Constructs a new greater-than expression.
	 *
	 * @param lhs The left-hand side.
	 * @param rhs The right-hand side.
	 */
	public GT( Expression lhs, Expression rhs ) {
		super( lhs, rhs );
	}
}
