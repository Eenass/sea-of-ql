package org.uva.sea.ql.value;

public abstract class Value {

	public Value add(Value arg) {
		throw new UnsupportedOperationException();
	}

	public Value pos() {
		throw new UnsupportedOperationException();
	}

	public Value div(Value arg) {
		throw new UnsupportedOperationException();
	}

	public Value mul(Value arg) {
		throw new UnsupportedOperationException();
	}

	public Value sub(Value arg) {
		throw new UnsupportedOperationException();
	}

	public Value and(Value arg) {
		throw new UnsupportedOperationException();
	}

	public Value neg(Value arg) {
		throw new UnsupportedOperationException();
	}
	
	// Int functions
	protected Value addInt(IntegerValue arg) {
		throw new UnsupportedOperationException();
	}
	
	protected Value divInt(IntegerValue arg) {
		throw new UnsupportedOperationException();
	}
	
	protected Value mulInt(IntegerValue arg) {
		throw new UnsupportedOperationException();
	}
	
	protected Value subInt(IntegerValue arg) {
		throw new UnsupportedOperationException();
	}

}