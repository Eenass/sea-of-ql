package org.uva.sea.ql.astvisitor;

import java.util.Iterator;

import org.uva.sea.ql.ast.BooleanType;
import org.uva.sea.ql.ast.CompoundBlock;
import org.uva.sea.ql.ast.ConditionalStatement;
import org.uva.sea.ql.ast.Expr;
import org.uva.sea.ql.ast.LineStatement;
import org.uva.sea.ql.ast.MoneyType;
import org.uva.sea.ql.ast.QLProgram;
import org.uva.sea.ql.ast.Statement;
import org.uva.sea.ql.ast.StringType;
import org.uva.sea.ql.ast.TypeDescription;

public class ASTNodePrintVisitor implements ASTNodeVisitor {

	@Override
	public void visit(Expr expr) {
		System.out.print("Do expr");
		if (expr.exLeftHand != null) {
			expr.exLeftHand.accept(this);
		}
		if (expr.exRightHand != null) {
			expr.exRightHand.accept(this);
		}
	}

	@Override
	public void visit(QLProgram qlProgram) {
		System.out.print("form " + qlProgram.programName);
		qlProgram.compound.accept(this);
	}

	@Override
	public void visit(CompoundBlock compoundBlock) {
		Iterator<Statement> it = compoundBlock.statementList.iterator();
		System.out.print(" { ");
		while (it.hasNext()) {
			Statement value = (Statement) it.next();
			value.accept(this);
		}
		System.out.println(" } ");
	}

	@Override
	public void visit(LineStatement lineStatement) {
		System.out.print(lineStatement.lineName);
		System.out.print(lineStatement.displayText + "\n");
		lineStatement.typeDescription.accept(this);
	}

	@Override
	public void visit(ConditionalStatement conditionalStatement) {
		// TODO Auto-generated method stub
		System.out.print("if (");
		conditionalStatement.expression.accept(this);
		System.out.print(") ");
		conditionalStatement.compound.accept(this);
	}

	@Override
	public void visit(TypeDescription typeDescription) {
		// TODO Auto-generated method stub
		if (typeDescription.getClass() == BooleanType.class) {
			System.out.println("boolean");
		}
		if (typeDescription.getClass() == StringType.class) {
			System.out.println("string");
		}
		if (typeDescription.getClass() == MoneyType.class) {
			System.out.println("money");
			if (((MoneyType) typeDescription).expression != null) {
				((MoneyType) typeDescription).expression.accept(this);
			}
		}
	}

}
