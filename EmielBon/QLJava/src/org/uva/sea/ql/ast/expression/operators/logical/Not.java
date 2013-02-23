package org.uva.sea.ql.ast.expression.operators.logical;

import org.uva.sea.ql.ast.expression.Expression;
import org.uva.sea.ql.ast.expression.operators.UnaryOperator;
import org.uva.sea.ql.ast.type.Bool;
import org.uva.sea.ql.ast.type.Type;
import org.uva.sea.ql.typechecker.ExpressionVisitor;
import org.uva.sea.ql.typechecker.TypeEnvironment;

public class Not extends UnaryOperator {

	public Not(Expression operand) {
		super(operand);
	}
	
	public Type typeOf(TypeEnvironment typeEnv) {
		return new Bool();
	}

	public <T> T accept(ExpressionVisitor<T> visitor) {
		return visitor.visit(this);
	}
	
	@Override
	public String getRepresentation() {
		return "!";
	}
	
}