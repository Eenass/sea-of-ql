package khosrow.uva.sea.ql.ast.stmt;

import khosrow.uva.sea.ql.ast.ASTNode;
import khosrow.uva.sea.ql.visitor.IStmtVisitor;

public abstract class Stmt extends ASTNode {
	
	public abstract void accept(IStmtVisitor visitor);
}