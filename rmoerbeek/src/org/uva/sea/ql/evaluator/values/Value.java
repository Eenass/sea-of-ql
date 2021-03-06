package org.uva.sea.ql.evaluator.values;


public abstract class Value {
	
	public abstract Object getValue();

	// Public operations on values
	public Value add(Value r) {
		throw new UnsupportedOperationException();
	}
	
	public Value and(Value r) {
		throw new UnsupportedOperationException();
	}
	
	public Value div(Value r) {
		throw new UnsupportedOperationException();
	}
	
	public Value eq(Value r) {
		throw new UnsupportedOperationException();
	}
	public Value geq(Value r) {
		throw new UnsupportedOperationException();
	}	
	
	public Value gt(Value r) {
		throw new UnsupportedOperationException();
	}
	
	public Value leq(Value r) {
		throw new UnsupportedOperationException();
	}
	
	public Value lt(Value r) {
		throw new UnsupportedOperationException();
	}
	
	public Value mul(Value r) {
		throw new UnsupportedOperationException();
	}
	
	public Value neg() {
		throw new UnsupportedOperationException();
	}
	
	public Value neq(Value r) {
		throw new UnsupportedOperationException();
	}
	
	public Value not() {
		throw new UnsupportedOperationException();
	}
	
	public Value or(Value r) {
		throw new UnsupportedOperationException();
	}
	
	public Value pos() {
		throw new UnsupportedOperationException();
	}
	
	public Value sub(Value r) {
		throw new UnsupportedOperationException();
	}
	
	
	// Protected default operations on values
	// Integer values
	
	protected Value addInt(IntValue r) {
		throw new UnsupportedOperationException();
	}
	
	protected Value eqInt(IntValue r) {
		throw new UnsupportedOperationException();
	}
		
	protected Value geqInt(IntValue r) {
		throw new UnsupportedOperationException();
	}	

	protected Value gtInt(IntValue r) {
		throw new UnsupportedOperationException();
	}

	protected Value leqInt(IntValue r) {
		throw new UnsupportedOperationException();
	}

	protected Value ltInt(IntValue r) {
		throw new UnsupportedOperationException();
	}

	protected Value mulInt(IntValue r) {
		throw new UnsupportedOperationException();
	}

	protected Value negInt() {
		throw new UnsupportedOperationException();
	}

	protected Value neqInt(IntValue r) {
		throw new UnsupportedOperationException();
	}	
	
	protected Value divInt(IntValue r) {
		throw new UnsupportedOperationException();
	}
	
	protected Value posInt() {
		throw new UnsupportedOperationException();
	}
	
	protected Value subInt(IntValue r) {
		throw new UnsupportedOperationException();
	}
	
	
	// BoolValues
	
	protected Value eqBool(BoolValue r) {
		throw new UnsupportedOperationException();
	}
	
	protected Value andBool(BoolValue r) {
		throw new UnsupportedOperationException();
	}
	
	protected Value neqBool(BoolValue r) {
		throw new UnsupportedOperationException();
	}
	
	protected Value notBool() {
		throw new UnsupportedOperationException();
	}
	
	protected Value orBool(BoolValue r) {
		throw new UnsupportedOperationException();
	}
		
	
	// StringValues		
	
	protected Value neqString(StringValue r) {
		throw new UnsupportedOperationException();
	}
	
	protected Value eqString(StringValue r) {
		throw new UnsupportedOperationException();
	}
	

}

	
