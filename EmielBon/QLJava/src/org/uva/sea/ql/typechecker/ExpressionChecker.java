package org.uva.sea.ql.typechecker;

import java.util.List;

import org.uva.sea.ql.ast.Expression;
import org.uva.sea.ql.ast.ExpressionVisitor;
import org.uva.sea.ql.ast.Identifier;
import org.uva.sea.ql.ast.literal.*;
import org.uva.sea.ql.ast.operators.*;
import org.uva.sea.ql.ast.operators.logical.*;
import org.uva.sea.ql.ast.operators.numeric.*;
import org.uva.sea.ql.ast.operators.relational.*;
import org.uva.sea.ql.ast.type.Type;

public class ExpressionChecker implements ExpressionVisitor<Boolean> {

	private final TypeEnvironment typeEnv;
	private final List<Error> errors;
	
	private ExpressionChecker(TypeEnvironment typeEnv, List<Error> messages) {
		this.typeEnv = typeEnv;
		this.errors = messages;
	}
	
	public static boolean check(Expression expr, TypeEnvironment typeEnv, List<Error> errs) {
		ExpressionChecker check = new ExpressionChecker(typeEnv, errs);
		return expr.accept(check);
	}
	
	public Type typeOf(Expression expr) {
		return expr.typeOf(typeEnv);
	}
	
	private void addError(Expression expr, String message) {
		errors.add(new Error(expr, message));
	}
	
	public boolean checkOperands(Operator expr) {
		
		boolean compatible = true;

		for(Expression e : expr.getOperands()) {
			compatible = compatible && e.accept(this);  
		}
		
		return compatible;
	}
	
	public boolean checkOperator(Operator expr) {
		
		if (!checkOperands(expr)) {
			return false;
		}
		
		Type operatorType = typeOf(expr);
		
		for(Expression operand : expr.getOperands()) {
			if (!typeOf(operand).isCompatibleWith(operatorType)) {
				addError(expr, "invalid type for " + expr.getRepresentation());
				return false;
			}
		}
		
		return true;
	}
	
	public boolean checkRelationalOperator(BinaryOperator expr) {
		
		if (!checkOperands(expr)) {
			addError(expr, "invalid type for " + expr.getRepresentation());
			return false;
		}
		
		Type lhsType = typeOf(expr.getLeftOperand());
		Type rhsType = typeOf(expr.getLeftOperand());
		
		return lhsType.isCompatibleWith(rhsType);
	}

	public Boolean visit(Add expr) {
		return checkOperator(expr);
	}

	public Boolean visit(Div expr) {
		return checkOperator(expr);
	}

	public Boolean visit(Mul expr) {
		return checkOperator(expr);
	}

	public Boolean visit(Neg expr) {
		return checkOperator(expr);
	}

	public Boolean visit(Pos expr) {
		return checkOperator(expr);
	}

	public Boolean visit(Sub expr) {
		return checkOperator(expr);
	}

	public Boolean visit(And expr) {
		return checkOperator(expr);
	}

	public Boolean visit(Not expr) {
		return checkOperator(expr);
	}

	public Boolean visit(Or expr) {
		return checkOperator(expr);
	}

	public Boolean visit(Eq expr) {
		return checkRelationalOperator(expr);
	}

	public Boolean visit(GEq expr) {
		return checkRelationalOperator(expr);
	}

	public Boolean visit(GT expr) {
		return checkRelationalOperator(expr);
	}

	public Boolean visit(LEq expr) {
		return checkRelationalOperator(expr);
	}

	public Boolean visit(LT expr) {
		return checkRelationalOperator(expr);
	}

	public Boolean visit(NEq expr) {
		return checkRelationalOperator(expr);
	}

	public Boolean visit(Identifier expr) {
		return true;
	}

	public Boolean visit(BooleanLiteral expr) {
		return true;
	}

	public Boolean visit(IntegerLiteral expr) {
		return true;
	}

	public Boolean visit(StringLiteral expr) {
		return true;
	}

	public Boolean visit(MoneyLiteral moneyLiteral) {
		return true;
	}
	
}
