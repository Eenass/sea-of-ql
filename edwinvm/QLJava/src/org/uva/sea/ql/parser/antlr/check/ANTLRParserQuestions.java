package org.uva.sea.ql.parser.antlr.check;

import org.uva.sea.ql.ast.FormStatement;
import org.uva.sea.ql.parser.ParseError;
import org.uva.sea.ql.parser.antlr.ANTLRParser;

public class ANTLRParserQuestions extends ANTLRParser {
	@Override
	public FormStatement parse(String src) throws ParseError {
		return (FormStatement)parseInput(src, "formStatement");
	}
}