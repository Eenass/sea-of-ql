package org.uva.sea.ql.ast.expressions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.uva.sea.ql.ast.eval.Env;
import org.uva.sea.ql.ast.types.Type;
import org.uva.sea.ql.ast.values.Value;
import org.uva.sea.ql.messages.Message;
import org.uva.sea.ql.messages.Error;

public class Ident extends Expr {

	private final String name;

	public Ident(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Ident))
			return false;
		return name.equals(((Ident)obj).name);
	}

	@Override
	public Value eval(Env environment) {
		if (environment.hasValue(this)) {
			return environment.getValue(this);
		}
		return typeOf(environment).getDefaultValue();
	}

	@Override
	public Type typeOf(Env environment) {
		return environment.typeOf(this);
	}
	
	@Override
	public List<Message> checkType(Env environment) {
		List<Message> errors = new ArrayList<Message>();
		
		if (!environment.typeOf(this).isDefined()) {
			errors.add(new Error("Ident " + name + " does not exist in current environment!"));
		}
		
		return errors;
	}
	
	@Override
	public String toString() {
		return name;
	}

	@Override
	public Set<Type> allowedArgumentTypes() {
		return new HashSet<Type>();
	}
}
