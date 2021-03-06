package org.uva.sea.ql.ast.expressions.unaryExpressions;

import org.uva.sea.ql.ast.expressions.AExpr;

public abstract class AUnaryExpr extends AExpr {
	private final AExpr unExpr;
	
	public AUnaryExpr(AExpr unExpr) {
		this.unExpr = unExpr;
	}
	
	public AExpr getUnExpr() {
		return unExpr;
	}
}