package org.uva.sea.ql.parser.antlr;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.uva.sea.ql.ast.QLExpression;
import org.uva.sea.ql.parser.IParse;
import org.uva.sea.ql.parser.exception.ParseError;

public class ANTLRParser implements IParse {

	@Override
	public QLExpression parse(String src) throws ParseError {
		ANTLRStringStream stream = new ANTLRStringStream(src);
		CommonTokenStream tokens = new CommonTokenStream();
		tokens.setTokenSource(new QLLexer(stream));
		QLParser parser = new QLParser(tokens);
		try {
			return parser.orExpr();
		} catch (RecognitionException e) {
			throw new ParseError(e.getMessage());
		}
	}

}
