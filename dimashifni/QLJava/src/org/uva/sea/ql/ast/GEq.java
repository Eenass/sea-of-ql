package org.uva.sea.ql.ast;

import org.uva.sea.ql.ast.Expr;
import org.uva.sea.ql.value.Value;

public class GEq extends Expr {
    private final Expr rhs;
    private final Expr lhs;
	
	public GEq(Expr rhs, Expr lhs)
	{
        this.rhs = rhs;
        this.lhs = lhs;
	}

    @Override
    public Value evaluate()
    {
        Value rhs = this.rhs.evaluate();
        Value lhs = this.lhs.evaluate();
        return rhs.gEq(rhs);
    }
}
