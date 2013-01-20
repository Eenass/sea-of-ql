package org.uva.sea.ql.parser.visitor.typechecking;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.uva.sea.ql.ast.nodetypes.binary.BinaryOperation;
import org.uva.sea.ql.ast.nodetypes.binary.Multiply;
import org.uva.sea.ql.ast.nodetypes.formelement.Computation;
import org.uva.sea.ql.ast.nodetypes.primary.Bool;
import org.uva.sea.ql.ast.nodetypes.primary.Datatype;
import org.uva.sea.ql.ast.nodetypes.primary.Ident;
import org.uva.sea.ql.ast.nodetypes.primary.Int;
import org.uva.sea.ql.ast.nodetypes.primary.Str;

public class ComputationTypeCheckingVisitorTest {

    private TypeCheckingVisitor typeCheckingVisitor;

    @Before
    public void init() {
        typeCheckingVisitor = new TypeCheckingVisitor();
    }

    @Test
    public void shouldReduceProperly() {
        Int number = new Int(0);
        Computation computation = new Computation(new Ident("test"), new Str("\"Label\""), number);

        typeCheckingVisitor.visitDatatype(number);
        typeCheckingVisitor.visitComputation(computation);
        assertTrue(typeCheckingVisitor.getErrors().isEmpty());
    }

    @Test
    public void shouldNotAcceptOtherExpressionThanInt() {
        Bool bool = new Bool(true);
        Computation computation = new Computation(new Ident("test"), new Str("\"Label\""), bool);

        typeCheckingVisitor.visitDatatype(bool);
        typeCheckingVisitor.visitComputation(computation);

        assertEquals(1, typeCheckingVisitor.getErrors().size());
        assertTrue(typeCheckingVisitor.getErrors().get(0) instanceof UnsupportedTypeError);
    }

    @Test
    public void shouldMakeIdentifierReduceableIfExpressionIsReduceable() {
        Datatype<?> leftHandSide = new Int(1);
        Datatype<?> rightHandSide = new Int(3);
        Datatype<?> rightHandSide2 = new Int(5);
        BinaryOperation multiply = new Multiply(leftHandSide, rightHandSide);
        Computation computation = new Computation(new Ident("test"), new Str("\"Label\""), multiply);
        BinaryOperation divide = new Multiply(new Ident("test"), rightHandSide2);

        typeCheckingVisitor.visitDatatype(leftHandSide);
        typeCheckingVisitor.visitDatatype(rightHandSide);
        typeCheckingVisitor.visitDatatype(rightHandSide2);
        typeCheckingVisitor.visitBinaryOperation(multiply);
        typeCheckingVisitor.visitComputation(computation);
        typeCheckingVisitor.visitBinaryOperation(divide);

        assertTrue(typeCheckingVisitor.getErrors().isEmpty());
    }

    @Test
    public void shouldNotMakeIdentifierReduceableIfExpressionIsNotReduceable() {
        Datatype<?> leftHandSide = new Int(1);
        Datatype<?> rightHandSide = new Int(3);
        Datatype<?> rightHandSide2 = new Int(5);
        BinaryOperation multiply = new Multiply(leftHandSide, rightHandSide);
        Computation computation = new Computation(new Ident("test"), new Str("\"Label\""), multiply);
        BinaryOperation divide = new Multiply(new Ident("test"), rightHandSide2);

        typeCheckingVisitor.visitDatatype(leftHandSide);
        typeCheckingVisitor.visitDatatype(rightHandSide);
        typeCheckingVisitor.visitDatatype(rightHandSide2);
        typeCheckingVisitor.visitComputation(computation);
        typeCheckingVisitor.visitBinaryOperation(divide);

        assertEquals(2, typeCheckingVisitor.getErrors().size());
        assertTrue(typeCheckingVisitor.getErrors().get(0) instanceof UnsupportedTypeError);
        assertTrue(typeCheckingVisitor.getErrors().get(1) instanceof UnsupportedTypeError);
    }
}