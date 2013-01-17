package org.uva.sea.ql.ast.form;

import org.uva.sea.ql.ast.base.Node;
import org.uva.sea.ql.ast.traversal.base.IVisitor;
import org.uva.sea.ql.ast.types.DataType;

public class Computation extends Element {
	private Label label;
	private String description;
	private DataType expectedType;
	private Node calculationOperation;
	
	public Computation(Label label, String description, DataType expectedType, Node calculationOperation) {
		this.label = label;
		this.description = description;
		this.expectedType = expectedType;
		this.calculationOperation = calculationOperation;
	}
	
	public Label getLabel() {
		return label;
	}
	
	public String getDescription() {
		return description;
	}
	
	public DataType getExpectedType() {
		return expectedType;
	}

	public Node getCalculationOperation() {
		return calculationOperation;
	}

	@Override
	public void accept(final IVisitor visitor) {
		calculationOperation.accept(visitor);
		visitor.visit(this);		
	}
}