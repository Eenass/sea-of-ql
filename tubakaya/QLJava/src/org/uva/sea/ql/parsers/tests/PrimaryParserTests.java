package org.uva.sea.ql.parsers.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.uva.sea.ql.ast.Identifier;
import org.uva.sea.ql.ast.literals.BooleanLiteral;
import org.uva.sea.ql.ast.literals.IntLiteral;
import org.uva.sea.ql.ast.literals.StringLiteral;
import org.uva.sea.ql.ast.operators.conditional.*;
import org.uva.sea.ql.parsers.PrimaryParser;
import org.uva.sea.ql.parsers.ParserBaseForExpressions;
import org.uva.sea.ql.parsers.exceptions.ParseException;

public class PrimaryParserTests {

	private ParserBaseForExpressions parser;
	
	@Before
    public void setUp() {
		this.parser = new PrimaryParser();
    }
	
	@Test
	public void does_returnInt_when_textIsADigit() throws ParseException {
		assertEquals(IntLiteral.class, parser.parse("0").getClass());		
	}
	
	@Test
	public void does_returnInt_when_textIsATwoDigitNumber() throws ParseException {
		assertEquals(IntLiteral.class, parser.parse("12").getClass());		
	}
	
	@Test
	public void does_returnIdent_when_textIsALetter() throws ParseException {
		assertEquals(Identifier.class, parser.parse("a").getClass());		
	}
	
	@Test
	public void does_returnIdent_when_textIsAWord() throws ParseException {
		assertEquals(Identifier.class, parser.parse("abc").getClass());		
	}
	
	@Test
	public void does_returnIdent_when_textIsAWordEndingWithANumber() throws ParseException {
		assertEquals(Identifier.class, parser.parse("abc1").getClass());		
	}
	
	@Test
	public void does_returnIdent_when_textIsStartsWithALetterButContainsNumbers() throws ParseException {
		assertEquals(Identifier.class, parser.parse("a2bc123").getClass());		
	}
	
	@Test
	public void does_returnOrExpression_when_textIsAnOrClauseWithinParantheses() throws ParseException {
		assertEquals(Or.class, parser.parse("(a || b)").getClass());		
	}
	
	@Test
	public void does_returnBOOL_when_textIsTrue() throws ParseException {
		assertEquals(BooleanLiteral.class, parser.parse("true").getClass());		
	}
	
	@Test
	public void does_returnBOOL_when_textIsFalse() throws ParseException {
		assertEquals(BooleanLiteral.class, parser.parse("false").getClass());		
	}
	
	@Test
	public void does_returnSTRING_when_textIsInsideQuotes() throws ParseException {
		assertEquals(StringLiteral.class, parser.parse("\"test\"").getClass());		
	}
}
