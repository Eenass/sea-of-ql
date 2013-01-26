package org.uva.sea.ql.ast.type;

import org.uva.sea.ql.visitor.Type;

public class Form extends AbstractType {

	@Override
	public <T> T accept(Type<T> visitor) {
		return visitor.visit(this);
	}

}
