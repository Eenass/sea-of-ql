package org.uva.sea.ql.ast.ql;

import org.uva.sea.ql.ast.Block;
import org.uva.sea.ql.ast.cond.IfThenElse;
import org.uva.sea.ql.ast.expr.Expr;

public class ConditionalElseQuestion extends IfThenElse implements ConditionalQuestion {

	public ConditionalElseQuestion(Expr condition,
			Block<QLItem> statements,
			Block<QLItem> elseStatements) {
		super(condition, statements, elseStatements);
	}
	
	
}
