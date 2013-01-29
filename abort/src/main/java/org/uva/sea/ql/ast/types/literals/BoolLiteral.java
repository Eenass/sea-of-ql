package org.uva.sea.ql.ast.types.literals;

import org.uva.sea.ql.ast.traversal.SymbolTable;
import org.uva.sea.ql.ast.traversal.base.IVisitor;
import org.uva.sea.ql.ast.types.datatypes.BoolType;
import org.uva.sea.ql.ast.types.datatypes.DataType;
import org.uva.sea.ql.ast.types.datatypes.NumericType;

/**
 * Boolean data type as represented in the QL language.
 * @author J. Dijkstra
 */
public class BoolLiteral extends LiteralType {
	private static final DataType type = new BoolType();
	
	/**
	 * Value of this data type
	 */
	private final boolean value; 
	
	/**
	 * Constructor.
	 * @param value value
	 */
	public BoolLiteral(final boolean value) {
		this.value = value;
	}
	
	/**
	 * Retrieve the value of this data type.
	 * @return value
	 */
	public boolean getValue() {
		return value;
	}
	
	@Override
	public <T> T accept(final IVisitor<T> visitor) {
		return visitor.visit(this);
	}

	@Override
	public DataType typeOf(SymbolTable symbolTable) {
		return type;
	}
}