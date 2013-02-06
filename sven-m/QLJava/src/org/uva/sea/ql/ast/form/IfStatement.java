package org.uva.sea.ql.ast.form;

import java.util.ArrayList;
import java.util.List;

import org.uva.sea.ql.ast.expression.Expr;

public class IfStatement extends AbstractConditional {
	private final List<ElseIfStatement> elseIfStatements;
	private final ElseStatement elseStatement;
	
	public IfStatement(Expr condition, Body body) {
		super(condition, body);
		elseIfStatements = null;
		elseStatement = null;
	}
	
	public IfStatement(Expr condition, Body body,
			List<ElseIfStatement> elseIfs)
	{
		super(condition, body);
		
		elseIfStatements = new ArrayList<>(elseIfs);
		elseStatement = null;
	}
	
	public IfStatement(Expr condition, Body body,
			List<ElseIfStatement> elseIfs, ElseStatement elseStatement)
	{
		super(condition, body);
		
		this.elseIfStatements = new ArrayList<>(elseIfs);
		this.elseStatement = elseStatement;
	}
	
	public List<ElseIfStatement> getElseIfs() {
		return new ArrayList<>(elseIfStatements);
	}
	
	public ElseStatement getElse() {
		return elseStatement;
	}
}
