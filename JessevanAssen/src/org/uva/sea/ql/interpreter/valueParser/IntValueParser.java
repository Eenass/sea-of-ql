package org.uva.sea.ql.interpreter.valueParser;

import org.uva.sea.ql.ast.expression.value.Int;
import org.uva.sea.ql.ast.expression.value.Value;

public class IntValueParser implements ValueParser {
    private static final Int DEFAULT = new Int(-1);

    @Override
    public Value parseValue(String value) {
        try {
            return new Int(Integer.parseInt(value));
        } catch(NumberFormatException ex) {
            throw new ValueParserException(
                    String.format("The value '%s' can't be parsed as an Integer.", value),
                    ex
            );
        }
    }

    @Override
    public Value getDefault() {
        return DEFAULT;
    }
}
