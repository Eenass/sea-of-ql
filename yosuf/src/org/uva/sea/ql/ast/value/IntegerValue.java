package org.uva.sea.ql.ast.value;

import static julius.validation.Assertions.state;

import org.uva.sea.ql.visitor.NaturalVisitor;
import org.uva.sea.ql.visitor.ValuableVisitor;

public class IntegerValue extends Value {

	private final int value;

	/**
	 * 
	 * @param value
	 *            (not null)
	 */
	public IntegerValue(final int value) {
		super();
		this.value = value;
		state.assertNotNull(this.value, "Integer.value");
	}

	public int getValue() {
		return value;
	}

	@Override
	public <T> T accept(final NaturalVisitor<T> visitor) {
		return visitor.visit(this);
	}

	@Override
	public <T> T accept(final ValuableVisitor<T> visitor) {
		return visitor.visit(this);
	}

	@Override
	public Nature getNature() {
		return Nature.NUMERIC;
	}

	@Override
	public String toString() {
		return "IntegerValue [value=" + value + ", Nature=" + getNature() + "]";
	}

}
