module lang::ql::ide::IdentifierUsesDefinitions

import lang::ql::ast::AST;
import lang::ql::ast::Graph;
import lang::ql::ide::FlowGraph;

public alias Occurrence = tuple[loc location, str \type, Expr expr];

public list[GraphNode] identifierUses(Form form) = uses(form.formElements);            
                       
public list[GraphNode] identifierDefinitions(Form f) =                 
  [ question(q, q@location) | /s:question(Question q) <- f.formElements];
                       
private list[GraphNode] uses(list[Statement] formElements) = [*uses(e) | e <- formElements];

private list[GraphNode] uses(Statement item:
  ifCondition(Conditional ifPart, list[Conditional] elseIfs, list[ElsePart] elsePart)) {
  return
    uses(ifPart) +
    [*uses(e) | e <- elseIfs] +
    [*uses(e.body) | e <- elsePart];
}

private list[GraphNode] uses(Conditional cond:
  conditional(Expr condition, list[Statement] body)) {
  return uses(condition) + [*uses(e) | e <- body];
}

private list[GraphNode] uses(Statement item: question(Question question)) = uses(question);

private list[GraphNode] uses(Question q:
  question(questionText, answerDataType, answerIdentifier)) {
  return [];
}

private list[GraphNode] uses(Question q:
  question(questionText, answerDataType, answerIdentifier, calculatedField)) {
  return uses(calculatedField); 
}

private list[GraphNode] uses(Expr e) {
  if(u:ident(str name) := e) {
    return [expr(e, e@location)];
  } else {
    return [expr(u, u@location) | /u:ident(str name) <- e ];
  }
} 
