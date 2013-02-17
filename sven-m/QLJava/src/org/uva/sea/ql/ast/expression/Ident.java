package org.uva.sea.ql.ast.expression;

import org.uva.sea.ql.ast.Location;
import org.uva.sea.ql.ast.visitor.ExpressionVisitor;

public class Ident extends Leaf {
	private final String name;

	public Ident(String name, Location location) {
		super(location);
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public <T> T accept(ExpressionVisitor<T> visitor) {
		return visitor.visit(this);
	}

}
