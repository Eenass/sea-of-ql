package org.uva.sea.ql.checker;

import java.util.ArrayList;
import java.util.List;

import org.uva.sea.ql.ast.Expr;
import org.uva.sea.ql.ast.IVisitorExpr;
import org.uva.sea.ql.ast.Ident;
import org.uva.sea.ql.ast.operative.Add;
import org.uva.sea.ql.ast.operative.And;
import org.uva.sea.ql.ast.operative.Div;
import org.uva.sea.ql.ast.operative.Eq;
import org.uva.sea.ql.ast.operative.GEq;
import org.uva.sea.ql.ast.operative.GT;
import org.uva.sea.ql.ast.operative.LEq;
import org.uva.sea.ql.ast.operative.LT;
import org.uva.sea.ql.ast.operative.Mul;
import org.uva.sea.ql.ast.operative.NEq;
import org.uva.sea.ql.ast.operative.Neg;
import org.uva.sea.ql.ast.operative.Not;
import org.uva.sea.ql.ast.operative.OperatorBinary;
import org.uva.sea.ql.ast.operative.OperatorUnary;
import org.uva.sea.ql.ast.operative.Or;
import org.uva.sea.ql.ast.operative.Pos;
import org.uva.sea.ql.ast.operative.Sub;
import org.uva.sea.ql.ast.primitive.Int;
import org.uva.sea.ql.ast.primitive.Str;
import org.uva.sea.ql.ast.primitive.Undefined;
import org.uva.sea.ql.ast.type.BoolType;
import org.uva.sea.ql.ast.type.NumericType;
import org.uva.sea.ql.ast.type.Type;
import org.uva.sea.ql.util.Environment;

public class VisitorExpressionChecker implements IVisitorExpr<Boolean> {

	private Environment<Ident, Type> environment;
	private List<Error> errors;
	
	public VisitorExpressionChecker(){
		environment = new Environment<Ident, Type>();
		errors = new ArrayList<Error>();
	}

	
	public VisitorExpressionChecker(Environment<Ident, Type> env, List<Error> errors){
		this.environment = env;
		this.errors = errors;
	}
	
	
	private boolean checkOperandCompatibility(Expr lhs, Expr rhs){
		Type leftType = lhs.typeOf(environment);
		Type rightType = rhs.typeOf(environment);
		
		if(!leftType.isCompatibleTo(rightType)){
			errors.add(new ErrorExpressionType(lhs, rightType));
			return false;
		}
		
		return true;
	}
	
	
	private boolean checkType(Expr expr, Type expectedType){
		
		if(!expr.typeOf(environment).isCompatibleTo(expectedType)){
			errors.add(new ErrorExpressionType(expr, expectedType));
			return false;
		}
		
		return true;
	}
	
	
	private boolean checkExpression(Expr expression, Type expectedType){
		
		if(!expression.accept(this))
			return false;
		
		return checkType(expression, expectedType);
	}
	
	
	private boolean checkOperatorBinary(OperatorBinary operator, Type expectedType){
		Expr lhs = operator.getLeftHandOperand();
		Expr rhs = operator.getRightHandOperand();
		
		return 	checkExpression(lhs, expectedType) & 
				checkExpression(rhs, expectedType) &
				checkOperandCompatibility(lhs, rhs);
	}
	
	
	private boolean checkOperatorUnary(OperatorUnary operator, Type expectedType){
		Expr op = operator.getOperand();
		return checkExpression(op, expectedType);
	}
	
	
	private boolean checkEqual(OperatorBinary operator){
		
		Expr lhs = operator.getLeftHandOperand();
		Expr rhs = operator.getRightHandOperand();
		
		if(!checkOperandCompatibility(lhs,rhs))
			return false;
		
		return lhs.accept(this) & rhs.accept(this);
	}
	
	@Override
	public Boolean visit(Ident ident) {
		if(!ident.typeOf(environment).isDefinedType()){
			errors.add(new ErrorIdentifierScope(ident));
			return false;
		}
		
		return true;
	}

	@Override
	public Boolean visit(Add operator) {
		return checkOperatorBinary(operator, new NumericType() );
	}

	@Override
	public Boolean visit(And operator) {
		return checkOperatorBinary(operator, new BoolType() );
	}

	@Override
	public Boolean visit(Div operator) {
		return checkOperatorBinary(operator, new NumericType() );
	}

	@Override
	public Boolean visit(Eq operator) {
		return checkEqual(operator);
	}

	@Override
	public Boolean visit(GEq operator) {
		return checkOperatorBinary(operator, new NumericType() );
	}

	@Override
	public Boolean visit(GT operator) {
		return checkOperatorBinary(operator, new NumericType() );
	}

	@Override
	public Boolean visit(LEq operator) {
		return checkOperatorBinary(operator, new NumericType() );
	}

	@Override
	public Boolean visit(LT operator) {
		return checkOperatorBinary(operator, new NumericType() );
	}

	@Override
	public Boolean visit(Mul operator) {
		return checkOperatorBinary(operator, new NumericType() );
	}

	@Override
	public Boolean visit(Neg operator) {
		return checkOperatorUnary(operator, new NumericType() );
	}

	@Override
	public Boolean visit(NEq operator) {
		return checkEqual(operator);
	}

	@Override
	public Boolean visit(Not operator) {
		return checkOperatorUnary(operator, new BoolType() );
	}

	@Override
	public Boolean visit(Or operator) {
		return checkOperatorBinary(operator, new BoolType() );
	}

	@Override
	public Boolean visit(Pos operator) {
		return checkOperatorUnary(operator, new NumericType() );
	}

	@Override
	public Boolean visit(Sub operator) {
		return checkOperatorBinary(operator, new NumericType() );
	}

	@Override
	public Boolean visit(Int ast) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Boolean visit(org.uva.sea.ql.ast.primitive.Bool ast) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Boolean visit(Str ast) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Boolean visit(Undefined ast) {
		// TODO Auto-generated method stub
		return true;
	}

	
	public boolean errorsFound(){
		return errors.size() > 0;
	}
	
	
	public List<Error> getErrors(){
		return errors;
	}
	
}
