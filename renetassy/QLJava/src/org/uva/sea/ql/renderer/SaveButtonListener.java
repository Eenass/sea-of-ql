package org.uva.sea.ql.renderer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SaveButtonListener implements ActionListener {

	private final Renderer r;
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		new XMLWriter(r);
		
	}
	
	public SaveButtonListener(Renderer r) {
		this.r = r;
	}
	
	
	
}
