package org.uva.sea.ql.ast.form;

import java.util.ArrayList;
import java.util.List;

import org.uva.sea.ql.ast.expression.Expr;
import org.uva.sea.ql.ast.visitor.FormVisitor;

public class IfStatement extends AbstractConditional {
	private final List<ElseIfStatement> elseIfStatements;
	private final ElseStatement elseStatement;
	
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
	
	public <T> T accept(FormVisitor<T> visitor) {
		return visitor.visit(this);
	}
}