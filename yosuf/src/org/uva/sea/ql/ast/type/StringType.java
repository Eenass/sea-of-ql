package org.uva.sea.ql.ast.type;

import org.uva.sea.ql.visitor.ASTNodeVisitor;

public class StringType extends DataType {
	@Override
	public void accept(final ASTNodeVisitor visitor) {
		visitor.visit(this);
	}
}