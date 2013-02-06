package org.uva.sea.ql.ast.form;

import org.uva.sea.ql.ast.expression.Expr;
import org.uva.sea.ql.ast.expression.Ident;
import org.uva.sea.ql.ast.type.ExprType;

public class Computed extends Question {
	private final Expr expression;
	
	public Computed(Ident name, String label, ExprType type,
			Expr expression)
	{
		super(name, label, type);
		this.expression = expression;
	}
	
	public Expr getExpression() {
		return expression;
	}
	
}
