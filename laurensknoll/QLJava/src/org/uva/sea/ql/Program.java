package org.uva.sea.ql;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.uva.sea.ql.ast.form.Question;
import org.uva.sea.ql.parser.test.ParseError;
import org.uva.sea.ql.parser.test.form.Parser;
import org.uva.sea.ql.visitor.IForm;
import org.uva.sea.ql.visitor.eval.ui.Application;
import org.uva.sea.ql.visitor.eval.ui.behaviour.autosave.AbstractAutoSave;
import org.uva.sea.ql.visitor.eval.ui.behaviour.autosave.Xml;
import org.uva.sea.ql.visitor.semantic.ValidationResult;

public class Program {
	private final static int FormLocation = 0;
	private final static int ResultPath = 1;

	public static void main(String[] args) {
		if (args.length != 2) {
			throw new IllegalArgumentException(
					"Example use: Program form.ql resultPath.xml");
		}

		String form = Program.readResourceContent(args[Program.FormLocation]);

		Question questionForm = null;
		try {
			Parser parser = new Parser();
			questionForm = parser.parseQuestionForm(form);
		} catch (ParseError e) {
			System.out.println("Parsing has failed:");
			e.printStackTrace();
			return;
		}

		IForm<ValidationResult> formChecker = new org.uva.sea.ql.visitor.semantic.Form();
		ValidationResult result = questionForm.accept(formChecker);
		if (!result.isValid()) {
			System.out.println("Form is invalid:");
			for (String error : result.getErrors()) {
				System.out.println(error);
			}
		} else {
			IForm<Application> formEvaluator = new org.uva.sea.ql.visitor.eval.Form();
			Application application = questionForm.accept(formEvaluator);

			String resultPath = args[Program.ResultPath];
			AbstractAutoSave autoSaveBehaviour = new Xml(resultPath);
			application.addObserver(autoSaveBehaviour);
		}
	}

	private static String readResourceContent(String location) {
		Program program = new Program();
		InputStream inputStream = program.getClass().getResourceAsStream(
				location);
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		StringBuilder sb = new StringBuilder();

		try {
			while (bufferedReader.ready()) {
				sb.append(bufferedReader.readLine());
			}
		} catch (IOException ex) {
			String exceptionMessage = String.format(
					"IOException while reading resource {0}: {1}", location,
					ex.getMessage());
			System.out.println(exceptionMessage);
		} finally {
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					// Ignore. Resource is closed already.
				}
			}
		}

		return sb.toString();
	}
}
