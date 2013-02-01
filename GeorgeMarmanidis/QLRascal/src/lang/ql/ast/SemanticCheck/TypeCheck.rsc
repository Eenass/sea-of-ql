@contributor{George Marmanidis -geo.marmani@gmail.com}
module lang::ql::ast::semanticcheck::TypeCheck

import lang::ql::ast::semanticcheck::TypeEnvUtils;
import lang::ql::ast::AST;

public TENV checkFormBody(formBodyItem,TENV env){
	for(item<-formBodyItem){
		env=checkFormBodyItem(item,env);
	}	
	return env;	
}

str requiredMsg(Type req,Type got)="Required <req> but got <got>";
str requiredMsg(Type req)="Required <req>.";
str requiredMsg(Type req,str plusMsg,Type got)="Required <req> <plusMsg> but got <got>";

TENV checkFormBodyItem(question(itemQuestion),TENV env)=checkQuestion(itemQuestion,env);
	
TENV checkFormBodyItem(conditionalStatement(itemCondStatement),TENV env)=checkFormBodyItem(itemCondStatement,env);
	
TENV checkFormBodyItem(ifCond(ifCondition,ifQuestions,elseQuestions),TENV env){
	env=checkExpression(ifCondition,boolean(),env);
	env=checkFormBody(ifQuestions,env);
	env=checkFormBody(elseQuestions,env);
	return(env);
}

TENV checkFormBodyItem(simpleIfCond(ifCondition,ifQuestions),TENV env){
	env=checkExpression(ifCondition,boolean(),env);
	env=checkFormBody(ifQuestions,env);
	return(env);
}

TENV checkFormBodyItem(ifElseIfCond(ifCondition,ifQuestions,elseifBranch,elseQuestions),TENV env){
	env=checkExpression(ifCondition,boolean(),env);
	env=checkFormBody(ifQuestions,env);
	env=checkFormBodyItem(elseifBranch,env);
	env=checkFormBody(elseQuestions,env);
	return(env);
}

TENV checkFormBodyItem(elseIfStatements,TENV env){
	for(statement<-elseIfStatements){

		if(elseif(ifExpression,elseQuestions):= statement){
			env=checkExpression(ifExpression,boolean(),env);
			env=checkFormBody(elseQuestions,env);
		}	
	}
	return(env);
}

TENV checkQuestion(simpleQuestion(questionId,questionLabel,questionType),TENV env)=env;

TENV checkQuestion(computedQuestion(questionId,questionLabel,questionType,questionComputation),TENV env)
	=checkExpression(questionComputation,questionType,env);

TENV checkExpression(exp:\int(ivalue),Type req,TENV env)=
	req==integer() ?
	env : 
	addError(env, exp@location, requiredMsg(req,integer()));

TENV checkExpression(exp:"string"(strValue),Type req,TENV env)=
	req==string() ? 
	env : 
	addError(env, exp@location, requiredMsg(req,string()));

TENV checkExpression(expr:"boolean"(bValue),Type req,TENV env)=
	req==boolean() ? 
	env : 
	addError(env, expr@location,requiredMsg(req,boolean()));

TENV checkExpression(exp:ident(name),Type req,TENV env){
	bool declaredIdent=false; 
	Type idType=integer();
	
	for(tup<-env.symbols){
		if(tup.variableName==name){
			declaredIdent=true;
			idType=tup.variableType;
		}
	}
	
	if(!declaredIdent) return addError(env,exp@location,"Undeclared identifier <name>");
	
	return req==idType ? env : addError(env,exp@location,requiredMsg(req,idType));
}

TENV checkExpression(exp:eq(eqLeft,eqRight),Type req,TENV env)=
	req==boolean()||req==string()||req==integer() ? 
	checkExpression(eqLeft,req,checkExpression(eqRight,req,env)) :
	addError(env, exp@location, requiredMsg(req));

TENV checkExpression(exp:neq(eqLeft,eqRight),Type req,TENV env)=
	req==boolean() ? 
	checkExpression(eqLeft,integer(),checkExpression(eqRight,integer(),env)) : 
	addError(env, exp@location, requiredMsg(req));

TENV checkExpression(exp:lt(ltLeft,ltRight),Type req,TENV env)=
	req==boolean() ? 
	checkExpression(ltLeft,integer(),checkExpression(ltRight,integer(),env)) : 
	addError(env, exp@location, requiredMsg(integer()));

TENV checkExpression(exp:leq(ltLeft,ltRight),Type req,TENV env)=
	req==boolean() ? 
	checkExpression(ltLeft,integer(),checkExpression(ltRight,integer(),env)) : 
	addError(env, exp@location, requiredMsg(integer()));

TENV checkExpression(exp:gt(ltLeft,ltRight),Type req,TENV env) =
	req==boolean() ? 
	checkExpression(ltLeft,integer(),checkExpression(ltRight,integer(),env)) : 
	addError(env, exp@location, requiredMsg(integer()));

TENV checkExpression(exp:geq(ltLeft,ltRight),Type req,TENV env)=
	req==boolean() ? 
	checkExpression(ltLeft,integer(),checkExpression(ltRight,integer(),env)) : 
	addError(env, exp@location, requiredMsg(integer()));

TENV checkExpression(exp:and(andLeft,andRight),Type req,TENV env)=
	req==boolean() ? 
	checkExpression(andLeft,req,checkExpression(andRight,req,env)) : 
	addError(env, exp@location, requiredMsg(boolean(),"in conditions",req));

TENV checkExpression(exp:or(orLeft, orRight),Type req,TENV env)=
	req==boolean() ? 
	checkExpression(orLeft,req,checkExpression(orRight,req,env)) : 
	addError(env, exp@location, requiredMsg(boolean(),"in conditions",req));

TENV checkExpression(exp:not(notValue),Type req,TENV env)=
	req==boolean() ? 
	checkExpression(notValue,req,env) : 
	addError(env, exp@location, requiredMsg(boolean(),"in conditions",req));

TENV checkExpression(exp:neg(negValue),Type req,TENV env)=
	req==integer() ? 
	checkExpression(negValue,req,env) : 
	addError(env, exp@location,requiredMsg(integer(),"in arithmetic operations",req));

TENV checkExpression(exp:pos(posValue),Type req,TENV env)=
	req==integer() ? 
	checkExpression(posValue,req,env) : 
	addError(env, exp@location,requiredMsg(integer(),"in arithmetic operations",req));

TENV checkExpression(exp:add(addLeft,addRight),Type req,TENV env)=
	req==integer() || req== string() ? 
	checkExpression(addLeft,req,checkExpression(addRight,req,env)) : 
	addError(env, exp@location, "Required <req>. Both should be the same type .");

TENV checkExpression(exp:mul(multLeft,multRight),Type req,TENV env)=
	req==integer() ? 
	checkExpression(multLeft,req,checkExpression(multRight,req,env)) : 
	addError(env, exp@location, requiredMsg(integer(),"in arithmetic operations",req));

TENV checkExpression(exp:div(divLeft,divRight),Type req,TENV env)=
	req==integer() ? 
	checkExpression(divLeft,req,checkExpression(divRight,req,env)) : 
	addError(env, exp@location, requiredMsg(integer(),"in arithmetic operations",req));

TENV checkExpression(exp:sub(subLeft,subRight),Type req,TENV env)=
	req==integer() ? 
	checkExpression(subLeft,req,checkExpression(subRight,req,env)) : 
	addError(env, exp@location, requiredMsg(integer(),"in arithmetic operations",req));