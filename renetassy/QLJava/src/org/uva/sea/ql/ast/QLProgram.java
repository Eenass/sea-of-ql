package org.uva.sea.ql.ast;

import org.uva.sea.ql.IStatementVisitor;

public abstract class QLProgram implements ASTNode {
	
	public abstract <T> T accept(IStatementVisitor<T> visitor);

}