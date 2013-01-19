package org.uva.sea.ql.parser.visitor.typechecking;

import org.uva.sea.ql.ast.nodetypes.binary.BinaryOperation;
import org.uva.sea.ql.parser.visitor.QLError;

public class UnequalTypesError extends QLError {

    private static final String TEMPLATE = "Error: binary operation on line %d contains unequal types of respectively %s and %s.";

    private final Class<?> leftHandSideType;
    private final Class<?> rightHandSideType;

    public UnequalTypesError(int line, BinaryOperation binaryOperation) {
        super(line);
        this.leftHandSideType = binaryOperation.getLeftHandSide().getClass();
        this.rightHandSideType = binaryOperation.getRightHandSide().getClass();
    }

    @Override
    public String getErrorMessage() {
        return String.format(TEMPLATE, getLine(), leftHandSideType.getSimpleName(), rightHandSideType.getSimpleName());
    }
}
