package org.uva.sea.ql.parser;

import junit.framework.Assert;
import org.junit.Before;
import org.uva.sea.ql.ast.QLExpression;
import org.uva.sea.ql.ast.QLStatement;
import org.uva.sea.ql.ast.nodetypes.formelement.Conditional;
import org.uva.sea.ql.ast.nodetypes.formelement.Form;
import org.uva.sea.ql.ast.nodetypes.primary.Datatype;
import org.uva.sea.ql.parser.antlr.ANTLRParser;
import org.uva.sea.ql.parser.exception.ParseError;

public abstract class TestParser {

	private Parser parser;

	@Before
	public void prepareTest() {
		this.parser = new ANTLRParser();
	}

	protected Form parseForm(String source) throws ParseError {
		return (Form) parser.parse(source);
	}

	protected QLStatement parseStatement(String source) throws ParseError {
		String template = "form FormName { %s }";
		Form form = parseForm(String.format(template, source));
		return form.getStatements().get(0);
	}

	protected QLExpression parseExpression(String source) throws ParseError {
		String template = "if(%s){}";
		Conditional statement = (Conditional) parseStatement(String.format(template, source));
        Assert.assertTrue("Attempted to parse non-expression to an expression.", statement.getCondition() instanceof QLExpression);
		return (QLExpression) statement.getCondition();
	}

    protected Datatype<?> parsePrimary(String source) throws ParseError {
        String template = "if(%s){}";
        Conditional statement = (Conditional) parseStatement(String.format(template, source));
        Assert.assertTrue("Attempted to parse non-expression to an expression.", statement.getCondition() instanceof Datatype<?>);
        return (Datatype<?>) statement.getCondition();
    }
}