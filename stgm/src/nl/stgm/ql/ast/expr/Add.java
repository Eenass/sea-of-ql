package nl.stgm.ql.ast.expr;

public class Add extends BinaryExpr
{
	public Add(Expr left, Expr right)
	{
		this.left = left;
		this.right = right;
	}
}