package org.uva.sea.ql.parser.antlr;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.uva.sea.ql.ast.expr.Expr;
import org.uva.sea.ql.ast.stat.Form;
import org.uva.sea.ql.ast.stat.FormUnit;
import org.uva.sea.ql.ast.types.Type;
import org.uva.sea.ql.test.IParse;
import org.uva.sea.ql.test.ParseError;

public class ANTLRParser implements IParse {

	@Override
	public QLParser parse(String src) throws ParseError {
		ANTLRStringStream stream = new ANTLRStringStream(src);
		CommonTokenStream tokens = new CommonTokenStream();
		tokens.setTokenSource(new QLLexer(stream));
		QLParser parser = new QLParser(tokens);
		return parser;
	}

	@Override
	public Expr parseExpr(String src) throws ParseError {
		try {
			return parse(src).orExpr();
		} catch (RecognitionException e) {
			throw new ParseError(e.getMessage());
		}
	}

	@Override
	public Form parseForm(String src) throws ParseError {
		try {
			return parse(src).form();
		} catch (RecognitionException e) {
			throw new ParseError(e.getMessage());
		}
	}

	@Override
	public Type parseType(String src) throws ParseError {
		try {
			return parse(src).type();
		} catch (RecognitionException e) {
			throw new ParseError(e.getMessage());
		}
	}

	@Override
	public FormUnit parseStatements(String src) throws ParseError {
		try {
			return parse(src).formUnit();
		} catch (RecognitionException e) {
			throw new ParseError(e.getMessage());
		}
	}

}
