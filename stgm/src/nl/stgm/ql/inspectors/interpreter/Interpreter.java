package nl.stgm.ql.inspectors.interpreter;

import java.io.*;
import java.util.HashMap;

import nl.stgm.ql.ast.expr.*;
import nl.stgm.ql.ast.expr.literal.*;
import nl.stgm.ql.ast.form.Document;

import nl.stgm.ql.inspectors.*;

public class Interpreter extends DocumentInspector
{
	private HashMap<String,LiteralExpr> symbols = new HashMap<String,LiteralExpr>();
		
	public void regForm(String name)
	{
		System.out.println("\n --- " + name.toUpperCase() + " ------------------------------\n");
	}
	
	public void regQuestion(String id, String question, Type type)
	{
		System.out.print("   " + question + " ");
		switch(type)
		{
			case INT:
				symbols.put(id, inputInt());
				break;
			case BOOL:
				symbols.put(id, inputBool());
				break;
			default:
				throw new Error("Unsupported type found in question.");
		}
	}
	
	public void regCalcQuestion(String id, String question, LiteralExpr value)
	{
		System.out.print("   " + question + " ");
		System.out.print(value.toString());
		System.out.println(" (calculated)");
		symbols.put(id, value);
	}
	
	public LiteralExpr lookupValue(String name)
	{
		return symbols.get(name);
	}
	
	//
	// question input tools (could be factored into separate io class)
	//
	
	private Int inputInt()
	{
		return new Int(Integer.parseInt(inputString()));
	}
	
	private Bool inputBool()
	{
		String input = inputString();
		
		if(input.equals("y") || input.equals("yes"))
		{
			return new Bool(true);
		}
		else // if no yes, it will be no ;-)
		{
			return new Bool(false);
		}
	}
	
	private String inputString()
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;

		try
		{
			input = br.readLine();
			return input;
		}
		catch (IOException ioe)
		{
			exitWithError("Unknown input error. Please restart.");
			return null; // FML
		}
	}
	
	public static void main(String[] args)
	{
		Interpreter ip = new Interpreter();
		Document document = parseDocument("canonical.qldoc");
		document.interpret(ip);
		System.out.println();
	}
}
