package org.uva.sea.ql.parser;

import org.uva.sea.ql.ICodeLocationInformation;

/**
 * Parse error with line, column and source file information attached.
 */
public class ParseError extends RuntimeException {
	private static final long serialVersionUID = 1L;

	private final int lineNumber;
	private final int column;
	private final String sourceFile;
	private static final String messageFormat = "Parse error: '{0}' on line {1}, column {2} in '{3}'"; 
	
	/**
	 * @return Line number in the source file.
	 */
	public int getLineNumber() {
		return lineNumber;
	}
	/**
	 * @return Character position in the line of the source file.
	 */
	public int getColumn() {
		return column;
	}

	/**
	 * @return Source file of the error origin.
	 */
	public String getSourceFile() {
		return sourceFile;
	}
	
	
	/**
	 * Create a new ParseError using an IErrorInformation implementation
	 * to retrieve file, line and column information. The information is 
	 * retrieved from the IErrorInformation directly and persisted in the 
	 * ParseError object.
	 */
	public ParseError(ICodeLocationInformation info, String message)
	{
		this(info.getLineNumber(), info.getColumn(), info.getFileName(), message);
	}
	
	/** Create a new ParseError object.
	 * @param lineNumber Line number where the error occurred.
	 * @param column Column number where the error occurred.
	 * @param sourceFile Source file where the error occurred.
	 * @param message Specify error details.
	 */
	public ParseError(int lineNumber, int column, String sourceFile, String message) {
		super(String.format(messageFormat, message, lineNumber, column, sourceFile));
		this.lineNumber = lineNumber;
		this.column = column;
		this.sourceFile = sourceFile;
	}
}