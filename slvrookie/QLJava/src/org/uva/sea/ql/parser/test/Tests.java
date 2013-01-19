package org.uva.sea.ql.parser.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.uva.sea.ql.ast.expr.*;
import org.uva.sea.ql.ast.expr.value.*;
import org.uva.sea.ql.parser.antlr.ANTLRParser;

@RunWith(Parameterized.class)
public class Tests {

	private IParse parser;

	@Parameters
	public static List<Object[]> theParser() {
		List<Object[]> parserList = new ArrayList<Object[]>();
		parserList.add(new Object[] { new ANTLRParser() });
		return parserList;
	}

	public Tests(IParse parser) {
		this.parser = parser;
	}

	@Test
	public void testAdds() throws ParseError {
		assertEquals(Add.class, parser.parseExpr("a + b").getClass());
		assertEquals(Add.class, parser.parseExpr("a + b + c").getClass());
		assertEquals(Add.class, parser.parseExpr("(a + b + c)").getClass());
		assertEquals(Add.class, parser.parseExpr("a + (b + c)").getClass());
		assertEquals(Add.class, parser.parseExpr("(a + b) + c").getClass());
		assertEquals(Add.class, parser.parseExpr("(a + b)").getClass());
		assertEquals(Add.class, parser.parseExpr("a + b * c").getClass());
		assertEquals(Add.class, parser.parseExpr("a * b + c").getClass());
	}
	
	@Test
	public void testSubs() throws ParseError {
		assertEquals(Sub.class, parser.parseExpr("a - b").getClass());
		assertEquals(Sub.class, parser.parseExpr("a - b - c").getClass());
		assertEquals(Sub.class, parser.parseExpr("(a - b - c)").getClass());
		assertEquals(Sub.class, parser.parseExpr("a - (b + c)").getClass());
		assertEquals(Sub.class, parser.parseExpr("(a - b) - c").getClass());
		assertEquals(Sub.class, parser.parseExpr("(a - b)").getClass());
		assertEquals(Sub.class, parser.parseExpr("a - b * c").getClass());
		assertEquals(Sub.class, parser.parseExpr("a * b - c").getClass());
	}
	
	@Test
	public void testUnary() throws ParseError {
		assertEquals(Neg.class, parser.parseExpr("- b").getClass());
		assertEquals(Neg.class, parser.parseExpr("- (a + b + c)").getClass());
		assertEquals(Neg.class, parser.parseExpr("- (a * b / c)").getClass());
		assertEquals(Neg.class, parser.parseExpr("- (a + (b + c))").getClass());
		assertEquals(Pos.class, parser.parseExpr(" + c").getClass());
		assertEquals(Pos.class, parser.parseExpr("+ (a + b)").getClass());
		assertEquals(Pos.class, parser.parseExpr("+ (a + b * c)").getClass());
		assertEquals(Pos.class, parser.parseExpr("+ (a * b + c)").getClass());
	}

	@Test
	public void testMuls() throws ParseError {
		assertEquals(Mul.class, parser.parseExpr("a * b").getClass());
		assertEquals(Mul.class, parser.parseExpr("a * b * c").getClass());
		assertEquals(Mul.class, parser.parseExpr("a * (b * c)").getClass());
		assertEquals(Mul.class, parser.parseExpr("(a * b) * c").getClass());
		assertEquals(Mul.class, parser.parseExpr("(a * b)").getClass());
		assertEquals(Mul.class, parser.parseExpr("(a + b) * c").getClass());
		assertEquals(Mul.class, parser.parseExpr("a * (b + c)").getClass());
	}
	
	@Test
	public void testDivs() throws ParseError {
		assertEquals(Div.class, parser.parseExpr("a / b").getClass());
		assertEquals(Div.class, parser.parseExpr("(a + b) / c").getClass());
		assertEquals(Div.class, parser.parseExpr("a / (b * c)").getClass());
		assertEquals(Div.class, parser.parseExpr("(a * b) / c").getClass());
	}

