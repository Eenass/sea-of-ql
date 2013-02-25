package org.uva.sea.ql.ast.stat;

import org.uva.sea.ql.ast.expr.Ident;
import org.uva.sea.ql.ast.types.Type;
import org.uva.sea.ql.ast.visitor.VisitorStatements;

public class Question extends FormUnit {

	private final Ident name;
	private final String body;
	private final Type type;
	
	public Question(Ident name, String body, Type type) {
		this.name = name;
		this.body = body;
		this.type = type;
	}

	public Ident getName() {
		return name;
	}

	public String getBody() {
		return body;
	}

	public Type getType() {
		return type;
	}

	@Override
	public <T> T accept(VisitorStatements<T> visitor) {
		return visitor.visit(this);
	}

}