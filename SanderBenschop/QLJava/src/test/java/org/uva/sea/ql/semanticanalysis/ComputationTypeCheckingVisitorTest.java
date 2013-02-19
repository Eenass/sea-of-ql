package org.uva.sea.ql.semanticanalysis;

import org.junit.Before;
import org.junit.Test;
import org.uva.sea.ql.ast.expression.binary.Multiply;
import org.uva.sea.ql.ast.expression.primary.Ident;
import org.uva.sea.ql.ast.expression.primary.Int;
import org.uva.sea.ql.ast.expression.primary.Str;
import org.uva.sea.ql.ast.SourceCodeInformation;
import org.uva.sea.ql.ast.statement.Computation;
import org.uva.sea.ql.general.SymbolTable;

import static junit.framework.Assert.assertTrue;

public class ComputationTypeCheckingVisitorTest {

    private SourceCodeInformation sourceCodeInformation;
    private SemanticAnalysisVisitor semanticAnalysisVisitor;

    @Before
    public void init() {
        sourceCodeInformation = new SourceCodeInformation(0, 0);
        semanticAnalysisVisitor = new SemanticAnalysisVisitor(new SymbolTable());
    }

    @Test
    public void shouldReduceProperly() {
        Ident ident = new Ident("test", sourceCodeInformation);
        Str str = new Str("\"Label\"", sourceCodeInformation);
        Int number = new Int(0, sourceCodeInformation);
        Computation computation = new Computation(ident, str, number);

        boolean computationCorrect = semanticAnalysisVisitor.visitComputation(computation);
        assertTrue(semanticAnalysisVisitor.getErrors().isEmpty());
        assertTrue(computationCorrect);
    }

    @Test
    public void shouldMakeIdentifierReduceableIfExpressionIsReduceable() {
        Int leftHandSide = new Int(1, sourceCodeInformation);
        Int rightHandSide = new Int(3, sourceCodeInformation);
        Int rightHandSide2 = new Int(5, sourceCodeInformation);
        Multiply multiply = new Multiply(leftHandSide, rightHandSide, sourceCodeInformation);
        //
        Ident ident = new Ident("test", sourceCodeInformation);
        Str str = new Str("\"Label\"", sourceCodeInformation);
        Computation computation = new Computation(ident, str, multiply);
        Multiply multiply2 = new Multiply(ident, rightHandSide2, sourceCodeInformation);

        boolean computationCorrect = semanticAnalysisVisitor.visitComputation(computation);
        boolean multiplyCorrect = semanticAnalysisVisitor.visitMultiply(multiply2);

        assertTrue(semanticAnalysisVisitor.getErrors().isEmpty());
        assertTrue(computationCorrect);
        assertTrue(multiplyCorrect);
    }
}