package org.uva.sea.ql.ast.nodetypes.conditional;

import java.util.List;

import org.uva.sea.ql.ast.QLExpression;
import org.uva.sea.ql.ast.QLStatement;

public class Conditional extends QLStatement {

	private final QLExpression condition;
	private final List<QLStatement> successBlock;
	private final List<QLStatement> failureBlock;
	
	public Conditional(QLExpression condition, List<QLStatement> successBlock) {

		this.condition = condition;
		this.successBlock = successBlock;
		this.failureBlock = null;
	}
	
	public Conditional(QLExpression condition, List<QLStatement> successBlock, List<QLStatement> failureBlock) {
		
		this.condition = condition;
		this.successBlock = successBlock;
		this.failureBlock = failureBlock;
	}
	
	public QLExpression getCondition() {
		
		return condition;
	}

	public List<QLStatement> getSuccessBlock() {
		
		return successBlock;
	}
	
	public List<QLStatement> getFailureBlock() {
		
		return failureBlock;
	}
}
