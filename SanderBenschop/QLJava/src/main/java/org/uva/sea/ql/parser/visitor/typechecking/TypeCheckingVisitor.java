package org.uva.sea.ql.parser.visitor.typechecking;

import java.util.ArrayList;
import java.util.List;

import org.uva.sea.ql.ast.ASTNode;
import org.uva.sea.ql.ast.QLExpression;
import org.uva.sea.ql.ast.nodetypes.binary.BinaryOperation;
import org.uva.sea.ql.ast.nodetypes.formelement.Computation;
import org.uva.sea.ql.ast.nodetypes.formelement.Conditional;
import org.uva.sea.ql.ast.nodetypes.formelement.Question;
import org.uva.sea.ql.ast.nodetypes.primary.Primary;
import org.uva.sea.ql.ast.nodetypes.unary.UnaryOperationExpression;
import org.uva.sea.ql.parser.visitor.ASTNodeVisitor;
import org.uva.sea.ql.parser.visitor.QLError;
import org.uva.sea.ql.parser.visitor.QLValidator;

/**
 * Visitor that's responsible for checking if the variables that are used in the QL program are of the proper types.
 */
public class TypeCheckingVisitor implements ASTNodeVisitor, QLValidator {

    private ReductionTable reductionTable;
    private List<QLError> typeCheckingErrors;

    public TypeCheckingVisitor() {
        this.reductionTable = new ReductionTable();
        this.typeCheckingErrors = new ArrayList<QLError>();
    }

    @Override
    public void visitComputation(Computation computation) {

    }

    @Override
    public void visitConditional(Conditional conditional) {
        //Check if condition evaluates to true or false and check identifier is not redefined.
    }

    @Override
    public void visitQuestion(Question question) {
        //Check if identifier is not redefined.
    }


    @Override
    public void visitUnaryOperation(UnaryOperationExpression unaryOperation) {

    }

    @Override
    public void visitBinaryOperation(BinaryOperation binaryOperation) {
        List<Class<?>> supportedTypes = binaryOperation.getSupportedTypes();
        QLExpression leftHandSide = binaryOperation.getLeftHandSide(), rightHandSide = binaryOperation.getRightHandSide();

        Class<?> leftHandSideReduction = reductionTable.getReduceableType(leftHandSide), rightHandSideReduction = reductionTable.getReduceableType(rightHandSide);
        boolean leftHandSideReduceable = supportedTypes.contains(leftHandSideReduction), rightHandSideReduceable = supportedTypes.contains(rightHandSideReduction);

        if (leftHandSideReduction == rightHandSideReduction) {
            if(leftHandSideReduceable) {
                //Reduce this expression to the neededClass in the map.
                reductionTable.setReducableToType(binaryOperation, leftHandSideReduction);
                return;
            }
        } else if (supportedTypes.size() > 1) {
            addErrorForUnequalTypes(binaryOperation);
        }

        if (!leftHandSideReduceable) {
            addErrorForVariable(leftHandSide, supportedTypes);
        }

        if (!rightHandSideReduceable) {
            addErrorForVariable(leftHandSide, supportedTypes);
        }
    }

    @Override
    public void visitPrimary(Primary primary) {
        reductionTable.setReducableToType(primary, primary.getClass());
    }

    @Override
    public List<QLError> getErrors() {
        return typeCheckingErrors;
    }

    private void addErrorForVariable(ASTNode astNode, List<Class<?>> allowedTypes) {
        QLError unsupportedTypeError = new UnsupportedTypeError(0, astNode.getClass().getSimpleName(), allowedTypes);
        typeCheckingErrors.add(unsupportedTypeError);
    }

    private void addErrorForUnequalTypes(BinaryOperation binaryOperation) {
        QLError unequalTypesError = new UnequalTypesError(0, binaryOperation);
        typeCheckingErrors.add(unequalTypesError);
    }
}
