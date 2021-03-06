package org.uva.sea.ql.rendering;

import java.util.Map.Entry;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

import org.uva.sea.ql.ast.expressions.Expr;
import org.uva.sea.ql.ast.expressions.Ident;
import org.uva.sea.ql.ast.expressions.StringLiteral;
import org.uva.sea.ql.ast.statements.Block;
import org.uva.sea.ql.ast.statements.ComputedQuestion;
import org.uva.sea.ql.ast.statements.IfThenElse;
import org.uva.sea.ql.ast.statements.Question;
import org.uva.sea.ql.ast.statements.Statement;
import org.uva.sea.ql.ast.statements.StatementVisitor;
import org.uva.sea.ql.ast.types.Type;
import org.uva.sea.ql.rendering.controls.Control;

public class RenderingVisitor implements StatementVisitor<Void> {
	
	private final JPanel panel;
	private final State state;
	private final static String COLUMN_SIZE = "350";
	
	public RenderingVisitor(State state) {
		panel = new JPanel(new MigLayout("", COLUMN_SIZE, ""));
		this.state = state;
	}	

	public static JPanel render(Statement statement, State state) {
		RenderingVisitor renderingVisitor = new RenderingVisitor(state);
		if (statement != null)
			statement.accept(renderingVisitor);
		return renderingVisitor.getPanel();
	}

	public JPanel getPanel() {
		return panel;
	}
	
	public State getState() {
		return state;
	}

	@Override
	public Void visit(Question question) {
		addLabel(question.getLabel());
		Control control = createControl(question);
		initializeValues(question);
		registerEventHandler(question, control);
		add(control);
		return null;
	}	

	@Override
	public Void visit(ComputedQuestion computedQuestion) {
		addLabel(computedQuestion.getLabel());
		Control control = createControl(computedQuestion);
		initializeValues(computedQuestion);
		control.getControl().setEnabled(false);
		registerEventHandler(computedQuestion, control);
		registerComputedQuestionDependencies(computedQuestion, state, control);
		add(control);
		return null;
	}	

	@Override
	public Void visit(Block block) {
		for (Statement statement : block.getStatements())
			statement.accept(this);
		return null;
	}

	@Override
	public Void visit(IfThenElse ifThenElse) {
		JPanel conditionTrue = render(ifThenElse.getBody(), state);
		JPanel conditionFalse = render(ifThenElse.getElseBody(), state);
		conditionTrue.setVisible(false);
		conditionFalse.setVisible(false);
		registerConditionDependencies(ifThenElse.getCondition(), conditionTrue, conditionFalse);
		addPanel(conditionTrue);
		addPanel(conditionFalse);
		return null;
	}	
	
	private void registerConditionDependencies(Expr condition, JPanel conditionTrue, JPanel conditionFalse) {
		ConditionObserver conditionObserver = new ConditionObserver(condition, conditionTrue, conditionFalse, state);
		addObserver(conditionObserver);
	}

	private void addPanel(JPanel panel) {
		this.panel.add(panel, "span");
	}

	private void add(Control control) {		
		panel.add(control.getControl(), "wrap");
	}
	
	private void registerEventHandler(Question question, Control control) {
		ObservableQuestion observableQuestion = new ObservableQuestion(question, state, control);
		state.putObservable(question.getVariable(), observableQuestion);
		control.addListener(observableQuestion);
	}
	
	private void registerComputedQuestionDependencies(ComputedQuestion computedQuestion, State state, Control control) {
		ComputedQuestionObserver computedQuestionObserver = new ComputedQuestionObserver(control, state, computedQuestion);
		addObserver(computedQuestionObserver);	
	}	
	
	private void addLabel(StringLiteral label) {
		String text = label.getValue();
		text = text.replaceAll("\"", "");
		panel.add(new JLabel(text));
	}
	
	private void addObserver(Observer observer) {
		for (Entry<Ident, Observable> observable : state.getObservables().entrySet())
			state.addObserver(observable.getKey(), observer);
	}
	
	private Control createControl(Question question) {
		Type type = question.getType();
		ControlFactoryTypeVisitor controlFactoryTypeVisitor = new ControlFactoryTypeVisitor();		
		return type.accept(controlFactoryTypeVisitor);
	}
	
	private void initializeValues(Question question) {
		Type type = question.getType();
		Ident identifier = question.getVariable();
		InitializationTypeVisitor initializationTypeVisitor = new InitializationTypeVisitor(state, identifier);
		type.accept(initializationTypeVisitor);
	}

}
