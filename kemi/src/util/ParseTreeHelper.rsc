@license{
  Copyright (c) 2013 
  All rights reserved. This program and the accompanying materials
  are made available under the terms of the Eclipse Public License v1.0
  which accompanies this distribution, and is available at
  http://www.eclipse.org/legal/epl-v10.html
}
@contributor{Kevin van der Vlist - kevin@kevinvandervlist.nl}
@contributor{Jimi van der Woning - Jimi.vanderWoning@student.uva.nl}

module util::ParseTreeHelper

import Grammar;
import ParseTree;

// From: lang::rascal::grammar::definition::Keywords
public set[Production] getKeywords(Grammar g) =
  {g.rules[s] | s:keywords(_) <- g.rules};