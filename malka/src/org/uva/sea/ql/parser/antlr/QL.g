grammar QL;
options {backtrack=true; memoize=true;}

@parser::header
{
package org.uva.sea.ql.parser.antlr;
import org.uva.sea.ql.ast.*;
import org.uva.sea.ql.ast.primitive.*;
import org.uva.sea.ql.ast.variable.*;
import org.uva.sea.ql.ast.form.*;
import org.uva.sea.ql.ast.types.*;
import org.uva.sea.ql.ast.operation.arithmetic.*;
import org.uva.sea.ql.ast.operation.bool.logical.*;
import org.uva.sea.ql.ast.operation.bool.relational.*;
}

@lexer::header
{
package org.uva.sea.ql.parser.antlr;
}

form returns [Form result]
	: FORM IDENT '{' elements=formElementList '}' { $result = new Form($elements.result); }
	;

formElementList returns [List<FormElement> result]
	: {$result = new ArrayList<FormElement>();} (element=formElement {$result.add($element.result);})*
	;

formElement returns [FormElement result]
	: IDENT ':' STRING TYPE { $result = new Question(new Identifier($IDENT.text), new StringPrimitive($STRING.text), new Type($TYPE.text)); }
	| IDENT ':' STRING TYPE '(' x=addExpr ')' { $result = new FormText(new Identifier($IDENT.text), new StringPrimitive($STRING.text), new Type($TYPE.text), $x.result); }
	| IF '(' condition=orExpr ')' '{' if_list=formElementList '}' ( ELSE '{' else_list=formElementList '}' )? {$result = new IfStatement($condition.result, $if_list.result, $else_list.result); }
	;

primary returns [Expression result]
  : INT    { $result = new IntegerPrimitive(Integer.parseInt($INT.text)); }
  | BOOL   { $result = new BooleanPrimitive(Boolean.parseBoolean($BOOL.text)); }
  | STRING { $result = new StringPrimitive($STRING.text); }
  | IDENT  { $result = new Identifier($IDENT.text); }
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
      
      if (result instanceof Identifier) {
        $result = new IntegerVariable((Identifier) $result);
      }
      if (rhs instanceof Identifier) {
        rhs = new IntegerVariable((Identifier) rhs);
      }
       
      if ( result instanceof IntegerExpression
              && rhs instanceof IntegerExpression ) {
      	if ($op.text.equals("*")) {
          $result = new Mul((IntegerExpression)$result, (IntegerExpression)rhs);
        }
        if ($op.text.equals("/")) {
          $result = new Div((IntegerExpression)$result, (IntegerExpression)rhs);      
        }
        
        
      } else {
      	throw new RecognitionException();
      }
    })*
    ;
    
  
addExpr returns [Expression result]
    :   lhs=mulExpr { $result=$lhs.result; } ( op=('+' | '-') rhs=mulExpr
    {
      if (result instanceof Identifier) {
        $result = new IntegerVariable((Identifier) $result);
      }
      if (rhs instanceof Identifier) {
        rhs = new IntegerVariable((Identifier) rhs);
      }
      
      if ( result instanceof IntegerExpression
              && rhs instanceof IntegerExpression ) {
      	if ($op.text.equals("+")) {
        	$result = new Add((IntegerExpression)$result, (IntegerExpression)rhs);
      	}
      	if ($op.text.equals("-")) {
	        $result = new Sub((IntegerExpression)$result, (IntegerExpression)rhs);
    	}
      } else {
      	throw new RecognitionException();
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
    : '/*' ( options{greedy=false;}: . )* '*/' {$channel=HIDDEN;}
    ;

STRING
	: '"' ( options{greedy=false;}: . )* '"'
	| '\'' ( options{greedy=false;}: . )* '\''
	;

IF
	: 'if'
	;

ELSE
	: 'else'
	;

FORM
	: 'form'
	;

BOOL
	: 'true'
	| 'false'
	| 'TRUE'
	| 'FALSE'
	;

TYPE
	: 'boolean'
	| 'integer'
	| 'string'
	;

IDENT
	: ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

INT
	: ('0'..'9')+;