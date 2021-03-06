package org.uva.sea.ql.checker.tests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.uva.sea.ql.parser.antlr.ANTLRParser;
import org.uva.sea.ql.parser.test.ParseError;
import org.uva.sea.ql.checker.ExprChecker;
import org.uva.sea.ql.ast.expressions.Ident;
import org.uva.sea.ql.ast.types.AType;

public class TestExprChecking {
	private ANTLRParser parser;
	private Map<Ident,AType> typeEnv;
	private List<String> errMsgs;
	
	public TestExprChecking() {
		parser = new ANTLRParser();
		typeEnv = new HashMap<Ident, AType>();
		errMsgs = new ArrayList<String>();
	}
	
	@Test
	public void testExprChecking() throws ParseError {
		assertTrue(ExprChecker.check(parser.parseExpr("10-25"), typeEnv, errMsgs));
		assertTrue(ExprChecker.check(parser.parseExpr("true || false"), typeEnv, errMsgs));
		assertTrue(ExprChecker.check(parser.parseExpr("23 >= 56"), typeEnv, errMsgs));
		assertTrue(ExprChecker.check(parser.parseExpr("25+56*(3/1)"), typeEnv, errMsgs));
		assertTrue(ExprChecker.check(parser.parseExpr("\"abc\"==\"abc\""), typeEnv, errMsgs));
		assertFalse(ExprChecker.check(parser.parseExpr("10-true"), typeEnv, errMsgs));
		assertFalse(ExprChecker.check(parser.parseExpr("true || 20"), typeEnv, errMsgs));
		assertFalse(ExprChecker.check(parser.parseExpr("\"abc\" + 56"), typeEnv, errMsgs));
	}
}