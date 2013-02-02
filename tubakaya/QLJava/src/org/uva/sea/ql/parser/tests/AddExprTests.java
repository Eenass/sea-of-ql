package org.uva.sea.ql.parser.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.uva.sea.ql.ast.operations.*;
import org.uva.sea.ql.parser.antlr.AddExprParser;
import org.uva.sea.ql.parser.antlr.ParserBase;
import org.uva.sea.ql.parser.exceptions.ParseException;

public class AddExprTests {

	private ParserBase parser;
	
	@Before
    public void setUp() {
		this.parser = new AddExprParser();
    }
	
	@Test
	public void does_returnAddExpression_when_plusUsedBetweenTwoIdentifiers() throws ParseException {
		assertEquals(Add.class, parser.parse("a + b").getClass());		
	}
	
	@Test
	public void does_returnAddExpression_when_plusUsedBetweenThreeIdentifiers() throws ParseException {
		assertEquals(Add.class, parser.parse("a + b + c").getClass());		
	}
	
	@Test
	public void does_returnAddExpression_when_plusUsedBetweenTwoIdentifiersInsideParanthesis() throws ParseException {
		assertEquals(Add.class, parser.parse("(a + b)").getClass());		
	}
	
	@Test
	public void does_returnAddExpression_when_plusUsedBeforeParanthesisOfAnotherAdd() throws ParseException {
		assertEquals(Add.class, parser.parse("a + (b+c))").getClass());		
	}
	
	@Test
	public void does_returnAddExpression_when_plusUsedAfterParanthesisOfAnotherAdd() throws ParseException {
		assertEquals(Add.class, parser.parse("(a + b) + c))").getClass());		
	}
	
	@Test
	public void does_returnAddExpression_when_plusUsedTogetherWithAMultiplication() throws ParseException {
		assertEquals(Add.class, parser.parse("a * b + c))").getClass());		
	}	
}