	@Test
	public void testRels() throws ParseError {
		assertEquals(LT.class, parser.parseExpr("a < b").getClass());
		assertEquals(LT.class, parser.parseExpr("a < b + c").getClass());
		assertEquals(LT.class, parser.parseExpr("a < (b * c)").getClass());
		assertEquals(LT.class, parser.parseExpr("(a * b) < c").getClass());
		assertEquals(Eq.class, parser.parseExpr("(a == b)").getClass());
		assertEquals(Eq.class, parser.parseExpr("(a + b) == c").getClass());
		assertEquals(GEq.class, parser.parseExpr("a >= b + c").getClass());
		assertEquals(GEq.class, parser.parseExpr("a >= b").getClass());
		assertEquals(GT.class, parser.parseExpr("(a * b) > c").getClass());
		assertEquals(GT.class, parser.parseExpr("(a == b) > (d + c)").getClass());
		assertEquals(LEq.class, parser.parseExpr("a <= b").getClass());
		assertEquals(LEq.class, parser.parseExpr("a <= b + c").getClass());
		assertEquals(NEq.class, parser.parseExpr("a != b").getClass());
		assertEquals(NEq.class, parser.parseExpr("a != b - c").getClass());
	}

	@Test
	public void testBools() throws ParseError {
		assertEquals(Not.class, parser.parseExpr("!b").getClass());
		assertEquals(Not.class, parser.parseExpr("! (b + a)").getClass());
		assertEquals(And.class, parser.parseExpr("a && b").getClass());
		assertEquals(And.class, parser.parseExpr("a > b && b > c").getClass());
		assertEquals(And.class, parser.parseExpr("(a > b) && (b > c)").getClass());
		assertEquals(Or.class, parser.parseExpr("a > b || b > c").getClass());
		assertEquals(Or.class, parser.parseExpr("(a > b) || (b > c)").getClass());
	}

	@Test
	public void testIds() throws ParseError {
		assertEquals(Ident.class, parser.parseExpr("a").getClass());
		assertEquals(Ident.class, parser.parseExpr("abc").getClass());
		assertEquals(Ident.class, parser.parseExpr("ABC").getClass());
		assertEquals(Ident.class, parser.parseExpr("ABCDEF").getClass());
		assertEquals(Ident.class, parser.parseExpr("abc2323").getClass());
		assertEquals(Ident.class, parser.parseExpr("a2bc232").getClass());
		assertEquals(Ident.class, parser.parseExpr("a2bc232aa").getClass());
	}

	@Test
	public void testIntLiteral() throws ParseError {
		assertEquals(IntLiteral.class, parser.parseExpr("0").getClass());
		assertEquals(IntLiteral.class, parser.parseExpr("1223").getClass());
		assertEquals(IntLiteral.class, parser.parseExpr("234234234").getClass());
	}
	
	@Test
	public void testMoneyLiteral() throws ParseError {
		assertEquals(MoneyLiteral.class, parser.parseExpr("120.00").getClass());
		assertEquals(MoneyLiteral.class, parser.parseExpr("1231121.11").getClass());
		assertEquals(MoneyLiteral.class, parser.parseExpr("00.00").getClass());
		assertEquals(MoneyLiteral.class, parser.parseExpr("00.0021312").getClass());  
	}
	
	@Test
	public void testBooleanLiteral() throws ParseError {
		assertEquals(BoolLiteral.class, parser.parseExpr("true").getClass());
		assertEquals(BoolLiteral.class, parser.parseExpr("false").getClass());
	}
	
	@Test
	public void testStringLiteral() throws ParseError {
		assertEquals(StringLiteral.class, parser.parseExpr("\"trues dat\"").getClass());
		assertEquals(StringLiteral.class, parser.parseExpr("\"true dat\"").getClass());
		assertEquals(StringLiteral.class, parser.parseExpr("\"true dat\" \" nice to SEE ya\"").getClass());
		assertEquals(StringLiteral.class, parser.parseExpr("\"True dat\" \n \t \" nice to SEE ya\"").getClass());
		assertEquals(StringLiteral.class, parser.parseExpr("\"tr<ue **dat\" \" nice) to SEE ya\"").getClass());
	}
	
//	@Test
//	public void testComments() throws ParseError {
//	assertNull(parser.parseExpr("// \"trues dat\"\n"));
//	assertNull(parser.parseExpr("/* true \r \"Dat\" \n 123 */"));
//	} 
		
}
