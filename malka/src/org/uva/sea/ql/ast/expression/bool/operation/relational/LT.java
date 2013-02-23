package org.uva.sea.ql.ast.expression.bool.operation.relational;

import org.uva.sea.ql.ast.expression.Expression;
import org.uva.sea.ql.ast.expression.bool.operation.BinaryBooleanOperation;
import org.uva.sea.ql.visitor.Visitor;
import org.uva.sea.ql.visitor.VisitorException;

public class LT extends BinaryBooleanOperation {

	public LT(Expression left, Expression right) {
		super(left, right);
	}

	@Override
	public void accept(Visitor visitor) throws VisitorException {
		visitor.visit(this);
	}

}