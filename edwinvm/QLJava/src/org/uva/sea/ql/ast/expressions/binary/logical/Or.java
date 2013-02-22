package org.uva.sea.ql.ast.expressions.binary.logical;

import org.uva.sea.ql.ast.expressions.Expr;
import org.uva.sea.ql.ast.expressions.binary.BinaryLogicalExpr;
import org.uva.sea.ql.ast.visitors.typechecker.Visitor;

public class Or extends BinaryLogicalExpr {
	public Or(Expr lhs, Expr rhs) {
		super(lhs, rhs);
	}
	
	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}
}