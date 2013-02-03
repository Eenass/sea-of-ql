package org.uva.sea.ql.parsers;

import org.uva.sea.ql.ast.types.Expr;
import org.uva.sea.ql.parser.antlr.QLParser;
import org.antlr.runtime.RecognitionException;

public class PrimaryParser extends ParserBase {

	public Expr callExprUnderTest(QLParser parser) throws RecognitionException {
		return parser.primary();
	}
}
