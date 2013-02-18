package org.uva.sea.ql.ast.expressions;

import java.util.Map;
import org.uva.sea.ql.ast.types.Type;
import org.uva.sea.ql.ast.types.ErrorType;
import org.uva.sea.ql.visitor.ExprVisitor;

public class Ident extends Expr {
	private final String name;

	public Ident(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public Type typeOf(Map<Ident, Type> typeEnv) {
		if (typeEnv.containsKey(this)) {
			return typeEnv.get(this);
		}
		return  new ErrorType();
	}
	
	@Override
	public <T> T accept(ExprVisitor<T> visitor) {
		return visitor.visit(this);
	}
}