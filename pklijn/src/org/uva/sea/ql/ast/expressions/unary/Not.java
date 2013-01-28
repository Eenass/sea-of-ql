package org.uva.sea.ql.ast.expressions.unary;


import org.uva.sea.ql.ast.eval.Env;
import org.uva.sea.ql.ast.expressions.Expr;
import org.uva.sea.ql.ast.types.BoolType;
import org.uva.sea.ql.ast.types.Type;
import org.uva.sea.ql.ast.values.BoolValue;
import org.uva.sea.ql.ast.values.Value;

public class Not extends Unary {

	public Not(Expr arg) {
		super(arg);
		allowedTypes.add(new BoolType());
	}

	@Override
	public Value eval() {
		return new BoolValue(!((BoolValue)getArg().eval()).getValue());
	}

	@Override
	public Type typeOf(Env environment) {
		return new org.uva.sea.ql.ast.types.BoolType();
	}
}