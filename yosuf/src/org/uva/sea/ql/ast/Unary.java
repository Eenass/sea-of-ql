package org.uva.sea.ql.ast;

public abstract class Unary extends Expression {

	private final Expression operation;

	public Unary(final Expression operation) {
		this.operation = operation;
	}

	public Expression getOperation() {
		return operation;
	}
}
