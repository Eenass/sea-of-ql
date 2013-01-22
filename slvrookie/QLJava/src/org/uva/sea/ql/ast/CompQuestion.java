package org.uva.sea.ql.ast;

import org.uva.sea.ql.ast.expr.Expr;
import org.uva.sea.ql.ast.expr.Ident;
import org.uva.sea.ql.ast.expr.value.StringLiteral;
import org.uva.sea.ql.ast.types.Type;
import org.uva.sea.ql.visitor.Context;
import org.uva.sea.ql.visitor.Visitor;

public class CompQuestion extends FormElement {

	private final Ident qID;
	private final StringLiteral qString;
	private final Type qType;
	private Expr qExpr;

	public CompQuestion(Ident qID, StringLiteral qString, Type qType, Expr qExpr) {
		this.qID = qID;
		this.qString = qString;
		this.qType = qType;
		this.qExpr = qExpr;
	}

	public Ident getQuestionID() {
		return qID;
	}

	public StringLiteral getQuestionString() {
		return qString;
	}

	public Type getQuestionType() {
		return qType;
	}

	public Expr getQuestionExpr() {
		return qExpr;
	}

	@Override
	public void accept(Visitor visitor, Context context) {
		visitor.visit(this, context);
	}

}
