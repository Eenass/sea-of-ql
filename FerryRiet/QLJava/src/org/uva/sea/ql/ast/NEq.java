package org.uva.sea.ql.ast;

import java.util.HashMap;

import org.uva.sea.ql.astnodevisitor.Visitor;
import org.uva.sea.ql.astnodevisitor.VisitorResult;

public class NEq extends BinExpr {

	public NEq(Expr result, Expr rhs) {
		super(result, rhs);
	}

	@Override
	public TypeDescription typeOf(HashMap<Ident, Statement> typeEnv) {
		return new BooleanType();
	}
	@Override
	public VisitorResult accept(Visitor visitor) {
		return visitor.visit(this);
	}
}
