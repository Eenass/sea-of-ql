@license{
  Copyright (c) 2013 
  All rights reserved. This program and the accompanying materials
  are made available under the terms of the Eclipse Public License v1.0
  which accompanies this distribution, and is available at
  http://www.eclipse.org/legal/epl-v10.html
}
@contributor{Kevin van der Vlist - kevin@kevinvandervlist.nl}
@contributor{Jimi van der Woning - Jimi.vanderWoning@student.uva.nl}

module lang::qls::compiler::PrettyPrinter

import lang::qls::ast::AST;
import lang::qls::ast::Keyword;

public str prettyPrint(Stylesheet s) =
  "stylesheet <s.ident> {<for(st <- s.definitions) {>
  '  <prettyPrint(st)><}>
  '}
  '";

public str prettyPrint(Definition s:
  definition(definition)) =
    prettyPrint(definition);

public str prettyPrint(PageDefinition d) =
  "page <d.ident> {<for(r <- d.pageRules) {>
  '  <prettyPrint(r)><}>
  '}
  '";

public str prettyPrint(SectionDefinition d) =
  "section <d.ident> {<for(r <- d.sectionRules) {>
  '  <prettyPrint(r)><}>
  '}
  '";

public str prettyPrint(QuestionDefinition d:
  questionDefinition(ident)) =
    "question <prettyPrint(ident)>";

public str prettyPrint(QuestionDefinition d:
  questionDefinition(ident, styleRules)) =
    "question <prettyPrint(ident)> {<for(r <- styleRules) {>
    '  <prettyPrint(r)><}>
    '}
    '";

public str prettyPrint(DefaultDefinition d) =
  "default <d.ident.name> {<for(r <- d.styleRules) {>
  '  <prettyPrint(r)><}>
  '}
  '";

public str prettyPrint(PageRule r:
  pageRule(definition)) =
    prettyPrint(definition);

public str prettyPrint(SectionRule r:
  sectionRule(definition)) =
    prettyPrint(definition);

public str prettyPrint(StyleRule r: 
  widgetStyleRule(attr, \value)) =
    "<attr> <\value.name>";

public str prettyPrint(StyleRule r: 
  widthStyleRule(str attr, int \value)) =
    "<attr> <\value>";

public default str prettyPrint(str ident) =
  ident;

public str prettyPrint(str ident) =
  "\\<ident>"
    when ident in keywords;
