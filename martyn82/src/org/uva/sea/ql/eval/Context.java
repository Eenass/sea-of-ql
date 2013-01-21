package org.uva.sea.ql.eval;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.uva.sea.ql.ast.expression.Ident;
import org.uva.sea.ql.ast.type.Type;

/**
 * Represents an evaluation context.
 */
public class Context {
	/**
	 * Holds the parent context.
	 */
	private final Context parent;

	/**
	 * Holds the declared variables.
	 */
	private final Map<String, Type> types;

	/**
	 * Holds the error list.
	 */
	private final List<String> errors;

	/**
	 * Constructs a new context.
	 *
	 * @param parent
	 */
	public Context( Context parent ) {
		this.parent = parent;
		this.types = new HashMap<String, Type>();
		this.errors = new LinkedList<String>();
	}

	/**
	 * Constructs a new root context.
	 */
	public Context() {
		this( null );
	}

	/**
	 * Determines whether this context is the root.
	 *
	 * @return True if it is root, false otherwise.
	 */
	public boolean isRoot() {
		return this.parent == null;
	}

	/**
	 * Retrieves the parent context.
	 *
	 * @return The parent.
	 */
	public Context getParent() {
		return this.parent;
	}

	/**
	 * Retrieves the error list.
	 *
	 * @return Errors
	 */
	public List<String> getErrors() {
		return this.errors;
	}

	/**
	 * Adds an error to the list of errors.
	 *
	 * @param message
	 */
	public void addError( String message ) {
		this.errors.add( message );
	}

	/**
	 * Determines whether the given identifier is defined.
	 *
	 * @param ident
	 *
	 * @return True if it is defined, false otherwise.
	 */
	public boolean isDeclared( Ident ident ) {
		if ( this.types.containsKey( ident.getName() ) ) {
			return true;
		}

		if ( !this.isRoot() ) {
			return this.parent.isDeclared( ident );
		}

		return false;
	}

	/**
	 * Finds a declared variable for the given identifier and returns it.
	 *
	 * @param ident
	 *
	 * @return The variable to find.
	 *
	 * @throws RuntimeException If the variable cannot be found.
	 */
	public Type find( Ident ident ) {
		if ( this.types.containsKey( ident.getName() ) ) {
			return this.types.get( ident.getName() );
		}

		if ( !this.isRoot() ) {
			return this.parent.find( ident );
		}

		throw new RuntimeException( "Undefined variable: " + ident.getName() );
	}

	/**
	 * Declares a variable value for the given identifier and value.
	 *
	 * @param ident
	 * @param value
	 */
	public void declareVariable( Ident ident, Type type ) {
		this.types.put( ident.getName(), type );
	}
}
