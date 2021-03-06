package org.uva.sea.ql.ast.statement;

import org.uva.sea.ql.ast.Statement;
import org.uva.sea.ql.ast.Type;
import org.uva.sea.ql.ast.expression.Ident;


public class Var extends Statement {

	private final Ident ident;
	private final Type type;

	public Var(Ident ident, Type type) {
		this.ident = ident;
		this.type = type;
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}

	public Ident getIdent() {
		return ident;
	}

	public Type getType() {
		return type;
	}

}
