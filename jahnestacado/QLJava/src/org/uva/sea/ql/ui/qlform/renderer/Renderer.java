package org.uva.sea.ql.ui.qlform.renderer;

import java.awt.Component;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.uva.sea.ql.ui.qlform.QLContentPanel;
import org.uva.sea.ql.ui.qlform.QLGenButton;
import org.uva.sea.ql.ui.qlform.QLScrollBar;

public class Renderer  {
	public final static Component centerOfScreen=null;
	private final List<JPanel> questionPanelList;
	private final JPanel contentPanel;
	private final JFrame frame;
	private final static QLScrollBar scrollBar = new QLScrollBar();
	

	public Renderer(List<JPanel> questionPanelList, JFrame frame) {
		this.frame = frame;
		this.questionPanelList = questionPanelList;
		contentPanel = QLContentPanel.getContentPanel();
		
	}
	
	
	public void addQuestionsToPanel() {
		for (JPanel question : questionPanelList) {
			contentPanel.add(question, "align label,wrap");
		}
		scrollBar.add(contentPanel);
		frame.add(scrollBar, "align center,wrap");
		frame.add(QLGenButton.responsiveButton(questionPanelList, frame),"align center");
		frame.setLocationRelativeTo(centerOfScreen);
		frame.setVisible(true);
	}

	
	



}
