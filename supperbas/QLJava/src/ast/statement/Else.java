package ast.statement;

import java.util.Map;

import ast.Statement;
import ast.type.Ident;
import ast.type.Type;
import ast.visitor.Visitor;

public class Else extends Statement {
	
	private final Statement consequence;
	
	public Else(Statement consequence){
		this.consequence = consequence;
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return null; //visitor.visit(this);
	}

	@Override
	public Type typeOf(Map<Ident, Type> typeEnv) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Statement getConsequence(){
		return this.consequence;
	}

}
