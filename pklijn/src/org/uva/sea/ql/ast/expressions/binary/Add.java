<<<<<<< HEAD:pklijn/src/org/uva/sea/ql/ast/Add.java
package org.uva.sea.ql.ast;

import java.util.Map;

import org.uva.sea.ql.ast.types.Type;
import org.uva.sea.ql.ast.values.Value;
import org.uva.sea.ql.ast.values.IntValue;


public class Add extends Binary {

	public Add(Expr left, Expr right) {
		super(left, right);
	}
	
	@Override
	public Value eval() {
		return new IntValue(
				((IntValue)getLeft().eval()).getValue() +
				((IntValue)getRight().eval()).getValue()
				);
	}
	
	@Override
	public Type typeOf(Map<Ident, Type> typeEnv) {
		return new org.uva.sea.ql.ast.types.IntType();
	}
}
=======
package org.uva.sea.ql.ast.expressions.binary;


import org.uva.sea.ql.ast.eval.Env;
import org.uva.sea.ql.ast.expressions.Expr;
import org.uva.sea.ql.ast.types.IntType;
import org.uva.sea.ql.ast.types.Type;
import org.uva.sea.ql.ast.values.Value;
import org.uva.sea.ql.ast.values.IntValue;


public class Add extends Binary {

	public Add(Expr left, Expr right) {
		super(left, right);
		allowedTypes.add(new IntType());
	}
	
	@Override
	public Value eval() {
		return new IntValue(
				((IntValue)getLeft().eval()).getValue() +
				((IntValue)getRight().eval()).getValue()
				);
	}
	
	@Override
	public Type typeOf(Env environment) {
		return new org.uva.sea.ql.ast.types.IntType();
	}
}
>>>>>>> 483057f28359ecac2b999d94a928c0aaf01d2a6e:pklijn/src/org/uva/sea/ql/ast/expressions/binary/Add.java
