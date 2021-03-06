package org.uva.sea.ql.parser.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.uva.sea.ql.ast.*;
import org.uva.sea.ql.parser.antlr.ANTLRComputedQuestionParser;
import org.uva.sea.ql.parser.antlr.ANTLRIfThenElseStatementParser;
import org.uva.sea.ql.parser.antlr.ANTLRIfThenStatementParser;
import org.uva.sea.ql.parser.antlr.ANTLRParser;
import org.uva.sea.ql.parser.antlr.ANTLRQuestionParser;

public class TestIfThenElseStatement {


	private IParse parser;

		public TestIfThenElseStatement() {
		this.parser = new ANTLRIfThenElseStatementParser();
	}

	
	@Test
	public void testIfThenElseStatement() throws ParseError {
		assertEquals(parser.parse
				("if (hasSoldHouse) then {"  
						+ "valueResidue : \"Value residue\" int(sellingPrice - privateDebt) "
						+ "valueResidue2 : \" Value residue 2 \" bool(x && y) "
						+ "} "
						+ " else { "
						+ "valueResidueMin : \"Value residue min\" int(privateDebt - sellingPrice) "	
						+ "hasMaintLoan: \"Did you enter a loan for maintenance or reconstruction\" bool "
						+ "    if (a < b) then { "
						+ "       valueResidue3: \"Value residue 3\" bool(xyz && abc) "
						+ "    } "
						+ "}").getClass(), IfThenElseStatement.class);
	}
	
	
	
}
