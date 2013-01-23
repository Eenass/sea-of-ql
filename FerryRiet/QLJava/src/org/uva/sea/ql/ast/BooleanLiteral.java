package org.uva.sea.ql.ast;

import java.util.HashMap;

import org.uva.sea.ql.ast.nodevisitor.Visitor;
import org.uva.sea.ql.ast.nodevisitor.VisitorResult;
import org.uva.sea.ql.ast.types.BooleanType;
import org.uva.sea.ql.ast.types.TypeDescription;

public class BooleanLiteral extends Expr {
	private final String value;

	public BooleanLiteral(String string) {
		value = string;
	}

	public String getValue() {
		return value;
	}

	@Override
	public VisitorResult accept(Visitor visitor) {
		return visitor.visit(this);
	}

	@Override
	public TypeDescription typeOf(HashMap<String, Statement> typeEnv) {
		return new BooleanType();
	}
}
