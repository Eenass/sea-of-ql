package eu.karuza.ql.ast.value;


import eu.karuza.ql.ast.Expr;
import eu.karuza.ql.ast.type.ErrorType;
import eu.karuza.ql.ast.type.Type;
import eu.karuza.ql.symbol.SymbolTable;
import eu.karuza.ql.visitor.ExpressionVisitor;

public class Ident extends Expr {

	private static final long serialVersionUID = -4211732920881892762L;
	private final String name;
	private Expr expr;

	public Ident(int lineNumber, String name) {
		super(lineNumber);
		this.name = name;
	}

	@Override
	public void accept(ExpressionVisitor<?> visitor) {
		visitor.visit(this);
	}

	public String getName() {
		return name;
	}

	@Override
	public Type typeOf(SymbolTable symbolTable) {
		if(symbolTable.getSymbol(getName()) != null) {
			return symbolTable.getSymbol(name).getType(symbolTable);
		} else {
			return new ErrorType();
		}
		
	}
	
	/**
	 * Depends on a run of the <DefinitionCollector>
	 */
	@Override
	public Value evaluate() {
		assert expr != null;
		return expr.evaluate();
	}

	@Override
	protected Type getLeastUpperBoundsType(SymbolTable table) {
		return expr.typeOf(table);
	}

	@Override
	public boolean isCompatibleToType(Type type, SymbolTable table) {
		return expr.isCompatibleToType(type, table);
	}
	
	public void setExpr(Expr expr) {
		this.expr = expr;
	}

}
