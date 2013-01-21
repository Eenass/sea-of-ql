package org.uva.sea.ql.ast;

import org.uva.sea.ql.ast.values.IntValue;
import org.uva.sea.ql.ast.values.Value;

public class Mul extends Binary {

	public Mul(Expr result, Expr rhs) {
		super(result,rhs);
	}

	@Override
	public Value eval() {
		return new IntValue(
				((IntValue)getLeft().eval()).getValue() *
				((IntValue)getRight().eval()).getValue()
				);
	}
}
