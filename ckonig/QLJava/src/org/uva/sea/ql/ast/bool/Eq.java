package org.uva.sea.ql.ast.bool;

import org.uva.sea.ql.ast.expressions.Expr;
import org.uva.sea.ql.common.EvaluationVisitor;
import org.uva.sea.ql.common.QLException;

public class Eq extends BinaryBooleanOperator {
    private static final String STR = "==";

    public Eq(Expr left, Expr right) {
        super(left, right);
    }

    @Override
    public final String toString() {
        return STR;
    }

    @Override
    public void accept(EvaluationVisitor visitor) throws QLException {
        visitor.visit(this);
    }
}
