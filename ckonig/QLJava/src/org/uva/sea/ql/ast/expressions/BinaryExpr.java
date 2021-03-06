package org.uva.sea.ql.ast.expressions;

import org.uva.sea.ql.ast.interfaces.TreeNode;
import org.uva.sea.ql.common.TreeVisitor;

public abstract class BinaryExpr extends Expr implements TreeNode{
	private Expr left;
	private Expr right;

	public BinaryExpr(Expr l, Expr r) {
		this.left = l;
		this.right = r;
	}

	public final Expr getRight() {
		return this.right;
	}

	public final Expr getLeft() {
		return this.left;
	}

    @Override
    public final void accept(TreeVisitor v) {
       v.visit(this);
    }
}
