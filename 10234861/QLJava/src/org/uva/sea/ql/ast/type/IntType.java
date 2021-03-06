package org.uva.sea.ql.ast.type;

public class IntType extends NumericType {

	@Override
	public boolean isCompatibleTo(Type t) {
		return t.isCompatibleToInt();
	}

	@Override
	public boolean isCompatibleToInt() {
		return true;
	}

}
