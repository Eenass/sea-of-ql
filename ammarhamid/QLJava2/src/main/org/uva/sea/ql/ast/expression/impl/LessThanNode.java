package org.uva.sea.ql.ast.expression.impl;

import org.uva.sea.ql.ast.expression.BinaryNode;
import org.uva.sea.ql.ast.expression.ExprNode;
import org.uva.sea.ql.value.Value;

public class LessThanNode extends BinaryNode
{

    public LessThanNode(final ExprNode lhs, final ExprNode rhs)
    {
        super(lhs, rhs);
    }

    @Override
    public Value evaluate()
    {
        final Value value1 = this.lhs.evaluate();
        final Value value2 = this.rhs.evaluate();
        return value1.lessThan(value2);
    }

    @Override
    protected String getOperator()
    {
        return "<";
    }

}
