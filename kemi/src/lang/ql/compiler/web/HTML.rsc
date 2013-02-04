@license{
  Copyright (c) 2013 
  All rights reserved. This program and the accompanying materials
  are made available under the terms of the Eclipse Public License v1.0
  which accompanies this distribution, and is available at
  http://www.eclipse.org/legal/epl-v10.html
}
@contributor{Kevin van der Vlist - kevin@kevinvandervlist.nl}
@contributor{Jimi van der Woning - Jimi.vanderWoning@student.uva.nl}

module lang::ql::compiler::web::HTML

import IO;
import String;
import lang::ql::ast::AST; 

public void HTML(Form f, loc dest) {
  dest += "index.html";
  
  str title = "";
  list[Question] questions = [];
  
  // Writing an empty string == truncating the file 
  writeFile(dest, "");
  
  top-down visit(f) {
    case form(def, _): title = def.ident;
    case q: question(_, _, _): questions += [q];
    case q: question(_, _, _, _): questions += [q];
  }
  
  createPage(title, questions, dest);
}

private void createPage(str title, list[Question] questions, loc dest) {
  html = 
  "\<!DOCTYPE html\>
  '\<html\>
  '  \<head\>
  '    \<!-- THIS IS AN AUTOMATICALLY GENERATED FILE. DO NOT EDIT! --\>
  '    \<meta charset=\"utf-8\"/\>
  '    \<title\><title>\</title\>
  '    \<script type=\"text/javascript\" src=\"checking.js\"\>\</script\>
  '    \<script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js\"\>\</script\>
  '    \<script type=\"text/javascript\" src=\"http://jzaefferer.github.com/jquery-validation/jquery.validate.js\"\>\</script\>
  '    \<script\>
  '      $(document).ready(function(){
  '        validate<title>();
  '      });
  '    \</script\>
  '    \<style type=\"text/css\" \>
  '      label { display: block; }
  '      .error { float: none; color: red; padding-left: .5em; vertical-align: top; }
  '    \</style\>
  '  \</head\>
  '  \<body\>
  '    \<form id=\"<title>\" method=\"post\" action=\"form.php\"\>
  '<for(q <- questions) {>
  '      <createQuestion(title, q)>
  '<}>
  '      \<input type=\"submit\" value=\"Submit <title>\"\>
  '    \</form\>
  '  \</body\>
  '\</html\>
  ";
  appendToFile(dest, html);
}

private str createQuestion(str title, Question q: 
  question(QuestionText text, Type \type, IdentDefinition ident)) {
  if(\type.name == "boolean") {
    return 
    "\<div id=\"<ident.ident>Block\"\>
    '  \<label for=\"<ident.ident>\"\><substring(text.text, 1, size(text.text) - 1)>\</label\>
    '  \<select id=\"<ident.ident>\" name=\"<ident.ident>\" form=\"<title>\"\>
    '  \<option value=\"undefined\"\>Choose an answer\</option\>
    '  \<option value=\"true\"\>Yes\</option\>
    '  \<option value=\"false\"\>No\</option\>
    '  \</select\>
    '\</div\>
    '";
  } else {
    return 
    "\<div id=\"<ident.ident>Block\"\>
    '  \<label for=\"<ident.ident>\"\><substring(text.text, 1, size(text.text) - 1)>\</label\>
    '  \<input type=\"<\type.name>\" id=\"<ident.ident>\" name=\"<ident.ident>\" /\>
    '\</div\>
    '";
  }  
}

private str createQuestion(str title, Question q: 
  question(QuestionText text, Type \type, IdentDefinition ident, calculatedField)) =
    "\<div id=\"<ident.ident>Block\"\>
    '  \<label for=\"<ident.ident>\"\><substring(text.text, 1, size(text.text) - 1)>\</label\>
    '  \<input type=\"<\type.name>\" id=\"<ident.ident>\" name=\"<ident.ident>\" disabled=\"disabled\"/\>
    '\</div\>
    '";