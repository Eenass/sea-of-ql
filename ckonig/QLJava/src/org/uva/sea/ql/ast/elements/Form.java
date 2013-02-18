package org.uva.sea.ql.ast.elements;

import org.uva.sea.ql.ast.interfaces.ASTElement;
import org.uva.sea.ql.common.ElementVisitor;
import org.uva.sea.ql.common.QLException;

public class Form implements ASTElement {
	private Block content;
	private String name;

	public Form(String title, Block block) {
		this.name = title;
		this.content = block;
	}

	public final String getName() {
		return this.name;
	}

	public final Block getBlock() {
		return this.content;
	}

	@Override
	public final void accept(ElementVisitor visitor) throws QLException{
		visitor.visit(this);
	}

}
