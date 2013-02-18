package org.uva.sea.ql.visitor.semanticanalysis;

import org.uva.sea.ql.ast.primary.Ident;
import org.uva.sea.ql.ast.primary.typeClasses.Type;

public interface SymbolTable {

    void addIdentifier(Ident identifier, Type type);

    Type getIdentifier(Ident identifier);

    boolean containsIdentifier(Ident identifier);

    void clear();
}
