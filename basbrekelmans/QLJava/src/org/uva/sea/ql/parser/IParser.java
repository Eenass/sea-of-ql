package org.uva.sea.ql.parser;

import org.uva.sea.ql.ast.Node;

public interface IParser {
	Node parse(String src) throws ParseError;

	Node parse(String src, String fileName) throws ParseError;
}
