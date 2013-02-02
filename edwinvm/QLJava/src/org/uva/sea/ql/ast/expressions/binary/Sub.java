package org.uva.sea.ql.ast.expressions.binary;

import java.util.Map;

import org.uva.sea.ql.ast.Expr;
import org.uva.sea.ql.ast.Numeric;
import org.uva.sea.ql.ast.Type;
import org.uva.sea.ql.ast.expressions.Binary;
import org.uva.sea.ql.ast.values.Ident;

public class Sub extends Binary {
	public Sub(Expr lhs, Expr rhs) {
		super(lhs, rhs);
	}
	
	@Override
	public Type typeOf(Map<Ident, Type> typeEnv) {
		return new Numeric();
	}
}