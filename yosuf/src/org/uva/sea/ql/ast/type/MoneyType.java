package org.uva.sea.ql.ast.type;

import org.uva.sea.ql.ast.exp.Nature;
import org.uva.sea.ql.ast.exp.Numeric;

public class MoneyType extends DataType {

	@Override
	public <T> T accept(final DataTypeVisitor<T> visitor) {
		return visitor.visit(this);
	}

	@Override
	public Nature getNature() {
		return new Numeric();
	}

}
