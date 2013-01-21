package org.uva.sea.ql.ast.expr.binary;

import java.util.Map;

import org.uva.sea.ql.ast.expr.Expr;
import org.uva.sea.ql.ast.expr.primary.Ident;
import org.uva.sea.ql.ast.type.BooleanType;
import org.uva.sea.ql.ast.type.Type;

public class LEq extends Binary {

	public LEq(Expr lhs, Expr rhs) {
		super(lhs, rhs);
	}

	@Override
	public Type typeOf(Map<Ident, Type> typeEnv) {
		return new BooleanType();
	}

}
