package org.uva.sea.ql.check.values;

import org.uva.sea.ql.ast.expressions.Expression;
import org.uva.sea.ql.ast.expressions.binary.BinaryExpression;
import org.uva.sea.ql.ast.expressions.binary.arithmetic.Addition;
import org.uva.sea.ql.ast.expressions.binary.arithmetic.Division;
import org.uva.sea.ql.ast.expressions.binary.arithmetic.Multiplication;
import org.uva.sea.ql.ast.expressions.binary.arithmetic.Subtraction;
import org.uva.sea.ql.ast.expressions.binary.logical.LogicallyEquivalentExpression;
import org.uva.sea.ql.ast.expressions.binary.logical.LogicallyNotEquivalentExpression;
import org.uva.sea.ql.ast.expressions.binary.relational.EqualToExpression;
import org.uva.sea.ql.ast.expressions.binary.relational.GreaterThanExpression;
import org.uva.sea.ql.ast.expressions.binary.relational.GreaterThanOrEqualToExpression;
import org.uva.sea.ql.ast.expressions.binary.relational.LessThanExpression;
import org.uva.sea.ql.ast.expressions.binary.relational.LessThanOrEqualToExpression;
import org.uva.sea.ql.ast.expressions.binary.relational.NotEqualToExpression;
import org.uva.sea.ql.ast.expressions.literal.Bool;
import org.uva.sea.ql.ast.expressions.literal.Identifier;
import org.uva.sea.ql.ast.expressions.literal.Int;
import org.uva.sea.ql.ast.expressions.literal.Money;
import org.uva.sea.ql.ast.expressions.literal.Str;
import org.uva.sea.ql.ast.expressions.unary.NegationalExpression;
import org.uva.sea.ql.ast.expressions.unary.NegativeExpression;
import org.uva.sea.ql.ast.expressions.unary.PositiveExpression;
import org.uva.sea.ql.ast.values.Null;
import org.uva.sea.ql.ast.values.Value;
import org.uva.sea.ql.ast.visitors.typechecker.Visitor;
import org.uva.sea.ql.parser.ValueEnvironment;

public class Evaluator implements Visitor<Value> {
	
	private final ValueEnvironment _valueEnvironment;
	
	public Evaluator(ValueEnvironment valueEnvironment) {
		//_valueEnvironment = (ValueEnvironment) Collections.unmodifiableMap(valueEnvironment.getEnvironment());
		_valueEnvironment = valueEnvironment;
	}
	
	public void eval(Expression expression) { expression.accept(this); }

	@Override
	public Value visit(Addition expression)       { return getLeftHandSide(expression).add(getRightHandSide(expression)); }
	@Override
	public Value visit(Division expression)       { return getLeftHandSide(expression).div(getRightHandSide(expression)); }
	@Override
	public Value visit(Subtraction expression)    { return getLeftHandSide(expression).sub(getRightHandSide(expression)); }
	@Override
	public Value visit(Multiplication expression) { return getLeftHandSide(expression).mul(getRightHandSide(expression)); }
	@Override
	public Value visit(Identifier indentifier) {
		if (_valueEnvironment.contains(indentifier)) {
			return _valueEnvironment.get(indentifier);
		}
		return new Null();
	}
	@Override
	public Value visit(LogicallyEquivalentExpression expression)    { return new Null(); }
	@Override
	public Value visit(LogicallyNotEquivalentExpression expression) { return new Null(); }
	@Override
	public Value visit(EqualToExpression expression)                { return new Null(); }
	@Override
	public Value visit(GreaterThanOrEqualToExpression expression)   { return new Null(); }
	@Override
	public Value visit(GreaterThanExpression expression)            { return new Null(); }
	@Override
	public Value visit(LessThanOrEqualToExpression expression)      { return new Null(); }
	@Override
	public Value visit(LessThanExpression expression)               { return new Null(); }
	@Override
	public Value visit(NotEqualToExpression expression)             { return new Null(); }
	@Override
	public Value visit(NegativeExpression expression)               { return new Null(); }
	@Override
	public Value visit(NegationalExpression expression)             { return new Null(); }
	@Override
	public Value visit(PositiveExpression expression)               { return new Null(); }
	
	@Override
	public Value visit(Bool expression) { 
		return new Null(); 
	}

	@Override
	public Value visit(Int expression) {
		return null;
	}

	@Override
	public Value visit(Money expression) {
		return null;
	}

	@Override
	public Value visit(Str expression) {
		return null;
	}
	
	private Value getLeftHandSide(BinaryExpression expression)  { return expression.getLeftHandSide().accept(this); }
	private Value getRightHandSide(BinaryExpression expression) { return expression.getRightHandSide().accept(this); }
	
}