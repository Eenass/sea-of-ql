@license{
  Copyright (c) 2013 
  All rights reserved. This program and the accompanying materials
  are made available under the terms of the Eclipse Public License v1.0
  which accompanies this distribution, and is available at
  http://www.eclipse.org/legal/epl-v10.html
}
@contributor{Kevin van der Vlist - kevin@kevinvandervlist.nl}
@contributor{Jimi van der Woning - Jimi.vanderWoning@student.uva.nl}

module lang::qls::util::Implode

import ParseTree;
import lang::qls::util::Parse;
import lang::qls::ast::AST;


public Stylesheet implode(Tree t) = 
  implode(#Stylesheet, t);

public Stylesheet load(loc l) = 
  implode(parse(readFile(l), l));
  