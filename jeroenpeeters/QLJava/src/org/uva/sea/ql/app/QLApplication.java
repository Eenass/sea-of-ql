package org.uva.sea.ql.app;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.apache.commons.io.IOUtils;
import org.uva.sea.ql.ast.expression.Identifier;
import org.uva.sea.ql.ast.statement.Form;
import org.uva.sea.ql.parser.ParseError;
import org.uva.sea.ql.parser.jacc.JaccQLParser;
import org.uva.sea.ql.value.Value;
import org.uva.sea.ql.visitor.evaluation.EvaluatorVisitor;
import org.uva.sea.ql.visitor.semantics.TypeCheckError;
import org.uva.sea.ql.visitor.semantics.TypeCheckVisitor2;
import org.uva.sea.ql.visitor.ui.FormGeneratorVisitor;

import com.google.common.collect.Maps;

public class QLApplication {
	
	public static void main(String[] args) {
		
		setSystemLookAndFeel();
		
		final Form qlForm = parseForm("simpleQLForm1.ql");
		
		if(qlForm == null){
			System.exit(-1);
		}
		
		if(!typeCheck(qlForm)){
			System.exit(-1);
		}
		
		//NodeJsGenerator nodeJsGenerator = new NodeJsGenerator(new File("D:\\Data\\jpeeters\\Desktop\\"));
		//nodeJsGenerator.visit(qlForm);
		//nodeJsGenerator.finish();
		
		render(qlForm);
	}
	
	private static Form parseForm(final String filePath){
		try {
			final JaccQLParser parser = new JaccQLParser();
			final Form form = parser.parseForm(readResource(filePath));
			return form;
		} catch (ParseError e) {
			System.out.println("A parse error occured in " + filePath + ": " + e.getMessage());
		} catch (IOException e) {
			System.out.println("An error occured when reading " + filePath + ": " + e.getMessage());
		}
		return null;
	}
	
	private static boolean typeCheck(final Form qlForm){
		final TypeCheckVisitor2 typeCheckVisitor = new TypeCheckVisitor2();
		qlForm.accept(typeCheckVisitor);
		if(typeCheckVisitor.hasTypeCheckErrors()){
			System.out.println("The following errors exist:");
			final Iterator<TypeCheckError> typeCheckErrorIterator = typeCheckVisitor.getTypeCheckErrorIterator();
			while(typeCheckErrorIterator.hasNext()){
				TypeCheckError error = typeCheckErrorIterator.next();
				System.out.println(error.getErrorMessage());
			}
			return false;
		}
		return true;
	}
	
	private static void render(final Form qlForm){
		final Map<Identifier, Value> symbolMap = Maps.newConcurrentMap();
		
		final EvaluatorVisitor evaluatorVisitor = new EvaluatorVisitor(symbolMap);
		final FormGeneratorVisitor formGeneratorVisitor = new FormGeneratorVisitor(evaluatorVisitor, symbolMap);
		final JComponent formPanel = qlForm.accept(formGeneratorVisitor);
		
		final JFrame jframe = new JFrame();
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jframe.setContentPane(formPanel);
		jframe.pack();
		jframe.setLocationRelativeTo(null); // centers frame on screen
		jframe.setVisible(true);
	}

	private static String readResource(final String resourceName) throws IOException {
		return IOUtils.toString(QLApplication.class.getResourceAsStream(resourceName));
	}
	
	private static void setSystemLookAndFeel(){
		try {
			UIManager.setLookAndFeel(
			        UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
	}
}
