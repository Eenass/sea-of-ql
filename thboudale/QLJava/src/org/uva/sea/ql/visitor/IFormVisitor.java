package org.uva.sea.ql.visitor;

import org.uva.sea.ql.ast.Form;
import org.uva.sea.ql.ast.statements.BlockOfStatements;
import org.uva.sea.ql.ast.statements.ComputedQuestion;
import org.uva.sea.ql.ast.statements.Question;
import org.uva.sea.ql.ast.statements.ifElseStatement;
import org.uva.sea.ql.ast.statements.ifStatement;

public interface IFormVisitor<T> {
	
	T visit(Question stmt);
	T visit(ComputedQuestion stmt);
	T visit(ifStatement stmt);
	T visit(ifElseStatement stmt);
	T visit(BlockOfStatements stmt);
	T visit(Form form);
}