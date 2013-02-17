package org.uva.sea.ql.ast.literals;

import java.util.HashMap;

import org.uva.sea.ql.ast.operators.Expr;
import org.uva.sea.ql.ast.statements.Statement;
import org.uva.sea.ql.ast.types.StringType;
import org.uva.sea.ql.ast.types.Type;
import org.uva.sea.ql.ast.visitor.Visitor;

public class StringLiteral extends Expr {

	private final String value;

	public StringLiteral(String string) {
		value = string;
	}

	public String getValue() {
		return value;
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}

	@Override
	public Type typeOf(HashMap<String, Statement> typeEnv) {
		return new StringType();
	}

	@Override
	public Result eval(HashMap<String, Result> symbolMap) {
		return new StringResult(value);
	}
}