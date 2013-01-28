grammar QL;
options {backtrack=true; memoize=true;}

@parser::header
{
package org.uva.sea.ql.parser.antlr;
import org.uva.sea.ql.ast.*;
import org.uva.sea.ql.ast.types.*;
import org.uva.sea.ql.ast.operators.*;
}

@lexer::header
{
package org.uva.sea.ql.parser.antlr;
}

qlprogram returns [QLProgram result]
    : 'form' Ident  cb=compoundStatement { $result = new QLProgram($Ident, cb) ; } 
    ;

compoundStatement returns [Statement result]
  @init { CompoundStatement compoundStatement = new CompoundStatement() ; }
    : LBRACE 
      (st=statement  { compoundStatement.addStatement($st.result) ; } )* 
      RBRACE    { $result = compoundStatement ; }
    ;    

statement returns [Statement result]     
    : Ident COLON StringLiteral type ('(' x=orExpr ')')? { $result = new LineStatement(new Ident($Ident),$StringLiteral,$type.result,x); }
    | 'if' '(' ex=orExpr ')' ctrue=compoundStatement ('else' cfalse=compoundStatement)? { $result = new ConditionalStatement(ex,ctrue,cfalse) ; }
    |  cst=compoundStatement { $result = cst ;}  
    ;

type returns [TypeDescription result]
    : 'boolean' { $result = new BooleanType() ;}
    | 'string'  { $result = new StringType() ;}
    | 'money'   { $result = new MoneyType() ;}
    ;

primary returns [Expr result]
  : IntLiteral      { $result = new IntLiteral($IntLiteral.text); }
  | BigLiteral      { $result = new BigLiteral($BigLiteral.text); }
  | Ident           { $result = new Ident($Ident); }
  | BooleanLiteral  { $result = new BooleanLiteral($BooleanLiteral.text) ;}
  | StringLiteral   { $result = new StringLiteral($StringLiteral.text) ;}
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
    
// Lexer Tokens
WS  :	(' ' | '\t' | '\n' | '\r') { $channel=HIDDEN; }
    ;

StringLiteral : '"' ~('\n' | '\r' | '\f' | '"')* '"' ;

COLON  : ':' ;
LBRACE : '{' ;
RBRACE : '}' ;


COMMENT 
    : '/*' .* '*/'    {$channel=HIDDEN;}
    | '//' ( ~'\n' )* {$channel=HIDDEN;}
    ;

BooleanLiteral
    : 'true'| 'false' | 'TRUE' | 'FALSE'
    ;
        
Ident:   ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

IntLiteral: ('0'..'9')+;

BigLiteral: ('0'..'9')+ ('.' ('0'..'9')+)? ;

