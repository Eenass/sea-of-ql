package org.uva.sea.ql.ast.operators.relational;

import org.uva.sea.ql.ast.Expr;
import org.uva.sea.ql.ast.operators.Binary;

public class GEq extends Binary {

	public GEq(Expr lhs, Expr rhs){
		super(lhs, rhs);
	}
	
}