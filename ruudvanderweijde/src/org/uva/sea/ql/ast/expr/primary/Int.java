package org.uva.sea.ql.ast.expr.primary;

import java.util.Map;

import org.uva.sea.ql.ast.expr.Expr;
import org.uva.sea.ql.ast.type.IntegerType;
import org.uva.sea.ql.ast.type.Type;
import org.uva.sea.ql.visitor.IExpressionVisitor;


public class Int extends Expr {

	private final int value;

	public Int(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	@Override
	public Type typeOf(Map<Ident, Type> typeEnv) {
		return new IntegerType();
	}

	@Override
	public <T> T accept(IExpressionVisitor<T> visitor) {
		return visitor.visit(this);
	}

}
