package org.uva.sea.ql.ast.values;

import java.util.Map;

import org.uva.sea.ql.ast.expr.Ident;
import org.uva.sea.ql.ast.types.IntType;
import org.uva.sea.ql.ast.types.Type;
import org.uva.sea.ql.visitor.ASTNodeVisitor;

public class Int extends Value<Integer> {

	public Int(int value) {
		super(value);

	}

	@Override
	public void accept(ASTNodeVisitor nodeVisitor) {
		// TODO Auto-generated method stub

	}

	@Override
	public Type isOfType(Map<Ident, Type> typeEnv) {
		return new IntType();
	}

}
