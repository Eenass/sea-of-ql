package org.uva.sea.ql.parser.test;

import org.uva.sea.ql.parser.ANTLRParser;

public class ParseDebug {

	/**
	 * @param args
	 */	
	public static void main(String[] args) throws ParseError {
		IParse parser = new ANTLRParser();
		System.out.println(parser.parseForm("form Ident { }").getClass());
	}
}