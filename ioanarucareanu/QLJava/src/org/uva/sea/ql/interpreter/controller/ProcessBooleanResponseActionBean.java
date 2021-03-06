package org.uva.sea.ql.interpreter.controller;

import org.uva.sea.ql.ast.expr.value.BooleanVal;
import org.uva.sea.ql.ast.expr.value.UndefinedVal;
import org.uva.sea.ql.ast.expr.value.Val;

import net.sourceforge.stripes.action.UrlBinding;
import net.sourceforge.stripes.validation.Validate;

@UrlBinding(value = ProcessBooleanResponseActionBean.URL_BINDING)
public class ProcessBooleanResponseActionBean extends ProcessResponseActionBean {

	/** Constant denoting the url binding for the current action bean. */
    public static final String URL_BINDING = "/protected/question/process/bool";
	
	private Boolean answer;
	
	public Boolean getAnswer() {
		return answer;
	}

	public void setAnswer(Boolean answer) {
		this.answer = answer;
	}

	@Override
	public Val getAnswerVal() {
		if (answer == null) {
			return new UndefinedVal();
		}
		return new BooleanVal(answer);
	}

}
