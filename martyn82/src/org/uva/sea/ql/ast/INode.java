package org.uva.sea.ql.ast;

import org.uva.sea.ql.eval.Context;
import org.uva.sea.ql.visitor.INodeVisitor;

/**
 * Represents a node in an AST.
 */
public interface INode {
	/**
	 * Evaluates the node.
	 *
	 * @param visitor
	 * @param context
	 */
	<T> T accept( INodeVisitor<T> visitor, Context context );
}
