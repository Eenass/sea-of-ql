package org.uva.sea.ql.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

import org.uva.sea.ql.ast.LineStatement;
import org.uva.sea.ql.ast.literals.Result;
import org.uva.sea.ql.ast.operators.Expr;
import org.uva.sea.ql.ast.types.BooleanType;

public class LinePanel extends Panel {
	private Expr fieldInitializer;
	private Result fieldResult;
	private JCheckBox jCheckBox;
	private JLabel jLabel;
	private JPanel jPanel;
	private JTextField jTextField;
	private String panelName;

	public LinePanel(LineStatement statement) {
		BooleanType booleanType = new BooleanType();

		panelName = statement.getLineName();

		jPanel = new JPanel();
		jLabel = new JLabel(statement.getDisplayText().substring(1,statement.getDisplayText().length()-1));

		jPanel.setLayout(new MigLayout("", "[200][][][][][][][][][][][][][][][][]", "[]"));

		jPanel.add(jLabel, "cell 0 0,alignx left,aligny top");

		fieldResult = statement.getTypeDescription().getTypeContainer();
		fieldInitializer = statement.getInitalizerExpr();

		if (booleanType.isCompatibleTo(statement.getTypeDescription())) {
			jCheckBox = new JCheckBox("");
			jCheckBox.addActionListener(this);
			jPanel.add(jCheckBox, "cell 12 0");

		} else {
			jTextField = new JTextField();
			jTextField.addActionListener(this);
			jTextField.setColumns(10);
			if (statement.getInitalizerExpr() != null)
				jTextField.setEditable(false);
			jPanel.add(jTextField, "cell 12 0,growx");
			;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.err.println("Second action trigger observer");
		setChanged();
		notifyObservers(this);
	}

	public String getFieldName() {
		return panelName;
	}

	public Result getFieldValue() {
		if (jCheckBox != null)
			return fieldResult.setValue(jCheckBox.isSelected() ? "true" : "false");
		else
			return fieldResult.setValue(jTextField.getText());
	}

	@Override
	public Panel isActionSource(ActionEvent ev) {
		if (jTextField == null) {
			if (ev.getSource() == jCheckBox)
				return this;
		}
		if (ev.getSource() == jTextField)
			return this;
		return null;
	}

	public void registerAt(JPanel parentPanel, int location) {
		StringBuilder stringBuilder = new StringBuilder("cell 0 ");

		stringBuilder.append(location);
		stringBuilder.append(" ,growx");

		parentPanel.add(jPanel, stringBuilder.toString());
	}

	public void updatecalculatedField(HashMap<String, Result> symbols) {
		if (fieldInitializer != null) {
			fieldResult = fieldInitializer.eval(symbols);
			if (!jTextField.getText().equals(fieldResult.toString())) {
				jTextField.setText(fieldResult.toString());
				setChanged();
				notifyObservers(this);
			}
		}
	}
}
