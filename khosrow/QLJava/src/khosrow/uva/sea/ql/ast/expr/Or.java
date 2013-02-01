package khosrow.uva.sea.ql.ast.expr;

import khosrow.uva.sea.ql.ast.type.Bool;
import khosrow.uva.sea.ql.ast.type.Type;
import khosrow.uva.sea.ql.eval.env.Env;


public class Or extends Binary {
	public Or(Expr lhs, Expr rhs) {
		super(lhs, rhs);
	}
	
	@Override
	public Type TypeOf(Env typeEnv) {		
		return new Bool();
	}
}
