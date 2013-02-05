package org.uva.sea.ql.ast.expressions.binary.arithmetic;

import org.uva.sea.ql.ast.Expr;
import org.uva.sea.ql.ast.expressions.binary.BinaryArithmeticExpr;
import org.uva.sea.ql.ast.visitors.checkexpr.Visitor;

public class Mul extends BinaryArithmeticExpr {
	public Mul(Expr lhs, Expr rhs) {
		super(lhs, rhs);
	}
	
	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}
}