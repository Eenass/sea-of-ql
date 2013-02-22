package org.uva.sea.ql.ast.expressions.binary.relational;

import org.uva.sea.ql.ast.expressions.Expr;
import org.uva.sea.ql.ast.expressions.binary.BinaryRelationalExpr;
import org.uva.sea.ql.ast.visitors.typechecker.Visitor;

public class NEq extends BinaryRelationalExpr {
	public NEq(Expr lhs, Expr rhs) {
		super(lhs, rhs);
	}
	
	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}
}