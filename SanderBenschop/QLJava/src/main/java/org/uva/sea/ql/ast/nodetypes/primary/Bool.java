package org.uva.sea.ql.ast.nodetypes.primary;

public final class Bool extends Datatype<Boolean> {

	private final boolean value;
	
	public Bool(boolean value) {
		this.value = value;
	}
	
	@Override
	public Boolean getValue() {
		return value;
	}
}