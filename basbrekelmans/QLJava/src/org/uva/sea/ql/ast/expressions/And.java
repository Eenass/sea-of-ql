package org.uva.sea.ql.ast.expressions;

import org.uva.sea.ql.ICodeLocationInformation;
import org.uva.sea.ql.ast.expressions.Logical;
import org.uva.sea.ql.visitor.IExpressionVisitor;

/**
 * Logical AND operator.
 */
public class And extends Logical {

	public And(ICodeLocationInformation codeLocation, Expression left,
			Expression right) {
		super(codeLocation, left, right);
	}

	public <T> T accept(IExpressionVisitor<T> visitor) {
		return visitor.visit(this);
	}
}
