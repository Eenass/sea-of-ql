package org.uva.sea.ql.evaluator;

import org.uva.sea.ql.Observable;
import org.uva.sea.ql.ast.type.Type;
import org.uva.sea.ql.evaluator.value.Undefined;
import org.uva.sea.ql.evaluator.value.Value;

public class Bindable {
	private Type type;
	private Observable observable;
	private Value value;

	public Bindable( Type type ) {
		this.type = type;
		this.value = Undefined.UNDEFINED;
		this.observable = null;
	}

	public void setValue( Value value ) {
		this.value = value;
	}

	public void setType( Type type ) {
		this.type = type;
	}

	public void setObservable( Observable observable ) {
		this.observable = observable;
	}

	public Type getType() {
		return this.type;
	}

	public Value getValue() {
		return this.value;
	}

	public Observable getObservable() {
		return this.observable;
	}
}