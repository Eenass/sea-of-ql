package org.uva.sea.ql.parser.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.uva.sea.ql.ast.Int;
import org.uva.sea.ql.ast.Mul;
import org.uva.sea.ql.parser.antlr.ANTLRParser;

@RunWith(Parameterized.class)
public class TestComments {

	private IParse parser;

	@Parameters
	public static List<Object[]> theParser() {
	  List<Object[]> parserList = new ArrayList<Object[]>();
	  parserList.add(new Object[] {new ANTLRParser()});
	  return parserList;
	}
	
	public TestComments(IParse parser) {
		this.parser = parser;
	}
	
	@Test
	public void testMultiLineComment() throws ParseError {
		assertEquals(parser.parse("/* a + /n b + */ c * d").getClass(), Mul.class);
	}
	
	@Test
	public void testSingleLineComment() throws ParseError {
		assertEquals(parser.parse("// a + \n b * c").getClass(), Mul.class);
		assertEquals(parser.parse("// a + b * c"), null);
		assertEquals(parser.parse("// a + b * c \n 5").getClass(), Int.class);
	}
	
	@Test
	public void testQuestion() throws ParseError {
		//parser.parse("hasSoldHouse: \"Did you sell a house in 2010?\" boolean");
		parser.parse("true");
	}

}
