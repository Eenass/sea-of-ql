package org.uva.sea.ql.test.types;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.uva.sea.ql.ast.expressions.Expression;
import org.uva.sea.ql.ast.types.Type;
import org.uva.sea.ql.check.TypeEnvironment;
import org.uva.sea.ql.check.expressions.TypeChecker;
import org.uva.sea.ql.parser.IParser;
import org.uva.sea.ql.parser.antlr.check.ANTLRParserExpressions;
import org.uva.sea.ql.parser.antlr.check.ANTLRParserTypes;
import org.uva.sea.ql.parser.errors.ErrorMessages;
import org.uva.sea.ql.parser.errors.ParseError;

public class ExpressionTypeChecker {
	
	private final IParser _parser;
	private final TypeEnvironment _typeEnvironment;
	
	public ExpressionTypeChecker() {
		_parser = new ANTLRParserExpressions();
		_typeEnvironment = new TypeEnvironment();
	}
	
	public void isAValidExpression(String input)     throws ParseError {  assertTrue(checkExpression(input)); }
	public void isNotAValidExpression(String input)  throws ParseError { assertFalse(checkExpression(input)); }
	
	public void isOfTypeBoolean(String input)        throws ParseError { assertTrue(getTypeFor(input).isCompatibleToBool());    }
	public void isOfTypeInt(String input)            throws ParseError { assertTrue(getTypeFor(input).isCompatibleToInt());     }
	public void isOfTypeMoney(String input)          throws ParseError { assertTrue(getTypeFor(input).isCompatibleToMoney());   }
	public void isOfTypeNumeric(String input)        throws ParseError { assertTrue(getTypeFor(input).isCompatibleToNumeric()); }
	public void isOfTypeString(String input)         throws ParseError { assertTrue(getTypeFor(input).isCompatibleToStr());     }
	public void isOfTypeIdent(String input)          throws ParseError { assertTrue(isIdentCompatibleWithType(input));          }
	
	private Boolean checkExpression(String input)    throws ParseError {
		Expression expression = parseExpression(input);
		return TypeChecker.check(expression, _typeEnvironment, new ErrorMessages());
	}
	
	private Expression parseExpression(String input) throws ParseError { return (Expression) _parser.parse(input); }
	
	private Type getTypeFor(String input)            throws ParseError { return getTypeForLiteralExpression(input); }
	
	private Type getTypeForLiteralExpression(String input) throws ParseError {
		Expression expression = (Expression) parseExpression(input);
		return expression.typeOf(_typeEnvironment);
	}
	
	private Boolean isIdentCompatibleWithType(String input) throws ParseError {
		Type type = getIdentifierTypeFor(input);
		return type.isCompatibleTo(type);
	}
	
	private Type getIdentifierTypeFor(String input) throws ParseError {
		ANTLRParserTypes parser = new ANTLRParserTypes();
		return parser.parse(input);
	}
	
}