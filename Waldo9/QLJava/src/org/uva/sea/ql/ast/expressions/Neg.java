package org.uva.sea.ql.ast.expressions;

import org.uva.sea.ql.ast.ASTNodeVisitor;

public class Neg extends BinaryTree {

	public Neg(Expr x) {
		super(x);
	}
	
	public void accept(ASTNodeVisitor visitor) {
		super.accept(visitor);
		visitor.visit(this);
    }

}
