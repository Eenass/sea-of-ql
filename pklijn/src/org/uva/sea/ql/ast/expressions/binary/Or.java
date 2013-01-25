<<<<<<< HEAD:pklijn/src/org/uva/sea/ql/ast/Or.java
package org.uva.sea.ql.ast;

import java.util.Map;

import org.uva.sea.ql.ast.types.Type;
import org.uva.sea.ql.ast.values.BoolValue;
import org.uva.sea.ql.ast.values.Value;

public class Or extends Binary {

	public Or(Expr left, Expr right) {
		super(left, right);
	}

	@Override
	public Value eval() {
		return new BoolValue(
				((BoolValue)getLeft().eval()).getValue() ||
				((BoolValue)getRight().eval()).getValue()
				);
	}

	@Override
	public Type typeOf(Map<Ident, Type> typeEnv) {
		return new org.uva.sea.ql.ast.types.BoolType();
	}

}
=======
package org.uva.sea.ql.ast.expressions.binary;


import org.uva.sea.ql.ast.eval.Env;
import org.uva.sea.ql.ast.expressions.Expr;
import org.uva.sea.ql.ast.types.BoolType;
import org.uva.sea.ql.ast.types.Type;
import org.uva.sea.ql.ast.values.BoolValue;
import org.uva.sea.ql.ast.values.Value;

public class Or extends Binary {

	public Or(Expr left, Expr right) {
		super(left, right);
		allowedTypes.add(new BoolType());
	}

	@Override
	public Value eval() {
		return new BoolValue(
				((BoolValue)getLeft().eval()).getValue() ||
				((BoolValue)getRight().eval()).getValue()
				);
	}

	@Override
	public Type typeOf(Env environment) {
		return new org.uva.sea.ql.ast.types.BoolType();
	}
}
>>>>>>> 483057f28359ecac2b999d94a928c0aaf01d2a6e:pklijn/src/org/uva/sea/ql/ast/expressions/binary/Or.java
