package org.uva.sea.ql.utility;

import java.util.ArrayList;
import java.util.List;

public class ErrorHandler {

	private static ErrorHandler instance;
	private List<QLError> errors = new ArrayList<QLError>();

	public static ErrorHandler getInstance() {
		if (instance == null) {
			instance = new ErrorHandler();
		}
		return instance;
	}

	public void addError(QLError error) {
		errors.add(error);
	}

	public List<QLError> getErrors() {
		return errors;
	}

}
