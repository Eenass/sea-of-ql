package org.uva.sea.ql.ast;

import org.jpatterns.gof.CompositePattern;
import org.jpatterns.gof.VisitorPattern.Element;

@CompositePattern(comment = "Interface for leaves and composites.")
@Element(comment = "A visitor pattern element which accepts a visitor")
public interface ASTNode {

}
