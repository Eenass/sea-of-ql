package org.uva.sea.ql.ast.values;

import org.uva.sea.ql.ast.types.Type;
import org.uva.sea.ql.ast.visitors.typechecker.Visitor;
import org.uva.sea.ql.check.TypeEnvironment;

public class Str extends Value {
	
	private final String _value;
	
	public Str(String value) {
		_value = value;
	}
	
	@Override
	public String getValue() {
		return _value;
	}
	
	@Override
	public Value add(Value value) { return value.addString(this); }
	@Override
	protected Value addString(Str value) { return new Str(value.getValue() + " " + getValue()); }
	
	@Override
	public Value equalsValue(Value value) { return value.equalsString(this); }
	@Override
	protected Value equalsString(Str value) { return new Bool(value.equals(this)); }
	@Override
	public Value notEqualsValue(Value value) { return value.notEqualsString(this); }
	@Override
	protected Value notEqualsString(Str value) { return new Bool(!value.equals(this)); }

	@Override
	public Type typeOf(TypeEnvironment typeEnvironment) {
		return new org.uva.sea.ql.ast.types.Str();
	}
	
	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((_value == null) ? 0 : _value.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		Str string = (Str) obj;
		return this.getValue().equals(string.getValue());
	}
}