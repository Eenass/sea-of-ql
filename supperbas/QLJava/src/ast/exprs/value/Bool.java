package ast.exprs.value;

import java.util.Map;

import ast.exprs.Value;
import ast.types.Type;
import ast.visitors.Visitor;


public class Bool extends Value {
	private final String name;

	public Bool(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public Type typeOf(Map<ast.types.Ident, Type> typeEnv) {
		return new ast.types.Bool();
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}
}