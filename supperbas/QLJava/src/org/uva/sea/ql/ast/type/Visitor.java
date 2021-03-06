package org.uva.sea.ql.ast.type;

public interface Visitor<T> {

	T visit(Bool ast);
	T visit(Str ast);
	T visit(Int ast);
}
