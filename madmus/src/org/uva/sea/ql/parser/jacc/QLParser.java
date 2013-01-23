// Output created by jacc on Mon Jan 21 15:01:19 CET 2013

package org.uva.sea.ql.parser.jacc;

import org.uva.sea.ql.ast.*;
import org.uva.sea.ql.ast.operators.binary.logical.*;
import org.uva.sea.ql.ast.operators.binary.numeric.*;
import org.uva.sea.ql.ast.operators.binary.relational.*;
import org.uva.sea.ql.ast.operators.unary.*;

class QLParser implements QLTokens {
    private int yyss = 100;
    private int yytok;
    private int yysp = 0;
    private int[] yyst;
    protected int yyerrno = (-1);
    private org.uva.sea.ql.ast.ASTNode[] yysv;
    private org.uva.sea.ql.ast.ASTNode yyrv;

    public boolean parse() {
        int yyn = 0;
        yysp = 0;
        yyst = new int[yyss];
        yysv = new org.uva.sea.ql.ast.ASTNode[yyss];
        yytok = (lexer.getToken()
                 );
    loop:
        for (;;) {
            switch (yyn) {
                case 0:
                    yyst[yysp] = 0;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 44:
                    switch (yytok) {
                        case FORM:
                            yyn = 3;
                            continue;
                    }
                    yyn = 91;
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 45:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 88;
                            continue;
                    }
                    yyn = 91;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 46:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr1();
                            continue;
                    }
                    yyn = 91;
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 47:
                    switch (yytok) {
                        case IDENT:
                            yyn = 4;
                            continue;
                    }
                    yyn = 91;
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 48:
                    switch (yytok) {
                        case '{':
                            yyn = 5;
                            continue;
                    }
                    yyn = 91;
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 49:
                    yyn = yys5();
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 50:
                    switch (yytok) {
                        case '}':
                            yyn = 14;
                            continue;
                    }
                    yyn = 91;
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 51:
                    yyn = yys7();
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 52:
                    yyn = yys8();
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 53:
                    yyn = yys9();
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 54:
                    yyn = yys10();
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 55:
                    yyn = yys11();
                    continue;

                case 12:
                    yyst[yysp] = 12;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 56:
                    yyn = yys12();
                    continue;

                case 13:
                    yyst[yysp] = 13;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 57:
                    yyn = yys13();
                    continue;

                case 14:
                    yyst[yysp] = 14;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 58:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr2();
                            continue;
                    }
                    yyn = 91;
                    continue;

                case 15:
                    yyst[yysp] = 15;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 59:
                    yyn = yys15();
                    continue;

                case 16:
                    yyst[yysp] = 16;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 60:
                    yyn = yys16();
                    continue;

                case 17:
                    yyst[yysp] = 17;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 61:
                    yyn = yys17();
                    continue;

                case 18:
                    yyst[yysp] = 18;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 62:
                    yyn = yys18();
                    continue;

                case 19:
                    yyst[yysp] = 19;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 63:
                    yyn = yys19();
                    continue;

                case 20:
                    yyst[yysp] = 20;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 64:
                    yyn = yys20();
                    continue;

                case 21:
                    yyst[yysp] = 21;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 65:
                    yyn = yys21();
                    continue;

                case 22:
                    yyst[yysp] = 22;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 66:
                    yyn = yys22();
                    continue;

                case 23:
                    yyst[yysp] = 23;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 67:
                    yyn = yys23();
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 68:
                    yyn = yys24();
                    continue;

                case 25:
                    yyst[yysp] = 25;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 69:
                    yyn = yys25();
                    continue;

                case 26:
                    yyst[yysp] = 26;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 70:
                    yyn = yys26();
                    continue;

                case 27:
                    yyst[yysp] = 27;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 71:
                    yyn = yys27();
                    continue;

                case 28:
                    yyst[yysp] = 28;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 72:
                    yyn = yys28();
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 73:
                    yyn = yys29();
                    continue;

                case 30:
                    yyst[yysp] = 30;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 74:
                    yyn = yys30();
                    continue;

                case 31:
                    yyst[yysp] = 31;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 75:
                    yyn = yys31();
                    continue;

