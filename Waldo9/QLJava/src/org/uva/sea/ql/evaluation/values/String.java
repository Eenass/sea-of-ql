package org.uva.sea.ql.evaluation.values;

public class String extends Value {
	
	private final java.lang.String value;
	
	public String(java.lang.String value) {
		this.value = value;
	}
	
	public java.lang.String getValue() {
		return value;
	}

}