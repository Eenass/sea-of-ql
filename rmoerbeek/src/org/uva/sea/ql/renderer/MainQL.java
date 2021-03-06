package org.uva.sea.ql.renderer;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.uva.sea.ql.ast.expression.Ident;
import org.uva.sea.ql.ast.statement.Form;
import org.uva.sea.ql.evaluator.values.Value;
import org.uva.sea.ql.parser.antlr.ANTLRParser;
import org.uva.sea.ql.parser.test.ParseError;
import org.uva.sea.ql.parser.typechecker.CheckStat;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


public class MainQL extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private String inputLoc;
	private String outputLoc;
	private String formName;
	private State state;
	
	
	
	public MainQL(String inputLoc, String outputLoc) {
		this.inputLoc = inputLoc;
		this.outputLoc = outputLoc;
		
		startUI();
		render();
	}
	
	
	private void startUI() {
		setTitle("My QL Form");
		setSize(600, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
		    public void windowClosing(WindowEvent e) {
		    	createXML(getOutputLoc());
		    }
		}
		);	
	}
	
	
	private void createXML(String outputLoc) {
			
		try {
			 
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
	 
			/* Root element: form */
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("form");
			rootElement.setAttribute("name", getFormName());
			doc.appendChild(rootElement);
			
			/* Get values of all identifiers from the form. This value is set in render() */
			Set<Map.Entry<Ident,Value>> valueSet = getMyState().getEnvironment().entrySet();
			
	 
			/* Question elements */
			for (Map.Entry<Ident, Value> entry : valueSet) {
				Element question = doc.createElement("question");
				question.setAttribute("id", entry.getKey().getValue());
				question.setAttribute("value", entry.getValue().getValue().toString());
				rootElement.appendChild(question);
			}
			
		 
			/* Write the content into XML file */
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(doc);
			System.out.println(getOutputLoc());
			StreamResult result = new StreamResult(new File(getOutputLoc()));
	 
			// Output to console for testing
			// StreamResult result = new StreamResult(System.out);
	 
			transformer.transform(domSource, result);
	 
			System.out.println("File created and saved");
	 
		  } catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		  } catch (TransformerException tfe) {
			tfe.printStackTrace();
		  }
	}
		
		
	
	
	private void render() {
		State state = new State();
		ANTLRParser parser = new ANTLRParser();
		ArrayList<String> errorList = new ArrayList<String>();
		
		String source = loadFile(getInputLoc());
		
		if (source != null) {
					
			try {
				Form form = parser.parseForm(source); // parse form
				setFormName(form.getId().getValue());
				
				/* check if there are no compilation and/or type errors */
				boolean check = CheckStat.check(form, new HashMap<Ident, org.uva.sea.ql.ast.types.Type>(), errorList);
				
				/* if the form is valid */
				if(check) {
					JPanel panel = Renderer.render(form.getBody(), state);
					this.add(panel);
					this.setVisible(true);
					setState(state);
			
				/* if the form contains errors */	
				} else {
					
					for(int i = 0; i<errorList.size(); i++) {
						/* pop-up box for every compilation error */
						new ErrorBox(errorList.get(i));
					}
					
				}
				
				
			} catch (ParseError e) {
			
				e.printStackTrace();
			}
		}
	}

	/* From file location to a String of its contents */
	private String loadFile(String inputLoc) {
		ByteArrayOutputStream stream = new ByteArrayOutputStream();
		String output;
		int temp;
		byte[] b;
		

		try {
			InputStream input = new FileInputStream(inputLoc);
			b = new byte[1024];
			while ((temp = input.read(b)) >= 0) {
				stream.write(b, 0, temp);
			}
			output = new String(stream.toByteArray());
		} catch (FileNotFoundException e){
			output = null;
			
		} catch (IOException e) {
			e.printStackTrace();
			output = null;
		}
		
		return output;
	}


	private String getInputLoc() {
		return this.inputLoc;
	}
	
	private String getOutputLoc() {
		return this.outputLoc;
	}
	
	private String getFormName() {
		return this.formName;
	}
	
	private void setFormName(String name) {
		this.formName = name;
	}
	
	private void setState(State state) {
		this.state = state;
	}
	
	private State getMyState() {
		return this.state;
	}


}
