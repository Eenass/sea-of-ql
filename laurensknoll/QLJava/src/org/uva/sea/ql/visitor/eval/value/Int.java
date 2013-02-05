package org.uva.sea.ql.visitor.eval.value;

public class Int extends AbstractValue {

	private final int value;

	public Int(int n) {
		this.value = n;
	}

	public int getValue() {
		return this.value;
	}

	@Override
	public AbstractValue neg() {
		return new Int(-this.getValue());
	}

	@Override
	public AbstractValue pos() {
		return new Int(Math.abs(this.getValue()));
	}

	@Override
	public AbstractValue add(AbstractValue value) {
		return value.addInt(this);
	}

	@Override
	protected AbstractValue addInt(Int value) {
		return new Int(value.getValue() + this.getValue());
	}

	@Override
	protected AbstractValue addMoney(Money value) {
		return new Money(value.getValue() + this.getValue());
	}

	@Override
	public AbstractValue div(AbstractValue value) {
		return value.divInt(this);
	}

	@Override
	protected AbstractValue divInt(Int value) {
		return new Int(value.getValue() / this.getValue());
	}

	@Override
	protected AbstractValue divMoney(Money value) {
		return new Money(value.getValue() / this.getValue());
	}

	@Override
	public AbstractValue mul(AbstractValue value) {
		return value.mulInt(this);
	}

	@Override
	protected AbstractValue mulInt(Int value) {
		return new Int(value.getValue() * this.getValue());
	}

	@Override
	protected AbstractValue mulMoney(Money value) {
		return new Money(value.getValue() * this.getValue());
	}

	@Override
	public AbstractValue sub(AbstractValue value) {
		return value.subInt(this);
	}

	@Override
	protected AbstractValue subInt(Int value) {
		return new Int(value.getValue() - this.getValue());
	}

	@Override
	protected AbstractValue subMoney(Money value) {
		return new Money(value.getValue() - this.getValue());
	}

	@Override
	public AbstractValue eq(AbstractValue value) {
		return value.eqInt(this);
	}

	@Override
	public AbstractValue eqInt(Int value) {
		return new Bool(value.getValue() == this.getValue());
	}

	@Override
	public AbstractValue eqMoney(Money value) {
		return new Bool(value.getValue() == this.getValue());
	}

	@Override
	public AbstractValue neq(AbstractValue value) {
		return value.neqInt(this);
	}

	@Override
	public AbstractValue neqInt(Int value) {
		return new Bool(value.getValue() != this.getValue());
	}

	@Override
	public AbstractValue neqMoney(Money value) {
		return new Bool(value.getValue() != this.getValue());
	}

	@Override
	public AbstractValue geq(AbstractValue value) {
		return value.geqInt(this);
	}

	@Override
	public AbstractValue geqInt(Int value) {
		return new Bool(value.getValue() >= this.getValue());
	}

	@Override
	public AbstractValue geqMoney(Money value) {
		return new Bool(value.getValue() >= this.getValue());
	}

	@Override
	public AbstractValue gt(AbstractValue value) {
		return value.gtInt(this);
	}

	@Override
	public AbstractValue gtInt(Int value) {
		return new Bool(value.getValue() > this.getValue());
	}

	@Override
	public AbstractValue gtMoney(Money value) {
		return new Bool(value.getValue() > this.getValue());
	}

	@Override
	public AbstractValue leq(AbstractValue value) {
		return value.leqInt(this);
	}

	@Override
	public AbstractValue leqInt(Int value) {
		return new Bool(value.getValue() <= this.getValue());
	}

	@Override
	public AbstractValue leqMoney(Money value) {
		return new Bool(value.getValue() <= this.getValue());
	}

	@Override
	public AbstractValue lt(AbstractValue value) {
		return value.ltInt(this);
	}

	@Override
	public AbstractValue ltInt(Int value) {
		return new Bool(value.getValue() < this.getValue());
	}

	@Override
	public AbstractValue ltMoney(Money value) {
		return new Bool(value.getValue() < this.getValue());
	}

}
