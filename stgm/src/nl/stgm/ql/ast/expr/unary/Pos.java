package nl.stgm.ql.ast.expr.unary;

import nl.stgm.ql.ast.*;
import nl.stgm.ql.ast.expr.*;
import nl.stgm.ql.data.*;
import nl.stgm.ql.interfaces.*;
import nl.stgm.ql.inspectors.*;

public class Pos extends UnaryExpr
{
	public Pos(ASTExpressionNode arg)
	{
		super(arg);
	}

	public String toString()
	{
		return "+";
	}

	public Type getType(TypeContext context)
	{
		return Type.INT;
	}
	
	public void checkType(TypeCheckContext context)
	{
		if(arg.getType(context) != Type.INT)
		{
			context.registerTypeError(this, "Argument to + should be an int.");
		}
	}

	public Value getValue(ValueContext context)
	{
		Int value = (Int) this.arg.getValue(context);
		return value;
	}
}
