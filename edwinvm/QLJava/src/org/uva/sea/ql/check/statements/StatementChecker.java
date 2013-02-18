package org.uva.sea.ql.check.statements;

import org.uva.sea.ql.ast.Expr;
import org.uva.sea.ql.ast.FormStatement;
import org.uva.sea.ql.ast.Type;
import org.uva.sea.ql.ast.expressions.literal.Ident;
import org.uva.sea.ql.ast.statements.ConditionBlock;
import org.uva.sea.ql.ast.statements.Question;
import org.uva.sea.ql.ast.statements.conditions.IfThen;
import org.uva.sea.ql.ast.statements.conditions.IfThenElse;
import org.uva.sea.ql.ast.statements.questions.AnswerableQuestion;
import org.uva.sea.ql.ast.statements.questions.ComputedQuestion;
import org.uva.sea.ql.ast.visitors.statementchecker.Visitor;
import org.uva.sea.ql.check.expressions.TypeChecker;
import org.uva.sea.ql.parser.ErrorMessages;
import org.uva.sea.ql.parser.SupportedTypes;

public class StatementChecker implements Visitor {
	
	private final SupportedTypes _supportedTypes;
	private final ErrorMessages _errorMessages;
	
	private StatementChecker(SupportedTypes supportedTypes, ErrorMessages messages) {
		_supportedTypes = supportedTypes;
		_errorMessages = messages;
	}
	
	public static void check(FormStatement statement, SupportedTypes supportedTypes, ErrorMessages errors) {
		StatementChecker statementChecker = new StatementChecker(supportedTypes, errors);
		statement.accept(statementChecker);
	}

	@Override
	public void visit(IfThen statement) {
		checkCondition(statement);
		statement.getBody().accept(this);
	}
	
	@Override
	public void visit(IfThenElse statement) {
		checkCondition(statement);
		statement.getBody().accept(this);
		statement.getElseBody().accept(this);
	}

	@Override
	public void visit(AnswerableQuestion statement) {
		checkName(statement, statement.getType());
	}

	@Override
	public void visit(ComputedQuestion statement) {
		checkName(statement, statement.getExpression().typeOf(_supportedTypes));
		checkExpr(statement.getExpression());
	}
	
	private void checkCondition(ConditionBlock statement) {
		checkExpr(statement.getCondition());
	}

	private void checkExpr(Expr expr) {
		// Run expression through TypeChecker
		TypeChecker.check(expr, _supportedTypes, _errorMessages);
	}
	
	private void checkName(Question statement, Type type) {
		Ident questionVariable = statement.getVariable();
		checkQuestionCompatibility(questionVariable, type);
	}
	
	private void checkQuestionCompatibility(Ident questionVariable, Type type) {
		storeQuestionVariable(questionVariable, type);
		if (!type.isCompatibleTo(questionVariable.typeOf(_supportedTypes))) {
			addError(questionVariable);
		}
	}

	private void storeQuestionVariable(Ident questionVariable, Type type) {
		if (!_supportedTypes.contains(questionVariable)) {
			_supportedTypes.add(questionVariable, type);
		}
	}
	
	private void addError(Ident ident) {
		_errorMessages.add("Invalid type for identifier " + ident.getValue().toString());
	}
	
}