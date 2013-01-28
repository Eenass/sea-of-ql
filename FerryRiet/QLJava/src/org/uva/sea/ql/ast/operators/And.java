package org.uva.sea.ql.ast.operators;

import java.util.HashMap;

import org.uva.sea.ql.ast.BinExpr;
import org.uva.sea.ql.ast.Expr;
import org.uva.sea.ql.ast.Statement;
import org.uva.sea.ql.ast.nodevisitor.Visitor;
import org.uva.sea.ql.ast.nodevisitor.VisitorResult;
import org.uva.sea.ql.ast.types.BooleanType;
import org.uva.sea.ql.ast.types.TypeDescription;

public class And extends BinExpr {

	public And(Expr result, Expr rhs) {
		super(result, rhs);
	}

	@Override
	public TypeDescription typeOf(HashMap<String, Statement> typeEnv) {
		return new BooleanType();
	}

	@Override
	public VisitorResult accept(Visitor visitor) {
		return visitor.visit(this);
	}

	@Override
	public ExpressionResult eval(HashMap<String, Statement> symbolMap) {
		// TODO and check type
		ExpressionResult leftHandresult = getExprLeftHand().eval(symbolMap);
		ExpressionResult rightHandResult = getExprRightHand().eval(symbolMap);

		return new BooleanResult(leftHandresult.getBooleanValue() && rightHandResult.getBooleanValue());
}
}
