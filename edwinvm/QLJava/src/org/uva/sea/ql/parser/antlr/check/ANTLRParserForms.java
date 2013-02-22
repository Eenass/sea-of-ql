package org.uva.sea.ql.parser.antlr.check;

import org.uva.sea.ql.ast.forms.Form;
import org.uva.sea.ql.parser.ParseError;
import org.uva.sea.ql.parser.antlr.ANTLRParser;

public class ANTLRParserForms extends ANTLRParser {
	@Override
	public Form parse(String src) throws ParseError {
		return (Form)parseInput(src, "form");
	}
}