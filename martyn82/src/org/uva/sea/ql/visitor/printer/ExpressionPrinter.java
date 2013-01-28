package org.uva.sea.ql.visitor.printer;

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
import org.uva.sea.ql.visitor.IExpressionVisitor;

/**
 * Represents a pretty printer for expression nodes.
 */
public class ExpressionPrinter extends PrintVisitor implements IExpressionVisitor<Boolean> {
	/**
	 * Constructs a new ExpressionPrinter instance.
	 *
	 * @param context
	 */
	public ExpressionPrinter( PrintContext context ) {
		super( context );
	}

	@Override
	public Boolean visit( LogicalExpression node ) {
		writeName( node );

		increaseLevel();

		indent();
		node.getLhs().accept( this );

		indent();
		node.getRhs().accept( this );

		decreaseLevel();

		return true;
	}

	@Override
	public Boolean visit( ArithmeticExpression node ) {
		writeName( node );

		increaseLevel();

		indent();
		node.getLhs().accept( this );

		indent();
		node.getRhs().accept( this );

		decreaseLevel();

		return true;
	}

	@Override
	public Boolean visit( UnaryExpression node ) {
		writeName( node );

		increaseLevel();

		indent();
		node.getExpression().accept( this );

		decreaseLevel();

		return true;
	}

	@Override
	public Boolean visit( UnaryNumericExpression node ) {
		writeName( node );

		increaseLevel();

		indent();
		node.getExpression().accept( this );

		decreaseLevel();

		return true;
	}

	@Override
	public Boolean visit( Str node ) {
		writeAtomic( node );
		return true;
	}

	@Override
	public Boolean visit( Money node ) {
		writeAtomic( node );
		return true;
	}

	@Override
	public Boolean visit( Int node ) {
		writeAtomic( node );
		return true;
	}

	@Override
	public Boolean visit( Bool node ) {
		writeAtomic( node );
		return true;
	}

	@Override
	public Boolean visit( Ident node ) {
		writeAtomic( node );
		return true;
	}

	@Override
	public Boolean visit( ComparisonExpression node ) {
		writeName( node );

		increaseLevel();

		indent();
		node.getLhs().accept( this );

		indent();
		node.getRhs().accept( this );

		decreaseLevel();

		return true;
	}
}