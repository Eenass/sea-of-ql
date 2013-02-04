package org.uva.sea.ql.ast.expr.binary;

import java.util.Map;

import org.uva.sea.ql.ast.expr.Expr;
import org.uva.sea.ql.ast.expr.primary.Ident;
import org.uva.sea.ql.ast.type.BooleanType;
import org.uva.sea.ql.ast.type.Type;
import org.uva.sea.ql.visitor.IExpressionVisitor;

public class NEq extends Binary {

	public NEq(Expr lhs, Expr rhs) {
		super(lhs, rhs);
	}

	@Override
	public String toString() {
		return "!=";
	}
	
	@Override
	public Type typeOf(Map<Ident, Type> typeEnv) {
		return new BooleanType();
	}

	@Override
	public <T> T accept(IExpressionVisitor<T> visitor) {
		return visitor.visit(this);
	}

}