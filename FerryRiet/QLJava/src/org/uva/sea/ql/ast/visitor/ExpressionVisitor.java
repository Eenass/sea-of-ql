package org.uva.sea.ql.ast.visitor;

import org.uva.sea.ql.ast.literals.BooleanLiteral;
import org.uva.sea.ql.ast.literals.IntegerLiteral;
import org.uva.sea.ql.ast.literals.MoneyLiteral;
import org.uva.sea.ql.ast.literals.StringLiteral;
import org.uva.sea.ql.ast.operators.Add;
import org.uva.sea.ql.ast.operators.And;
import org.uva.sea.ql.ast.operators.Div;
import org.uva.sea.ql.ast.operators.Eq;
import org.uva.sea.ql.ast.operators.GEq;
import org.uva.sea.ql.ast.operators.GT;
import org.uva.sea.ql.ast.operators.Ident;
import org.uva.sea.ql.ast.operators.LEq;
import org.uva.sea.ql.ast.operators.LT;
import org.uva.sea.ql.ast.operators.Mul;
import org.uva.sea.ql.ast.operators.NEq;
import org.uva.sea.ql.ast.operators.Neg;
import org.uva.sea.ql.ast.operators.Not;
import org.uva.sea.ql.ast.operators.Or;
import org.uva.sea.ql.ast.operators.Pos;
import org.uva.sea.ql.ast.operators.Sub;

public interface ExpressionVisitor<T> {
	T visit(Ident expr);

	T visit(IntegerLiteral expr);

	T visit(MoneyLiteral expr);

	T visit(StringLiteral expr);

	T visit(BooleanLiteral expr);

	T visit(Add expr);

	T visit(Mul expr);

	T visit(Div expr);

	T visit(Sub expr);

	T visit(And expr);

	T visit(Or expr);

	T visit(Eq expr);

	T visit(GT expr);

	T visit(LT expr);

	T visit(LEq expr);

	T visit(NEq expr);

	T visit(GEq expr);

	T visit(Not expr);

	T visit(Neg expr);

	T visit(Pos expr);
}
