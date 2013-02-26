package org.uva.sea.ql.ast.value;

import static julius.validation.Assertions.state;

import org.uva.sea.ql.ast.exp.Nature;
import org.uva.sea.ql.ast.exp.Numeric;
import org.uva.sea.ql.visitor.ExpressionVisitor;
import org.uva.sea.ql.visitor.NaturalVisitor;

public class NumericValue extends Value {

	private final double value;

	/**
	 * 
	 * @param value
	 *            (not null)
	 */
	public NumericValue(final double value) {
		super();
		this.value = value;
		state.assertNotNull(this.value, "NumericValue.value");
	}

	public double getValue() {
		return value;
	}

	@Override
	public <T> T accept(final NaturalVisitor<T> visitor) {
		return visitor.visit(this);
	}

	@Override
	public Value accept(final ExpressionVisitor visitor) {
		return visitor.visit(this);
	}

	@Override
	public Nature getNature() {
		return new Numeric();
	}

	@Override
	public String toString() {
		return "IntegerValue [value=" + value + ", Nature=" + getNature() + "]";
	}

	@Override
	public String getAsString() {
		return String.valueOf(value);
	}

}