package org.uva.sea.ql.ast.expr;

import java.util.Map;

import org.uva.sea.ql.ast.types.BoolType;
import org.uva.sea.ql.ast.types.Type;
import org.uva.sea.ql.visitor.ASTNodeVisitor;


public class And extends Binary {

	public And(Expr leftExpr, Expr rightExpr) {
		super(leftExpr,rightExpr);
	}

	@Override
	public void accept(ASTNodeVisitor nodeVisitor) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public Type isOfType(Map<Ident, Type> typeEnv) {
		return new BoolType();
	}

}