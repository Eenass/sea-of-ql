package org.uva.sea.ql.rendering.controls;

import javax.swing.JCheckBox;
import javax.swing.JComponent;

import org.uva.sea.ql.evaluation.values.Bool;
import org.uva.sea.ql.evaluation.values.Value;
import org.uva.sea.ql.rendering.ObservableQuestion;

public class CheckBox extends Control {

	private final JCheckBox jCheckBox;
	
	public CheckBox() {
		jCheckBox = new JCheckBox();
	}
	
	@Override
	public Value getValue() {
		return jCheckBox.isSelected() ? new Bool(true) : new Bool(false);
	}
	
	@Override
	public JComponent getControl() {
		return jCheckBox;
	}

	@Override
	public void setValue(Value value) {
		if (value instanceof Bool)
			jCheckBox.setSelected(((Bool)value).getValue());	
	}

	@Override
	public void addListener(ObservableQuestion observableQuestion) {
		jCheckBox.addActionListener(observableQuestion);		
	}

}
