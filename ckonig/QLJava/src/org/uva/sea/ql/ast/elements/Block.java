package org.uva.sea.ql.ast.elements;

import java.util.List;

import org.uva.sea.ql.ast.expressions.Expr;
import org.uva.sea.ql.ast.interfaces.ASTElement;
import org.uva.sea.ql.common.VisitorException;
import org.uva.sea.ql.common.interfaces.ElementVisitor;

public class Block extends Expr implements ASTElement {
	private List<BlockElement> content;

	public Block(List<BlockElement> ex) {
		this.content = ex;
	}

	public final List<BlockElement> getContent() {
		return this.content;
	}

	public final void addLine(BlockElement e) {
		this.content.add(e);
	}

	@Override
	public final void accept(ElementVisitor visitor) throws VisitorException{
		visitor.visit(this);
	}
}
