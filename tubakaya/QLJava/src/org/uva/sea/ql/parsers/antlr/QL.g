grammar QL;


options {backtrack=true; memoize=true;}

@parser::header
{
package org.uva.sea.ql.parsers.antlr;
import org.uva.sea.ql.core.dom.*; 
import org.uva.sea.ql.core.dom.operators.*;
import org.uva.sea.ql.core.dom.operators.arithmetic.*;
import org.uva.sea.ql.core.dom.operators.conditional.*;
import org.uva.sea.ql.core.dom.operators.relational.*;
import org.uva.sea.ql.core.dom.operators.unary.*;
import org.uva.sea.ql.core.dom.statements.*;
import org.uva.sea.ql.core.dom.types.declarations.*;
import org.uva.sea.ql.core.dom.types.primitive.*;
}

@lexer::header
{
package org.uva.sea.ql.parsers.antlr; 
}

form returns [Form result] 
  : FORM IDENT '{' elements=formElementList '}' { $result = new Form($elements.result); }
  ;

formElementList returns [List<FormElement> result]
  : {$result = new ArrayList<FormElement>();} (element=formElement {$result.add($element.result);})*
  ;
  
formElement returns [FormElement result]
  : IDENT COLON STRING type { $result = new FormElement(new Identifier($IDENT.text), new StringLiteral($STRING.text), $type.result);}
  ;
  
type returns [TypeDefinition result]
  : x='boolean' {$result = new BooleanDefinition(); }
  | x='integer' {$result=new IntDefinition();}
  | x='string'  {$result=new StringDefinition();}
  ;

primary returns [Expression result] 
  : INT   { $result = new IntLiteral($INT.text); }
  | BOOL  { $result = new BooleanLiteral($BOOL.text); } 
  | STRING {$result = new StringLiteral($STRING.text);}
  | IDENT { $result = new Identifier($IDENT.text); }
  | '(' x=orExpr ')'{ $result = $x.result; }
  ;
    
unExpr returns [Expression result]
    :  '+' x=unExpr { $result = new Pos($x.result); }
    |  '-' x=unExpr { $result = new Neg($x.result); }
    |  '!' x=unExpr { $result = new Not($x.result); } 
    |  x=primary    { $result = $x.result; }
    ;    
    
mulExpr returns [Expression result]
    :   lhs=unExpr { $result=$lhs.result; } ( op=( '*' | '/' ) rhs=unExpr 
    { 
      if ($op.text.equals("*")) {
        $result = new Mul($result, rhs);
      }
      if ($op.text.equals("/")) {
        $result = new Div($result, rhs);      
      }
    })*
    ; 
    
  
addExpr returns [Expression result]
    :   lhs=mulExpr { $result=$lhs.result; } ( op=('+' | '-') rhs=mulExpr
    { 
      if ($op.text.equals("+")) {
        $result = new Add($result, rhs);
      }
      if ($op.text.equals("-")) {
        $result = new Sub($result, rhs);      
      }
    })*
    ;
  
relExpr returns [Expression result]
    :   lhs=addExpr { $result=$lhs.result; } ( op=('<'|'<='|'>'|'>='|'=='|'!=') rhs=addExpr 
    { 
      if ($op.text.equals("<")) {
        $result = new LT($result, rhs);
      }
      if ($op.text.equals("<=")) {
        $result = new LEq($result, rhs);      
      }
      if ($op.text.equals(">")) {
        $result = new GT($result, rhs);
      }
      if ($op.text.equals(">=")) {
        $result = new GEq($result, rhs);      
      }
      if ($op.text.equals("==")) {
        $result = new Eq($result, rhs);
      }
      if ($op.text.equals("!=")) {
        $result = new NEq($result, rhs);
      }
    })*
    ;
    
andExpr returns [Expression result]
    :   lhs=relExpr { $result=$lhs.result; } ( '&&' rhs=relExpr { $result = new And($result, rhs); } )*
    ;
    

orExpr returns [Expression result]
    :   lhs=andExpr { $result = $lhs.result; } ( '||' rhs=andExpr { $result = new Or($result, rhs); } )*
    ;

    
// Tokens
WS  :	(' ' | '\t' | '\n' | '\r') { $channel=HIDDEN; }
    ;

COMMENT 
     : '/*' .* '*/' {$channel=HIDDEN;}
    ;

COLON
    :':'
    ;

BOOL
  : 'true'
  | 'false'
  ;
  
FORM
  : 'form'
  ;

STRING: '"' .* '"';

IDENT:   ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

INT: ('0'..'9')+;