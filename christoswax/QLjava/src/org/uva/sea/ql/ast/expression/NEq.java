package org.uva.sea.ql.ast.expression; 
import org.uva.sea.ql.ast.*;

public class NEq extends Binary {

	public NEq(Expr lhs, Expr rhs) {
		super(lhs,rhs);
	}

}
