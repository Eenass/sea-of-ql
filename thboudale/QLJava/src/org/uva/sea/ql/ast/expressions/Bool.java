package org.uva.sea.ql.ast.expressions;

import java.util.Map;
import org.uva.sea.ql.ast.types.Type;
import org.uva.sea.ql.ast.types.BoolType;
import org.uva.sea.ql.visitor.ExprVisitor;

public class Bool extends Expr {
	private final boolean value;

	public Bool(boolean value) {
		this.value = value;
	}
	
	public boolean getValue() {
		return value;
	}
	
	@Override
	public Type typeOf(Map<Ident, Type> typeEnv) {
		return new BoolType();
	}
	
	@Override
	public <T> T accept(ExprVisitor<T> visitor) {
		return visitor.visit(this);
	}
}