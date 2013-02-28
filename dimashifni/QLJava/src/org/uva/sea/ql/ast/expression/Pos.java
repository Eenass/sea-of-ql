package org.uva.sea.ql.ast.expression;

import org.uva.sea.ql.value.Value;
import org.uva.sea.ql.visitor.expression.ExpressionVisitor;

import java.util.Map;

public class Pos extends Expr {

    private final Expr expr;

	public Pos(Expr expr)
	{
        this.expr = expr;
	}

    @Override
    public Value evaluate(Map<Ident, Value> variables)
    {
        Value value = expr.evaluate(variables);
        return value.pos();
    }

    @Override
    public <T> T accept(ExpressionVisitor<T> visitor) {
        return visitor.visit(this);
    }

}
