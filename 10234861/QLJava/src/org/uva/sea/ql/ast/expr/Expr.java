package org.uva.sea.ql.ast.expr;

import java.util.Map;

import org.uva.sea.ql.ast.ASTNode;
import org.uva.sea.ql.ast.IExprVisitor;
import org.uva.sea.ql.ast.type.Type;

public abstract class Expr implements ASTNode {

	public abstract <T> T accept(IExprVisitor<T> visitor);

	public abstract Type isOfType(Map<String, Type> typeEnv);

}
