package org.uva.sea.ql.ast.operators;

import java.math.BigDecimal;

import org.uva.sea.ql.ast.types.TypeDescription;

import org.uva.sea.ql.ast.types.MoneyType;

public class Moneyresult implements ExpressionResult {
	private BigDecimal value;

	public Moneyresult(BigDecimal val) {
		value = val;
	}

	public int getValue() {
		return 1;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public String toString() {
		return value.toString();
	}

	@Override
	public TypeDescription typeOf() {
		return new MoneyType();
	}
}
