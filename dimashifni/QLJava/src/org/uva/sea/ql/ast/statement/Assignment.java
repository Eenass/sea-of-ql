package org.uva.sea.ql.ast.statement;

import org.uva.sea.ql.ast.expression.Ident;
import org.uva.sea.ql.type.Type;
import org.uva.sea.ql.visitor.statement.StatementVisitor;

public class Assignment implements Statement {
    private final Ident ident;
    private final String question;

    public Assignment(Ident ident, String question) {
        this.ident = ident;
        this.question = question;
    }

    public Ident getIdent() {
        return ident;
    }

    public String getQuestion() {
        return question;
    }

    public Type getType() {
        return ident.getType();
    }

    @Override
    public <T> T accept(StatementVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
