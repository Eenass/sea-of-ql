package org.uva.sea.ql.visitor;

import java.util.List;
import java.util.Map;

import org.uva.sea.ql.ast.expr.Expr;
import org.uva.sea.ql.ast.expr.Ident;
import org.uva.sea.ql.ast.expr.binary.*;
import org.uva.sea.ql.ast.expr.unary.*;
import org.uva.sea.ql.ast.expr.value.*;
import org.uva.sea.ql.ast.types.ErrorType;
import org.uva.sea.ql.ast.types.Type;

public class ExprVisitor implements IExprVisitor<Boolean> {
	
	private final Map<String, Type> typeEnv;
	private final List<String> messages;
	private final Type lastType;
	
	private ExprVisitor(Map<String, Type> tenv, List<String> messages, Type lastType) {
		this.typeEnv = tenv;
		this.messages = messages;
		this.lastType = lastType;
	}
	
	public static boolean check(Expr expr, Map<String, Type> typeEnv, List<String> errs, Type lastType) {
		ExprVisitor check = new ExprVisitor(typeEnv, errs, lastType);
		return expr.accept(check);
	}
	
	public void addError(String error) {
		this.messages.add(error);
	}
	
	public List<String> getErrorList() {
		return messages;
	}

	@Override
	public Boolean visit(Ident node) {
		if(typeEnv.get(node.getName()) == null)	{
			addError("Ident " + node.getName() + " is not declared");
		}
		return true;
	}
	
	@Override
	public Boolean visit(Add node) {
		if(!checkSubtrees(node)) return false;
		areBothSidesCompatable(node, "+");
		areBothSidesCompatibleToNumeric(node,"+");	
		return true;
	}

	@Override
	public Boolean visit(And node) {
		if(!checkSubtrees(node)) return false;
		areBothSidesCompatibleToBoolean(node, "&&");
		return true;
	}

	@Override
	public Boolean visit(Div node) {
		if(!checkSubtrees(node)) return false;
		areBothSidesCompatable(node, "/");
		areBothSidesCompatibleToNumeric(node,"/");
		return true;
	}
	
	@Override
	public Boolean visit(Eq node) {
		if(!checkSubtrees(node)) return false;
		areBothSidesCompatable(node, "==");
		return true;
	}

	@Override
	public Boolean visit(GEq node) {
		if(!checkSubtrees(node)) return false;
		areBothSidesCompatable(node, ">=");
		areBothSidesCompatibleToNumeric(node,">=");
		return true;
	}

	@Override
	public Boolean visit(GT node) {
		if(!checkSubtrees(node)) return false;
		areBothSidesCompatable(node, ">");
		areBothSidesCompatibleToNumeric(node,">");
		return true;
	}

	@Override
	public Boolean visit(LEq node) {
		if(!checkSubtrees(node)) return false;
		areBothSidesCompatable(node, "<=");
		areBothSidesCompatibleToNumeric(node,"<=");
		return true;
	}

	@Override
	public Boolean visit(LT node) {
		if(!checkSubtrees(node)) return false;
		areBothSidesCompatable(node, "<");
		areBothSidesCompatibleToNumeric(node,"<");
		return true;
	}

	@Override
	public Boolean visit(Mul node) {
		if(!checkSubtrees(node)) return false;
		areBothSidesCompatable(node, "*");
		areBothSidesCompatibleToNumeric(node,"*");
		return true;
	}

	@Override
	public Boolean visit(Neg node) {
		checkArgument(node);
		isArgumentNumeric(node, "-");
		return true;
	}

	@Override
	public Boolean visit(NEq node) {
		if(!checkSubtrees(node)) return false;		
		areBothSidesCompatable(node, "!=");
		return true;
	}

	@Override
	public Boolean visit(Not node) {
		checkArgument(node);
		isArgumentBoolean(node, "!");
		return true;
	}

	@Override
	public Boolean visit(Or node) {
		if(!checkSubtrees(node)) return false;
		areBothSidesCompatibleToBoolean(node, "||");
		return true;
	}

	@Override
	public Boolean visit(Pos node) {
		checkArgument(node);
		isArgumentNumeric(node, "+");
		return true;
	}

	@Override
	public Boolean visit(Sub node) {
		if(!checkSubtrees(node)) return false;
		areBothSidesCompatable(node, "-");
		areBothSidesCompatibleToNumeric(node,"-");
		return true;
	}

	@Override
	public Boolean visit(BoolLiteral node) {
		return true;
	}

	@Override
	public Boolean visit(MoneyLiteral node) { 
		return true;
	}

	@Override
	public Boolean visit(StringLiteral node) {
		return true;
	}
	
	@Override
	public Boolean visit(IntLiteral node) {
		return true;
	}
	
	private boolean checkSubtrees(BinaryExpr node) {
		if (!(node.getLhs().accept(this) && node.getRhs().accept(this))){
			return false;
		}
		return true;	
	}
	
	private boolean checkArgument(UnaryExpr node) {
		if (!node.getArg().accept(this)){
			return false;
		}
		return true;
	}
	
	private boolean isArgumentNumeric(UnaryExpr node, String operator) {
		if(!node.getArg().typeOf(typeEnv).isCompatibleToNumeric()) {
			addError("Invalid type for unary " + operator);
			return false;
		}
		return true;
	}
	
	private boolean isArgumentBoolean(UnaryExpr node, String operator) {
		if(!node.getArg().typeOf(typeEnv).isCompatibleToBoolType()) {
			addError("Invalid type for unary " + operator);
			return false;
		}
		return true;
	}
	
	private boolean areBothSidesCompatable(BinaryExpr node, String operator) {
		if (!(node.getLhs().typeOf(typeEnv).isCompatibleTo(node.getRhs().typeOf(typeEnv)))) { 
			addError("Both operators must have the same type for " + operator);
			return false;
		}
		return true;
	}
	
	private boolean areBothSidesCompatibleToNumeric(BinaryExpr node, String operator ) {
		if (!(node.getLhs().typeOf(typeEnv).isCompatibleToNumeric() && node.getRhs().typeOf(typeEnv).isCompatibleToNumeric())) {   //&& node.getLhs().typeOf(typeEnv).isCompatibleTo(node.getRhs().typeOf(typeEnv)
			addError("invalid types for " + operator);
			return false;
		}
		if (!lastType.isCompatibleToErrorType()&&!lastType.isCompatibleToBoolType()){
			if (!node.getRhs().typeOf(typeEnv).isCompatibleTo(lastType)){
				addError("Expression will be of a different type than the one declared");
				return false;
			}
		}  
		return true;
	}
	
	private boolean areBothSidesCompatibleToBoolean(BinaryExpr node, String operator ) {
		if (!(node.getLhs().typeOf(typeEnv).isCompatibleToBoolType() && node.getRhs().typeOf(typeEnv).isCompatibleToBoolType())) {
			addError("invalid type for " + operator);
			return false;
		}
		return true;
	}

}
