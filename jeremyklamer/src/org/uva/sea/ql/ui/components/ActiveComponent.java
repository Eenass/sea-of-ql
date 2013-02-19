package org.uva.sea.ql.ui.components;


import java.awt.event.FocusListener;

import javax.swing.JComponent;

import org.uva.sea.ql.interpreter.Value;

public abstract class ActiveComponent extends BaseComponent {

	protected final String args; 
	protected final JComponent answerField; 
	
	public ActiveComponent(String args, JComponent answerField) {
		this.args = args;
		this.answerField = answerField;
	}
	
	public abstract void updateValue(Value newValue);
	public abstract Value getValue();
	
	public void addFocusListener(FocusListener listener) {
		answerField.addFocusListener(listener);
	}


	public void setEnabled(boolean enabled) {
		answerField.setEnabled(enabled);
	}
		
	@Override
	public String getArgs() {
		return args;
	}

	@Override
	public JComponent getComponent() {
		return answerField;
	}
	
	@Override 
	public void setVisible(boolean visible) {
		answerField.setVisible(visible);
	}
	
	public void addActionListener() { 
		
	}
	
}
