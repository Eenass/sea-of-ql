package org.uva.sea.ql.ast.expression.binary;

import org.uva.sea.ql.ast.expression.Expression;
import org.uva.sea.ql.visitor.ASTVisitor;

public class And extends BinaryExpr {
	
	public And(final Expression lhs, final Expression rhs){
		super(lhs, rhs);
	}

	@Override
	public void accept(ASTVisitor visitor) {
		visitor.visit(this);
	}
	
}