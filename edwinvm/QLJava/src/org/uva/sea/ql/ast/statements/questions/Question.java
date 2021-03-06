package org.uva.sea.ql.ast.statements.questions;

import org.uva.sea.ql.ast.statements.FormStatement;

public abstract class Question extends FormStatement {
	private final QuestionLabel _label;
	private final QuestionVariable _variable;
	
	protected Question(QuestionLabel label, QuestionVariable variable) {
		_label = label;
		_variable = variable;
	}
	
	public QuestionLabel getQuestionLabel() {
		return _label;
	}
	
	public QuestionVariable getQuestionVariable() {
		return _variable;
	}
}