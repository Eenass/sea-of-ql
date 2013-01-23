package org.uva.sea.ql.ast.expr.atom;

import org.uva.sea.ql.visitor.Expression;

public class Ident extends AbstractAtom {

	private final java.lang.String value;

	public Ident(java.lang.String value) {
		this.value = value;
	}

	public java.lang.String getName() {
		return value;
	}

	@Override
	public <T> T accept(Expression<T> visitor) {
		return visitor.visit(this);
	}

}