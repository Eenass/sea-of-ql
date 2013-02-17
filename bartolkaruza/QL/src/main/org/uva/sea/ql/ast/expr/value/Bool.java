package org.uva.sea.ql.ast.expr.value;

import org.uva.sea.ql.ast.expr.type.BoolType;
import org.uva.sea.ql.ast.expr.type.Type;
import org.uva.sea.ql.symbol.SymbolTable;
import org.uva.sea.ql.visitor.ExpressionVisitor;

public class Bool extends Value {

	private static final long serialVersionUID = 2811468596893748028L;
	private Boolean value;

	public Bool(int lineNumber) {
		super(lineNumber);
		this.value = false;
	}

	public Bool(int lineNumber, String initialValue) {
		super(lineNumber);
		this.value = new Boolean(initialValue);
	}
	
	public Bool(int lineNumber, boolean initialvalue) {
		super(lineNumber);
		this.value = initialvalue;
	}

	public Boolean getRawValue() {
		return value;
	}

	public void setValue(Boolean value) {
		this.value = value;
	}

	@Override
	public void accept(ExpressionVisitor<?> visitor) {
		visitor.visit(this);
	}

	@Override
	public Type typeOf(SymbolTable symbolTable) {
		return new BoolType();
	}
	
	@Override
	public Value and(Value value) {
		return value.andBool(this);
	}
	
	@Override
	public Value or(Value value) {
		return value.orBool(this);
	}
	
	@Override
	public Value not() {
		return new Bool(getLineNumber(), !this.value);
	}
	
	@Override
	public Value eq(Value value) {
		return value.eqBool(this);
	}
	
	@Override
	public Value neq(Value value) {
		return value.neqBool(this);
	}
	
	@Override
	protected Bool andBool(Bool value) {
		return new Bool(getLineNumber(), value.getRawValue() && getRawValue());
	}
	
	@Override
	protected Bool orBool(Bool value) {
		return new Bool(getLineNumber(), value.getRawValue() || getRawValue());
	}
	
	@Override
	protected Bool eqBool(Bool value) {
		return new Bool(getLineNumber(), value.getRawValue() == getRawValue());
	}
	
	@Override
	protected Bool neqBool(Bool value) {
		return new Bool(getLineNumber(), value.getRawValue() != getRawValue());
	}

}
