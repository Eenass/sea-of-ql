package ast.expression.value;

import java.util.Map;

import ast.Type;
import ast.expression.Visitor;
import ast.expression.Value;


public class Bool extends Value {
	private final boolean value;

	public Bool(boolean value) {
		this.value = value;
	}

	public <T> boolean getValue() {
		return value;
	}
	
	@Override
	public String toString(){
		return String.valueOf(this.value);
	}
	
	@Override
	public Type typeOf(Map<Ident, Type> typeEnv) {
		return new ast.type.Bool();
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}
}
