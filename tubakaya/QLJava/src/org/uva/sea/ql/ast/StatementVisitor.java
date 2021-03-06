package org.uva.sea.ql.ast;

import org.uva.sea.ql.ast.statements.*;

public interface StatementVisitor {
	
	void visit(Form form);
	void visit(Question question);
	void visit(ComputedValue computedValue);
	void visit(IfStatement ifStatement);
}
