package org.uva.sea.ql.parser.primary;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.uva.sea.ql.ast.nodetypes.primary.Bool;
import org.uva.sea.ql.parser.TestParser;
import org.uva.sea.ql.parser.exception.ParseError;

public class TestBooleans extends TestParser {

    @Test
    public void shouldEvaluateToBoolClass() throws ParseError {
        assertEquals(Bool.class, parseExpression("true").getClass());
        assertEquals(Bool.class, parseExpression("false").getClass());
    }
}
