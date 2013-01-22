package org.uva.sea.ql.visitor.checker;

import java.util.List;
import java.util.Map;

import org.antlr.tool.Message;
import org.uva.sea.ql.ast.expr.Expr;
import org.uva.sea.ql.ast.expr.binary.Add;
import org.uva.sea.ql.ast.expr.binary.And;
import org.uva.sea.ql.ast.expr.binary.Div;
import org.uva.sea.ql.ast.expr.binary.Eq;
import org.uva.sea.ql.ast.expr.binary.GEq;
import org.uva.sea.ql.ast.expr.binary.GT;
import org.uva.sea.ql.ast.expr.binary.LEq;
import org.uva.sea.ql.ast.expr.binary.LT;
import org.uva.sea.ql.ast.expr.binary.Mul;
import org.uva.sea.ql.ast.expr.binary.NEq;
import org.uva.sea.ql.ast.expr.binary.Or;
import org.uva.sea.ql.ast.expr.binary.Sub;
import org.uva.sea.ql.ast.expr.primary.Bool;
import org.uva.sea.ql.ast.expr.primary.Ident;
import org.uva.sea.ql.ast.expr.primary.Int;
import org.uva.sea.ql.ast.expr.primary.StringLiteral;
import org.uva.sea.ql.ast.expr.unary.Neg;
import org.uva.sea.ql.ast.expr.unary.Not;
import org.uva.sea.ql.ast.expr.unary.Pos;
import org.uva.sea.ql.ast.type.Type;
import org.uva.sea.ql.visitor.ExpressionVisitor;

public class ExpressionChecker implements ExpressionVisitor<Boolean> {
	private final Map<Ident, Type> typeEnv;
	private final List<Message> messages;

	public ExpressionChecker(Map<Ident, Type> tenv, List<Message> messages) {
		this.typeEnv = tenv;
		this.messages = messages;
	}

	public static boolean check(Expr expr, Map<Ident, Type> typeEnv,
			List<Message> errs) {
		ExpressionChecker check = new ExpressionChecker(typeEnv, errs);
		return expr.accept(check);
	}

	@Override
	public Boolean visit(Add ast) {
		boolean checkLhs = ast.getLhs().accept(this);
		boolean checkRhs = ast.getRhs().accept(this);

		if (!(checkLhs && checkRhs)) {
			return false;
		}

		Type lhsType = ast.getLhs().typeOf(typeEnv);
		Type rhsType = ast.getRhs().typeOf(typeEnv);

		if (!(lhsType.isCompatibleToNumericType() && rhsType
				.isCompatibleToNumericType())) {

			System.out.println("invalid Numeric operater for + ");
			return false;
		}
		return true;
	}

	@Override
	public Boolean visit(And ast) {
		boolean checkLhs = ast.getLhs().accept(this);
		boolean checkRhs = ast.getRhs().accept(this);
		
		if (!(checkLhs && checkRhs)) {
			return false;
		}
		
		Type lhsType = ast.getLhs().typeOf(typeEnv);
		Type rhsType = ast.getRhs().typeOf(typeEnv);
		
		if (!(lhsType.isCompatibleToBooleanType() && rhsType
				.isCompatibleToBooleanType())) {

			System.out.println("invalid boolean operator for &&.");
			return false;
		}
		return true;
	}

	@Override
	public Boolean visit(Div ast) {
		boolean checkLhs = ast.getLhs().accept(this);
		boolean checkRhs = ast.getRhs().accept(this);
		
		if (!(checkLhs && checkRhs)) {
			return false;
		}
		
		Type lhsType = ast.getLhs().typeOf(typeEnv);
		Type rhsType = ast.getRhs().typeOf(typeEnv);
		
		if (!(lhsType.isCompatibleToNumericType() && rhsType
				.isCompatibleToNumericType())) {

			System.out.println("invalid integer operator for /.");
			return false;
		}
		return true;
	}

	@Override
	public Boolean visit(Eq ast) {
		boolean checkLhs = ast.getLhs().accept(this);
		boolean checkRhs = ast.getRhs().accept(this);
		
		if (!(checkLhs && checkRhs)) {
			return false;
		}
		
		Type lhsType = ast.getLhs().typeOf(typeEnv);
		Type rhsType = ast.getRhs().typeOf(typeEnv);
		
		if (!(lhsType.isCompatibleToBooleanType() && rhsType.isCompatibleToBooleanType()) 
				&& !(lhsType.isCompatibleToNumericType() && rhsType.isCompatibleToNumericType())) {

			System.out.println("invalid boolean operator for ==.");
			return false;
		}
		return true;
	}

	@Override
	public Boolean visit(GEq ast) {
		boolean checkLhs = ast.getLhs().accept(this);
		boolean checkRhs = ast.getRhs().accept(this);
		
		if (!(checkLhs && checkRhs)) {
			return false;
		}
		
		Type lhsType = ast.getLhs().typeOf(typeEnv);
		Type rhsType = ast.getRhs().typeOf(typeEnv);
		
		if (!(lhsType.isCompatibleToNumericType() && rhsType
				.isCompatibleToNumericType())) {

			System.out.println("invalid Numeric operator for <=.");
			return false;
		}
		return true;
	}

	@Override
	public Boolean visit(GT ast) {
		boolean checkLhs = ast.getLhs().accept(this);
		boolean checkRhs = ast.getRhs().accept(this);
		
		if (!(checkLhs && checkRhs)) {
			return false;
		}
		
		Type lhsType = ast.getLhs().typeOf(typeEnv);
		Type rhsType = ast.getRhs().typeOf(typeEnv);
		
		if (!(lhsType.isCompatibleToNumericType() && rhsType
				.isCompatibleToNumericType())) {

			System.out.println("invalid Numeric operator for >.");
			return false;
		}
		return true;
	}

