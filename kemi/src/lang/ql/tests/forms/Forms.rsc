module lang::ql::tests::forms::Forms

import lang::ql::ast::AST;
import lang::ql::util::Parse;
import lang::ql::util::Implode;

import IO;

private Form p(str src) = implode(parse(src, |file:///-|));
private Form p(loc f) = implode(parse(readFile(f), |file:///-|));

public test bool testForm1() = p("form Hello { \"Income?\", money, myIncome }") is form;

public test bool testBasicForm() = p(|project://QL-R/src/lang/ql/tests/forms/examples/basic.q|) is form;
public test bool testCommentForm() = p(|project://QL-R/src/lang/ql/tests/forms/examples/comment.q|) is form;
public test bool testMultipleQuestions() = p(|project://QL-R/src/lang/ql/tests/forms/examples/multipleQuestions.q|) is form;
public test bool testIfCondition() = p(|project://QL-R/src/lang/ql/tests/forms/examples/ifCondition.q|) is form;
public test bool testIfElseCondition() = p(|project://QL-R/src/lang/ql/tests/forms/examples/ifElseCondition.q|) is form;
public test bool testCalculatedField() = p(|project://QL-R/src/lang/ql/tests/forms/examples/calculatedField.q|) is form;
