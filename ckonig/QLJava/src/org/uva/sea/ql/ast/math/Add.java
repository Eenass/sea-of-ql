package org.uva.sea.ql.ast.math;

import org.uva.sea.ql.ast.expressions.Expr;
import org.uva.sea.ql.common.ExpressionVisitor;
import org.uva.sea.ql.common.QLException;

public class Add extends BinaryMathOperator {
    private static final String STR = "+";

    public Add(Expr left, Expr right) {
        super(left, right);
    }

    @Override
    public final String toString() {
        return STR;
    }

    @Override
    public final void accept(ExpressionVisitor visitor) throws QLException {
        visitor.visit(this);
    }

}
