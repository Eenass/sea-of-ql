package org.uva.sea.ql.ast.math;

import org.uva.sea.ql.ast.expressions.Expr;
import org.uva.sea.ql.ast.expressions.UnaryExpr;
import org.uva.sea.ql.ast.interfaces.AcceptsMathOperands;
import org.uva.sea.ql.ast.interfaces.ReturnsMathOperands;

public class Pos extends UnaryExpr implements AcceptsMathOperands,
		ReturnsMathOperands {
	public static final String str = "+";

	public Pos(Expr ex) {
		super(ex);
	}

	@Override
	public String toString() {
		return str;
	}
}
