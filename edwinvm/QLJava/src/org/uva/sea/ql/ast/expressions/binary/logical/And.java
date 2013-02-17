package org.uva.sea.ql.ast.expressions.binary.logical;

import org.uva.sea.ql.ast.Expr;
import org.uva.sea.ql.ast.expressions.binary.BinaryLogicalExpr;
import org.uva.sea.ql.ast.visitors.checkexpr.Visitor;

public class And extends BinaryLogicalExpr {
	public And(Expr lhs, Expr rhs) {
		super(lhs, rhs);
	}
	
	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}
}