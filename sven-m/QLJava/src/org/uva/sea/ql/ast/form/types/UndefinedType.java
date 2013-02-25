package org.uva.sea.ql.ast.form.types;

import org.uva.sea.ql.ast.ASTNode;
import org.uva.sea.ql.ast.misc.Location;
import org.uva.sea.ql.ast.visitor.TypeVisitor;

public class UndefinedType extends Type implements ASTNode {
	
	public UndefinedType(Location location) {
		super(location);
	}
	
	@Override
	public <T> T accept(TypeVisitor<T> visitor) {
		return visitor.visit(this);
	}
	
	public String toString() {
		return "undefined";
	}
}
