package org.uva.sea.ql.ast.operators;

import java.math.BigDecimal;
import java.util.HashMap;

import org.uva.sea.ql.ast.BinExpr;
import org.uva.sea.ql.ast.Expr;
import org.uva.sea.ql.ast.Statement;
import org.uva.sea.ql.ast.nodevisitor.Visitor;
import org.uva.sea.ql.ast.nodevisitor.VisitorResult;
import org.uva.sea.ql.ast.types.MoneyType;
import org.uva.sea.ql.ast.types.IntegerType;
import org.uva.sea.ql.ast.types.TypeDescription;

public class Div extends BinExpr {

	public Div(Expr lhs, Expr rhs) {
		super(lhs, rhs);
	}

	@Override
	public TypeDescription typeOf(HashMap<String, Statement> typeEnv) {
		return new IntegerType();
	}

	@Override
	public VisitorResult accept(Visitor visitor) {
		return visitor.visit(this);
	}

	@Override
	public ExpressionResult eval(HashMap<String, ExpressionResult> symbolMap) {
		ExpressionResult leftHandResult = getExprLeftHand().eval(symbolMap);
		ExpressionResult rightHandResult = getExprRightHand().eval(symbolMap);

		// Check types and allow promotion from integer to money, there is no
		// demotion
		// Money is compatible to Integer and Integer IS NOT compatible to Money
		// The order of the test for compatibility is important.
		// Case 1 MoneyType - MoneyType
		if ((new MoneyType()).isCompatibleTo(leftHandResult.typeOf())
				&& (new MoneyType()).isCompatibleTo(rightHandResult.typeOf())) {
			return new MoneyResult(leftHandResult.getMoneyValue().divide(rightHandResult.getMoneyValue()));
		}
		// Case 2 MoneyType - Integer
		if ((new MoneyType()).isCompatibleTo(leftHandResult.typeOf())) {
			return new MoneyResult(leftHandResult.getMoneyValue().divide(new BigDecimal(rightHandResult.getIntegerValue())));
		}
		// Case 3 Integer - MoneyType
		if ((new MoneyType()).isCompatibleTo(rightHandResult.typeOf())) {
			return new MoneyResult((new BigDecimal(leftHandResult.getIntegerValue()).divide(rightHandResult.getMoneyValue())));
		}
		// Case 4 Integer - Integer
		return new IntegerResult(leftHandResult.getIntegerValue() / rightHandResult.getIntegerValue());
	}
}