package org.uva.sea.ql.ast.expressions;

import org.uva.sea.ql.ICodeLocationInformation;
import org.uva.sea.ql.ast.IExpressionVisitor;

public class UnaryNot extends Unary {

	public UnaryNot(ICodeLocationInformation codeLocation, Expression operand) {
		super(codeLocation, operand);
	}

	public <T> T accept(IExpressionVisitor<T> visitor)
	{
		return visitor.visit(this);
	}
}
