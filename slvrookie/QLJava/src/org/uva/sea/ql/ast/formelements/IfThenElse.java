package org.uva.sea.ql.ast.formelements;

import org.uva.sea.ql.ast.expr.Expr;
import org.uva.sea.ql.visitors.IElementVisitor;

public class IfThenElse extends IfThen {

	private final Block elseBody;

	public IfThenElse(Expr condition, Block thenBody, Block elseBody) {
		super(condition, thenBody);
		this.elseBody = elseBody;
	}

	public Block getElseBody() {
		return elseBody;
	}

	@Override
	public void accept(IElementVisitor ElementVisitor) {
		ElementVisitor.visit(this);
	}

}
