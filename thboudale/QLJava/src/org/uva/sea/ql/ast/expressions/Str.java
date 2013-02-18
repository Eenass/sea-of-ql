package org.uva.sea.ql.ast.expressions;

import java.util.Map;
import org.uva.sea.ql.ast.types.Type;
import org.uva.sea.ql.ast.types.StringType;
import org.uva.sea.ql.visitor.ExprVisitor;

public class Str extends Expr {
	private final String value;

	public Str(String n) {
		this.value = n;
	}

	public String getValue() {
		return value;
	}
	
	@Override
	public Type typeOf(Map<Ident, Type> typeEnv) {
		return new StringType();
	}
	
	@Override
	public <T> T accept(ExprVisitor<T> visitor) {
		return visitor.visit(this);
	}
}