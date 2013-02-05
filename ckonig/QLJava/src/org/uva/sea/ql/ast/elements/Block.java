package org.uva.sea.ql.ast.elements;

import java.util.List;

import org.uva.sea.ql.ast.expressions.Expr;
import org.uva.sea.ql.common.ASTElement;
import org.uva.sea.ql.common.ASTVisitor;
import org.uva.sea.ql.common.VisitorException;

public class Block extends Expr implements ASTElement {
	private List<Expr> content;

	public Block(List<Expr> ex) {
		this.content = ex;
	}

	public final List<Expr> getContent() {
		return this.content;
	}

	public final void addLine(Expr e) {
		this.content.add(e);
	}

	@Override
	public final void accept(ASTVisitor visitor) throws VisitorException{
		visitor.visit(this);
	}
}
