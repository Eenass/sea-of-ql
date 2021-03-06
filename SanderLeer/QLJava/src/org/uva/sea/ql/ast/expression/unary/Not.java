package org.uva.sea.ql.ast.expression.unary;

import org.uva.sea.ql.ast.Visitor;
import org.uva.sea.ql.ast.datatype.BooleanType;
import org.uva.sea.ql.ast.datatype.Datatype;
import org.uva.sea.ql.ast.expression.Expression;
import org.uva.sea.ql.typechecker.SymbolTable;

public class Not extends UnaryExpression {
	public Not(Expression operand) {
		super(operand);
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}

	@Override
	public Datatype typeOf(SymbolTable symbols) {
		return new BooleanType();
	}
}
