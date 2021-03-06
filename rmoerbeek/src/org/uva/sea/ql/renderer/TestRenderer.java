package org.uva.sea.ql.renderer;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.uva.sea.ql.ast.expression.Ident;
import org.uva.sea.ql.ast.types.Type;
import org.uva.sea.ql.parser.antlr.ANTLRParser;
import org.uva.sea.ql.parser.test.ParseError;
import org.uva.sea.ql.parser.typechecker.CheckStat;

public class TestRenderer {
	//private static String Stmt1 = "hasSoldHouse: \"Did you sell a house in 2010?\" boolean\n";
	private static String form = "form Box1HouseOwning { \n" +
                                      "hasSoldHouse: \"Did you sell a house in 2010?\" boolean\n" +
                                      "hasBoughtHouse: \"Did you by a house in 2010?\" boolean    \n"+
                                      "hasMaintLoan: \"Did you enter a loan for maintenance/reconstruction?\" " +
                                      	"boolean\n" +
                                      "if (hasSoldHouse) {" +
                                      "sellingPrice: \"Price the house was sold for:\" integer \n" +
                                      "privateDebt: \"Private debts for the sold house:\" integer\n" +
                                      "hasMaintLoan: \"Value residue:\" integer(sellingPrice - privateDebt)\n" +         
										"}\n" +
                                      "else if (hasBoughtHouse) { blabla: \"thisisaquestion\" boolean \n }" +
									  "}"; 
	
                                      
	private static State state;
	private static ANTLRParser parser;
	private static JFrame frame;
	 
	public static void mainTest(String[] args) throws ParseError {
		state = new State();
		parser = new ANTLRParser();
		ArrayList<String> errorList = new ArrayList<String>();
		boolean check = CheckStat.check(parser.parseForm(form), new HashMap<Ident, Type>(), errorList);

		if(check) {
			JPanel panel = Renderer.render(parser.parseForm(form).getBody(), state);
			panel.setVisible(true);
		
			frame=new JFrame("My Ql");
			frame.setSize(400,400);
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.add(panel);
		
		}
		else {
			for(int i = 0; i<errorList.size(); i++) {
				new ErrorBox(errorList.get(i));
			}
			
		}
	}
}