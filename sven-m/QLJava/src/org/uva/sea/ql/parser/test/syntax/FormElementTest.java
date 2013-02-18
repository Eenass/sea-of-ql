package org.uva.sea.ql.parser.test.syntax;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.uva.sea.ql.ast.form.Computed;
import org.uva.sea.ql.ast.form.IfStatement;
import org.uva.sea.ql.ast.form.Question;
import org.uva.sea.ql.parser.test.ParseError;

public class FormElementTest extends SyntaxTest {

	@Override
	protected Class<?> parseClass(String src) throws ParseError {
		return getParser().parseFormElement(src).getClass();
	}
	
	@Test
	public void testFormElements() throws ParseError {
		assertEquals(Question.class, parseClass("q1: \"fjdslfj\" boolean"));
		assertEquals(Question.class, parseClass("q1: \"\" boolean"));
		
		assertEquals(Computed.class, parseClass("q1: \"fjdkslfj \" boolean(a == b)"));
		assertEquals(Computed.class, parseClass("q1: \"\" integer(this + that)"));
		
		assertEquals(IfStatement.class, parseClass("if (d < e) { q1: \" \" integer }"));
		assertEquals(IfStatement.class, parseClass("if (a == b) { } "));
		
		assertEquals(IfStatement.class, parseClass(
				"if (d < e) { q1: \" \" integer } else if (a) { }"));
		assertEquals(IfStatement.class, parseClass(
				"if (a == b) { } else if (1+1) { }"));
		
		assertEquals(IfStatement.class, parseClass(
				"if (d < e) { q1: \" \" integer } else { q2: \" \" string }"));
		assertEquals(IfStatement.class, parseClass(
				"if (a == b) { } else if (r == 4) {} else {} "));
	}

}