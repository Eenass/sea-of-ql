package org.uva.sea.ql.ast.operators.binary;

import org.uva.sea.ql.ast.base.Expression;
import org.uva.sea.ql.ast.operators.base.BinaryOperator;
import org.uva.sea.ql.ast.traversal.SymbolTable;
import org.uva.sea.ql.ast.traversal.base.IVisitor;
import org.uva.sea.ql.ast.types.datatypes.BoolType;
import org.uva.sea.ql.ast.types.datatypes.DataType;
import org.uva.sea.ql.ast.types.datatypes.NumericType;
import org.uva.sea.ql.ast.types.literals.BoolLiteral;
import org.uva.sea.ql.ast.types.literals.LiteralType;

/**
 * Represents an Or operation in the QL language.
 * @author J. Dijkstra
 */
public class Or extends BinaryOperator {
	private static final DataType type = new BoolType();
	
	/**
	 * Constructor.
	 * @param leftHandSide left hand side of the operator
	 * @param rightHandSide right hand side of the operator
	 */
	public Or(final Expression leftHandSide, final Expression rightHandSide) {
		super(leftHandSide, rightHandSide);
	}
	
	@Override
	public DataType typeOf(SymbolTable symbolTable) {
		return type;
	}
	
	@Override
	public <T> T accept(IVisitor<T> visitor) {
		return visitor.visit(this);
	}
}
