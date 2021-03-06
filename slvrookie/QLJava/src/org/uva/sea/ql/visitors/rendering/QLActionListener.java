package org.uva.sea.ql.visitors.rendering;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import org.uva.sea.ql.ast.expr.value.BoolLiteral;
import org.uva.sea.ql.ast.expr.value.IntLiteral;
import org.uva.sea.ql.ast.expr.value.MoneyLiteral;
import org.uva.sea.ql.ast.expr.value.StringLiteral;
import org.uva.sea.ql.ast.types.BoolType;
import org.uva.sea.ql.ast.types.IntType;
import org.uva.sea.ql.ast.types.MoneyType;
import org.uva.sea.ql.ast.types.StringType;
import org.uva.sea.ql.ast.types.Type;
import org.uva.sea.ql.gui.Gui;
import org.uva.sea.ql.visitors.ITypeVisitor;
import org.uva.sea.ql.visitors.utils.State;

public class QLActionListener implements ITypeVisitor<Void> {

	private final State state;
	private final JComponent component;
	private final String name;
	private static Gui gui1;

	private QLActionListener(String name, State state, JComponent component) {
		this.state = state;
		this.component = component;
		this.name = name;
	}

	public static void createListener(String name, Type type, JComponent component, State state, Gui gui) {
		gui1 = gui;
		QLActionListener listener = new QLActionListener(name, state, component);
		type.accept(listener);
	}
	
	private double roundTwoDecimals(String input) {
		return Math.round(Double.parseDouble(input) * 100.0) / 100.0;
	}

	@Override
	public Void visit(BoolType node) {
		((JCheckBox) component).addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				BoolLiteral value = new BoolLiteral(((JCheckBox) component).isSelected());
				state.setValue(name, value);
				gui1.setQuestionPanel();
			}
		});
		return null;
	}

	@Override
	public Void visit(IntType node) {
		((JTextField) component).addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					IntLiteral value = new IntLiteral(Integer.parseInt(((JTextField) component).getText()));
					state.setValue(name, value);
					gui1.setQuestionPanel();
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Invalid input: Please enter an Integer value");
				}
			}
		});
		return null;
	}
	
	@Override
	public Void visit(MoneyType node) {
		((JTextField) component).addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					MoneyLiteral value = new MoneyLiteral(roundTwoDecimals(((JTextField) component).getText()));
					state.setValue(name, value);
					gui1.setQuestionPanel();
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null,"Invalid input: Please enter a Money value");
				}
			}
		});
		return null;
	}

	@Override
	public Void visit(StringType node) {
		((JTextField) component).addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					StringLiteral value = new StringLiteral(((JTextField) component).getText());
					state.setValue(name, value);
					gui1.setQuestionPanel();
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Invalid input: Please enter a String value");
				}
			}
		});
		return null;
	}

}
