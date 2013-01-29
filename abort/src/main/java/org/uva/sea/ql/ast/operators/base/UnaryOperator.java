package org.uva.sea.ql.ast.operators.base;

import org.uva.sea.ql.ast.base.Expression;

/**
 * Unary Operator base class for unary operators in the QL language.
 * 
 * @author J. Dijkstra
 */
public abstract class UnaryOperator extends Operator {
	/**
	 * The expression or operation that the unary operator affects.
	 */
	private final Expression expression;

	/**
	 * Constructor.
	 * 
	 * @param expression
	 *            the expression or operation that the unary operator affects.
	 */
	protected UnaryOperator(final Expression expression) {
		this.expression = expression;
	}

	/**
	 * Retrieve the expression or operation the unary operator affects.
	 * 
	 * @return expression/operation
	 */
	public Expression getExpression() {
		return expression;
	}
}
