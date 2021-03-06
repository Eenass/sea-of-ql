package org.uva.sea.ql.parser.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.uva.sea.ql.parser.jacc.JACCParser;


import org.uva.sea.ql.ast.Ident;
import org.uva.sea.ql.ast.Int;
import org.uva.sea.ql.ast.operators.binary.numeric.Add;
import org.uva.sea.ql.ast.operators.binary.numeric.Div;
import org.uva.sea.ql.ast.operators.binary.numeric.Mul;
import org.uva.sea.ql.ast.operators.binary.numeric.Sub;
import org.uva.sea.ql.ast.operators.binary.relational.GT;
import org.uva.sea.ql.ast.operators.binary.relational.LEq;
import org.uva.sea.ql.ast.operators.binary.relational.LT;



@RunWith(Parameterized.class)
public class TestExpressions {

	private IParse parser;

	@Parameters
	public static List<Object[]> theParser() {
		List<Object[]> parserList = new ArrayList<Object[]>();
		parserList.add(new Object[] {new JACCParser()});
		return parserList;
	}
		
	public TestExpressions(IParse parser) {
		this.parser = parser;
	}
	
	@Test
	public void testAdds() throws ParseError {
		assertEquals(parser.parse("a + b").getClass(), Add.class);
		assertEquals(parser.parse("a + b + c").getClass(), Add.class);
		assertEquals(parser.parse("(a + b + c)").getClass(), Add.class);
		assertEquals(parser.parse("a + (b + c)").getClass(), Add.class);
		assertEquals(parser.parse("(a + b) + c").getClass(), Add.class);
		assertEquals(parser.parse("(a + b)").getClass(), Add.class);
		assertEquals(parser.parse("a + b * c").getClass(), Add.class);
		assertEquals(parser.parse("a * b + c").getClass(), Add.class);
	}
	
	@Test
	public void testSubs() throws ParseError {
		assertEquals(parser.parse("a - b").getClass(), Sub.class);
		assertEquals(parser.parse("a - b - c").getClass(), Sub.class);
		assertEquals(parser.parse("(a - b - c)").getClass(), Sub.class);
		assertEquals(parser.parse("a - (b - c)").getClass(), Sub.class);
		assertEquals(parser.parse("(a - b) - c").getClass(), Sub.class);
		assertEquals(parser.parse("(a - b)").getClass(), Sub.class);
		assertEquals(parser.parse("a - b * c").getClass(), Sub.class);
		assertEquals(parser.parse("a * b - c").getClass(), Sub.class);
	}
	
	@Test
	public void testMuls() throws ParseError {
		assertEquals(parser.parse("a * b").getClass(), Mul.class);
		assertEquals(parser.parse("a * b * c").getClass(), Mul.class);
		assertEquals(parser.parse("a * (b * c)").getClass(), Mul.class);
		assertEquals(parser.parse("(a * b) * c").getClass(), Mul.class);
		assertEquals(parser.parse("(a * b)").getClass(), Mul.class);
		assertEquals(parser.parse("(a + b) * c").getClass(), Mul.class);
		assertEquals(parser.parse("a * (b + c)").getClass(), Mul.class);
	}
	
	@Test
	public void testDivs() throws ParseError {
		assertEquals(parser.parse("a / b").getClass(), Div.class);
		assertEquals(parser.parse("a / (b * c)").getClass(), Div.class);
		assertEquals(parser.parse("(a * b) / c").getClass(), Div.class);
		assertEquals(parser.parse("(a / b)").getClass(), Div.class);
		assertEquals(parser.parse("(a + b) / c").getClass(), Div.class);
		assertEquals(parser.parse("a / (b + c)").getClass(), Div.class);
	}
	
	@Test
	public void testRels() throws ParseError {
		assertEquals(parser.parse("a < b").getClass(), LT.class);
		assertEquals(parser.parse("a < b + c").getClass(), LT.class);
		assertEquals(parser.parse("a < (b * c)").getClass(), LT.class);
		assertEquals(parser.parse("(a * b) < c").getClass(), LT.class);
		assertEquals(parser.parse("(a <= b)").getClass(), LEq.class);
		assertEquals(parser.parse("a + b > c").getClass(), GT.class);
		assertEquals(parser.parse("a > b + c").getClass(), GT.class);
	}

	@Test
	public void testIds() throws ParseError {
		assertEquals(parser.parse("a").getClass(), Ident.class);
		assertEquals(parser.parse("abc").getClass(), Ident.class);
		assertEquals(parser.parse("ABC").getClass(), Ident.class);
		assertEquals(parser.parse("ABCDEF").getClass(), Ident.class);
		assertEquals(parser.parse("abc2323").getClass(), Ident.class);
		assertEquals(parser.parse("a2bc232").getClass(), Ident.class);
		assertEquals(parser.parse("a2bc232aa").getClass(), Ident.class);
	}

	@Test
	public void testNums() throws ParseError {
		assertEquals(parser.parse("0").getClass(), Int.class);
		assertEquals(parser.parse("1223").getClass(), Int.class);
		assertEquals(parser.parse("234234234").getClass(), Int.class);
	}
	
}
