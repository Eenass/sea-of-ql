package org.uva.sea.ql.ast.form;

import org.uva.sea.ql.ast.expr.type.IdentExprType;
import org.uva.sea.ql.ast.statement.Block;
import org.uva.sea.ql.visitor.FormVisitor;

public class QuestionForm extends AbstractForm {

	private final IdentExprType ident;
	private final Block statements;

	public QuestionForm(IdentExprType ident, Block statements) {
		this.ident = ident;
		this.statements = statements;
	}

	public IdentExprType getIdent() {
		return this.ident;
	}

	public Block getStatements() {
		return this.statements;
	}

	@Override
	public void accept(FormVisitor<?> visitor) {
		visitor.visit(this);
	}

}
