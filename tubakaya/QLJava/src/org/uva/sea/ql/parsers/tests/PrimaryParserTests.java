package org.uva.sea.ql.parsers.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.uva.sea.ql.ast.types.*;
import org.uva.sea.ql.ast.operations.*;
import org.uva.sea.ql.parser.exceptions.ParseException;
import org.uva.sea.ql.parsers.PrimaryParser;
import org.uva.sea.ql.parsers.ParserBase;

public class PrimaryParserTests {

	private ParserBase parser;
	
	@Before
    public void setUp() {
		this.parser = new PrimaryParser();
    }
	
	@Test
	public void does_returnInt_when_textIsADigit() throws ParseException {
		assertEquals(Int.class, parser.parse("0").getClass());		
	}
	
	@Test
	public void does_returnInt_when_textIsATwoDigitNumber() throws ParseException {
		assertEquals(Int.class, parser.parse("12").getClass());		
	}
	
	@Test
	public void does_returnIdent_when_textIsALetter() throws ParseException {
		assertEquals(Ident.class, parser.parse("a").getClass());		
	}
	
	@Test
	public void does_returnIdent_when_textIsAWord() throws ParseException {
		assertEquals(Ident.class, parser.parse("abc").getClass());		
	}
	
	@Test
	public void does_returnIdent_when_textIsAWordEndingWithANumber() throws ParseException {
		assertEquals(Ident.class, parser.parse("abc1").getClass());		
	}
	
	@Test
	public void does_returnIdent_when_textIsStartsWithALetterButContainsNumbers() throws ParseException {
		assertEquals(Ident.class, parser.parse("a2bc123").getClass());		
	}
	
	@Test
	public void does_returnOrExpression_when_textIsAnOrClauseWithinParantheses() throws ParseException {
		assertEquals(Or.class, parser.parse("(a || b)").getClass());		
	}
}
