grammar QL;
options {backtrack=true; memoize=true;}

@parser::header
{
package org.uva.sea.ql.parser.antlr;
import org.uva.sea.ql.ast.*;
}

@lexer::header
{
package org.uva.sea.ql.parser.antlr;
}

/*
ifStatement
	: 'if' '(' orExpr ')'
	 '{' (question | computedQuestion)* '}'
	 ('else'  '{' (question | computedQuestion)* '}')?
	;

computedQuestion
	: question '(' orExpr ')'
	;
*/

question
	: IDENT ':' STRING_LITERAL x=type
	;
	
type
	:
	| 'boolean'
	| 'money'
	; 

primary returns [Expr result]
  	: INT   { $result = new Int(Integer.parseInt($INT.text)); }
  	| IDENT { $result = new Ident($IDENT.text); }
  	| '(' x=orExpr ')'{ $result = $x.result; }
  	;
    
unExpr returns [Expr result]
    :  '+' x=unExpr { $result = new Pos($x.result); }
    |  '-' x=unExpr { $result = new Neg($x.result); }
    |  '!' x=unExpr { $result = new Not($x.result); }
    |  x=primary    { $result = $x.result; }
    ;    
    
mulExpr returns [Expr result]
    :   lhs=unExpr { $result=$lhs.result; } ( op=( '*' | '/' ) rhs=unExpr 
    { 
      if ($op.text.equals("*")) {
        $result = new Mul($result, rhs);
      }
      if ($op.text.equals("<=")) {
        $result = new Div($result, rhs);      
      }
    })*
    ;
    
  
addExpr returns [Expr result]
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
  
relExpr returns [Expr result]
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
    
andExpr returns [Expr result]
    :   lhs=relExpr { $result=$lhs.result; } ( '&&' rhs=relExpr { $result = new And($result, rhs); } )*
    ;
    

orExpr returns [Expr result]
    :   lhs=andExpr { $result = $lhs.result; } ( '||' rhs=andExpr { $result = new Or($result, rhs); } )*
    ;
  
    
// Tokens

WS
	: (' ' | '\t' | '\n' | '\r') { $channel=HIDDEN; }
	;
	
COMMENT
	: '/*' .* '*/' {$channel=HIDDEN;}
    | '//' .* ('\n'|'\r') {$channel = HIDDEN;}
    ;
    
INT
	: ('0'..'9')+
	;
	
STRING_LITERAL
	: '"' .* '"'
	;
	
BOOLEAN
	: ('true' | 'false')
	;
	
IDENT
	: ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
	;
