package org.uva.sea.ql.ast.expr.rel;

import org.uva.sea.ql.ast.expr.Binary;
import org.uva.sea.ql.ast.expr.Expr;

public class LT extends Binary {

	public LT(Expr leftExpr, Expr rightExpr) {
		super(leftExpr,rightExpr) ;
	}

}
