package org.uva.sea.ql.ast.expressions.literals;

import java.util.Map;
import org.uva.sea.ql.ast.expressions.Ident;
import org.uva.sea.ql.ast.types.AType;
import org.uva.sea.ql.ast.types.StringType;
import org.uva.sea.ql.semanticCheck.ExprVisitor;

public class StrLiteral extends ALiteral {
	private final String value;

	public StrLiteral(String n) {
		this.value = n;
	}

	public String getValue() {
		return value;
	}
	
	@Override
	public AType typeOf(Map<Ident, AType> typeEnv) {
		return new StringType();
	}
	
	@Override
	public <T> T accept(ExprVisitor<T> visitor) {
		return visitor.visit(this);
	}
}