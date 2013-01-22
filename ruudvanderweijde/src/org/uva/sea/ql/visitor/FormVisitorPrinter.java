package org.uva.sea.ql.visitor;

import org.uva.sea.ql.ast.Form;
import org.uva.sea.ql.ast.stmt.IfThenElse;
import org.uva.sea.ql.ast.stmt.Question;
import org.uva.sea.ql.ast.stmt.Statement;
import org.uva.sea.ql.ast.type.Type;

public class FormVisitorPrinter implements FormVisitor {

	private int depth = 0;

	@Override
	public void visit(Form form) {
		printString("Form " + "\t id: " + form.getId().getName()
				+ "\t Statement count: " + form.getStatements().size());
		increaseDepth();
		for (Statement stmt : form.getStatements()) {
			stmt.accept(this);
		}
		decreaseDepth();
	}

	@Override
	public void visit(IfThenElse ifThenElse) {
		printString("IfThenElse " + "\t condition type: "
				+ ifThenElse.getCondition().getClass() + "\t ifBlock count: "
				+ ifThenElse.getIfBlock().size() + "\t elseBlock count: "
				+ ifThenElse.getElseBlock().size());
		increaseDepth();
		printString("IF");
		ifThenElse.getCondition().accept(this);
		increaseDepth();
		for (Statement stmt : ifThenElse.getIfBlock()) {
			stmt.accept(this);
		}
		decreaseDepth();
		printString("ELSE");
		increaseDepth();
		for (Statement stmt : ifThenElse.getElseBlock()) {
			stmt.accept(this);
		}
		decreaseDepth();
		decreaseDepth();
	}

	@Override
	public void visit(Question question) {
		printString("Question " + "\t id: "
				+ question.getId().getName() + "\t label: "
				+ question.getLabel() + "\t type: "
				+ question.getType().getClass());
		increaseDepth();
		question.getType().accept(this);
		decreaseDepth();
	}

	@Override
	public void visit(Type type) {
		printString("Type: " + type.getClass());
		increaseDepth();
		if (type.isComputated()) {
			type.getExpr().accept(this);
		}
		decreaseDepth();
	}
	
	// pretty print helper methods
	private int getDepth() {
		return depth;
	}

	private void increaseDepth() {
		this.depth += 1;
	}

	private void decreaseDepth() {
		this.depth -= 1;
	}

	private void printString(String str) {
		String tab = "\t";
		System.out.println(repeatString(tab, getDepth()) + "- " + str);
	}

	private static String repeatString(String s, int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(s);
		}

		return sb.toString();
	}
}