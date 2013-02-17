package ast.type;

import ast.Type;
import ast.visitor.Visitor;

public class Int extends Type {
	
	@Override
	public boolean isCompatibleTo(Type t) {
		return t.isCompatibleToInt();
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}
}
