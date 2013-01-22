package org.uva.sea.ql.ast.datatype;

import org.uva.sea.ql.ast.Visitor;

public class StringType extends Datatype {
	private String value;
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.setDefined();
		this.value = value;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	@Override
	public boolean isCompatibleTo(Datatype type) {
		return type.isCompatibleToString();
	}

	public boolean isCompatibleToString() {
		return true;
	}
}
