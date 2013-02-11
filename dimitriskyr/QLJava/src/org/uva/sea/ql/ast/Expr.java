package org.uva.sea.ql.ast;

import java.util.Map;

import org.uva.sea.ql.ast.values.Ident;
import org.uva.sea.ql.ast.visitor.ICheckExprVisitor;


public abstract class Expr implements ASTNode {
	public abstract Type typeOf (Map <Ident , Type> typeEnv);
	public abstract <T> T accept(ICheckExprVisitor<T> visitor); 

}
