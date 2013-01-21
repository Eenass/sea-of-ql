package org.uva.sea.ql.visitor;

import org.uva.sea.ql.ast.expression.ArithmeticExpression;
import org.uva.sea.ql.ast.expression.ComparisonExpression;
import org.uva.sea.ql.ast.expression.Ident;
import org.uva.sea.ql.ast.expression.LogicalExpression;
import org.uva.sea.ql.ast.expression.UnaryExpression;
import org.uva.sea.ql.ast.expression.UnaryNumericExpression;
import org.uva.sea.ql.ast.expression.literal.Bool;
import org.uva.sea.ql.ast.expression.literal.Int;
import org.uva.sea.ql.ast.expression.literal.Money;
import org.uva.sea.ql.ast.expression.literal.Str;
import org.uva.sea.ql.eval.Context;

/**
 * Expression visitor.
 */
public interface IExpressionVisitor<T> {
	/**
	 * Visit arithmetic expression.
	 *
	 * @param node
	 * @param context
	 */
	T visit( ArithmeticExpression node, Context context );

	/**
	 * Visit logical expression.
	 *
	 * @param node
	 * @param context
	 */
	T visit( LogicalExpression node, Context context );

	/**
	 * Visit binary expression.
	 *
	 * @param node
	 * @param context
	 */
	T visit( ComparisonExpression node, Context context );

	/**
	 * Visit unary expression.
	 *
	 * @param node
	 * @param context
	 */
	T visit( UnaryExpression node, Context context );

	/**
	 * Visit unary numeric expression.
	 *
	 * @param node
	 * @param context
	 */
	T visit( UnaryNumericExpression node, Context context );

	/**
	 * Visit integer literal expression.
	 *
	 * @param node
	 * @param context
	 */
	T visit( Int node, Context context );

	/**
	 * Visit boolean literal expression.
	 *
	 * @param node
	 * @param context
	 */
	T visit( Bool node, Context context );

	/**
	 * Visit money literal expression.
	 *
	 * @param node
	 * @param context
	 */
	T visit( Money node, Context context );

	/**
	 * Visit string literal expression.
	 *
	 * @param node
	 * @param context
	 */
	T visit( Str node, Context context );

	/**
	 * Visit identifier expression.
	 *
	 * @param node
	 * @param context
	 */
	T visit( Ident node, Context context );
}
