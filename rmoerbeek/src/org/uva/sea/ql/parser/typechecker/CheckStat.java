package org.uva.sea.ql.parser.typechecker;

import java.util.List;
import java.util.Map;

import org.uva.sea.ql.ast.expression.Expr;
import org.uva.sea.ql.ast.expression.Ident;
import org.uva.sea.ql.ast.statement.Body;
import org.uva.sea.ql.ast.statement.ComputedQuestion;
import org.uva.sea.ql.ast.statement.ElseIfStat;
import org.uva.sea.ql.ast.statement.ElseStat;
import org.uva.sea.ql.ast.statement.Form;
import org.uva.sea.ql.ast.statement.IfStat;
import org.uva.sea.ql.ast.statement.NonComputedQuestion;
import org.uva.sea.ql.ast.statement.Statement;
import org.uva.sea.ql.ast.types.Type;
import org.uva.sea.ql.ast.visitors.StatementVisitor;

public class CheckStat implements StatementVisitor<Boolean> {
	
	private final Map<Ident, Type> typeEnv;
	private final List<String> messages;
	
	private CheckStat(Map<Ident, Type> typeEnv, List<String> messages){
		this.typeEnv = typeEnv;
		this.messages = messages;
		
	}
	
	public static boolean check(Form stat, Map<Ident, Type> typeEnv, List<String> mess){
		CheckStat check = new CheckStat(typeEnv, mess);
		return stat.accept(check);	
	}
	
	public boolean checkExpr(Expr expr) {
		return CheckExpr.check(expr, typeEnv, messages);
	}
	
	public Type typeOf(Expr expr) {
		return expr.typeOf(typeEnv);
	}


	@Override
	public Boolean visit(Body stat) {
		boolean out = true;

		for(Statement stmt: stat.getElems()){
			out &= stmt.accept(this);
			}
		return out;
	}
	

	@Override
	public Boolean visit(ElseIfStat stat) {

		if (!stat.getCondition().typeOf(typeEnv).isCompatibleToBool()) { // check for boolean output of condition
			messages.add("Error in " + "If Statement" + "\n" + "Condition does not result in Bool");
			return false;
		}
		
		if (!checkExpr(stat.getCondition())) { //check for valid expression of condition
			messages.add("Error in " + "If Statement" + "\n" + "Condition no valid Expression");
			return false;
		}
		
		return stat.getBody().accept(this); // check body
		
	}

	@Override
	public Boolean visit(ElseStat stat) {
		return stat.getBody().accept(this);
	}
	

	@Override
	public Boolean visit(Form stat) {
		if (stat.getBody().getElems().isEmpty()) {
			// no elements in the form returns true by default
			return true; 
		}
	
		return stat.getBody().accept(new CheckStat(typeEnv, messages));
	}


	public Boolean visit(IfStat stat) {
		
		if (!stat.getCondition().typeOf(typeEnv).isCompatibleToBool()) { // check for boolean output of condition
			messages.add("Error in " + "If Statement" + "\n" + "Condition does not result in Bool");
			return false;
		}
	
		if (!checkExpr(stat.getCondition())) { // check for valid expression of condition
			messages.add("Error in " + "If Statement" + "\n" + "Condition no valid Expression");
			return false;
		}

		if (stat.getElseIfs().isEmpty()) {
			/* check validity of if-body */
			return stat.getBody().accept(this);	 // check body
		} else {
			boolean tempBool = true;
			List<ElseIfStat> elseIfStats = stat.getElseIfs();
			for (ElseIfStat eis : elseIfStats) {
				/* Check for every else-if-statement for validity */
				tempBool &= eis.accept(this);
			}
			
			return tempBool && stat.getBody().accept(this);
		}
		
	}
	

	public Boolean visit(NonComputedQuestion stat) {
		
		Ident id = stat.getIdentifier();
		Type t = stat.getType();
		
		for (Ident idInEnv : typeEnv.keySet()) { // check for unique id
			if (idInEnv.getValue().equals(id.getValue()) ) {
				messages.add("Error in " + id.getValue() + "\n" + id.getValue() + " already exists");
				return false;
			}
		}
		
		typeEnv.put(id, t); //update environment
		return true;
		
	}	

	@Override
	public Boolean visit(ComputedQuestion stat) {
		Ident id = stat.getIdentifier();
		Type t = stat.getType();
		Expr expr = stat.getExpression();
		
		if (typeEnv.containsKey(id)) { // check for unique id
			messages.add("Error in " + id.getValue() + "\n" + id.getValue() + " already exists");
			return false;
		}

		if (!checkExpr(expr)) { // check valid expression
			messages.add("Error in " + id.getValue() + "\n" + "No valid expression");
			return false;
		}
		
		if (! expr.typeOf(typeEnv).isCompatibleTo(t)) { // check compatibility to expression type
			messages.add("Error in " + id.getValue() + "\n" + expr.typeOf(typeEnv) + " is not compatible to " + t);
			return false;
		}
		
		
		typeEnv.put(id, t); //update environment
		return true;
	}



}
