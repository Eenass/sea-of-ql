package org.uva.sea.ql.tests.semantic.expression;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.uva.sea.ql.ast.expr.primary.Ident;
import org.uva.sea.ql.ast.type.Type;
import org.uva.sea.ql.message.Message;
import org.uva.sea.ql.parser.ANTLRParser;
import org.uva.sea.ql.parser.error.ParseError;
import org.uva.sea.ql.tests.IParse;
import org.uva.sea.ql.visitor.ExpressionVisitor;

@RunWith(Parameterized.class)
public class TestBinary {

	private IParse parser;

	@Parameters
	public static List<Object[]> theParsers() {
		Object[][] data = new Object[][] { new Object[] {new ANTLRParser()} };
		return Arrays.asList(data);
	}
	public static HashMap<Ident, Type> exprMap = new HashMap<Ident, Type>();
	public static ArrayList<Message> errors = new ArrayList<Message>();

	
	public TestBinary(IParse parser) {
		this.parser = parser;
	}

	@Test
	public void testAdd() throws ParseError {
		assertEquals(parser.parseExpression("1 + 1").accept(new ExpressionVisitor(exprMap, errors)), true);
    	assertEquals(parser.parseExpression("1 + true").accept(new ExpressionVisitor(exprMap, errors)), false);	
	}

	@Test
	public void testAnd() throws ParseError {
		assertEquals(parser.parseExpression("true && false").accept(new ExpressionVisitor(exprMap, errors)), true);
    	assertEquals(parser.parseExpression("true && 1").accept(new ExpressionVisitor(exprMap, errors)), false);	
	}

	@Test
	public void testDiv() throws ParseError {
		assertEquals(parser.parseExpression("2 - 1").accept(new ExpressionVisitor(exprMap, errors)), true);
    	assertEquals(parser.parseExpression("2 - true").accept(new ExpressionVisitor(exprMap, errors)), false);	
	}
	
	@Test
	public void testEq() throws ParseError {
		assertEquals(parser.parseExpression("true == true").accept(new ExpressionVisitor(exprMap, errors)), true);
    	assertEquals(parser.parseExpression("true == 1").accept(new ExpressionVisitor(exprMap, errors)), false);
    	
    	assertEquals(parser.parseExpression("1 == 10").accept(new ExpressionVisitor(exprMap, errors)), true);
    	assertEquals(parser.parseExpression("true == 1").accept(new ExpressionVisitor(exprMap, errors)), false);
	}
	
	@Test
	public void testGT() throws ParseError {
		assertEquals(parser.parseExpression("10 > 1").accept(new ExpressionVisitor(exprMap, errors)), true);
    	assertEquals(parser.parseExpression("10 > true").accept(new ExpressionVisitor(exprMap, errors)), false);	
	}
	
	@Test
	public void testGEq() throws ParseError {
		assertEquals(parser.parseExpression("1 >= 3").accept(new ExpressionVisitor(exprMap, errors)), true);
    	assertEquals(parser.parseExpression("1 >= true").accept(new ExpressionVisitor(exprMap, errors)), false);	
	}
	
	@Test
	public void testLEq() throws ParseError {
		assertEquals(parser.parseExpression("1 <= 10").accept(new ExpressionVisitor(exprMap, errors)), true);
    	assertEquals(parser.parseExpression("1 <= true").accept(new ExpressionVisitor(exprMap, errors)), false);	
	}	
	
	@Test
	public void testLT() throws ParseError {
		assertEquals(parser.parseExpression("1 < 10").accept(new ExpressionVisitor(exprMap, errors)), true);
    	assertEquals(parser.parseExpression("1 < true").accept(new ExpressionVisitor(exprMap, errors)), false);	
	}
	
	@Test
	public void testMul() throws ParseError {
		assertEquals(parser.parseExpression("1 * 10").accept(new ExpressionVisitor(exprMap, errors)), true);
    	assertEquals(parser.parseExpression("1 * true").accept(new ExpressionVisitor(exprMap, errors)), false);	
	}	
	
	@Test
	public void testNEq() throws ParseError {
		assertEquals(parser.parseExpression("true != true").accept(new ExpressionVisitor(exprMap, errors)), true);
		assertEquals(parser.parseExpression("true != 1").accept(new ExpressionVisitor(exprMap, errors)), false);
		
		assertEquals(parser.parseExpression("10 != 1").accept(new ExpressionVisitor(exprMap, errors)), true);
		assertEquals(parser.parseExpression("true != 1").accept(new ExpressionVisitor(exprMap, errors)), false);
	}
	
	@Test
	public void testOr() throws ParseError {
		assertEquals(parser.parseExpression("true || false").accept(new ExpressionVisitor(exprMap, errors)), true);
    	assertEquals(parser.parseExpression("1 || true").accept(new ExpressionVisitor(exprMap, errors)), false);	
	}
	
	@Test
	public void testSub() throws ParseError {
		assertEquals(parser.parseExpression("10 / 1").accept(new ExpressionVisitor(exprMap, errors)), true);
    	assertEquals(parser.parseExpression("10 / true").accept(new ExpressionVisitor(exprMap, errors)), false);	
	}
}