package org.uva.sea.ql.ast.stat;

import org.uva.sea.ql.ast.expr.Expr;
import org.uva.sea.ql.ast.expr.Ident;
import org.uva.sea.ql.ast.nodes.values.Value;
import org.uva.sea.ql.ast.type.Type;

public abstract class ComputedStat extends TypedStat{

	private Value value;
	public ComputedStat(Ident ident, String label, Expr computableExpr, Type type) {
		super(ident, label, type);
	}

	public Expr getExpr() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private Value computeValue(){
		return value;
	}
	
	public Value getValue(){
		return value;
	}

	

}
