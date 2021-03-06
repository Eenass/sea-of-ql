package org.uva.sea.ql.questionnaire;

import org.uva.sea.ql.ast.expr.ASTNode;
import org.uva.sea.ql.ast.stat.Block;

public class Questionnaire extends ASTNode {

	private final String questionnaireName;
	private final Block questionnaireBlock;

	//questionnaire container contains first level block and questionnaire name
	public Questionnaire(String qName, Block block) {
		this.questionnaireName = qName;
		this.questionnaireBlock = block;
	}

	@Override
	public String toString() {
		return "Questionnaore name: " + this.questionnaireName;
	}

	public Block getBlock() {
		return this.questionnaireBlock;
	}

	public String getName() {
		return this.questionnaireName;
	}

}
