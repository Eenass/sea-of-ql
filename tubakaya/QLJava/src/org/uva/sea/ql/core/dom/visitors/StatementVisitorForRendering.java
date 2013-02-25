package org.uva.sea.ql.core.dom.visitors;

import javax.swing.JLabel;
import javax.swing.JPanel;
import org.uva.sea.ql.core.dom.Statement;
import org.uva.sea.ql.core.dom.StatementVisitor;
import org.uva.sea.ql.core.dom.statements.ComputedValue;
import org.uva.sea.ql.core.dom.statements.Form;
import org.uva.sea.ql.core.dom.statements.IfStatement;
import org.uva.sea.ql.core.dom.statements.Question;

public class StatementVisitorForRendering implements StatementVisitor{

	private JPanel parentPanel;
	public TypeVisitorForRendering typeVisitor;
	
	public StatementVisitorForRendering(JPanel parentPanel){
		this.typeVisitor = new TypeVisitorForRendering(parentPanel);
		this.parentPanel=parentPanel;
	}
	
	@Override
	public void visit(Form form) {
		for(Statement statement : form.getStatements())	{
			statement.accept(this);
		}
	}

	@Override
	public void visit(Question question) {
		addLabelInParentPanel(question.getText().value);
		question.getIdentifier().getType().accept(typeVisitor);
	}

	@Override
	public void visit(ComputedValue computedValue) {
		addLabelInParentPanel(computedValue.text.value);
		computedValue.identifier.getType().accept(typeVisitor);
	}

	@Override
	public void visit(IfStatement ifStatement) {
		for(Statement statement : ifStatement.getStatements())	{
			statement.accept(this);
		}
	}

	private void addLabelInParentPanel(String label) {		
		JLabel jLabel = new JLabel(label);
		parentPanel.add(jLabel, "w 280!, grow");		
	}
}