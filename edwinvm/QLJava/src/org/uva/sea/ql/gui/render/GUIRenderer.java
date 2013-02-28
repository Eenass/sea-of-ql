package org.uva.sea.ql.gui.render;

import javax.swing.JLabel;
import javax.swing.JPanel;

import org.uva.sea.ql.ast.statements.FormStatement;
import org.uva.sea.ql.ast.statements.StatementBody;
import org.uva.sea.ql.ast.statements.conditions.IfThenElseStatement;
import org.uva.sea.ql.ast.statements.conditions.IfThenStatement;
import org.uva.sea.ql.ast.statements.questions.AnswerableQuestion;
import org.uva.sea.ql.ast.statements.questions.ComputedQuestion;
import org.uva.sea.ql.ast.statements.questions.QuestionLabel;
import org.uva.sea.ql.ast.types.Type;
import org.uva.sea.ql.ast.values.Str;
import org.uva.sea.ql.ast.visitors.statementchecker.Visitor;
import org.uva.sea.ql.gui.Widget;

public class GUIRenderer implements Visitor {

	private final JPanel _panel;
	private final State _state;

	private GUIRenderer(State state) {
		_state = state;
		_panel = new JPanel();
	}

	public static JPanel render(FormStatement statement, State state) {
		GUIRenderer renderer = new GUIRenderer(state);
		statement.accept(renderer);
		return renderer.getPanel();
	}

	private JPanel render(StatementBody bodyStatements, State state) {
		GUIRenderer renderer = new GUIRenderer(state);
		bodyStatements.accept(renderer);
		return renderer.getPanel();
	}

	@Override
	public void visit(final IfThenStatement statement) {
		JPanel renderedBody = render(statement.getBody(), _state);
		// Make sure something happens if condition is recomputed
//		registerConditionDeps(statement.getCondition(), renderedBody);
		renderedBody.setVisible(false);
//		addPanel(renderedBody);
	}

	@Override
	public void visit(final IfThenElseStatement statement) {
		JPanel renderedBody     = render(statement.getBody(), _state);
		JPanel renderedElseBody = render(statement.getElseBody(), _state);
		// Make sure something happens if condition is recomputed
//		registerConditionDeps(statement.getCondition(), renderedBody, renderedElseBody);
		renderedBody.setVisible(false);
		renderedElseBody.setVisible(false);
//		addPanel(renderedBody);
//		addPanel(renderedElseBody);
	}

	@Override
	public void visit(AnswerableQuestion statement) {
		// "Draw" the label
		addLabel(statement.getQuestionLabel());
		// Get a Widget based on Type through another Visitor
		//Control control = typeToWidget(statement.getType(), true); // True == editable, False == not enabled
		Widget widget = typeToWidget(statement.getType());
		// Add Event Listener
		//registerHandler(statement, control);
		// Draw the widget
		add(widget);
	}

	@Override
	public void visit(ComputedQuestion statement) {
//		addLabel(statement.getQuestionLabel());
//		Control control = typeToWidget(statement.getExpression().typeOf(new TypeEnvironment()), false);
//		registerComputedDeps(statement, control);
//		registerPropagator(statement);
//		initValue(statement, control);
//		add(control);
	}

	@Override
	public void visit(StatementBody statements) {
		for (FormStatement statement: statements.getStatements()) {
			statement.accept(this);
		}
	}
	
	private Widget typeToWidget(Type type) {
		return WidgetRenderer.render(type);
	}
	
	private void addLabel(QuestionLabel questionLabel) {
		addQuestionLabel(questionLabel.getLabel());
	}
	
	private void addQuestionLabel(Str label) {
		_panel.add(new JLabel(label.getValue()));
	}
	
	private void add(Widget widget) {
		_panel.add(widget.getWidget());
	}
	
	private JPanel getPanel() {
		return _panel;
	}
	
}