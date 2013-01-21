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
