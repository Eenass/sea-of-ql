package org.uva.sea.ql.valuesystem;

import org.uva.sea.ql.ast.DataType;

public class BooleanValue implements Value{

	private final boolean value;
	
	public BooleanValue(boolean value) {
		super();
		this.value = value;
	}

	public boolean getValue() {
		return value;
	}

	@Override
	public DataType getDataType() {
		return DataType.BOOLEAN;
	}

	@Override
	public Value add(Value otherValue) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Value addInteger(IntegerValue otherValue) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Value addMoney(MoneyValue otherValue) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Value and(Value otherValue) {
		return otherValue.andBool(this);
	}
	
	@Override
	public Value andBool(BooleanValue otherValue) {
		return new BooleanValue(otherValue.getValue() && value);
	}

	@Override
	public Value div(Value otherValue) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Value divInteger(IntegerValue otherValue) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Value divMoney(MoneyValue otherValue) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Value eq(Value otherValue) {
		throw new UnsupportedOperationException();
	}
	
	public Value eqBool(BooleanValue otherValue){
		return new BooleanValue(otherValue.getValue() == value);
	}

	@Override
	public Value eqInteger(IntegerValue otherValue) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Value eqMoney(MoneyValue otherValue) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Value geq(Value otherValue) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Value geqInteger(IntegerValue otherValue) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Value geqMoney(MoneyValue otherValue) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Value gt(Value otherValue) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Value gtInteger(IntegerValue otherValue) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Value gtMoney(MoneyValue otherValue) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public Value leq(Value otherValue) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public Value leqInteger(IntegerValue otherValue) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Value leqMoney(MoneyValue otherValue) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Value lt(Value otherValue) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Value ltInteger(IntegerValue otherValue) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Value ltMoney(MoneyValue otherValue) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Value mul(Value otherValue) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Value mulInteger(IntegerValue otherValue) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Value mulMoney(MoneyValue otherValue) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Value neq(Value otherValue) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Value neqInteger(IntegerValue otherValue) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Value neqMoney(MoneyValue otherValue) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public Value neqBool(BooleanValue otherValue) {
		return new BooleanValue(otherValue.getValue() != value);
	}

	@Override
	public Value or(Value otherValue) {
		return otherValue.orBool(this);
	}
	
	@Override
	public Value orBool(BooleanValue otherValue) {
		return new BooleanValue(otherValue.getValue() || value);
	}

	@Override
	public Value sub(Value otherValue) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Value subInteger(IntegerValue otherValue) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Value subMoney(MoneyValue otherValue) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Value neg() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Value not() {
		return new BooleanValue(!value);
	}
	
	@Override
	public Value pos() {
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		return "BooleanValue [value=" + value + "]";
	}

}
