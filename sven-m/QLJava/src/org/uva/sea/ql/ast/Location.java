package org.uva.sea.ql.ast;

public class Location {
	private int startLine;
	private int endLine;
	private int startColumn;
	private int endColumn;
	
	public Location(int startLine, int endLine, int startColumn,
			int endColumn)
	{
		this.startLine = startLine;
		this.endLine = endLine;
		this.startColumn = startColumn;
		this.endColumn = endColumn;
	}
	
	public Location(Location startLocation, Location endLocation) {
		this.startLine = startLocation.getStartLine();
		this.endLine = startLocation.getEndLine();
		this.startColumn = startLocation.getStartColumn();
		this.endColumn = startLocation.getEndColumn();
	}

	public int getStartLine() {
		return startLine;
	}

	public int getEndLine() {
		return endLine;
	}

	public int getStartColumn() {
		return startColumn;
	}

	public int getEndColumn() {
		return endColumn;
	}
	
}
