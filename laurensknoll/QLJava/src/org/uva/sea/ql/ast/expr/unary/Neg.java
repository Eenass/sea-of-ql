package org.uva.sea.ql.ast.expr.unary;

import org.uva.sea.ql.ast.expr.AbstractExpr;
import org.uva.sea.ql.visitor.Expression;

public class Neg extends AbstractUnary {

	public Neg(AbstractExpr expression) {
		super(expression);
	}

	@Override
	public void accept(Expression<?> visitor) {
		visitor.visit(this);
	}

}