                case 32:
                    yyst[yysp] = 32;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 76:
                    yyn = yys32();
                    continue;

                case 33:
                    yyst[yysp] = 33;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 77:
                    yyn = yys33();
                    continue;

                case 34:
                    yyst[yysp] = 34;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 78:
                    yyn = yys34();
                    continue;

                case 35:
                    yyst[yysp] = 35;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 79:
                    yyn = yys35();
                    continue;

                case 36:
                    yyst[yysp] = 36;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 80:
                    yyn = yys36();
                    continue;

                case 37:
                    yyst[yysp] = 37;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 81:
                    yyn = yys37();
                    continue;

                case 38:
                    yyst[yysp] = 38;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 82:
                    yyn = yys38();
                    continue;

                case 39:
                    yyst[yysp] = 39;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 83:
                    yyn = yys39();
                    continue;

                case 40:
                    yyst[yysp] = 40;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 84:
                    yyn = yys40();
                    continue;

                case 41:
                    yyst[yysp] = 41;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 85:
                    yyn = yys41();
                    continue;

                case 42:
                    yyst[yysp] = 42;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 86:
                    yyn = yys42();
                    continue;

                case 43:
                    yyst[yysp] = 43;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 87:
                    yyn = yys43();
                    continue;

                case 88:
                    return true;
                case 89:
                    yyerror("stack overflow");
                case 90:
                    return false;
                case 91:
                    yyerror("syntax error");
                    return false;
            }
        }
    }

    protected void yyexpand() {
        int[] newyyst = new int[2*yyst.length];
        org.uva.sea.ql.ast.ASTNode[] newyysv = new org.uva.sea.ql.ast.ASTNode[2*yyst.length];
        for (int i=0; i<yyst.length; i++) {
            newyyst[i] = yyst[i];
            newyysv[i] = yysv[i];
        }
        yyst = newyyst;
        yysv = newyysv;
    }

    private int yys5() {
        switch (yytok) {
            case IDENT:
                return 8;
            case INT:
                return 9;
            case '!':
                return 10;
            case '(':
                return 11;
            case '+':
                return 12;
            case '-':
                return 13;
        }
        return 91;
    }

    private int yys7() {
        switch (yytok) {
            case AND:
                return 15;
            case EQ:
                return 16;
            case GEQ:
                return 17;
            case LEQ:
                return 18;
            case NEQ:
                return 19;
            case OR:
                return 20;
            case '*':
                return 21;
            case '+':
                return 22;
            case '-':
                return 23;
            case '/':
                return 24;
            case '<':
                return 25;
            case '>':
                return 26;
            case '}':
                return yyr5();
        }
        return 91;
    }

    private int yys8() {
        switch (yytok) {
            case '}':
            case '>':
            case '<':
            case '/':
            case OR:
            case GEQ:
            case '-':
            case '+':
            case NEQ:
            case '*':
            case ')':
            case LEQ:
            case EQ:
            case AND:
                return yyr22();
        }
        return 91;
    }

    private int yys9() {
        switch (yytok) {
            case '}':
            case '>':
            case '<':
            case '/':
            case OR:
            case GEQ:
            case '-':
            case '+':
            case NEQ:
            case '*':
            case ')':
            case LEQ:
            case EQ:
            case AND:
                return yyr21();
        }
        return 91;
    }

    private int yys10() {
        switch (yytok) {
            case IDENT:
                return 8;
            case INT:
                return 9;
            case '!':
                return 10;
            case '(':
                return 11;
            case '+':
                return 12;
            case '-':
                return 13;
        }
        return 91;
    }

    private int yys11() {
        switch (yytok) {
            case IDENT:
                return 8;
            case INT:
                return 9;
            case '!':
                return 10;
            case '(':
                return 11;
            case '+':
                return 12;
            case '-':
                return 13;
        }
        return 91;
    }

    private int yys12() {
        switch (yytok) {
            case IDENT:
                return 8;
            case INT:
                return 9;
            case '!':
                return 10;
            case '(':
                return 11;
            case '+':
                return 12;
            case '-':
                return 13;
        }
        return 91;
    }

    private int yys13() {
        switch (yytok) {
            case IDENT:
                return 8;
            case INT:
                return 9;
            case '!':
                return 10;
            case '(':
                return 11;
            case '+':
                return 12;
            case '-':
                return 13;
        }
        return 91;
    }

    private int yys15() {
        switch (yytok) {
            case IDENT:
                return 8;
            case INT:
                return 9;
            case '!':
                return 10;
            case '(':
                return 11;
            case '+':
                return 12;
            case '-':
                return 13;
        }
        return 91;
    }

    private int yys16() {
        switch (yytok) {
            case IDENT:
                return 8;
            case INT:
                return 9;
            case '!':
                return 10;
            case '(':
                return 11;
            case '+':
                return 12;
            case '-':
                return 13;
        }
        return 91;
    }

    private int yys17() {
        switch (yytok) {
            case IDENT:
                return 8;
            case INT:
                return 9;
            case '!':
                return 10;
            case '(':
                return 11;
            case '+':
                return 12;
            case '-':
                return 13;
        }
        return 91;
    }

    private int yys18() {
        switch (yytok) {
            case IDENT:
                return 8;
            case INT:
                return 9;
            case '!':
                return 10;
            case '(':
                return 11;
            case '+':
                return 12;
            case '-':
                return 13;
        }
        return 91;
    }

    private int yys19() {
        switch (yytok) {
            case IDENT:
                return 8;
            case INT:
                return 9;
            case '!':
                return 10;
            case '(':
                return 11;
            case '+':
                return 12;
            case '-':
                return 13;
        }
        return 91;
    }

    private int yys20() {
        switch (yytok) {
            case IDENT:
                return 8;
            case INT:
                return 9;
            case '!':
                return 10;
            case '(':
                return 11;
            case '+':
                return 12;
            case '-':
                return 13;
        }
        return 91;
    }

    private int yys21() {
        switch (yytok) {
            case IDENT:
                return 8;
            case INT:
                return 9;
            case '!':
                return 10;
            case '(':
                return 11;
            case '+':
                return 12;
            case '-':
                return 13;
        }
        return 91;
    }

    private int yys22() {
        switch (yytok) {
            case IDENT:
                return 8;
            case INT:
                return 9;
            case '!':
                return 10;
            case '(':
                return 11;
            case '+':
                return 12;
            case '-':
                return 13;
        }
        return 91;
    }

    private int yys23() {
        switch (yytok) {
            case IDENT:
                return 8;
            case INT:
                return 9;
            case '!':
                return 10;
            case '(':
                return 11;
            case '+':
                return 12;
            case '-':
                return 13;
        }
        return 91;
    }

    private int yys24() {
        switch (yytok) {
            case IDENT:
                return 8;
            case INT:
                return 9;
            case '!':
                return 10;
            case '(':
                return 11;
            case '+':
                return 12;
            case '-':
                return 13;
        }
        return 91;
    }

    private int yys25() {
        switch (yytok) {
            case IDENT:
                return 8;
            case INT:
                return 9;
            case '!':
                return 10;
            case '(':
                return 11;
            case '+':
                return 12;
            case '-':
                return 13;
        }
        return 91;
    }

    private int yys26() {
        switch (yytok) {
            case IDENT:
                return 8;
            case INT:
                return 9;
            case '!':
                return 10;
            case '(':
                return 11;
            case '+':
                return 12;
            case '-':
                return 13;
        }
        return 91;
    }

    private int yys27() {
        switch (yytok) {
            case '}':
            case '>':
            case '<':
            case '/':
            case OR:
            case GEQ:
            case '-':
            case '+':
            case NEQ:
            case '*':
            case ')':
            case LEQ:
            case EQ:
            case AND:
                return yyr8();
        }
        return 91;
    }

    private int yys28() {
        switch (yytok) {
            case AND:
                return 15;
            case EQ:
                return 16;
            case GEQ:
                return 17;
            case LEQ:
                return 18;
            case NEQ:
                return 19;
            case OR:
                return 20;
            case '*':
                return 21;
            case '+':
                return 22;
            case '-':
                return 23;
            case '/':
                return 24;
            case '<':
                return 25;
            case '>':
                return 26;
            case ')':
                return 43;
        }
        return 91;
    }

    private int yys29() {
        switch (yytok) {
            case '}':
            case '>':
            case '<':
            case '/':
            case OR:
            case GEQ:
            case '-':
            case '+':
            case NEQ:
            case '*':
            case ')':
            case LEQ:
            case EQ:
            case AND:
                return yyr6();
        }
        return 91;
    }

    private int yys30() {
        switch (yytok) {
            case '}':
            case '>':
            case '<':
            case '/':
            case OR:
            case GEQ:
            case '-':
            case '+':
            case NEQ:
            case '*':
            case ')':
            case LEQ:
            case EQ:
            case AND:
                return yyr7();
        }
        return 91;
    }

    private int yys31() {
        switch (yytok) {
            case EQ:
                return 16;
            case GEQ:
                return 17;
            case LEQ:
                return 18;
            case NEQ:
                return 19;
            case '*':
                return 21;
            case '+':
                return 22;
            case '-':
                return 23;
            case '/':
                return 24;
            case '<':
                return 25;
            case '>':
                return 26;
            case '}':
            case OR:
            case ')':
            case AND:
                return yyr19();
        }
        return 91;
    }

    private int yys32() {
        switch (yytok) {
            case '*':
                return 21;
            case '+':
                return 22;
            case '-':
                return 23;
            case '/':
                return 24;
            case '}':
            case '>':
            case '<':
            case OR:
            case GEQ:
            case NEQ:
            case ')':
            case LEQ:
            case EQ:
            case AND:
                return yyr13();
        }
        return 91;
    }

    private int yys33() {
        switch (yytok) {
            case '*':
                return 21;
            case '+':
                return 22;
            case '-':
                return 23;
            case '/':
                return 24;
            case '}':
            case '>':
            case '<':
            case OR:
            case GEQ:
            case NEQ:
            case ')':
            case LEQ:
            case EQ:
            case AND:
                return yyr17();
        }
        return 91;
    }

    private int yys34() {
        switch (yytok) {
            case '*':
                return 21;
            case '+':
                return 22;
            case '-':
                return 23;
            case '/':
                return 24;
            case '}':
            case '>':
            case '<':
            case OR:
            case GEQ:
            case NEQ:
            case ')':
            case LEQ:
            case EQ:
            case AND:
                return yyr18();
        }
        return 91;
    }

    private int yys35() {
        switch (yytok) {
            case '*':
                return 21;
            case '+':
                return 22;
            case '-':
                return 23;
            case '/':
                return 24;
            case '}':
            case '>':
            case '<':
            case OR:
            case GEQ:
            case NEQ:
            case ')':
            case LEQ:
            case EQ:
            case AND:
                return yyr14();
        }
        return 91;
    }

    private int yys36() {
        switch (yytok) {
            case AND:
                return 15;
            case EQ:
                return 16;
            case GEQ:
                return 17;
            case LEQ:
                return 18;
            case NEQ:
                return 19;
            case '*':
                return 21;
            case '+':
                return 22;
            case '-':
                return 23;
            case '/':
                return 24;
            case '<':
                return 25;
            case '>':
                return 26;
            case '}':
            case OR:
            case ')':
                return yyr20();
        }
        return 91;
    }

    private int yys37() {
        switch (yytok) {
            case '}':
            case '>':
            case '<':
            case '/':
            case OR:
            case GEQ:
            case '-':
            case '+':
            case NEQ:
            case '*':
            case ')':
            case LEQ:
            case EQ:
            case AND:
                return yyr9();
        }
        return 91;
    }

    private int yys38() {
        switch (yytok) {
            case '*':
                return 21;
            case '/':
                return 24;
            case '}':
            case '>':
            case '<':
            case OR:
            case GEQ:
            case '-':
            case '+':
            case NEQ:
            case ')':
            case LEQ:
            case EQ:
            case AND:
                return yyr11();
        }
        return 91;
    }

    private int yys39() {
        switch (yytok) {
            case '*':
                return 21;
            case '/':
                return 24;
            case '}':
            case '>':
            case '<':
            case OR:
            case GEQ:
            case '-':
            case '+':
            case NEQ:
            case ')':
            case LEQ:
            case EQ:
            case AND:
                return yyr12();
        }
        return 91;
    }

    private int yys40() {
        switch (yytok) {
            case '}':
            case '>':
            case '<':
            case '/':
            case OR:
            case GEQ:
            case '-':
            case '+':
            case NEQ:
            case '*':
            case ')':
            case LEQ:
            case EQ:
            case AND:
                return yyr10();
        }
        return 91;
    }

    private int yys41() {
        switch (yytok) {
            case '*':
                return 21;
            case '+':
                return 22;
            case '-':
                return 23;
            case '/':
                return 24;
            case '}':
            case '>':
            case '<':
            case OR:
            case GEQ:
            case NEQ:
            case ')':
            case LEQ:
            case EQ:
            case AND:
                return yyr16();
        }
        return 91;
    }

    private int yys42() {
        switch (yytok) {
            case '*':
                return 21;
            case '+':
                return 22;
            case '-':
                return 23;
            case '/':
                return 24;
            case '}':
            case '>':
            case '<':
            case OR:
            case GEQ:
            case NEQ:
            case ')':
            case LEQ:
            case EQ:
            case AND:
                return yyr15();
        }
        return 91;
    }

    private int yys43() {
        switch (yytok) {
            case '}':
            case '>':
            case '<':
            case '/':
            case OR:
            case GEQ:
            case '-':
            case '+':
            case NEQ:
            case '*':
            case ')':
            case LEQ:
            case EQ:
            case AND:
                return yyr23();
        }
        return 91;
    }

    private int yyr1() { // top : form
        { result = yysv[yysp-1]; }
        yysv[yysp-=1] = yyrv;
        return 1;
    }

    private int yyr2() { // form : FORM IDENT '{' stmt '}'
        { yyrv = new Form(((Ident)yysv[yysp-4]), yysv[yysp-2]); }
        yysv[yysp-=5] = yyrv;
        return 2;
    }

    private int yyr5() { // stmt : expr
        yysp -= 1;
        return 6;
    }

    private int yyr6() { // expr : '+' expr
        { yyrv = new Pos(((Expr)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypexpr();
    }

    private int yyr7() { // expr : '-' expr
        { yyrv = new Neg(((Expr)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypexpr();
    }

    private int yyr8() { // expr : '!' expr
        { yyrv = new Not(((Expr)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypexpr();
    }

    private int yyr9() { // expr : expr '*' expr
        { yyrv = new Mul(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr10() { // expr : expr '/' expr
        { yyrv = new Div(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr11() { // expr : expr '+' expr
        { yyrv = new Add(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr12() { // expr : expr '-' expr
        { yyrv = new Sub(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr13() { // expr : expr EQ expr
        { yyrv = new Eq(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr14() { // expr : expr NEQ expr
        { yyrv = new NEq(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr15() { // expr : expr '>' expr
        { yyrv = new GT(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr16() { // expr : expr '<' expr
        { yyrv = new LT(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr17() { // expr : expr GEQ expr
        { yyrv = new GEq(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr18() { // expr : expr LEQ expr
        { yyrv = new LEq(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr19() { // expr : expr AND expr
        { yyrv = new And(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr20() { // expr : expr OR expr
        { yyrv = new Or(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr21() { // expr : INT
        { yyrv = ((Int)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypexpr();
    }

    private int yyr22() { // expr : IDENT
        { yyrv = ((Ident)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypexpr();
    }

    private int yyr23() { // expr : '(' expr ')'
        { yyrv = ((Expr)yysv[yysp-2]); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yypexpr() {
        switch (yyst[yysp-1]) {
            case 25: return 41;
            case 24: return 40;
            case 23: return 39;
            case 22: return 38;
            case 21: return 37;
            case 20: return 36;
            case 19: return 35;
            case 18: return 34;
            case 17: return 33;
            case 16: return 32;
            case 15: return 31;
            case 13: return 30;
            case 12: return 29;
            case 11: return 28;
            case 10: return 27;
            case 5: return 7;
            default: return 42;
        }
    }

    protected String[] yyerrmsgs = {
    };

private QLLexer lexer; 

private Expr result;

public Expr getResult() {
  return result;
}

public QLParser(QLLexer lexer) { 
  this.lexer = lexer; 
}

private void yyerror(String msg) { 
  System.err.println(msg); 
}

}
