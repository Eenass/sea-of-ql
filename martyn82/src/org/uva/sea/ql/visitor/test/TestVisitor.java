package org.uva.sea.ql.visitor.test;

import org.junit.Test;
import org.uva.sea.ql.parser.antlr.ANTLRParser;
import org.uva.sea.ql.parser.test.IParser;
import org.uva.sea.ql.parser.test.ParseError;
import org.uva.sea.ql.visitor.*;

/**
 * Testing visitor.
 */
public class TestVisitor {
	/**
	 * 
	 */
	private final Visitor visitor;
	
	/**
	 * 
	 */
	private final IParser parser;
	
	/**
	 * 
	 */
	public TestVisitor() {
		this.visitor = new PrintVisitor();
		this.parser = new ANTLRParser();
	}

	@Test
	public void testVisitor() throws ParseError {
		String program = "((true && !false) || ((a + b) == -31)) != \"hello world\"";
		
		this.parser.parse( program ).accept( visitor );
		System.out.println( visitor.toString() );
	}
}
