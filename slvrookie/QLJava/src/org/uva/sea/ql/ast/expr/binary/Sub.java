package org.uva.sea.ql.ast.expr.binary;

import java.util.Map;

import org.uva.sea.ql.ast.expr.*;
import org.uva.sea.ql.ast.types.IntType;
import org.uva.sea.ql.ast.types.MoneyType;
import org.uva.sea.ql.ast.types.Numeric;
import org.uva.sea.ql.ast.types.Type;
import org.uva.sea.ql.visitor.IExprVisitor;

public class Sub extends BinaryExpr {

	public Sub(Expr result, Expr rhs) {
		super(result, rhs);
	}

	@Override
	public Type typeOf(Map<String, Type> typeEnv) {
		if(this.getLhs().typeOf(typeEnv).isCompatibleToIntType() && this.getRhs().typeOf(typeEnv).isCompatibleToIntType()) {
			return new IntType();
		}
		if(this.getLhs().typeOf(typeEnv).isCompatibleToMoneyType() && this.getRhs().typeOf(typeEnv).isCompatibleToMoneyType()) {
			return new MoneyType();
		}
		return new Numeric();
	}

	@Override
	public <T> T accept(IExprVisitor<T> visitor) {
		return visitor.visit(this);
	}
	
}
