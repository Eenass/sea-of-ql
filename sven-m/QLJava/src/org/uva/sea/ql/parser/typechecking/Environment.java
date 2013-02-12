package org.uva.sea.ql.parser.typechecking;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.uva.sea.ql.ast.expression.Ident;
import org.uva.sea.ql.ast.type.Type;

public class Environment {
	Map<String, Type> types;
	List<String> errors;
	
	public Environment() {
		types = new HashMap<>();
	}
	
	public Type checkIdentType(Ident id) {
		return types.get(id.getName());
	}
	
	
	
}
