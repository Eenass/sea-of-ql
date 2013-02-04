package org.uva.sea.ql.interpretation.swing;

import java.awt.BorderLayout;

import javax.swing.AbstractButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.uva.sea.ql.ast.elements.Question;
import org.uva.sea.ql.ast.types.BooleanType;
import org.uva.sea.ql.ast.types.Money;
import org.uva.sea.ql.ast.types.StrType;

public class QuestionPanel extends JPanel {
	private static final long serialVersionUID = -8537987318519877345L;
	private Question question;
	private JComponent input;

	public QuestionPanel(Question question) {
		this.question = question;
		this.setLayout(new BorderLayout());
		this.add(new JLabel(question.getContent().getValue()),
				BorderLayout.LINE_START);
		createInputElement();
	}

	public String getIdentName() {
		return question.getIdent().getName();
	}

	public Question getQuestion() {
		return question;
	}

	public JComponent getInput() {
		return input;
	}

	public boolean getBoolValue() {
		AbstractButton abstractButton = (AbstractButton) input;
		return abstractButton.getModel().isSelected();
	}

	public String getStringValue() {
		JTextField t = (JTextField) input;
		return t.getText();
	}

	private void createInputElement() {
		if (question.getType() instanceof BooleanType) {
			input = new JCheckBox();
			this.add(input, BorderLayout.LINE_END);
		}
		if (question.getType() instanceof StrType) {
			input = new JTextField(10);
			this.add(input, BorderLayout.LINE_END);
		}
		if (question.getType() instanceof Money) {
			input = new JTextField(10);
			Money m = (Money) question.getType();
			if (m.getExpr() != null) {
				((JTextField) input).setEditable(false);
			}
			this.add(input, BorderLayout.LINE_END);
		}
	}
}