package org.uva.sea.ql.parser.test;

import org.uva.sea.ql.ast.expression.Expr;
import org.uva.sea.ql.ast.form.Body;
import org.uva.sea.ql.ast.form.FormElement;
import org.uva.sea.ql.ast.form.QLForm;

public interface IParse {
	
	QLForm parse(String src) throws ParseError;
	QLForm parseForm(String src) throws ParseError;
	Body parseBody(String src) throws ParseError;
	FormElement parseFormElement(String src) throws ParseError;
	Expr parseExpression(String src) throws ParseError;
	
}
