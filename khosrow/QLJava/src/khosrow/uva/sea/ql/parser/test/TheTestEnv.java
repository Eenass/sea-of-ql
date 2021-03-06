package khosrow.uva.sea.ql.parser.test;

import khosrow.uva.sea.ql.ast.expr.Ident;
import khosrow.uva.sea.ql.ast.type.*;
import khosrow.uva.sea.ql.env.Env;
import khosrow.uva.sea.ql.values.*;

public class TheTestEnv {
	private static Env env;
	private static TheTestEnv testEnv;
	
	private TheTestEnv(){}
	
	public static Env getEnv() {
		if(testEnv == null) {
			testEnv = new TheTestEnv();
			env = new Env();
			env.declareType(new Ident("iA"), new Int());
			env.assignValue(new Ident("iA"), new IntVal(1));
			env.declareType(new Ident("iB"), new Int());
			env.assignValue(new Ident("iB"), new IntVal(2));
			env.declareType(new Ident("iC"), new Int());
			env.assignValue(new Ident("iC"), new IntVal(3));
			env.declareType(new Ident("iD"), new Int());	
			env.assignValue(new Ident("iD"), new IntVal(4));
			
			env.declareType(new Ident("bA"), new Bool());
			env.assignValue(new Ident("bA"), new BoolVal(true));
			env.declareType(new Ident("bB"), new Bool());
			env.assignValue(new Ident("bB"), new BoolVal(false));
			env.declareType(new Ident("bC"), new Bool());
			env.assignValue(new Ident("bC"), new BoolVal(true));
			env.declareType(new Ident("bD"), new Bool());
			env.assignValue(new Ident("bD"), new BoolVal(false));
			
			env.declareType(new Ident("sA"), new Str());
			env.assignValue(new Ident("sA"), new StrVal("same text"));
			env.declareType(new Ident("sB"), new Str());
			env.assignValue(new Ident("sB"), new StrVal("same text"));			
			env.declareType(new Ident("sC"), new Str());
			env.assignValue(new Ident("sC"), new StrVal("text C"));
			env.declareType(new Ident("sD"), new Str());
			env.assignValue(new Ident("sD"), new StrVal("same D"));
			
			env.declareType(new Ident("mA"), new Money());
			env.assignValue(new Ident("mA"), new MoneyVal(1.1));
			env.declareType(new Ident("mB"), new Money());
			env.assignValue(new Ident("mB"), new MoneyVal(1.2));
			env.declareType(new Ident("mC"), new Money());
			env.assignValue(new Ident("mC"), new MoneyVal(1.3));
			env.declareType(new Ident("mD"), new Money());
			env.assignValue(new Ident("mD"), new MoneyVal(1.4));
		}
		return env;
	}
	
	public static Value getValueOf(String ident){
		return env.valueOf(new Ident(ident));
	}
}
