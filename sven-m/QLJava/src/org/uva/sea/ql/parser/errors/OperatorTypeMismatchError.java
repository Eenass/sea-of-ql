package org.uva.sea.ql.parser.errors;

import org.uva.sea.ql.ast.expression.Expr;
import org.uva.sea.ql.ast.form.FormElement;

public class OperatorTypeMismatchError extends SemanticError {
	private final Expr expression;
	
	public OperatorTypeMismatchError(FormElement formElement, Expr expression,
			String message)
	{
		
	}
}