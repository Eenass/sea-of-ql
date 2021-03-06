package org.uva.sea.ql.gui.widget;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JComponent;

import org.uva.sea.ql.eval.value.Value;

public abstract class Widget implements ChangeEventSource {

	private List<ChangeEventListener> changeEventListeners;
	
	public Widget(){
		changeEventListeners = new ArrayList<ChangeEventListener>();
	}
	
	
	protected synchronized void fireChangeEvent() {
		
		ChangeEvent event = new ChangeEvent(this);
		Iterator<ChangeEventListener> i = changeEventListeners.iterator();
		
		while(i.hasNext())
			i.next().onChange(event);
	}

	
	public synchronized void addChangeEventListener(ChangeEventListener listener){
		changeEventListeners.add(listener);
	}
	
	
	public synchronized void removeChangeEventListener(ChangeEventListener listener){
		changeEventListeners.remove(listener);
	}
	
	
	public boolean isDefined() {
		return getValue().isDefined();
	}
	
	
	public abstract JComponent getControl();
	
	public abstract Value getValue();
	
	
}
