package org.uva.sea.ql.form;

import java.util.List;

import org.uva.sea.ql.ast.eval.Env;
import org.uva.sea.ql.ast.expressions.Expr;
import org.uva.sea.ql.ast.expressions.Ident;
import org.uva.sea.ql.ast.types.Type;
import org.uva.sea.ql.ast.values.Value;
import org.uva.sea.ql.interpreter.FormElement;
import org.uva.sea.ql.messages.Error;

public class ComputedQuestion extends Question {

	private final Expr expression;
	
	public ComputedQuestion(Ident id, String question, Type questionType, Expr expression) {
		super(id,question,questionType);
		this.expression = expression;
		this.answerComponent = questionType.getAnswerField(false);
	}
	
	public Expr getExpression() {
		return expression;
	}
	
	@Override
	public String getPrintableText(int level) {
		String printableText = getIndent(level);
		printableText += id + ": " + label + " " + questionType + "(" + expression + ")" + "\n";
		printableText += getErrorText();
		return printableText;
	}
	
	@Override
	public boolean validate(Env environment) {
		errors.addAll(expression.checkType(environment));
		if (expression.typeOf(environment).getClass() != questionType.getClass()) {
			errors.add(new Error("" +
					"ComputedQuestion " + id + 
					" requires the expression to give a " + questionType + 
					" result (" + expression.typeOf(environment) + " given)"));
		}
		boolean valid = super.validate(environment);
		return errors.size() == 0 && valid;
	}
	
	@Override
	public List<FormElement> getFormComponents() {
		return getQuestionComponents();
	}
	
	@Override
	public void eval(Env environment, Form form) {
		Value expressionValue = expression.eval(environment);
		if (expressionValue != null) {
			questionType.setAnswerFieldValue(expressionValue);
		}
		super.eval(environment, form);
	}
}
