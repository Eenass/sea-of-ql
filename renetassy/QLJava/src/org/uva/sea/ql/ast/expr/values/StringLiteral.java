package org.uva.sea.ql.ast.expr.values;

import java.util.Map;

import org.uva.sea.ql.IExprVisitor;
import org.uva.sea.ql.ast.types.StringType;
import org.uva.sea.ql.ast.types.Type;


public class StringLiteral extends Value {
	
	private final String value;
	
	public StringLiteral(String value) {
		this.value=value;
	}
	
	public String getValue() {
		return value;
	}

	@Override
	public <T> T accept(IExprVisitor<T> visitor) {
		return visitor.visit(this);
	}

	@Override
	public Type isOfType(Map<String, Type> typeEnv) {
		return new StringType();
	}

}
