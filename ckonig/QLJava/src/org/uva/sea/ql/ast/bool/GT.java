<<<<<<< HEAD
package org.uva.sea.ql.ast.bool;

import org.uva.sea.ql.ast.AcceptsMathOperands;
import org.uva.sea.ql.ast.BinaryExpr;
import org.uva.sea.ql.ast.Expr;
import org.uva.sea.ql.ast.ReturnsBoolOperands;
import org.uva.sea.ql.visitor.ASTVisitor;
import org.uva.sea.ql.visitor.VisitorException;

public class GT extends BinaryExpr implements AcceptsMathOperands,
		ReturnsBoolOperands {
	public static final String str = ">";

	public GT(Expr left, Expr right) {
		super(left, right);
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

import org.uva.sea.ql.ast.AcceptsMathOperands;
import org.uva.sea.ql.ast.BinaryExpr;
import org.uva.sea.ql.ast.Expr;
import org.uva.sea.ql.ast.ReturnsBoolOperands;

public class GT extends BinaryExpr implements AcceptsMathOperands,
		ReturnsBoolOperands {
	public static final String str = ">";

	public GT(Expr left, Expr right) {
		super(left, right);
	}

	@Override
	public String toString() {
		return str;
	}
}
>>>>>>> 483057f28359ecac2b999d94a928c0aaf01d2a6e