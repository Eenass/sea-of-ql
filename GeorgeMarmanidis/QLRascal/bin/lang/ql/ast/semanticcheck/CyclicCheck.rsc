module lang::ql::ast::semanticcheck::CyclicCheck

import lang::ql::ast::AST;
import lang::ql::ast::semanticcheck::TypeEnvUtils;
import IO;

public TENV checkCyclicDepen(list[FormBodyItem] formBodyItems,TENV env){
	visit(formBodyItems){
		case X:ident(str name): env=checkCyclicIdent(name,X@location,env);
	}
	return env;	

}

TENV checkCyclicIdent(str identName, loc exprLocation,TENV env){
	for(x<-env.symbols){
		if(identName==x.variableName){
			if(x.queLocation.begin.line<exprLocation.begin.line){
			 return env;
			 }
			 env=addError(env,exprLocation,"Cyclic problem intentified.Variable <x.variableName> must be declared first.");
		}
	}
	return env;
}