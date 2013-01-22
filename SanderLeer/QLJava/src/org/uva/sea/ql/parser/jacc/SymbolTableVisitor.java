package org.uva.sea.ql.parser.jacc;

import java.util.ArrayList;
import org.uva.sea.ql.ast.*;

public class SymbolTableVisitor implements ASTNodeVisitor {
	private final SymbolTable symbols;
	private final ArrayList<String> errors;

	public SymbolTableVisitor(SymbolTable symboltable) {
		this.errors = new ArrayList<>();
		this.symbols = symboltable;
	}

	protected void addError(String s) {
		errors.add(s);
	}

	public String getErrors() {
		StringBuilder sb = new StringBuilder();
		for (String error : errors) {
			if (sb.length() > 0) {
				sb.append("\n");
			}
			sb.append(error);
		}
		return sb.toString();
	}

	public boolean hasErrors() {
		return !errors.isEmpty();
	}

	@Override
	public void visit(Pos node) {
		node.getOperand().accept(this);
	}

	@Override
	public void visit(Neg node) {
		node.getOperand().accept(this);
	}

	@Override
	public void visit(Not node) {
		node.getOperand().accept(this);
	}

	@Override
	public void visit(Mul node) {
		node.getLhs().accept(this);
		node.getRhs().accept(this);
	}

	@Override
	public void visit(Div node) {
		node.getLhs().accept(this);
		node.getRhs().accept(this);
	}

	@Override
	public void visit(Add node) {
		node.getLhs().accept(this);
		node.getRhs().accept(this);
	}

	@Override
	public void visit(Sub node) {
		node.getLhs().accept(this);
		node.getRhs().accept(this);
	}

	@Override
	public void visit(Eq node) {
		node.getLhs().accept(this);
		node.getRhs().accept(this);
	}

	@Override
	public void visit(NEq node) {
		node.getLhs().accept(this);
		node.getRhs().accept(this);
	}

	@Override
	public void visit(GT node) {
		node.getLhs().accept(this);
		node.getRhs().accept(this);
	}

	@Override
	public void visit(LT node) {
		node.getLhs().accept(this);
		node.getRhs().accept(this);
	}

	@Override
	public void visit(GEq node) {
		node.getLhs().accept(this);
		node.getRhs().accept(this);
	}

	@Override
	public void visit(LEq node) {
		node.getLhs().accept(this);
		node.getRhs().accept(this);
	}

	@Override
	public void visit(And node) {
		node.getLhs().accept(this);
		node.getRhs().accept(this);
	}

	@Override
	public void visit(Or node) {
		node.getLhs().accept(this);
		node.getRhs().accept(this);
	}

	@Override
	public void visit(Identifier node) {
		if (!symbols.contains(node.getName())) {
			addError("Variable '" + node.getName() + "' not defined");
		}
	}

	@Override
	public void visit(IntegerLiteral node) {
	}

	@Override
	public void visit(BooleanLiteral node) {
	}

	@Override
	public void visit(StringLiteral node) {
	}

	@Override
	public void visit(IntegerType node) {
	}

	@Override
	public void visit(StringType node) {
	}

	@Override
	public void visit(BooleanType node) {
	}

	@Override
	public void visit(Form node) {
		node.getStatements().accept(this);
	}

	@Override
	public void visit(StatementList node) {
		for (Statement e : node.getList()) {
			e.accept(this);
		}
	}

	private void addQuestionSymbol(Identifier identifier, Datatype datatype) {
		if (symbols.contains(identifier.getName())) {
			addError("Question identifier '" + identifier.getName() + "' already defined");
		} else {
			symbols.put(identifier.getName(), datatype);
		}
	}
	
	@Override
	public void visit(Question node) {
		addQuestionSymbol(node.getIdentifier(), node.getDatatype());
	}

	@Override
	public void visit(ComputedQuestion node) {
		addQuestionSymbol(node.getIdentifier(), node.getDatatype());
		node.getExpression().accept(this);
	}

	@Override
	public void visit(IfStatement node) {
		node.getExpression().accept(this);
		node.getStatements().accept(this);
	}
}