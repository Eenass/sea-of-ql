package org.uva.sea.ql.ast.bool;

import org.uva.sea.ql.ast.expressions.Expr;
import org.uva.sea.ql.ast.interfaces.Evaluatable;
import org.uva.sea.ql.common.VisitorException;
import org.uva.sea.ql.common.interfaces.EvaluationVisitor;

public class LT extends BinaryBooleanOperator implements Evaluatable {
    public static final String STR = "<";

    public LT(Expr left, Expr right) {
        super(left, right);
    }

    @Override
    public final String toString() {
        return STR;
    }

    @Override
    public void accept(EvaluationVisitor visitor) throws VisitorException {
        visitor.visit(this);
    }
}
