<<<<<<< HEAD
package org.uva.sea.ql.parser.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.uva.sea.ql.ast.Add;
import org.uva.sea.ql.ast.GT;
import org.uva.sea.ql.ast.Ident;
import org.uva.sea.ql.ast.Int;
import org.uva.sea.ql.ast.LEq;
import org.uva.sea.ql.ast.LT;
import org.uva.sea.ql.ast.Mul;
import org.uva.sea.ql.parser.antlr.ANTLRParser;

@RunWith(Parameterized.class)
public class TestExpressions {

	private IParse parser;

	@Parameters
	public static List<Object[]> theParsers() {
		List<Object[]> list = new ArrayList<Object[]>();
		list.add(new Object[] {new ANTLRParser()});
		return list;
	}

	
	public TestExpressions(IParse parser) {
		this.parser = parser;
	}
	
	@Test
	public void testAdds() throws ParseError {
		assertEquals(Add.class, parser.parse("a + b").getClass());
		assertEquals(Add.class, parser.parse("a + b + c").getClass());
		assertEquals(Add.class, parser.parse("(a + b + c)").getClass());
		assertEquals(Add.class, parser.parse("a + (b + c)").getClass());
		assertEquals(Add.class, parser.parse("(a + b) + c").getClass());
		assertEquals(Add.class, parser.parse("(a + b)").getClass());
		assertEquals(Add.class, parser.parse("a + b * c").getClass());
		assertEquals(Add.class, parser.parse("a * b + c").getClass());
	}

	@Test
	public void testMuls() throws ParseError {
		assertEquals(Mul.class, parser.parse("a * b").getClass());
		assertEquals(Mul.class, parser.parse("a * b * c").getClass());
		assertEquals(Mul.class, parser.parse("a * (b * c)").getClass());
		assertEquals(Mul.class, parser.parse("(a * b) * c").getClass());
		assertEquals(Mul.class, parser.parse("(a * b)").getClass());
		assertEquals(Mul.class, parser.parse("(a + b) * c").getClass());
		assertEquals(Mul.class, parser.parse("a * (b + c)").getClass());
	}
	
	@Test
	public void testRels() throws ParseError {
		assertEquals(LT.class, parser.parse("a < b").getClass());
		assertEquals(LT.class, parser.parse("a < b + c").getClass());
		assertEquals(LT.class, parser.parse("a < (b * c)").getClass());
		assertEquals(LT.class, parser.parse("(a * b) < c").getClass());
		assertEquals(LEq.class, parser.parse("(a <= b)").getClass());
		assertEquals(GT.class, parser.parse("a + b > c").getClass());
		assertEquals(GT.class, parser.parse("a > b + c").getClass());
	}


	@Test
	public void testIds() throws ParseError {
		assertEquals(Ident.class, parser.parse("a").getClass());
		assertEquals(Ident.class, parser.parse("abc").getClass());
		assertEquals(Ident.class, parser.parse("ABC").getClass());
		assertEquals(Ident.class, parser.parse("ABCDEF").getClass());
		assertEquals(Ident.class, parser.parse("abc2323").getClass());
		assertEquals(Ident.class, parser.parse("a2bc232").getClass());
		assertEquals(Ident.class, parser.parse("a2bc232aa").getClass());
	}

	@Test
	public void testNums() throws ParseError {
		assertEquals(Int.class, parser.parse("0").getClass());
		assertEquals(Int.class, parser.parse("1223").getClass());
		assertEquals(Int.class, parser.parse("234234234").getClass());
	}
	
	@Test
	public void testCalculation() throws ParseError {
		assertEquals(
				new Integer(3),
				((org.uva.sea.ql.ast.values.IntValue)parser.parse("1 + 2").eval()).getValue());
		assertEquals(
				new Integer(7),
				((org.uva.sea.ql.ast.values.IntValue)parser.parse("1 + 2 * 3").eval()).getValue()); 
		assertEquals(
				new Integer(9),
				((org.uva.sea.ql.ast.values.IntValue)parser.parse("(1 + 2) * 3").eval()).getValue()); 
		assertEquals(
				new Integer(4),
				((org.uva.sea.ql.ast.values.IntValue)parser.parse("(1 + 2) * 3 - (2 + 3)").eval()).getValue());
		assertEquals(
				new Integer(3),
				((org.uva.sea.ql.ast.values.IntValue)parser.parse("27 / 3 / 3").eval()).getValue());
		assertEquals(
				new Integer(5),
				((org.uva.sea.ql.ast.values.IntValue)parser.parse("(4 * 5) / 4").eval()).getValue());
	}
	
