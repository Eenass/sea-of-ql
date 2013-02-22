package org.uva.sea.ql.ast.expressions.binary.arithmetic;

import org.uva.sea.ql.ast.expressions.Expr;
import org.uva.sea.ql.ast.visitors.typechecker.Visitor;

public class Sub extends BinaryArithmeticExpr {
	public Sub(Expr lhs, Expr rhs) {
		super(lhs, rhs);
	}
	
	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}
}