package org.uva.sea.ql.parser.test;

import org.uva.sea.ql.parser.antlr.QLFormParser;

public abstract class AbstractTest {
	private QLFormParser parser;

	public AbstractTest() {
		parser = new QLFormParser();
	}
	
	protected QLFormParser getParser() {
		return parser;
	}
	
	protected abstract Class<?> parseClass(String src) throws ParseError;
}
