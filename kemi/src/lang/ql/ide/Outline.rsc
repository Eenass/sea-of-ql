@license{
  Copyright (c) 2013 
  All rights reserved. This program and the accompanying materials
  are made available under the terms of the Eclipse Public License v1.0
  which accompanies this distribution, and is available at
  http://www.eclipse.org/legal/epl-v10.html
}
@contributor{Kevin van der Vlist - kevin@kevinvandervlist.nl}
@contributor{Jimi van der Woning - Jimi.vanderWoning@student.uva.nl}

module lang::ql::ide::Outline

import List;
import Node;
import lang::ql::ast::AST;
import lang::ql::compiler::PrettyPrinter;
import util::IDE;

public node outlineForm(Form form) =
  "outline"(outline(form))
  [@label="Form"]
  [@\loc=form@location];

private node createNode(str name, str label, loc location, 
    list[node] children) =
  setAnnotations(makeNode(name, children), ("label": label, "loc": location));

private node outlineBranch(str name, str label, loc location, 
    list[Statement] items) =
  "<name>"([outline(i) | i <- items])
  [@label="<label>"]
  [@\loc=location];

private node outline(Form form) = 
  "form"([outline(e) | e <- form.formElements])
  [@label="Form <form.formName.ident> (<size(form.formElements)>)"]
  [@\loc=form@location];

private node outline(Statement item:
    ifCondition(Conditional ifPart, list[Conditional] elseIfs, 
    list[ElsePart] elsePart)) {

  str name = "IfCondition";
  str label = "If (<prettyPrint(ifPart.condition)>)";

  bool elseIfBlock = false;
  bool elseBlock = false;

  children = [outlineBranch("ifPart", "<prettyPrint(ifPart.condition)>", 
    ifPart@location, ifPart.body)];

  if (elseIfs != []) {
    elseIfBlock = true;
    children += [outlineBranch("elseIf", "<prettyPrint(b.condition)>", 
      b@location, b.body) | b <- elseIfs];
  }

  if(elsePart != []) {
    elseBlock = true;
    ElsePart ep = head(elsePart);
    children += [outlineBranch("elsePart", "else", ep@location, ep.body)];
  }

  if(elseIfBlock && elseBlock) {
    name = "ifElseIfElseCondition";
    label = "If (<prettyPrint(ifPart.condition)>) elseif... else";
  } else if(elseIfBlock) {
    name = "ifElseIfCondition";
    label = "If (<prettyPrint(ifPart.condition)>) elseif...";
  } else if(elseBlock) {
    name = "ifElseCondition";
    label = "If (<prettyPrint(ifPart.condition)>) else ...";
  }

  return createNode(name, label, item@location, children);
}

private node outline(Statement item: 
    question(Question question)) = 
  outline(question);

private node outline(Question q:
    question(questionText, answerDataType, _)) {
  str name = "Question";
  str label = "Q: <answerDataType.name>:<questionText.text>";

  return createNode(name, label, q@location, []);
}

private node outline(Question q:
    question(questionText, answerDataType, _, cf)) {
  str name = "CalculatedQuestion";
  str label = "CQ: <answerDataType.name>:<questionText.text>(<cf>)";
  
  return createNode(name, label, q@location, []);
}
