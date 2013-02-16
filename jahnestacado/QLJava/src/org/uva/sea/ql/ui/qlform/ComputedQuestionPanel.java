package org.uva.sea.ql.ui.qlform;

import java.util.Map;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

import org.uva.sea.ql.ast.expr.values.BoolLit;
import org.uva.sea.ql.ast.expr.values.DecimalLit;
import org.uva.sea.ql.ast.expr.values.IntegerLit;
import org.uva.sea.ql.ast.expr.values.StringLit;
import org.uva.sea.ql.ast.expr.values.Value;
import org.uva.sea.ql.ast.form.ComputedQuestion;
import org.uva.sea.ql.visitor.evaluator.ExprEvaluator;

public class ComputedQuestionPanel {
	private final JLabel label;
	private final JTextField computedValue;
	private final JPanel panel;
	public final static String COM_QUESTION_PANEL="COM_QUESTION_PANEL";

	public ComputedQuestionPanel(ComputedQuestion qlElement,Map<String,Value> runTimeValues){
		panel=QLRowPanel.getQLRowPanel();
		label=QLLabel.getQLLabel(qlElement.getLabel().getValue(),COM_QUESTION_PANEL);
		computedValue=QLComputedField.getQLComputedField();
		computedValue.setText(valueToString(qlElement, runTimeValues));
		addComponents();
	}
	
	private void addComponents(){
		panel.setLayout(new MigLayout());
		panel.add(label,"align label");
		panel.add(computedValue,"push, al right,wrap");
		
	}
	
	public JPanel getPanel(){
		return panel;
	}
	
	
	private String valueToString(ComputedQuestion qlElement, Map<String,Value> runTimeValues){
		if(qlElement.getType().isCompatibleToIntType()){
			return String.valueOf(((IntegerLit) ExprEvaluator.eval(qlElement.getExpr(), runTimeValues)).getValue());
		}
		else if(qlElement.getType().isCompatibleToMoneyType()){
			float value=((DecimalLit) ExprEvaluator.eval(qlElement.getExpr(), runTimeValues)).getValue();
			float roundedValue=QLNumField.roundTo2Decimals(value);
			return String.valueOf(roundedValue);
		}
		else if(qlElement.getType().isCompatibleToBoolType()){
			return String.valueOf(((BoolLit) ExprEvaluator.eval(qlElement.getExpr(), runTimeValues)).getValue());
		}
		return (((StringLit) ExprEvaluator.eval(qlElement.getExpr(), runTimeValues)).getValue());
		
	}
	



}
