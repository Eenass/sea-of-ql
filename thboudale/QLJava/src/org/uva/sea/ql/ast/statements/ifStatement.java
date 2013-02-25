package org.uva.sea.ql.ast.statements;

import org.uva.sea.ql.ast.expressions.AExpr;
import org.uva.sea.ql.visitor.IFormStmtVisitor;

public class ifStatement extends AStatement {
	private final AExpr condition;
	private final BlockOfStatements ifStmts;
	
	public ifStatement(AExpr condition, BlockOfStatements ifStmts) {
		this.condition = condition;
		this.ifStmts = ifStmts;
	}
	
	public AExpr getCondition() {
		return condition;
	}
	
	public BlockOfStatements getIfStmts() {
		return ifStmts;
	}
	
	@Override
	public <T> T accept(IFormStmtVisitor<T> visitor) {
		return visitor.visit(this);		
	}
}