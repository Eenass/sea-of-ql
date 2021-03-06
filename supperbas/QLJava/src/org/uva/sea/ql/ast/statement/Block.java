package org.uva.sea.ql.ast.statement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.uva.sea.ql.ast.Statement;



public class Block extends Statement implements Iterable<Statement> {
	
	private final List<Statement> statements;
	
	public Block(Statement statement){
		this();
		this.statements.add(statement);
	}
	
	public Block(Statement statement, Block block) {
		this(statement);
		this.statements.addAll(block.getStatements());
	}
	
	public Block(){
		this.statements = new ArrayList<Statement>();
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}
	
	public List<Statement> getStatements(){
		return this.statements;
	}

	@Override
	public Iterator<Statement> iterator() {
		return statements.iterator();
	}
}
