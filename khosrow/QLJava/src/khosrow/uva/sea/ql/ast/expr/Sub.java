package khosrow.uva.sea.ql.ast.expr;

import khosrow.uva.sea.ql.ast.type.Numeric;
import khosrow.uva.sea.ql.ast.type.Type;
import khosrow.uva.sea.ql.env.Env;
import khosrow.uva.sea.ql.visitor.IExpressionVisitor;


public class Sub extends Binary {
	public Sub(Expr lhs, Expr rhs) {
		super(lhs, rhs);
	}
	
	@Override
	public Type TypeOf(Env typeEnv) {
		return new Numeric();
	}
	
	@Override
	public <T> T Accept(IExpressionVisitor<T> visitor) {
		return visitor.Visit(this);
	}
}
