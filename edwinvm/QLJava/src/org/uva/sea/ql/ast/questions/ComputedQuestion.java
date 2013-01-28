package org.uva.sea.ql.ast.questions;

import org.uva.sea.ql.ast.Expr;
import org.uva.sea.ql.ast.Question;
import org.uva.sea.ql.ast.values.Ident;
import org.uva.sea.ql.ast.values.Str;

public class ComputedQuestion extends Question {
	private final Expr _expression;

	public ComputedQuestion(Str label, Ident variable, Expr expression) {
		setLabel(label);
		setVariable(variable);
		_expression = expression;
	}
	
	public Expr getExpression() {
		return _expression;
	}
}