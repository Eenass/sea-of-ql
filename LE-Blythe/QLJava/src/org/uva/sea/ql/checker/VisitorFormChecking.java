package org.uva.sea.ql.checker;

import java.util.ArrayList;
import java.util.List;

import org.uva.sea.ql.ast.Bool;
import org.uva.sea.ql.ast.Expr;
import org.uva.sea.ql.ast.Ident;
import org.uva.sea.ql.ast.Int;
import org.uva.sea.ql.ast.Str;
import org.uva.sea.ql.ast.comparative.ComparativeBaseOperator2;
import org.uva.sea.ql.ast.form.Body;
import org.uva.sea.ql.ast.form.Branch;
import org.uva.sea.ql.ast.form.Form;
import org.uva.sea.ql.ast.form.Question;
import org.uva.sea.ql.ast.numeric.NumericBaseOperator1;
import org.uva.sea.ql.ast.numeric.NumericBaseOperator2;
import org.uva.sea.ql.ast.propositional.Not;
import org.uva.sea.ql.ast.propositional.PropositionalBaseOperator2;
import org.uva.sea.ql.errors.ExpressionTypeError;
import org.uva.sea.ql.errors.FormCheckerCompiledErrors;
import org.uva.sea.ql.errors.FormCheckerError;
import org.uva.sea.ql.errors.IdentifierExistsError;
import org.uva.sea.ql.errors.IdentifierScopeError;
import org.uva.sea.ql.errors.IdentifierTypeError;
import org.uva.sea.ql.interfaces.IBoolean;
import org.uva.sea.ql.interfaces.IVisitor;
import org.uva.sea.ql.interfaces.INumeric;
import org.uva.sea.ql.util.Stack;

public class VisitorFormChecking implements IVisitor {
	
	private void checkIdentifier(Ident i, Class<?> type, Stack s) throws Exception {

		if(!s.contains(i)){
			throw new IdentifierScopeError(i);
		}
		
		if(!s.hasType(i, type)){
			throw new IdentifierTypeError(i, type);
		}
	}

	
	private void checkExpression(Expr ex, Class<?> type, Stack s) throws Exception{
		
		//check if the type of the expression is correct
		if(!type.isInstance(ex)){
			throw new ExpressionTypeError(ex, type);
		}
		
		//also visit the expression to check that it is valid
		ex.accept(this, s);
		
	}
	
	
	private void checkCondition(Expr condition, Stack s) throws Exception{
		
		//the condition is a single identifier, then check the identifying value is type boolean
		if(condition instanceof Ident){
			checkIdentifier((Ident)condition, IBoolean.class, s);
		}else{ //expression, check expression is of boolean type
			checkExpression(condition, IBoolean.class, s);
		}		
	}
	

	private void checkOperand(Expr op, Class<?> type, Stack s) throws Exception{
		
		//if the operand is an identifier, check it's existence in the stack and 
		//the type of the value the identifier points to
		if(op instanceof Ident){
			Ident i = (Ident)op;
			checkIdentifier(i, type, s);
		}else{
			//else the operand is another expression (includes primitives), check that the expression
			//is of the correct type
			checkExpression(op, type, s);
		}
	}
	
	

	public void visit(Ident n, Stack s) throws Exception {

		
	}


	public void visit(Bool n, Stack s) throws Exception {

		
	}


	public void visit(Int n, Stack s) throws Exception {

		
	}


	public void visit(Str n, Stack s) throws Exception {

		
	}


	public void visit(Form n, Stack s) throws Exception {
		
		n.getBody().accept(this, s);
	}


	public void visit(Body n, Stack s) throws Exception {
		
		List<Expr> nodes = n.getNodes();
		List<FormCheckerError> errors = new ArrayList<FormCheckerError>();	
		
		for(int i=0; i<nodes.size(); i++){
			
			Expr node = nodes.get(i);
			
			try{
				node.accept(this, s);
			}
			catch(FormCheckerError e){
				errors.add(e); //register the error in the list
			}
			catch(Exception e){
				throw e; //this shouldn't happen so throw it further down the chain
			}

		}
		
		//were there any errors in this form? then throw the compiled list down the chain
		if(errors.size() > 0)
			throw new FormCheckerCompiledErrors(errors);

	}


	public void visit(Question n, Stack s) throws Exception {
		
		Ident identifier = n.getIdentifier();
		Expr value = n.getValue();
		
		//identifiers are immutable and final, if the declared identifier is already defined,
		//throw an exception
		if(s.contains(identifier)){
			throw new IdentifierExistsError(identifier);
		}
		
		//we need to check the expression for correctness: are it's types valid,
		//does it contain valid identifiers, etc
		value.accept(this, s);
		
		//register the identifier and its value
		s.add(identifier, value);
	}

	
	public void visit(Branch n, Stack s) throws Exception {
		
		Expr condition = n.getIfCondition();
		
		checkCondition(condition, s);
		
		//clone the current stack to ensure that variables declared
		//inside the body of the branch stay within the scope of the branch's body 
		Stack ifStack = s.clone();
		
		//continue type checking on the body
		n.getIfBody().accept(this, ifStack);
		
		//same for else (if present)
		if(n.getElseBody() != null){
			Stack elseStack = s.clone();
			n.getElseBody().accept(this, elseStack);
		}
	}


	public void visit(NumericBaseOperator1 n, Stack s) throws Exception {
		Expr op = n.getOperand();
		checkOperand(op, INumeric.class, s);
	}


	public void visit(NumericBaseOperator2 n, Stack s) throws Exception {

		Expr leftOp = n.getLeftHandOperand();
		Expr rightOp = n.getRightHandOperand();
		
		checkOperand(leftOp, INumeric.class, s);
		checkOperand(rightOp, INumeric.class, s);
	}


	public void visit(Not n, Stack s) throws Exception {
		Expr op = n.getOperand();
		checkOperand(op, IBoolean.class, s);
	}


	public void visit(PropositionalBaseOperator2 n, Stack s) throws Exception {

		Expr leftOp = n.getLeftHandOperand();
		Expr rightOp = n.getRightHandOperand();
		
		checkOperand(leftOp, IBoolean.class, s);
		checkOperand(rightOp, IBoolean.class, s);
	}


	public void visit(ComparativeBaseOperator2 n, Stack s) throws Exception {
		
		Expr leftOp = n.getLeftHandOperand();
		Expr rightOp = n.getRightHandOperand();
		
		checkOperand(leftOp, INumeric.class, s);
		checkOperand(rightOp, INumeric.class, s);
	}

}