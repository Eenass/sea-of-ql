package org.uva.sea.ql.parser.antlr;

public class ParseError extends Exception {

	private static final long serialVersionUID = 1L;

	public ParseError(String msg) {
		super(msg);
	}
}
