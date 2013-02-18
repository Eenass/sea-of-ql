package org.uva.sea.ql.ast.statements;

import org.uva.sea.ql.ast.expressions.Expr;
import org.uva.sea.ql.visitor.StmtVisitor;

public class ifStatement extends Statement {
	private final Expr condition;
	private final BlockOfStatements ifStms;
	
	public ifStatement(Expr condition, BlockOfStatements ifStms) {
		this.condition = condition;
		this.ifStms = ifStms;
	}
	
	public Expr getCondition() {
		return condition;
	}
	
	public BlockOfStatements getIfStms() {
		return ifStms;
	}
	
	@Override
	public void accept(StmtVisitor visitor) {
		visitor.visit(this);		
	}
}