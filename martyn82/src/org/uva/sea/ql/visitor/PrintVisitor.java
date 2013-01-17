package org.uva.sea.ql.visitor;

import java.io.IOException;
import java.io.OutputStream;

import org.uva.sea.ql.ast.expression.BinaryExpression;
import org.uva.sea.ql.ast.expression.Ident;
import org.uva.sea.ql.ast.expression.UnaryExpression;
import org.uva.sea.ql.ast.expression.value.Literal;
import org.uva.sea.ql.ast.statement.Assignment;
import org.uva.sea.ql.ast.statement.If;
import org.uva.sea.ql.ast.statement.VarDeclaration;
import org.uva.sea.ql.ast.type.Type;

/**
 * Visitor that prints the AST.
 */
public class PrintVisitor extends Visitor {
	/**
	 * String used for indenting.
	 */
	private static final String INDENT = "  ";
	
	/**
	 * Holds the output stream to print to.
	 */
	private final OutputStream out;
	
	/**
	 * Holds the current nesting level.
	 */
	private int level;
	
	/**
	 * Holds a value to determine whether there were bytes written to the output stream.
	 */
	private boolean empty;
	
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
	 * Appends indentation to the buffer.
	 */
	private void indent() {
		if ( !empty ) {
			put( "\n" );
		}
		
		StringBuilder sb = new StringBuilder();
		
		for ( int i = 0; i < level; i++ ) {
			sb.append( INDENT );
		}
		
		put( sb.toString() );
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
	 * Puts data into the output stream.
	 * 
	 * @param data
	 */
	private void put( String data ) {
		try {
			out.write( data.getBytes() );
			empty = false;
		}
		catch ( IOException e ) {
			// keep silent
		}
	}
	
	@Override
	public void visit( BinaryExpression node ) {
		put( node.getClass().getSimpleName().toUpperCase() );
		
		level++;
		
		indent();
		visit( node.getLhs() );
		
		indent();
		visit( node.getRhs() );
		
		level--;
	}

	@Override
	public void visit( UnaryExpression node ) {
		put( node.getClass().getSimpleName().toUpperCase() );
		
		level++;
		
		indent();
		visit( node.getExpression() );
		
		level--;
	}

	@Override
	public void visit( Literal node ) {
		put( node.getClass().getSimpleName().toUpperCase() );
		put( "(" );
		put( node.toString() );
		put( ")" );
	}

	@Override
	public void visit( Ident node ) {
		put( node.getClass().getSimpleName().toUpperCase() );
		put( "(" );
		put( node.getName() );
		put( ")" );
	}
	
	@Override
	public void visit( If node ) {
		indent();
		put( "IF" );
		
		level++;
		
		indent();
		visit( node.getCondition() );
		
		level--;

		if ( node.getIfThen() != null ) {
			indent();
			put( "THEN" );
		
			level++;
			
			indent();
			visit( node.getIfThen() );
			
			level--;
		}
		
		if ( node.getIfElse() != null ) {
			indent();
			put( "ELSE" );
			
			level++;
			
			indent();
			visit( node.getIfElse() );
			
			level--;
		}
	}

	@Override
	public void visit( VarDeclaration node ) {
		put( node.getClass().getSimpleName().toUpperCase() );

		level++;
		
		indent();
		visit( node.getIdent() );
		
		indent();
		visit( node.getType() );
		
		level--;
	}

	@Override
	public void visit( Type node ) {
		put( node.getClass().getSimpleName().toUpperCase() );
	}
	
	@Override
	public void visit( Assignment node ) {
		put( node.getClass().getSimpleName().toUpperCase() );
		
		level++;
		
		indent();
		visit( node.getLhs() );
		
		indent();
		visit( node.getRhs() );
		
		level--;
	}
}