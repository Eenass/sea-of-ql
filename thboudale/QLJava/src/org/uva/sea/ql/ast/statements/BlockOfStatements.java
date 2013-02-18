package org.uva.sea.ql.ast.statements;

import java.util.ArrayList;

import org.uva.sea.ql.visitor.StmtVisitor;

public class BlockOfStatements extends Statement {
	private final ArrayList<Statement> blStms = new ArrayList<Statement>();
	
	public void addStatement(Statement stm) {
		blStms.add(stm);
	}
	
	public ArrayList<Statement> getStmts() {
		return blStms;
	}
	
	@Override
	public void accept(StmtVisitor visitor) {
		visitor.visit(this);		
	}
}