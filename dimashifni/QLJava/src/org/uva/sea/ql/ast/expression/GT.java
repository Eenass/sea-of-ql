package org.uva.sea.ql.ast.expression;

import org.uva.sea.ql.type.BoolType;
import org.uva.sea.ql.type.Type;
import org.uva.sea.ql.value.Value;
import org.uva.sea.ql.visitor.expression.ExpressionVisitor;

import java.util.Map;

public class GT extends Expr {
    private final Expr rhs;
    private final Expr lhs;

    public GT(Expr rhs, Expr lhs)
    {
        this.rhs = rhs;
        this.lhs = lhs;
    }

    public Expr getLhs() {
        return lhs;
    }

    public Expr getRhs() {
        return rhs;
    }

    @Override
    public Value evaluate(Map<Ident, Value> variables)
    {
        Value lhs = this.lhs.evaluate(variables);
        Value rhs = this.rhs.evaluate(variables);
        return lhs.gT(rhs);
    }

    @Override
    public <T> T accept(ExpressionVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public Type getType() {
        return new BoolType();
    }

}
