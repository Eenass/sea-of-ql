package org.uva.sea.ql.visitor;

import java.util.List;
import java.util.Map;

import org.uva.sea.ql.ast.expressions.Expr;
import org.uva.sea.ql.ast.expressions.Ident;
import org.uva.sea.ql.ast.statements.BlockOfStatements;
import org.uva.sea.ql.ast.statements.ComputedQuestion;
import org.uva.sea.ql.ast.statements.Question;
import org.uva.sea.ql.ast.statements.Statement;
import org.uva.sea.ql.ast.statements.ifElseStatement;
import org.uva.sea.ql.ast.statements.ifStatement;
import org.uva.sea.ql.ast.types.Type;

public class StmtChecker implements StmtVisitor {
	private final Map<Ident, Type> typeEnv;
	private final List<String> errMsgs;
	
	public StmtChecker(Map<Ident, Type> typeEnv, List<String> errMsgs) {
		this.typeEnv = typeEnv;
		this.errMsgs = errMsgs;
	}

	@Override
	public void visit(Question stmt) {
		checkName(stmt, stmt.getType());		
	}

	@Override
	public void visit(ComputedQuestion stmt) {
		checkName(stmt, stmt.getExpr().typeOf(typeEnv));
		checkExpr(stmt.getExpr());
	}

	@Override
	public void visit(ifStatement stmt) {
		checkCondition(stmt);
		stmt.getIfStms().accept(this);
	}

	@Override
	public void visit(ifElseStatement stmt) {
		checkCondition(stmt);
		stmt.getIfStms().accept(this);
		stmt.getElseStms().accept(this);
	}

	@Override
	public void visit(BlockOfStatements stmt) {
		for (Statement s: stmt.getStmts()) {
			s.accept(this);
		}
	}
	
	private void checkName(Question stmt, Type type) {
		// TODO Auto-generated method stub
		
	}
	
	private void checkExpr(Expr expr) {
		// TODO Auto-generated method stub
		
	}
	
	private void checkCondition(ifStatement stmt) {
		// TODO Auto-generated method stub
		
	}
}