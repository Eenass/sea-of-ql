package org.uva.sea.ql.ast.expressions;

import java.util.Map;
import org.uva.sea.ql.ast.types.AType;
import org.uva.sea.ql.ast.types.StringType;
import org.uva.sea.ql.visitor.IExprVisitor;

public class StrLiteral extends AExpr {
	private final String value;

	public StrLiteral(String n) {
		this.value = n;
	}

	public String getValue() {
		return value;
	}
	
	public String toString() {
		return value;
	}
	
	@Override
	public AType typeOf(Map<Ident, AType> typeEnv) {
		return new StringType();
	}
	
	@Override
	public <T> T accept(IExprVisitor<T> visitor) {
		return visitor.visit(this);
	}
}