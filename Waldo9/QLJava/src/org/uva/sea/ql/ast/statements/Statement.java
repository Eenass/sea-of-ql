package org.uva.sea.ql.ast.statements;

import org.uva.sea.ql.ast.ASTNode;

public abstract class Statement implements ASTNode {
	
	public abstract <T> T accept(StatementVisitor<T> visitor);
	
}
