package org.uva.sea.ql.ui.qlform;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import org.uva.sea.ql.ast.expr.values.StringLit;
import org.uva.sea.ql.ast.expr.values.Value;
import org.uva.sea.ql.ui.qlform.interpreter.SwingGenerator;
import org.uva.sea.ql.ui.qlform.interpreter.VariableUpdater;

public class QLTextField implements ActionListener{
	private final String varName;
	private final Map<String, Value> runTimeValues;
	private final String value;
	private final JTextField txtField;
	private final static Color defaultColor= new Color(238,238,238);
	public final static String QL_TXT_FIELD_ID="QL_TXT_FIELD_ID";


	
	public QLTextField(String varName,Map<String, Value> runTimeValues){
		txtField=new JTextField(8);
		setSettings();
		this.varName=varName;
		this.runTimeValues=runTimeValues;
		value=((StringLit) runTimeValues.get(varName)).getValue();
		
	}
	
	private void setSettings(){
		txtField.setName(QL_TXT_FIELD_ID);
		txtField.setName("QLNUMFIELD");
		txtField.setBackground(defaultColor);
	}
	
	public static JTextField responsiveTextField(String varName,Map<String, Value> runTimeValues) {
		QLTextField txtField = new QLTextField(varName, runTimeValues);
		return txtField.getTextField();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String input=txtField.getText();
		if(!QLInputVerifier.isStringChar(input)) return;
		
		VariableUpdater varUpdater=new VariableUpdater(varName, runTimeValues, new StringLit(input));
		List<JPanel> questionList=new ArrayList<JPanel>();
		
		JFrame frame = (JFrame) SwingUtilities.getRoot(txtField);
		new SwingGenerator(questionList,varUpdater.getUpdatedValues()).regenerate(frame);

	}
	
	private JTextField getTextField() {
		txtField.addActionListener(this);
		txtField.setText(value);
		return txtField;
	}
	
	
	

}
