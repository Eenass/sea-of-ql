package org.uva.sea.ql.parser.test.syntax;

import org.uva.sea.ql.parser.test.AbstractTest;
import org.uva.sea.ql.parser.test.ParseError;

public abstract class SyntaxTest extends AbstractTest {
	
	protected abstract Class<?> parseClass(String src) throws ParseError;
	
}
