package org.uva.sea.ql.ast.stat;

import org.uva.sea.ql.ast.expr.Ident;
import org.uva.sea.ql.ast.type.Type;
import org.uva.sea.ql.ast.visitor.StatementVisitor;

public abstract class TypedStat implements Stat {

	protected final Ident ident;
	protected final String label;
	protected final Type type;
	
	//statement which has a type
	public TypedStat(Ident ident, String label, Type type) {
		this.ident = ident;
		this.label = label;
		this.type = type;
	}

	public Ident getIdent() {
		return this.ident;
	}

	public String getLabel() {
		return this.label;
	}

	public Type getType() {
		return this.type;
	}

	@Override
	public void accept(StatementVisitor visitor) {
	}

	@Override
	public String toString() {
		return "TypedStat Ident(" + this.ident.toString() + ") Type("
				+ this.type.toString() + ") Label(" + this.label + ")";
	}
}