	@Test
	public void testEquation() throws ParseError {
		assertEquals(
				true,
				((org.uva.sea.ql.ast.values.BoolValue)parser.parse("(1 < 2) && (3 < 4)").eval()).getValue());
		assertEquals(
				true,
				((org.uva.sea.ql.ast.values.BoolValue)parser.parse("(1 <= 1) && (7 > 4)").eval()).getValue());
		assertEquals(
				true,
				((org.uva.sea.ql.ast.values.BoolValue)parser.parse("(1 > 2) || (3 < 4)").eval()).getValue());
		assertEquals(
				false,
				((org.uva.sea.ql.ast.values.BoolValue)parser.parse("(1 >= 2) || (3 >= 4)").eval()).getValue());
		
	}
}
=======
package org.uva.sea.ql.parser.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.uva.sea.ql.ast.expressions.Ident;
import org.uva.sea.ql.ast.expressions.Int;
import org.uva.sea.ql.ast.expressions.binary.Add;
import org.uva.sea.ql.ast.expressions.binary.GT;
import org.uva.sea.ql.ast.expressions.binary.LEq;
import org.uva.sea.ql.ast.expressions.binary.LT;
import org.uva.sea.ql.ast.expressions.binary.Mul;
import org.uva.sea.ql.ast.values.*;
import org.uva.sea.ql.parser.antlr.ANTLRParser;

public class TestExpressions {

	private IParse parser;
	
	public TestExpressions() {
		this.parser = new ANTLRParser();
	}
	
	@Test
	public void testAdds() throws ParseError {
		assertEquals(Add.class, parser.parse("a + b").getClass());
		assertEquals(Add.class, parser.parse("a + b + c").getClass());
		assertEquals(Add.class, parser.parse("(a + b + c)").getClass());
		assertEquals(Add.class, parser.parse("a + (b + c)").getClass());
		assertEquals(Add.class, parser.parse("(a + b) + c").getClass());
		assertEquals(Add.class, parser.parse("(a + b)").getClass());
		assertEquals(Add.class, parser.parse("a + b * c").getClass());
		assertEquals(Add.class, parser.parse("a * b + c").getClass());
	}

	@Test
	public void testMuls() throws ParseError {
		assertEquals(Mul.class, parser.parse("a * b").getClass());
		assertEquals(Mul.class, parser.parse("a * b * c").getClass());
		assertEquals(Mul.class, parser.parse("a * (b * c)").getClass());
		assertEquals(Mul.class, parser.parse("(a * b) * c").getClass());
		assertEquals(Mul.class, parser.parse("(a * b)").getClass());
		assertEquals(Mul.class, parser.parse("(a + b) * c").getClass());
		assertEquals(Mul.class, parser.parse("a * (b + c)").getClass());
	}
	
	@Test
	public void testRels() throws ParseError {
		assertEquals(LT.class, parser.parse("a < b").getClass());
		assertEquals(LT.class, parser.parse("a < b + c").getClass());
		assertEquals(LT.class, parser.parse("a < (b * c)").getClass());
		assertEquals(LT.class, parser.parse("(a * b) < c").getClass());
		assertEquals(LEq.class, parser.parse("(a <= b)").getClass());
		assertEquals(GT.class, parser.parse("a + b > c").getClass());
		assertEquals(GT.class, parser.parse("a > b + c").getClass());
	}


	@Test
	public void testIds() throws ParseError {
		assertEquals(Ident.class, parser.parse("a").getClass());
		assertEquals(Ident.class, parser.parse("abc").getClass());
		assertEquals(Ident.class, parser.parse("ABC").getClass());
		assertEquals(Ident.class, parser.parse("ABCDEF").getClass());
		assertEquals(Ident.class, parser.parse("abc2323").getClass());
		assertEquals(Ident.class, parser.parse("a2bc232").getClass());
		assertEquals(Ident.class, parser.parse("a2bc232aa").getClass());
	}

	@Test
	public void testNums() throws ParseError {
		assertEquals(Int.class, parser.parse("0").getClass());
		assertEquals(Int.class, parser.parse("1223").getClass());
		assertEquals(Int.class, parser.parse("234234234").getClass());
	}
	
	@Test
	public void testCalculation() throws ParseError {
		assertEquals(
				new Integer(3),
				((IntValue)parser.parse("1 + 2").eval()).getValue());
		assertEquals(
				new Integer(7),
				((IntValue)parser.parse("1 + 2 * 3").eval()).getValue()); 
		assertEquals(
				new Integer(9),
				((IntValue)parser.parse("(1 + 2) * 3").eval()).getValue()); 
		assertEquals(
				new Integer(4),
				((IntValue)parser.parse("(1 + 2) * 3 - (2 + 3)").eval()).getValue());
		assertEquals(
				new Integer(3),
				((IntValue)parser.parse("27 / 3 / 3").eval()).getValue());
		assertEquals(
				new Integer(5),
				((IntValue)parser.parse("(4 * 5) / 4").eval()).getValue());
	}
	
