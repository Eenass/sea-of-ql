package org.uva.sea.ql.ast.expressions.binary.numeric;

import org.uva.sea.ql.ast.Expr;
import org.uva.sea.ql.ast.expressions.binary.BinaryNumericExpr;

public class Add extends BinaryNumericExpr {
	public Add(Expr lhs, Expr rhs) {
		super(lhs, rhs);
	}
}