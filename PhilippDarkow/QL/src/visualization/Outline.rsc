module visualization::Outline

import syntax::AbstractSyntax;
import Prelude;

public alias Outline = tuple[list[node] questions,list[node] statements] ;

//addInstance(Outline out, str id, str questionLabel, Type tp, bool isComputed) = out[questions = out.questions + id];

//addInstance(QLTENV qlTenv, str id, str questionLabel, Type tp, bool isComputed) = qlTenv[question = qlTenv.question + {<id,questionLabel,tp,isComputed>}];

public node outline(program(id,Body)){
	println("in outline <Body>");
	Outline outlineList = <[],[]>;
	list[node] b = [];
	b = outlineBody(Body, b);
	if(id == ""){
		println("OUTLINE THAT");
		return id;
	}
	println("B is : <b>");
	node k = "form"(b);
	println("KKKK : <k>");
	//node all = "form";
	return k;	
}

list[node] outlineBody(list[Body] body, list[node] outlineList){
	println("In outline BODY <body>");
	for(k <- body){
	println("S : <k>");
		top-down visit(k) {
			case Question q : {
				outlineList += outline(q, outlineList);
			}
			case Statement s : {
				outlineList += outline(s, outlineList);
			}
		}
	}
	return outlineList;
}

Outline outlineBody(list[Body] body, Outline outlineList){
	println("In outline BODY <body>");
	for(k <- body){
	println("S : <k>");
		top-down visit(s) {
			case Question q : {
				outlineList += outline(q, outlineList);
			}
			case Statement s : {
				outlineList += outline(s, outlineList);
			}
		}
	}
}

node outline(question:easyQuestion(str id, str labelQuestion, Type tp), list[node] outlineList){
	println("In outline easy : <question>");
	return question;
}

node outline(question:easyQuestion(str id, str labelQuestion, Type tp), Outline outlineList){
	println("In outline easy : <question>");
	return question;
}

Outline outline(question:computedQuestion(str id, str labelQuestion, Type tp,Expression exp ), Outline outlineList){
	println("In outline computed : <question>");
}

node outline(question:computedQuestion(str id, str labelQuestion, Type tp,Expression exp ), list[node] outlineList){
	println("In outline computed : <question>");
	return question;
}

Outline outline(statement:ifStat(Expression exp, list[Body] body), Outline outlineList){
	println("In outline ifStat : <question>");
	return statement;	
}

node outline(statement:ifStat(Expression exp, list[Body] body), list[node] outlineList){
	println("In outline ifStat : <statement>");
	return statement;	
}

Outline outline(statement:ifElseStat(Expression exp, list[Body] thenpart, list[Body] elsepart), Outline outlineList){
	println("In outline ifElseStat : <question>");	
}