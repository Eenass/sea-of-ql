package org.uva.sea.ql.visitor;

import org.uva.sea.ql.ast.statements.BlockOfStatements;
import org.uva.sea.ql.ast.statements.ComputedQuestion;
import org.uva.sea.ql.ast.statements.Question;
import org.uva.sea.ql.ast.statements.ifElseStatement;
import org.uva.sea.ql.ast.statements.ifStatement;

public interface StmtVisitor {
	
	void visit(Question stmt);
	void visit(ComputedQuestion stmt);
	void visit(ifStatement stmt);
	void visit(ifElseStatement stmt);
	void visit(BlockOfStatements stmt);
}