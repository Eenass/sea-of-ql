package org.uva.sea.ql.parser.jacc;

import org.uva.sea.ql.ast.ASTNode;

public interface Parser {
	ASTNode parse(String src) throws ParseException;
}
