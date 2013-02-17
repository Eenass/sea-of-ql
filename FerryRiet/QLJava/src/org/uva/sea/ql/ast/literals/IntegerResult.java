package org.uva.sea.ql.ast.literals;

import java.math.BigDecimal;

import org.uva.sea.ql.ast.types.Type;
import org.uva.sea.ql.ast.types.IntegerType;

public class IntegerResult extends Result {
	private Integer value;

	public IntegerResult(int val) {
		super(new IntegerType());
		value = new Integer(val);
	}

	public int getIntegerValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public String toString() {
		return value.toString();
	}

	@Override
	public Type typeOf() {
		return new IntegerType();
	}

	@Override
	public BigDecimal getMoneyValue() {
		return new BigDecimal(value);
	}

	@Override
	public boolean getBooleanValue() {
		return value == 0;
	}

	@Override
	public String getStringValue() {
		return value.toString();
	}

	@Override
	public Result setValue(String string) {
		try {
			value = Integer.parseInt(string);
		} catch (java.lang.NumberFormatException e) {
			System.out.println("Format error in ints");
			value = 0;
		}

		return this;
	}

	@Override
	public boolean isCompatibleToInt() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCompatibleToString() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCompatibleToBool() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCompatibleToMoney() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Result add(Result adder) {
		return adder.doAdd(this);
	}

	@Override
	public Result doAdd(MoneyResult inte) {
		return new MoneyResult(inte.getMoneyValue().add(
				new BigDecimal(this.getIntegerValue())));
	}

	@Override
	public Result doAdd(IntegerResult inte) {
		return new IntegerResult(this.getIntegerValue() + inte.getIntegerValue());
	}

	@Override
	public Result mul(Result muller) {
		return muller.doMul(this);
	}

	@Override
	public Result doMul(MoneyResult muller) {
		return new MoneyResult(muller.getMoneyValue().multiply(
				new BigDecimal(this.getIntegerValue())));
	}

	@Override
	public Result doMul(IntegerResult muller) {
		return new IntegerResult(this.getIntegerValue() * muller.getIntegerValue());
	}

	@Override
	public Result div(Result muller) {
		return muller.doDiv(this);
	}

	@Override
	public Result doDiv(MoneyResult diver) {
		Result result;
		try {
			result = new MoneyResult(diver.getMoneyValue().divide(
					new BigDecimal(this.getIntegerValue())));
		} catch (ArithmeticException e) {
			result = new MoneyResult(0);
		}
		return result;
	}

	@Override
	public Result doDiv(IntegerResult diver) {
		Result result;
		try {
			result = new IntegerResult(diver.getIntegerValue() / this.getIntegerValue());
		} catch (ArithmeticException e) {
			result = new IntegerResult(0) ;
		}
		return result ;
	}
}