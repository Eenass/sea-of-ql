package org.uva.sea.ql.ast.type;

public class Int extends Numeric {

	public boolean isCompatibleWith(Type t) {
		return t.isCompatibleWithInt();
	}
	
	public <T> T accept(TypeVisitor<T> visitor) {
		return visitor.visit(this);
	}
	
	public String toString() {
		return "integer";
	}
	
}
