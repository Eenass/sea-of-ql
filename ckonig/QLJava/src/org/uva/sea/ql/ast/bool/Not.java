<<<<<<< HEAD
package org.uva.sea.ql.ast.bool;

import org.uva.sea.ql.ast.AcceptsBoolOperands;
import org.uva.sea.ql.ast.Expr;
import org.uva.sea.ql.ast.ReturnsBoolOperands;
import org.uva.sea.ql.ast.UnaryExpr;
import org.uva.sea.ql.visitor.ASTVisitor;
import org.uva.sea.ql.visitor.VisitorException;

public class Not extends UnaryExpr implements AcceptsBoolOperands,
		ReturnsBoolOperands {
	public static final String str = "!";

	public Not(Expr ex) {
		super(ex);
	}

	@Override
	public void accept(ASTVisitor visitor) throws VisitorException {
		visitor.visit(this);
	}

	@Override
	public String toString() {
		return str;
	}
}
=======
package org.uva.sea.ql.ast.bool;

import org.uva.sea.ql.ast.AcceptsBoolOperands;
import org.uva.sea.ql.ast.Expr;
import org.uva.sea.ql.ast.ReturnsBoolOperands;
import org.uva.sea.ql.ast.UnaryExpr;

public class Not extends UnaryExpr implements AcceptsBoolOperands,
		ReturnsBoolOperands {
	public static final String str = "!";

	public Not(Expr ex) {
		super(ex);
	}

	@Override
	public String toString() {
		return str;
	}
}
>>>>>>> 483057f28359ecac2b999d94a928c0aaf01d2a6e