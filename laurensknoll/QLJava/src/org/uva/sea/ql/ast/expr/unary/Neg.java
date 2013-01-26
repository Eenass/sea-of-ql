package org.uva.sea.ql.ast.expr.unary;

import org.uva.sea.ql.ast.expr.AbstractExpr;
import org.uva.sea.ql.ast.type.AbstractType;
import org.uva.sea.ql.ast.type.Numeric;
import org.uva.sea.ql.visitor.Expression;
import org.uva.sea.ql.visitor.semantic.Environment;

public class Neg extends AbstractUnary {

	public Neg(AbstractExpr expression) {
		super(expression);
	}

	@Override
	public <T> T accept(Expression<T> visitor) {
		return visitor.visit(this);
	}

	@Override
	public AbstractType typeOf(Environment environment) {
		return new Numeric();
	}

}
