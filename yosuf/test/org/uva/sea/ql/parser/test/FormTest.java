package org.uva.sea.ql.parser.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.uva.sea.ql.ast.Form;
import org.uva.sea.ql.parser.IParse;
import org.uva.sea.ql.parser.ParseError;
import org.uva.sea.ql.parser.jacc.JACCParser;

public class FormTest {
	private IParse parser;

	@Before
	public void setUp() {
		parser = new JACCParser();
	}

	@Test
	public void testEmptyForm() throws ParseError {
		assertEquals(parser.parse("form someForm{ }").getClass(), Form.class);
	}
}
