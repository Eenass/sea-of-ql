module lang::ql::tests::expressions::Int

import lang::ql::ast::AST;
import lang::ql::tests::expressions::ParseHelper;

public test bool testInt1() = parse("0") is \int;
public test bool testInt2() = parse("1223") is \int;
public test bool testInt3() = parse("234234234") is \int;
public test bool testInt3() = parse("234234234929922091319024209190246420919024420913190242911902442919024") is \int;
