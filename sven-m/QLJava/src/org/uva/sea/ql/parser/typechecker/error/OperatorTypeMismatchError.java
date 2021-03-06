package org.uva.sea.ql.parser.typechecker.error;

import org.uva.sea.ql.ast.expression.Binary;
import org.uva.sea.ql.ast.expression.Unary;

public class OperatorTypeMismatchError extends SemanticError {
	private final static String U_FORMAT =
			"Operator type mismatch: %s not defined for %s";
	private final static String B_FORMAT =
			"Operator type mismatch: %s not defined for %s and %s";
	
	public OperatorTypeMismatchError(String operatorType, String operandType,
			Unary expression)
	{	
		super(String.format(U_FORMAT, operatorType, operandType), expression);
	}
	
	public OperatorTypeMismatchError(String opType, String lhsType, String rhsType,
			Binary expression)
	{	
		super(String.format(B_FORMAT, opType, lhsType, rhsType), expression);
	}
	
}
