package org.uva.sea.ql.visitor.printer;

import java.io.IOException;
import java.io.OutputStream;

import org.uva.sea.ql.ast.Node;
import org.uva.sea.ql.ast.expression.Ident;
import org.uva.sea.ql.ast.expression.literal.Literal;
import org.uva.sea.ql.visitor.NodeVisitor;

/**
 * Visitor that prints the AST.
 */
abstract public class PrintVisitor extends NodeVisitor<Boolean> {
	/**
	 * String used for indenting.
	 */
	private static final String INDENT = "  ";

	/**
	 * String template used for printing atomic nodes.
	 */
	private static final String TPL_ATOMIC_NODE = "%s(%s)";

	/**
	 * Holds the output stream to print to.
	 */
	private final OutputStream out;

	/**
	 * Holds a value to determine whether there were bytes written to the output stream.
	 */
	private boolean empty;

	/**
	 * Holds the current nesting level.
	 */
	private int level;

	/**
	 * Constructs a new print visitor.
	 *
	 * @param out
	 */
	public PrintVisitor( OutputStream out ) {
		this.out = out;
		this.level = 0;
		this.empty = true;
	}

	/**
	 * Retrieves the output stream.
	 *
	 * @return Output stream
	 */
	public OutputStream getOutput() {
		return out;
	}

	/**
	 * Appends indentation to the buffer.
	 */
	protected void indent() {
		if ( !empty ) {
			write( "\n" );
		}

		StringBuilder sb = new StringBuilder();

		for ( int i = 0; i < level; i++ ) {
			sb.append( INDENT );
		}

		write( sb.toString() );
	}

	/**
	 * Increases indentation level.
	 */
	protected void increaseLevel() {
		level++;
	}

	/**
	 * Decreases indentation level.
	 */
	protected void decreaseLevel() {
		level--;
	}

	/**
	 * Puts data into the output stream.
	 *
	 * @param data
	 */
	protected void write( String data ) {
		try {
			out.write( data.getBytes() );
			empty = false;
		}
		catch ( IOException e ) {
			// keep silent
		}
	}

	/**
	 * Writes a node name to output.
	 *
	 * @param node
	 */
	protected void writeName( Node node ) {
		write( node.getClass().getSimpleName().toUpperCase() );
	}

	/**
	 * Writes an atomic node to output stream.
	 *
	 * @param node
	 */
	protected void writeAtomic( Literal node ) {
		write(
			String.format(
				TPL_ATOMIC_NODE,
				node.getClass().getSimpleName().toUpperCase(),
				node.toString()
			)
		);
	}

	/**
	 * Writes an atomic node to output stream.
	 *
	 * @param node
	 */
	protected void writeAtomic( Ident node ) {
		write(
			String.format(
				TPL_ATOMIC_NODE,
				node.getClass().getSimpleName().toUpperCase(),
				node.getName()
			)
		);
	}
}
