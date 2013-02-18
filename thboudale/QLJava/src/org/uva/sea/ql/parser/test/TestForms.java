package org.uva.sea.ql.parser.test;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.uva.sea.ql.ast.Form;
import org.uva.sea.ql.parser.antlr.ANTLRParser;

@RunWith(Parameterized.class)
public class TestForms {

	private IParse parser;

	@Parameters
	public static List<Object[]> theParsers() {
	  return Arrays.asList( 
			  new Object[][] {{new ANTLRParser()}}
			 );
	}

	
	public TestForms(IParse parser) {
		this.parser = parser;
	}

	
	@Test
	public void testForm() throws ParseError {
	 	assertEquals(parser.parseForm("form Box1HouseOwning { \n" +
                                      "hasSoldHouse: \"Did you sell a house in 2010?\" boolean\n" +
                                      "hasBoughtHouse: \"Did you by a house in 2010?\" boolean    \n"+
                                      "hasMaintLoan: \"Did you enter a loan for maintenance/reconstruction?\" \n" +
                                      	"boolean\n" +
                                      "if (hasSoldHouse) {" +
                                      "sellingPrice: \"Price the house was sold for:\" int \n" +
                                      "privateDebt: \"Private debts for the sold house:\" int\n" +
                                      "valueResidue: \"Value residue:\" int(sellingPrice - privateDebt)\n" +         
										"}\n" +
									  "}").getClass(),
									  Form.class);
	 	
	}
	
}