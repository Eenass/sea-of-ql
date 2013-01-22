package ast.expressions.eval;

import java.util.Map;

import ast.Expression;
import ast.expressions.Eval;
import ast.types.Type;

public class GT extends Eval {
	private final int level = 2;

	public GT(Expression lhs, Expression rhs) {
		super(lhs, rhs);
	}

	public int getLevel() {
		return level;
	}
	
	@Override
	public Type typeOf(Map<ast.types.Ident, Type> typeEnv) {
		return new ast.types.Numeric();
	}

}
