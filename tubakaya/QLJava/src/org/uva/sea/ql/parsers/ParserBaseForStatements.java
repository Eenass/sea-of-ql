package org.uva.sea.ql.parsers;

import org.uva.sea.ql.core.dom.Statement;
import org.uva.sea.ql.parsers.antlr.QLLexer;
import org.uva.sea.ql.parsers.antlr.QLParser;
import org.uva.sea.ql.parsers.exceptions.ParseException;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

public abstract class ParserBaseForStatements {

	public Statement parse(String src) throws ParseException {
		ANTLRStringStream stream = new ANTLRStringStream(src);
		CommonTokenStream tokens = new CommonTokenStream();
		tokens.setTokenSource(new QLLexer(stream));
		QLParser parser = new QLParser(tokens);		
		try {
				return callExprUnderTest(parser);
			} 
		catch (RecognitionException e) {
				throw new ParseException(e.getMessage());
			}
		}

	public abstract Statement callExprUnderTest(QLParser parser) throws RecognitionException;
}