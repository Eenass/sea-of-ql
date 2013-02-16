package org.uva.sea.ql.ui.qlform;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import org.uva.sea.ql.ast.expr.values.BoolLit;
import org.uva.sea.ql.ast.expr.values.Value;
import org.uva.sea.ql.ui.qlform.interpreter.SwingGenerator;
import org.uva.sea.ql.ui.qlform.interpreter.VariableUpdater;

public class QLCheckBox implements ActionListener {

	private final String varName;
	private final Map<String, Value> runTimeValues;
	private final JCheckBox chBox;
	public final static String QL_CHECKBOX_ID = "QL_CHECKBOX_ID";

	public QLCheckBox(String varName, Map<String, Value> runTimeValues) {
		chBox = new JCheckBox("No");
		chBox.setName(QL_CHECKBOX_ID);
		this.varName = varName;
		this.runTimeValues = runTimeValues;
		setSettings();

	}

	public static JCheckBox responsiveCheckBox(String varName,
			Map<String, Value> declaredVar) {
		QLCheckBox chBox = new QLCheckBox(varName, declaredVar);
		return chBox.getCheckBox();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		VariableUpdater varUpdater = new VariableUpdater(varName, runTimeValues,
				new BoolLit(!getState()));
		List<JPanel> questionList = new ArrayList<JPanel>();

		JFrame frame = (JFrame) SwingUtilities.getRoot(chBox);
		new SwingGenerator(questionList, varUpdater.getUpdatedValues()).regenerate(frame);

	}

	private void setSettings() {
		chBox.addActionListener(this);
		chBox.setSelected(getState());
		setStatusText();
		chBox.setBackground(Color.DARK_GRAY);
		chBox.setForeground(Color.white);
	}

	private JCheckBox getCheckBox() {
		return chBox;
	}

	private boolean getState() {
		return ((BoolLit) runTimeValues.get(varName)).getValue();
	}

	private void setStatusText() {
		if (getState()) {
			chBox.setText("Yes");
			return;
		}
		chBox.setText("No");

	}

}
