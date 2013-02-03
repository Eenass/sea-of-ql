package org.uva.sea.ql.parsers.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.uva.sea.ql.ast.operations.*;
import org.uva.sea.ql.parser.exceptions.ParseException;
import org.uva.sea.ql.parsers.AndExprParser;
import org.uva.sea.ql.parsers.ParserBase;

public class AndExprParserTests {

	private ParserBase parser;
	
	@Before
    public void setUp() {
		this.parser = new AndExprParser();
    }
	
	@Test
	public void does_returnAndExpression_when_andSignUsedBetweenTwoIdentifiers() throws ParseException {
		assertEquals(And.class, parser.parse("a && b").getClass());		
	}
}
