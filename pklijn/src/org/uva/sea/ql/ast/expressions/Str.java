package org.uva.sea.ql.ast.expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.uva.sea.ql.ast.types.Type;
import org.uva.sea.ql.ast.values.Value;
import org.uva.sea.ql.messages.Message;

public class Str extends Expr {

	private final java.lang.String value;

	public Str(java.lang.String value) {
		this.value = value;
	}

	public java.lang.String getValue() {
		return value;
	}

	@Override
	public Value eval() {
		return new org.uva.sea.ql.ast.values.StringValue(value);
	}

	@Override
	public Type typeOf(Map<Ident, Type> typeEnv) {
		return new org.uva.sea.ql.ast.types.StringType();
	}
	
	@Override
	public List<Message> checkType(Map<Ident, Type> typeEnv) {
		List<Message> errors = new ArrayList<Message>();
		return errors;
	}

}