	@Override
	public Boolean visit(LEq ast) {
		boolean checkLhs = ast.getLhs().accept(this);
		boolean checkRhs = ast.getRhs().accept(this);
		
		if (!(checkLhs && checkRhs)) {
			return false;
		}
		
		Type lhsType = ast.getLhs().typeOf(typeEnv);
		Type rhsType = ast.getRhs().typeOf(typeEnv);
		
		if (!(lhsType.isCompatibleToNumericType() && rhsType
				.isCompatibleToNumericType())) {

			System.out.println("invalid Numeric operator for <=.");
			return false;
		}
		return true;
	}

	@Override
	public Boolean visit(LT ast) {
		boolean checkLhs = ast.getLhs().accept(this);
		boolean checkRhs = ast.getRhs().accept(this);
		
		if (!(checkLhs && checkRhs)) {
			return false;
		}
		
		Type lhsType = ast.getLhs().typeOf(typeEnv);
		Type rhsType = ast.getRhs().typeOf(typeEnv);
		
		if (!(lhsType.isCompatibleToNumericType() && rhsType
				.isCompatibleToNumericType())) {

			System.out.println("invalid Numeric operator for <.");
			return false;
		}
		return true;
	}

	@Override
	public Boolean visit(Mul ast) {
		boolean checkLhs = ast.getLhs().accept(this);
		boolean checkRhs = ast.getRhs().accept(this);
		
		if (!(checkLhs && checkRhs)) {
			return false;
		}
		
		Type lhsType = ast.getLhs().typeOf(typeEnv);
		Type rhsType = ast.getRhs().typeOf(typeEnv);
		
		if (!(lhsType.isCompatibleToNumericType() && rhsType
				.isCompatibleToNumericType())) {

			System.out.println("invalid Numeric operator for *.");
			return false;
		}
		return true;
	}

	@Override
	public Boolean visit(NEq ast) {
		boolean checkLhs = ast.getLhs().accept(this);
		boolean checkRhs = ast.getRhs().accept(this);
		
		if (!(checkLhs && checkRhs)) {
			return false;
		}
		
		Type lhsType = ast.getLhs().typeOf(typeEnv);
		Type rhsType = ast.getRhs().typeOf(typeEnv);
		
		if (!(lhsType.isCompatibleToBooleanType() && rhsType.isCompatibleToBooleanType()) 
			&& !(lhsType.isCompatibleToNumericType() && rhsType.isCompatibleToNumericType())) {

			System.out.println("invalid Boolean operator for !=.");
			return false;
		}
		return true;
	}

	@Override
	public Boolean visit(Or ast) {
		boolean checkLhs = ast.getLhs().accept(this);
		boolean checkRhs = ast.getRhs().accept(this);
		
		if (!(checkLhs && checkRhs)) {
			return false;
		}
		
		Type lhsType = ast.getLhs().typeOf(typeEnv);
		Type rhsType = ast.getRhs().typeOf(typeEnv);
		
		if (!(lhsType.isCompatibleToBooleanType() && rhsType
				.isCompatibleToBooleanType())) {

			System.out.println("invalid Boolean operator for ||.");
			return false;
		}
		return true;
	}

	@Override
	public Boolean visit(Sub ast) {
		boolean checkLhs = ast.getLhs().accept(this);
		boolean checkRhs = ast.getRhs().accept(this);
		
		if (!(checkLhs && checkRhs)) {
			return false;
		}
		
		Type lhsType = ast.getLhs().typeOf(typeEnv);
		Type rhsType = ast.getRhs().typeOf(typeEnv);
		
		if (!(lhsType.isCompatibleToNumericType() && rhsType
				.isCompatibleToNumericType())) {

			System.out.println("invalid Numeric operator for /.");
			return false;
		}
		return true;
	}

	@Override
	public Boolean visit(Neg ast) {
		boolean checkArg = ast.getArg().accept(this);
		
		if (!checkArg) {
			return false;
		}

		Type argType = ast.getArg().typeOf(typeEnv);
		if (!argType.isCompatibleToNumericType()) {
			System.out.println("invalid Numeric operator for -.");
			return false;
		}
		
		return true;
	}

	@Override
	public Boolean visit(Not ast) {
		boolean checkArg = ast.getArg().accept(this);
		
		if (!checkArg) {
			return false;
		}

		Type argType = ast.getArg().typeOf(typeEnv);
		if (!argType.isCompatibleToBooleanType()) {
			System.out.println("invalid Numeric operator for !.");
			return false;
		}
		
		return true;
	}

	@Override
	public Boolean visit(Pos ast) {
		boolean checkArg = ast.getArg().accept(this);
		
		if (!checkArg) {
			return false;
		}

		Type argType = ast.getArg().typeOf(typeEnv);
		if (!argType.isCompatibleToNumericType()) {
			System.out.println("invalid Numeric operator for +.");
			return false;
		}
		
		return true;
	}

	@Override
	public Boolean visit(Bool ast) {
//		boolean checkString = ast.accept(this);
//		
//		if (!checkString) {
//			return false;
//		}
		return true;
	}

	@Override
	public Boolean visit(Ident ast) {
//		boolean checkString = ast.accept(this);
//		
//		if (!checkString) {
//			return false;
//		}
		return true;
	}

	@Override
	public Boolean visit(Int ast) {
//		boolean checkString = ast.accept(this);
//		
//		if (!checkString) {
//			return false;
//		}
		return true;
	}

	@Override
	public Boolean visit(StringLiteral ast) {
//		boolean checkString = ast.accept(this);
//		
//		if (!checkString) {
//			return false;
//		}
		return true;
	}

	public List<Message> getMessages() {
		return messages;
	}
}
