package org.uva.sea.ql.value;

import org.uva.sea.ql.type.MoneyType;
import org.uva.sea.ql.type.Type;

public class MoneyValue extends Value{
    private final Double value;

    public MoneyValue(Double value) {
        this.value = value;
    }

    @Override
    public Value add(Value value) {

        return value.addMoney(this);
    }

    @Override
    public Value addMoney(MoneyValue moneyValue) {
        return new MoneyValue(moneyValue.getValue() + this.getValue());
    }

    @Override
    public Value sub(Value value) {
        return value.subMoney(this);
    }

    @Override
    public Value subMoney(MoneyValue moneyValue) {
        return new MoneyValue(moneyValue.getValue() - getValue());
    }

    @Override
    public Value div(Value value) {
        return value.divMoney(this);
    }

    @Override
    public Value divMoney(MoneyValue moneyValue) {
        return new MoneyValue(moneyValue.getValue() / this.getValue());
    }

    @Override
    public Value eq(Value value) {
        return value.eqMoney(this);
    }

    @Override
    public Value eqMoney(MoneyValue moneyValue) {
        return new BooleanValue(moneyValue.getValue().equals(this.getValue()));
    }

    @Override
    public Value gEq(Value value) {
        return value.gEqMoney(this);
    }

    @Override
    public Value gEqMoney(MoneyValue value) {
        return new BooleanValue(value.getValue() >= this.getValue());
    }

    @Override
    public Value gT(Value value) {
        return value.gTMoney(this);
    }

    @Override
    public Value gTMoney(MoneyValue value) {
        return new BooleanValue(value.getValue() > this.getValue());
    }

    @Override
    public Value lEq(Value value) {
        return value.lEqMoney(this);
    }

    @Override
    public Value lEqMoney(MoneyValue value) {
        return new BooleanValue(value.getValue() <= this.getValue());
    }

    @Override
    public Value lT(Value value) {
        return value.lTMoney(this);
    }

    @Override
    public Value lTMoney(MoneyValue value) {
        return new BooleanValue(value.getValue() < this.getValue());
    }

    @Override
    public Value mul(Value value) {
        return value.mulMoney(this);
    }

    @Override
    public Value mulMoney(MoneyValue value) {
        return new MoneyValue(value.getValue() * this.getValue());
    }

    @Override
    public Value nEq(Value value) {
        return value.nEqMoney(this);
    }

    @Override
    public Value nEqMoney(MoneyValue value) {
        return new BooleanValue(value.getValue() != this.getValue());
    }

    @Override
    public Value neg() {
        return new MoneyValue(-1D * getValue());
    }

    @Override
    public Value pos() {
        return new MoneyValue(getValue());
    }

    public Double getValue() {
        return value;
    }

    @Override
    public Type getType() {
        return new MoneyType();
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
