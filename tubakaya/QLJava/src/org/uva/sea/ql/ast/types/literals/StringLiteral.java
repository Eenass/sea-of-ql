package org.uva.sea.ql.ast.types.literals;

import org.uva.sea.ql.ast.Expression;
import org.uva.sea.ql.ast.ExpressionTypeVisitor;
import org.uva.sea.ql.ast.ExpressionVisitor;
import org.uva.sea.ql.ast.types.Type;

public class StringLiteral extends Expression {

	public final String value;

	public StringLiteral(String string) {
		this.value = string;
	}

	@Override
	public void accept(ExpressionVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public Type accept(ExpressionTypeVisitor visitor) {
		return visitor.visit(this);
	}
}
