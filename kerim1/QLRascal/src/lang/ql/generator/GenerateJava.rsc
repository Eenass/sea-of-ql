module lang::ql::generator::GenerateJava

import lang::ql::ast::AST;
import lang::ql::ast::TypeEnvironment;

import lang::ql::generator::GenerateJavaContent;
import lang::ql::generator::GenerateJavaStateChangedLogic;

anno str Statement@id;
anno str ElseIf@id;

public str generateJava(Form form) { 
	form = idStatements(form);
	
	return 	"import java.awt.*;
			'import java.awt.event.*;
			'import javax.swing.*;
			'import javax.swing.event.*;
			'
			'public class <form.name> extends JFrame implements ChangeListener, FocusListener {
			'	<generateInstanceVars(form)>
			'	<generateMainMethod(form)>
			'	
			'	<generateConstructor(form)>
			'	
			'	<generateListeners(form)>
			'}";
}

// Give if-then-else statements a simple id, such that we can reference their bodies later
Form idStatements(Form form) {
	int counter = 0;
	
	return visit(form) {
		case Statement s => {
			counter += 1;
			s[@id = "<counter>"];
		}
		case ElseIf elseIf => {
			counter += 1;
			elseIf[@id = "<counter>"];
		}
	};
}

str generateInstanceVars(Form form) {
	str output = "";
	
	visit (form) {
		case computed(str identifier, _, Type tp, _):
			output += generateQuestionVar(identifier, tp);
		case noncomputed(str identifier, _, Type tp):
			output += generateQuestionVar(identifier, tp);
		case s:ifThenElse(_, _, _, _):
			output += (generatePanelVar("if<s@id>") + generatePanelVar("else<s@id>"));
		case s:ifThen(_, _, _): 
			output += generatePanelVar("if<s@id>");
		case ElseIf elseIf: 
			output += generatePanelVar("elseIf<elseIf@id>");
	};
	
	return output;
}

str generateQuestionVar(str identifier, intType()) = 
	"private SpinnerNumberModel <identifier>Model = new SpinnerNumberModel();
	'private JSpinner <identifier> = new JSpinner(<identifier>Model);\n";
	
str generateQuestionVar(str identifier, boolType()) = 
	"private JCheckBox <identifier> = new JCheckBox();\n";
	
str generateQuestionVar(str identifier, stringType()) = 
	"private JTextField <identifier> = new JTextField();\n";
	
str generatePanelVar(str name) =
	"private JPanel <name> = new JPanel();\n";
	
str generateMainMethod(Form form) = 
	"public static void main(String[] args) {
	'	EventQueue.invokeLater(new Runnable() {
    '		public void run() {
    '      		new <form.name>().setVisible(true);
  	'		}
   	'	});
	'}";
	
str generateConstructor(Form form) =
	"private <form.name>() {
	'	setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  	'	setTitle(\"QL: <form.name>\");
  	'	setAlwaysOnTop(true);
  	'	setLocationByPlatform(true);
  	'	
  	'	JPanel content = new JPanel();
  	'	content.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
   	'	content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
  	'	getContentPane().add(content, BorderLayout.CENTER);
  	'	<generateContent(form.body, "content")>	
  	'	pack();
  	'	
  	'	formStateChanged();
	'}";
	
str generateListeners(Form form) =
	"public void stateChanged(ChangeEvent e) {
	'	formStateChanged();
	'}
	'
	'public void focusGained(FocusEvent e) { }
	'
	'public void focusLost(FocusEvent e) {
	'	if (!e.isTemporary()) {
	'		formStateChanged();
	'	}
	'}
	'
	'private void formStateChanged() {
	'	<generateStateChangedLogic(form, getTypeEnvironment(form))>
	'}";