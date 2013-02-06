grammar QL;
options {backtrack=true; memoize=true;}

@parser::header
{
package org.uva.sea.ql.parser.antlr;
import org.uva.sea.ql.ast.*;
import org.uva.sea.ql.ast.type.*;
import org.uva.sea.ql.ast.expression.*;
import org.uva.sea.ql.ast.form.*;
}

@parser::members {
    @Override
    public void reportError(RecognitionException e) {
      throw new RuntimeException(e);
    }
}

@lexer::header
{
package org.uva.sea.ql.parser.antlr;
}

@rulecatch {
  catch (RecognitionException re) {
    reportError(re);
    recover(input,re);
    throw re;
  }
}

form returns [Form result]
  : 'form' IDENT body { $result = new Form($IDENT.text, $body.result); } EOF
  ;
  
topLevelBody returns [Body result]
  : body EOF { $result = $body.result; }
  ;

  
body returns [Body result]
  @init { List<FormElement> tempList = new ArrayList<>(); }
  @after { $result = new Body(tempList); }
  : '{' (formElement { tempList.add($formElement.result); })* '}'
  ;
  
formElement returns [FormElement result]
  : question { $result = $question.result; }
  | ifStatement { $result = $ifStatement.result; }
  ;
  
topLevelFormElement returns [FormElement result]
  : formElement EOF { $result = $formElement.result; }
  ;
  
question returns [Question result]
  : id=IDENT ':' lbl=STRING_LITERAL type
    {
      $result = new Question(new Ident($id.text), $lbl.text, $type.result);
    }
  | id=IDENT ':' lbl=STRING_LITERAL type '(' cond=expression ')'
    {
      $result = new Computed(new Ident($id.text), $lbl.text,
        $type.result, $cond.result);
    }
  ;
  
type returns [ExprType result]
  : 'boolean' { $result = new BoolType(); }
  | 'string' { $result = new StrType(); }
  | 'integer' { $result = new IntType(); }
  ;

ifStatement returns [IfStatement result]
  @init {
    List<ElseIfStatement> elseIfs = new ArrayList<>();
    ElseStatement elseStmt = null;
  }
  : 'if' '(' ic=expression ')' ib=body
    (
      'else' 'if' '(' eic=expression ')' eib=body
      {
        elseIfs.add(new ElseIfStatement($eic.result, $eib.result));
      }
    )*
    
    (
      'else' eb=body
      {
        elseStmt = new ElseStatement($eb.result);
      }
    )?
    {
      $result = new IfStatement($ic.result, $ib.result, elseIfs, elseStmt); 
    }
  ;

topLevelExpression returns [Expr result]
  : expression EOF { $result = $expression.result; }
  ;

expression returns [Expr result]
  : orExpr { $result = $orExpr.result; }
  ;

primary returns [Expr result]
  : INT   { $result = new Int(Integer.parseInt($INT.text)); }
  | IDENT { $result = new Ident($IDENT.text); }
  | STRING_LITERAL { $result = new Str($STRING_LITERAL.text); }
  | '(' orExpr ')' { $result = $orExpr.result; }
  ;
    
unExpr returns [Expr result]
  : '+' x=unExpr { $result = new Pos($x.result); }
  | '-' x=unExpr { $result = new Neg($x.result); }
  | '!' x=unExpr { $result = new Not($x.result); }
  | x=primary    { $result = $x.result; }
  ;    
    
mulExpr returns [Expr result]
  : lhs=unExpr { $result=$lhs.result; } ( op=( '*' | '/' ) rhs=unExpr 
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
  : lhs=mulExpr { $result=$lhs.result; } ( op=('+' | '-') rhs=mulExpr
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
  : lhs=addExpr { $result = $lhs.result; }
    ( op=('<' | '<=' | '>' | '>=' | '==' | '!=') rhs=addExpr 
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
  : lhs=relExpr { $result=$lhs.result; }
    ( '&&' rhs=relExpr { $result = new And($result, rhs); } )*
  ;
    

orExpr returns [Expr result]
  : lhs=andExpr { $result = $lhs.result; }
    ( '||' rhs=andExpr { $result = new Or($result, rhs); } )*
  ;

    
// Tokens
WS  :	(' ' | '\t' | '\n' | '\r') { $channel = HIDDEN; }
    ;

COMMENT :  '/*' .* '*/' { $channel = HIDDEN; }
        ;

IDENT : LETTER (LETTER | DIGIT | '_')*
      ;

INT :    DIGIT+
    ;

STRING_LITERAL  : '"'
                  (
                    '\\' '"' | ~('"'|'\r'|'\n')
                  )*
                  '"'
                ;

fragment DIGIT: '0'..'9';
fragment LETTER: 'a'..'z'|'A'..'Z';
