package org.uva.sea.ql.ast.visitors.typechecker;

import org.uva.sea.ql.ast.expressions.binary.arithmetic.Addition;
import org.uva.sea.ql.ast.expressions.binary.arithmetic.Division;
import org.uva.sea.ql.ast.expressions.binary.arithmetic.Multiplication;
import org.uva.sea.ql.ast.expressions.binary.arithmetic.Subtraction;
import org.uva.sea.ql.ast.expressions.binary.logical.And;
import org.uva.sea.ql.ast.expressions.binary.logical.Or;
import org.uva.sea.ql.ast.expressions.binary.relational.Eq;
import org.uva.sea.ql.ast.expressions.binary.relational.GEq;
import org.uva.sea.ql.ast.expressions.binary.relational.GT;
import org.uva.sea.ql.ast.expressions.binary.relational.LEq;
import org.uva.sea.ql.ast.expressions.binary.relational.LT;
import org.uva.sea.ql.ast.expressions.binary.relational.NEq;
import org.uva.sea.ql.ast.expressions.literal.Bool;
import org.uva.sea.ql.ast.expressions.literal.Ident;
import org.uva.sea.ql.ast.expressions.literal.Int;
import org.uva.sea.ql.ast.expressions.literal.Money;
import org.uva.sea.ql.ast.expressions.literal.Str;
import org.uva.sea.ql.ast.expressions.unary.Neg;
import org.uva.sea.ql.ast.expressions.unary.Not;
import org.uva.sea.ql.ast.expressions.unary.Pos;

public interface Visitor<T> {
	
	// Binary arithmetic expressions
	T visit(Addition ast);
	T visit(Division ast);
	T visit(Subtraction ast);
	T visit(Multiplication ast);
	
	// Binary logical expressions
	T visit(And ast);
	T visit(Or ast);
	
	// Binary relational expressions
	T visit(Eq ast);
	T visit(GEq ast);
	T visit(GT ast);
	T visit(LEq ast);
	T visit(LT ast);
	T visit(NEq ast);
	
	// Unary expressions
	T visit(Neg ast);
	T visit(Not ast);
	T visit(Pos ast);
	
	// Literal expressions
	T visit(Bool ast);
	T visit(Ident ast);
	T visit(Int ast);
	T visit(Money money);
	T visit(Str str);
	
}