package org.uva.sea.ql.parser.test.statements;

import static org.junit.Assert.assertTrue;

import org.uva.sea.ql.ast.Type;
import org.uva.sea.ql.ast.statements.Question;
import org.uva.sea.ql.ast.statements.questions.AnswerableQuestion;
import org.uva.sea.ql.parser.ParseError;
import org.uva.sea.ql.parser.antlr.check.ANTLRParserQuestions;

public class QuestionTypeChecker extends StatementTypeChecker {
	
	public QuestionTypeChecker() {
		super(new ANTLRParserQuestions());
	}

	public void isOfTypeBoolean(String input)     throws ParseError { assertTrue(getTypeFor(input).isCompatibleToBool());    }
	public void isOfTypeInt(String input)         throws ParseError { assertTrue(getTypeFor(input).isCompatibleToInt());     }
	public void isOfTypeMoney(String input)       throws ParseError { assertTrue(getTypeFor(input).isCompatibleToMoney());   }
	public void isOfTypeNumeric(String input)     throws ParseError { assertTrue(getTypeFor(input).isCompatibleToNumeric()); }
	public void isOfTypeString(String input)      throws ParseError { assertTrue(getTypeFor(input).isCompatibleToStr());     }
	
	private Question parseQuestion(String input)  throws ParseError { return (Question) parse(input); }
	
	private Type getTypeFor(String input)         throws ParseError { return getTypeForVariable(input); }
	private Type getTypeForVariable(String input) throws ParseError {
		AnswerableQuestion statement = (AnswerableQuestion) parseQuestion(input);
		return statement.getType();
	}
	
}