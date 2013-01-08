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

qlprogram returns [QLProgram result]
    : 'form' Ident  cb=compoundblock { $result = new QLProgram(new String($Ident.text), cb) ; } 
    ;

compoundblock returns [CompoundBlock result]
    : LBRACE 
      { $result = new CompoundBlock() ; } (st=stmt  { $result.addStatement($st.result) ; } )* 
      RBRACE  
    ;

stmt returns [Statement result]     
    : Ident COLON st=String ty=type { $result = new LineStatement(new String($Ident.text),$st,$ty.result); }
    | 'if' '(' ex=orExpr ')' c=compoundblock    { $result = new ConditionalStatement(ex,c) ; } 
    ;

type returns [TypeDescription result]
    : 'boolean' { $result = new BooleanType() ;}
    | 'money' ('(' x=orExpr ')')? { $result = new MoneyType(x) ;}
    ;

 

primary returns [Expr result]
  : Int   { $result = new Int(Integer.parseInt($Int.text)); }
  | Ident { $result = new Ident($Ident.text); }
  | Boolean { $result = new BooleanType($Ident.text) ;}
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
      if ($op.text.equals("/")) {
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
WS  :	(' ' | '\t' | '\n' | '\r') { $channel=HIDDEN; }
    ;

String : '"' ~('\n' | '\r' | '"')* '"' ;

COLON  : ':' ;
LBRACE : '{' ;
RBRACE : '}' ;

COMMENT 
    : '/*' .* '*/'    {$channel=HIDDEN;}
    | '//' ( ~'\n' )* {$channel=HIDDEN;}
    ;

Boolean
    : 'true'
    | 'false'
    ;
        
Ident:   ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;



Int: ('0'..'9')+;