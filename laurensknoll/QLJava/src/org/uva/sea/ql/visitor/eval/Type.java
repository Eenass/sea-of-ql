package org.uva.sea.ql.visitor.eval;

import org.uva.sea.ql.ast.type.Bool;
import org.uva.sea.ql.ast.type.Int;
import org.uva.sea.ql.ast.type.Money;
import org.uva.sea.ql.ast.type.Numeric;
import org.uva.sea.ql.ast.type.String;
import org.uva.sea.ql.visitor.IType;
import org.uva.sea.ql.visitor.eval.ui.type.Widget;

public class Type implements IType<Widget> {

	@Override
	public Widget visit(Bool bool) {
		return new org.uva.sea.ql.visitor.eval.ui.type.Bool();
	}

	@Override
	public Widget visit(Int intType) {
		return new org.uva.sea.ql.visitor.eval.ui.type.Int();
	}

	@Override
	public Widget visit(Money money) {
		return new org.uva.sea.ql.visitor.eval.ui.type.Money();
	}

	@Override
	public Widget visit(String string) {
		return new org.uva.sea.ql.visitor.eval.ui.type.String();
	}

	@Override
	public Widget visit(Numeric numeric) {
		throw new UnsupportedOperationException(
				"Numeric cannot be used as a concrete type.");
	}

}
