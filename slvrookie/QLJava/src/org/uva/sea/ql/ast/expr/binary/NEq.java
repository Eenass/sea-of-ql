package org.uva.sea.ql.ast.expr.binary;

import org.uva.sea.ql.ast.expr.Expr;
import org.uva.sea.ql.visitor.Context;
import org.uva.sea.ql.visitor.Visitor;

public class NEq extends BinaryExpr {

	public NEq(Expr lhs, Expr rhs) {
		super(lhs, rhs);
	}

	@Override
	public void accept(Visitor visitor, Context context) {
		visitor.visit(this, context);
	}
	
}