	@Test
	public void testComparison() throws ParseError {
		assertTrue(((BoolValue)parser.parse("(1 < 2) && (3 < 4)").eval()).getValue());
		assertTrue(((BoolValue)parser.parse("(1 <= 1) && (7 > 4)").eval()).getValue());
		assertTrue(((BoolValue)parser.parse("(1 > 2) || (3 < 4)").eval()).getValue());
		assertFalse(((BoolValue)parser.parse("(1 >= 2) || (3 >= 4)").eval()).getValue());
		
		assertTrue(((BoolValue)parser.parse("10 == 10").eval()).getValue());
		assertTrue(((BoolValue)parser.parse("099 == 99").eval()).getValue());
		assertFalse(((BoolValue)parser.parse("23 == 25").eval()).getValue());
		assertTrue(((BoolValue)parser.parse("-124 == -124").eval()).getValue());
		
		assertTrue(((BoolValue)parser.parse("1 != 2").eval()).getValue());
		assertFalse(((BoolValue)parser.parse("245 != 245").eval()).getValue());
		
		assertTrue(((BoolValue)parser.parse("true == true").eval()).getValue());
		assertTrue(((BoolValue)parser.parse("false == false").eval()).getValue());
		assertFalse(((BoolValue)parser.parse("true == false").eval()).getValue());
		assertFalse(((BoolValue)parser.parse("false == true").eval()).getValue());
		
		assertTrue(((BoolValue)parser.parse("true != false").eval()).getValue());
		assertTrue(((BoolValue)parser.parse("false != true").eval()).getValue());
		assertFalse(((BoolValue)parser.parse("true != true").eval()).getValue());
		assertFalse(((BoolValue)parser.parse("false != false").eval()).getValue());
		
		assertTrue(((BoolValue)parser.parse("\"peter\" == \"peter\"").eval()).getValue());
		assertFalse(((BoolValue)parser.parse("\"peter\" == \"klijn\"").eval()).getValue());
		assertTrue(((BoolValue)parser.parse("\"peter\" != \"klijn\"").eval()).getValue());
		assertFalse(((BoolValue)parser.parse("\"peter\" != \"peter\"").eval()).getValue());
	}
	
	@Test
	public void testTypeChecking() throws ParseError {
		assertEquals(0,parser.parse("1 + 5").checkType(null).size());
		assertEquals(0,parser.parse("(3 < 5) && (true != false)").checkType(null).size());
		assertEquals(0,parser.parse("\"peter\" != \"klijn\"").checkType(null).size());
		
		// Unary checks that should NOT give an error
		assertEquals(0,parser.parse("-2").checkType(null).size());
		assertEquals(0,parser.parse("!true").checkType(null).size());
		assertEquals(0,parser.parse("+-8").checkType(null).size());
		
		// Unary checks that should give an error
		assertEquals(1,parser.parse("-true").checkType(null).size());
		assertEquals(1,parser.parse("!\"this is a string\"").checkType(null).size());
		assertEquals(1,parser.parse("+true").checkType(null).size());

		// Binary checks that should NOT give an error
		assertEquals(0,parser.parse("1 == 1").checkType(null).size());
		assertEquals(0,parser.parse("true == true").checkType(null).size());
		assertEquals(0,parser.parse("\"s\" == \"s\"").checkType(null).size());
		assertEquals(0,parser.parse("2 != 1").checkType(null).size());
		assertEquals(0,parser.parse("false != true").checkType(null).size());
		assertEquals(0,parser.parse("\"t\" != \"s\"").checkType(null).size());
		assertEquals(0,parser.parse("1 + 1").checkType(null).size());
		assertEquals(0,parser.parse("true && false").checkType(null).size());
		assertEquals(0,parser.parse("4 / 2").checkType(null).size());
		assertEquals(0,parser.parse("2 >= 1").checkType(null).size());
		assertEquals(0,parser.parse("2 > 1").checkType(null).size());
		assertEquals(0,parser.parse("1 <= 1").checkType(null).size());
		assertEquals(0,parser.parse("1 < 2").checkType(null).size());
		assertEquals(0,parser.parse("4 * 3").checkType(null).size());
		assertEquals(0,parser.parse("true || false").checkType(null).size());
		assertEquals(0,parser.parse("2 - 1").checkType(null).size());
		
		// Binary checks that should give an error
		assertEquals(1,parser.parse("true == 1").checkType(null).size());
		assertEquals(1,parser.parse("true != 1").checkType(null).size());
		assertEquals(1,parser.parse("true + true").checkType(null).size());
		assertEquals(1,parser.parse("1 && 1").checkType(null).size());
		assertEquals(1,parser.parse("\"test\" / \"test\"").checkType(null).size());
		assertEquals(1,parser.parse("true >= false").checkType(null).size());
		assertEquals(1,parser.parse("true > false").checkType(null).size());
		assertEquals(1,parser.parse("\"a\" <= \"b\"").checkType(null).size());
		assertEquals(1,parser.parse("\"c\" < \"d\"").checkType(null).size());
		assertEquals(1,parser.parse("true * true").checkType(null).size());
		assertEquals(1,parser.parse("3 || 2").checkType(null).size());
		assertEquals(1,parser.parse("\"aa\" - \"a\"").checkType(null).size());
	}
}

>>>>>>> 483057f28359ecac2b999d94a928c0aaf01d2a6e
