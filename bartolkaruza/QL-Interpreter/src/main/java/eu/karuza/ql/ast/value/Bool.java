package eu.karuza.ql.ast.value;


import eu.karuza.ql.ast.type.BoolType;
import eu.karuza.ql.ast.type.Type;
import eu.karuza.ql.symbol.SymbolTable;
import eu.karuza.ql.visitor.ExpressionVisitor;

public class Bool extends Value {

	private static final long serialVersionUID = 2811468596893748028L;
	private Boolean value;

	public Bool(int lineNumber) {
		super(lineNumber);
		this.value = false;
	}

	public Bool(int lineNumber, String initialValue) {
		super(lineNumber);
		this.value = Boolean.valueOf(initialValue);
	}
	
	public Bool(int lineNumber, boolean initialvalue) {
		super(lineNumber);
		this.value = initialvalue;
	}

	public Boolean getRawValue() {
		return value;
	}

	@Override
	public void setValue(Object value) {
		this.value = (Boolean) value;
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
	public Value add(Value value) {
		return value.addBool(this);
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
	
	@Override
	protected Value addString(Text value) {
		return value.addBool(this);
	}

}
