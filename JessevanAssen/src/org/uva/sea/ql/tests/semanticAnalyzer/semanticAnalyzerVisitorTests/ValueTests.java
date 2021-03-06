package org.uva.sea.ql.tests.semanticAnalyzer.semanticAnalyzerVisitorTests;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValueTests extends SemanticAnalyzerVisitorTests {

	@Test
	public void visitBoolValue_returnsBoolType() {
		assertEquals(
			org.uva.sea.ql.ast.type.Boolean.class,
			new org.uva.sea.ql.ast.expression.value.Bool(true).accept(visitor, context).getClass()
		);
	}

	@Test
	public void visitIntValue_returnsIntType() {
		assertEquals(
			org.uva.sea.ql.ast.type.Integer.class,
			new org.uva.sea.ql.ast.expression.value.Int(1).accept(visitor, context).getClass()
		);
	}

	@Test
	public void visitStringValue_returnsStringType() {
		assertEquals(
			org.uva.sea.ql.ast.type.String.class,
			new org.uva.sea.ql.ast.expression.value.Str("a").accept(visitor, context).getClass()
		);
	}
	
}
