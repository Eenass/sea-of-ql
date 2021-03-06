package org.uva.sea.ql.ast.expression;

import java.util.Map;

import org.uva.sea.ql.ast.types.Type;
import org.uva.sea.ql.ast.types.Error;
import org.uva.sea.ql.ast.visitors.ExpressionVisitor;

public class Ident extends Expr {

	private final String value;

	public Ident(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
@Override
public Type typeOf(Map<Ident, Type> typeEnv) {
	for (Ident id : typeEnv.keySet()) {
		if (id.getValue().equals(this.value)) {
			return typeEnv.get(id);
		}
	}
	return new Error();
}
	
	@Override 
	public <T> T accept(ExpressionVisitor<T> visitor) {
		return visitor.visit(this);
	}
	

}