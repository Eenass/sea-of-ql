package org.uva.sea.ql.ast;

public class Question {

	private String id;
	private String question;
	
	public Question(String id, String question) {
		this.id = id;
		this.question = question;
	}
	
	public String getId() {
		return id;
	}
	
	public String getQuestion() {
		return question;
	}
}
