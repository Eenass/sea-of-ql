package org.uva.sea.ql.ast.statement;

import java.util.List;

import org.uva.sea.ql.visitor.StatementVisitor;

public class Block extends AbstractStatement {

	private final List<AbstractStatement> statements;

	public Block(List<AbstractStatement> statements) {
		this.statements = statements;
	}

	public List<AbstractStatement> getStatements() {
		return this.statements;
	}

	@Override
	public void accept(StatementVisitor<?> visitor) {
		visitor.visit(this);
	}

}
