Eclipse highlight categories (probably):
  - "Normal"; -> black
  - "Type"; -> red
  - "Identifier"; -> blue'ish
  - "Variable"; -> light green
  - "Constant"; -> purple
  - "Comment"; -> dark green, italic
  - "Todo"; -> blue'ish, bold
  - "Quote"; -> red, dark green background
  - "MetaAmbiguity"; -> red, bold
  - "MetaVariable"; -> blue'ish, italic
  - "MetaKeyword"; -> purple, bold
  - "MetaSkipped"; -> black, dark green background
  - "NonterminalLabel". -> gray, italic
  
  
IMP EDITOR!!!!!!!!!!!!!!


Page: <div class="page"> ... </div>
Section: <fieldset><legend>SectionName</legend> ... </fieldset>

rascal>import lang::rascal::grammar::definition::Priorities;
ok

rascal>doNotNest(#Form.definitions)
|stdin:///|(10,5,<1,10>,<1,15>): The called signature: doNotNest(map[Symbol sort, Production def]),
does not match any of the declared (overloaded) signature patterns:
  DoNotNest doNotNest(Grammar);
  DoNotNest doNotNest(Production);


rascal>doNotNest(grammar({}, #Form.definitions))
|stdin:///|(10,7,<1,10>,<1,17>): Undeclared variable, function or constructor: grammar

rascal>import Grammar;
ok

rascal>doNotNest(grammar({}, #Form.definitions))
DoNotNest: {
  <prod(
  
  Oberon0:  module ldta::oberon0::util::Priorities
            module ldta::oberon0::l1::Priorities
  
