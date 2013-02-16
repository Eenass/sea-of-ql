// Output created by jacc on Sat Feb 16 14:25:08 CET 2013

package parser;

import ast.*;
import ast.expression.binary.*;
import ast.expression.unary.*;
import ast.expression.value.*;
import ast.statement.*;
@SuppressWarnings("unused")

class QLParser implements QLTokens {
    private int yyss = 100;
    private int yytok;
    private int yysp = 0;
    private int[] yyst;
    protected int yyerrno = (-1);
    private ast.ASTNode[] yysv;
    private ast.ASTNode yyrv;

    public boolean parse() {
        int yyn = 0;
        yysp = 0;
        yyst = new int[yyss];
        yysv = new ast.ASTNode[yyss];
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
                case 78:
                    switch (yytok) {
                        case FORM:
                            yyn = 3;
                            continue;
                    }
                    yyn = 159;
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 79:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 156;
                            continue;
                    }
                    yyn = 159;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 80:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr1();
                            continue;
                    }
                    yyn = 159;
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
                case 81:
                    switch (yytok) {
                        case IDENT:
                            yyn = 4;
                            continue;
                    }
                    yyn = 159;
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
                case 82:
                    switch (yytok) {
                        case '{':
                            yyn = 5;
                            continue;
                    }
                    yyn = 159;
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
                case 83:
                    switch (yytok) {
                        case IF:
                        case '}':
                        case IDENT:
                        case STR:
                            yyn = yyr3();
                            continue;
                    }
                    yyn = 159;
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 84:
                    switch (yytok) {
                        case IDENT:
                            yyn = 11;
                            continue;
                        case IF:
                            yyn = 12;
                            continue;
                        case STR:
                            yyn = 13;
                            continue;
                        case '}':
                            yyn = 14;
                            continue;
                    }
                    yyn = 159;
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 85:
                    switch (yytok) {
                        case IF:
                        case '}':
                        case IDENT:
                        case STR:
                            yyn = yyr7();
                            continue;
                    }
                    yyn = 159;
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 86:
                    switch (yytok) {
                        case IF:
                        case '}':
                        case IDENT:
                        case STR:
                            yyn = yyr8();
                            continue;
                    }
                    yyn = 159;
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 87:
                    switch (yytok) {
                        case ELSE:
                            yyn = 16;
                            continue;
                        case IF:
                        case '}':
                        case IDENT:
                        case STR:
                            yyn = yyr14();
                            continue;
                    }
                    yyn = 159;
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 88:
                    switch (yytok) {
                        case IF:
                        case '}':
                        case IDENT:
                        case STR:
                            yyn = yyr4();
                            continue;
                    }
                    yyn = 159;
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
                case 89:
                    switch (yytok) {
                        case ':':
                            yyn = 17;
                            continue;
                        case '=':
                            yyn = 18;
                            continue;
                    }
                    yyn = 159;
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
                case 90:
                    switch (yytok) {
                        case '(':
                            yyn = 19;
                            continue;
                    }
                    yyn = 159;
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
                case 91:
                    switch (yytok) {
                        case IDENT:
                            yyn = 21;
                            continue;
                    }
                    yyn = 159;
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
                case 92:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr2();
                            continue;
                    }
                    yyn = 159;
                    continue;

                case 15:
                    yyst[yysp] = 15;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 93:
                    switch (yytok) {
                        case IF:
                        case '}':
                        case IDENT:
                        case STR:
                            yyn = yyr13();
                            continue;
                    }
                    yyn = 159;
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
                case 94:
                    switch (yytok) {
                        case IF:
                            yyn = 12;
                            continue;
                        case '{':
                            yyn = 23;
                            continue;
                    }
                    yyn = 159;
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
                case 95:
                    switch (yytok) {
                        case tBool:
                            yyn = 25;
                            continue;
                        case tInt:
                            yyn = 26;
                            continue;
                        case tMoney:
                            yyn = 27;
                            continue;
                        case tStr:
                            yyn = 28;
                            continue;
                    }
                    yyn = 159;
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
                case 96:
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
                case 97:
                    yyn = yys19();
                    continue;

                case 20:
                    yyst[yysp] = 20;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 98:
                    switch (yytok) {
                        case IF:
                        case '}':
                        case IDENT:
                        case STR:
                            yyn = yyr5();
                            continue;
                    }
                    yyn = 159;
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
                case 99:
                    switch (yytok) {
                        case ':':
                            yyn = 17;
                            continue;
                    }
                    yyn = 159;
                    continue;

                case 22:
                    yyst[yysp] = 22;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 100:
                    switch (yytok) {
                        case IF:
                        case '}':
                        case IDENT:
                        case STR:
                            yyn = yyr12();
                            continue;
                    }
                    yyn = 159;
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
                case 101:
                    switch (yytok) {
                        case IF:
                        case '}':
                        case IDENT:
                        case STR:
                            yyn = yyr3();
                            continue;
                    }
                    yyn = 159;
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 102:
                    switch (yytok) {
                        case IF:
                        case '}':
                        case IDENT:
                        case STR:
                            yyn = yyr9();
                            continue;
                    }
                    yyn = 159;
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
                case 103:
                    switch (yytok) {
                        case IF:
                        case '}':
                        case IDENT:
                        case STR:
                            yyn = yyr39();
                            continue;
                    }
                    yyn = 159;
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
                case 104:
                    switch (yytok) {
                        case IF:
                        case '}':
                        case IDENT:
                        case STR:
                            yyn = yyr41();
                            continue;
                    }
                    yyn = 159;
                    continue;

                case 27:
                    yyst[yysp] = 27;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 105:
                    switch (yytok) {
                        case IF:
                        case '}':
                        case IDENT:
                        case STR:
                            yyn = yyr40();
                            continue;
                    }
                    yyn = 159;
                    continue;

                case 28:
                    yyst[yysp] = 28;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 106:
                    switch (yytok) {
                        case IF:
                        case '}':
                        case IDENT:
                        case STR:
                            yyn = yyr42();
                            continue;
                    }
                    yyn = 159;
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 107:
                    yyn = yys29();
                    continue;

                case 30:
                    yyst[yysp] = 30;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 108:
                    yyn = yys30();
                    continue;

                case 31:
                    yyst[yysp] = 31;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 109:
                    yyn = yys31();
                    continue;

                case 32:
                    yyst[yysp] = 32;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 110:
                    yyn = yys32();
                    continue;

                case 33:
                    yyst[yysp] = 33;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 111:
                    yyn = yys33();
                    continue;

                case 34:
                    yyst[yysp] = 34;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 112:
                    yyn = yys34();
                    continue;

                case 35:
                    yyst[yysp] = 35;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 113:
                    yyn = yys35();
                    continue;

                case 36:
                    yyst[yysp] = 36;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 114:
                    yyn = yys36();
                    continue;

                case 37:
                    yyst[yysp] = 37;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 115:
                    yyn = yys37();
                    continue;

                case 38:
                    yyst[yysp] = 38;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 116:
                    yyn = yys38();
                    continue;

                case 39:
                    yyst[yysp] = 39;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 117:
                    yyn = yys39();
                    continue;

                case 40:
                    yyst[yysp] = 40;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 118:
                    yyn = yys40();
                    continue;

                case 41:
                    yyst[yysp] = 41;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 119:
                    yyn = yys41();
                    continue;

                case 42:
                    yyst[yysp] = 42;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 120:
                    yyn = yys42();
                    continue;

                case 43:
                    yyst[yysp] = 43;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 121:
                    switch (yytok) {
                        case IDENT:
                            yyn = 11;
                            continue;
                        case IF:
                            yyn = 12;
                            continue;
                        case STR:
                            yyn = 13;
                            continue;
                        case '}':
                            yyn = 61;
                            continue;
                    }
                    yyn = 159;
                    continue;

                case 44:
                    yyst[yysp] = 44;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 122:
                    yyn = yys44();
                    continue;

                case 45:
                    yyst[yysp] = 45;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 123:
                    yyn = yys45();
                    continue;

                case 46:
                    yyst[yysp] = 46;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 124:
                    yyn = yys46();
                    continue;

                case 47:
                    yyst[yysp] = 47;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 125:
                    yyn = yys47();
                    continue;

                case 48:
                    yyst[yysp] = 48;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 126:
                    yyn = yys48();
                    continue;

                case 49:
                    yyst[yysp] = 49;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 127:
                    yyn = yys49();
                    continue;

                case 50:
                    yyst[yysp] = 50;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 128:
                    yyn = yys50();
                    continue;

                case 51:
                    yyst[yysp] = 51;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 129:
                    yyn = yys51();
                    continue;

                case 52:
                    yyst[yysp] = 52;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 130:
                    yyn = yys52();
                    continue;

                case 53:
                    yyst[yysp] = 53;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 131:
                    yyn = yys53();
                    continue;

                case 54:
                    yyst[yysp] = 54;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 132:
                    yyn = yys54();
                    continue;

                case 55:
                    yyst[yysp] = 55;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 133:
                    yyn = yys55();
                    continue;

                case 56:
                    yyst[yysp] = 56;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 134:
                    yyn = yys56();
                    continue;

                case 57:
                    yyst[yysp] = 57;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 135:
                    yyn = yys57();
                    continue;

                case 58:
                    yyst[yysp] = 58;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 136:
                    yyn = yys58();
                    continue;

                case 59:
                    yyst[yysp] = 59;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 137:
                    yyn = yys59();
                    continue;

                case 60:
                    yyst[yysp] = 60;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 138:
                    switch (yytok) {
                        case '{':
                            yyn = 75;
                            continue;
                    }
                    yyn = 159;
                    continue;

                case 61:
                    yyst[yysp] = 61;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 139:
                    switch (yytok) {
                        case IF:
                        case '}':
                        case IDENT:
                        case STR:
                            yyn = yyr11();
                            continue;
                    }
                    yyn = 159;
                    continue;

                case 62:
                    yyst[yysp] = 62;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 140:
                    yyn = yys62();
                    continue;

                case 63:
                    yyst[yysp] = 63;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 141:
                    yyn = yys63();
                    continue;

                case 64:
                    yyst[yysp] = 64;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 142:
                    yyn = yys64();
                    continue;

                case 65:
                    yyst[yysp] = 65;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 143:
                    yyn = yys65();
                    continue;

                case 66:
                    yyst[yysp] = 66;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 144:
                    yyn = yys66();
                    continue;

                case 67:
                    yyst[yysp] = 67;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 145:
                    yyn = yys67();
                    continue;

                case 68:
                    yyst[yysp] = 68;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 146:
                    yyn = yys68();
                    continue;

                case 69:
                    yyst[yysp] = 69;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 147:
                    yyn = yys69();
                    continue;

                case 70:
                    yyst[yysp] = 70;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 148:
                    yyn = yys70();
                    continue;

                case 71:
                    yyst[yysp] = 71;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 149:
                    yyn = yys71();
                    continue;

                case 72:
                    yyst[yysp] = 72;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 150:
                    yyn = yys72();
                    continue;

                case 73:
                    yyst[yysp] = 73;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 151:
                    yyn = yys73();
                    continue;

                case 74:
                    yyst[yysp] = 74;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 152:
                    yyn = yys74();
                    continue;

                case 75:
                    yyst[yysp] = 75;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 153:
                    switch (yytok) {
                        case IF:
                        case '}':
                        case IDENT:
                        case STR:
                            yyn = yyr3();
                            continue;
                    }
                    yyn = 159;
                    continue;

                case 76:
                    yyst[yysp] = 76;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 154:
                    switch (yytok) {
                        case IDENT:
                            yyn = 11;
                            continue;
                        case IF:
                            yyn = 12;
                            continue;
                        case STR:
                            yyn = 13;
                            continue;
                        case '}':
                            yyn = 77;
                            continue;
                    }
                    yyn = 159;
                    continue;

                case 77:
                    yyst[yysp] = 77;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 155:
                    switch (yytok) {
                        case ELSE:
                        case IF:
                        case '}':
                        case IDENT:
                        case STR:
                            yyn = yyr10();
                            continue;
                    }
                    yyn = 159;
                    continue;

                case 156:
                    return true;
                case 157:
                    yyerror("stack overflow");
                case 158:
                    return false;
                case 159:
                    yyerror("syntax error");
                    return false;
            }
        }
    }

    protected void yyexpand() {
        int[] newyyst = new int[2*yyst.length];
        ast.ASTNode[] newyysv = new ast.ASTNode[2*yyst.length];
        for (int i=0; i<yyst.length; i++) {
            newyyst[i] = yyst[i];
            newyysv[i] = yysv[i];
        }
        yyst = newyyst;
        yysv = newyysv;
    }

    private int yys18() {
        switch (yytok) {
            case BOOL:
                return 31;
            case FALSE:
                return 32;
            case IDENT:
                return 33;
            case INT:
                return 34;
            case MONEY:
                return 35;
            case STR:
                return 36;
            case TRUE:
                return 37;
            case '!':
                return 38;
            case '(':
                return 39;
            case '+':
                return 40;
            case '-':
                return 41;
        }
        return 159;
    }

    private int yys19() {
        switch (yytok) {
            case BOOL:
                return 31;
            case FALSE:
                return 32;
            case IDENT:
                return 33;
            case INT:
                return 34;
            case MONEY:
                return 35;
            case STR:
                return 36;
            case TRUE:
                return 37;
            case '!':
                return 38;
            case '(':
                return 39;
            case '+':
                return 40;
            case '-':
                return 41;
        }
        return 159;
    }

    private int yys29() {
        switch (yytok) {
            case AND:
                return 44;
            case EQ:
                return 45;
            case GEQ:
                return 46;
            case LEQ:
                return 47;
            case NEQ:
                return 48;
            case OR:
                return 49;
            case '*':
                return 50;
            case '+':
                return 51;
            case '-':
                return 52;
            case '/':
                return 53;
            case '<':
                return 54;
            case '>':
                return 55;
            case IF:
            case '}':
            case IDENT:
            case STR:
                return yyr6();
        }
        return 159;
    }

    private int yys30() {
        switch (yytok) {
            case OR:
            case ')':
            case NEQ:
            case LEQ:
            case IF:
            case '*':
            case '+':
            case EQ:
            case '}':
            case '>':
            case IDENT:
            case '<':
            case '/':
            case '-':
            case STR:
            case GEQ:
            case AND:
                return yyr31();
        }
        return 159;
    }

    private int yys31() {
        switch (yytok) {
            case OR:
            case ')':
            case NEQ:
            case LEQ:
            case IF:
            case '*':
            case '+':
            case EQ:
            case '}':
            case '>':
            case IDENT:
            case '<':
            case '/':
            case '-':
            case STR:
            case GEQ:
            case AND:
                return yyr34();
        }
        return 159;
    }

    private int yys32() {
        switch (yytok) {
            case OR:
            case ')':
            case NEQ:
            case LEQ:
            case IF:
            case '*':
            case '+':
            case EQ:
            case '}':
            case '>':
            case IDENT:
            case '<':
            case '/':
            case '-':
            case STR:
            case GEQ:
            case AND:
                return yyr36();
        }
        return 159;
    }

    private int yys33() {
        switch (yytok) {
            case OR:
            case ')':
            case NEQ:
            case LEQ:
            case IF:
            case '*':
            case '+':
            case EQ:
            case '}':
            case '>':
            case IDENT:
            case '<':
            case '/':
            case '-':
            case STR:
            case GEQ:
            case AND:
                return yyr38();
        }
        return 159;
    }

    private int yys34() {
        switch (yytok) {
            case OR:
            case ')':
            case NEQ:
            case LEQ:
            case IF:
            case '*':
            case '+':
            case EQ:
            case '}':
            case '>':
            case IDENT:
            case '<':
            case '/':
            case '-':
            case STR:
            case GEQ:
            case AND:
                return yyr32();
        }
        return 159;
    }

    private int yys35() {
        switch (yytok) {
            case OR:
            case ')':
            case NEQ:
            case LEQ:
            case IF:
            case '*':
            case '+':
            case EQ:
            case '}':
            case '>':
            case IDENT:
            case '<':
            case '/':
            case '-':
            case STR:
            case GEQ:
            case AND:
                return yyr33();
        }
        return 159;
    }

    private int yys36() {
        switch (yytok) {
            case OR:
            case ')':
            case NEQ:
            case LEQ:
            case IF:
            case '*':
            case '+':
            case EQ:
            case '}':
            case '>':
            case IDENT:
            case '<':
            case '/':
            case '-':
            case STR:
            case GEQ:
            case AND:
                return yyr37();
        }
        return 159;
    }

    private int yys37() {
        switch (yytok) {
            case OR:
            case ')':
            case NEQ:
            case LEQ:
            case IF:
            case '*':
            case '+':
            case EQ:
            case '}':
            case '>':
            case IDENT:
            case '<':
            case '/':
            case '-':
            case STR:
            case GEQ:
            case AND:
                return yyr35();
        }
        return 159;
    }

    private int yys38() {
        switch (yytok) {
            case BOOL:
                return 31;
            case FALSE:
                return 32;
            case IDENT:
                return 33;
            case INT:
                return 34;
            case MONEY:
                return 35;
            case STR:
                return 36;
            case TRUE:
                return 37;
            case '!':
                return 38;
            case '(':
                return 39;
            case '+':
                return 40;
            case '-':
                return 41;
        }
        return 159;
    }

    private int yys39() {
        switch (yytok) {
            case BOOL:
                return 31;
            case FALSE:
                return 32;
            case IDENT:
                return 33;
            case INT:
                return 34;
            case MONEY:
                return 35;
            case STR:
                return 36;
            case TRUE:
                return 37;
            case '!':
                return 38;
            case '(':
                return 39;
            case '+':
                return 40;
            case '-':
                return 41;
        }
        return 159;
    }

    private int yys40() {
        switch (yytok) {
            case BOOL:
                return 31;
            case FALSE:
                return 32;
            case IDENT:
                return 33;
            case INT:
                return 34;
            case MONEY:
                return 35;
            case STR:
                return 36;
            case TRUE:
                return 37;
            case '!':
                return 38;
            case '(':
                return 39;
            case '+':
                return 40;
            case '-':
                return 41;
        }
        return 159;
    }

    private int yys41() {
        switch (yytok) {
            case BOOL:
                return 31;
            case FALSE:
                return 32;
            case IDENT:
                return 33;
            case INT:
                return 34;
            case MONEY:
                return 35;
            case STR:
                return 36;
            case TRUE:
                return 37;
            case '!':
                return 38;
            case '(':
                return 39;
            case '+':
                return 40;
            case '-':
                return 41;
        }
        return 159;
    }

    private int yys42() {
        switch (yytok) {
            case AND:
                return 44;
            case EQ:
                return 45;
            case GEQ:
                return 46;
            case LEQ:
                return 47;
            case NEQ:
                return 48;
            case OR:
                return 49;
            case '*':
                return 50;
            case '+':
                return 51;
            case '-':
                return 52;
            case '/':
                return 53;
            case '<':
                return 54;
            case '>':
                return 55;
            case ')':
                return 60;
        }
        return 159;
    }

    private int yys44() {
        switch (yytok) {
            case BOOL:
                return 31;
            case FALSE:
                return 32;
            case IDENT:
                return 33;
            case INT:
                return 34;
            case MONEY:
                return 35;
            case STR:
                return 36;
            case TRUE:
                return 37;
            case '!':
                return 38;
            case '(':
                return 39;
            case '+':
                return 40;
            case '-':
                return 41;
        }
        return 159;
    }

    private int yys45() {
        switch (yytok) {
            case BOOL:
                return 31;
            case FALSE:
                return 32;
            case IDENT:
                return 33;
            case INT:
                return 34;
            case MONEY:
                return 35;
            case STR:
                return 36;
            case TRUE:
                return 37;
            case '!':
                return 38;
            case '(':
                return 39;
            case '+':
                return 40;
            case '-':
                return 41;
        }
        return 159;
    }

    private int yys46() {
        switch (yytok) {
            case BOOL:
                return 31;
            case FALSE:
                return 32;
            case IDENT:
                return 33;
            case INT:
                return 34;
            case MONEY:
                return 35;
            case STR:
                return 36;
            case TRUE:
                return 37;
            case '!':
                return 38;
            case '(':
                return 39;
            case '+':
                return 40;
            case '-':
                return 41;
        }
        return 159;
    }

    private int yys47() {
        switch (yytok) {
            case BOOL:
                return 31;
            case FALSE:
                return 32;
            case IDENT:
                return 33;
            case INT:
                return 34;
            case MONEY:
                return 35;
            case STR:
                return 36;
            case TRUE:
                return 37;
            case '!':
                return 38;
            case '(':
                return 39;
            case '+':
                return 40;
            case '-':
                return 41;
        }
        return 159;
    }

    private int yys48() {
        switch (yytok) {
            case BOOL:
                return 31;
            case FALSE:
                return 32;
            case IDENT:
                return 33;
            case INT:
                return 34;
            case MONEY:
                return 35;
            case STR:
                return 36;
            case TRUE:
                return 37;
            case '!':
                return 38;
            case '(':
                return 39;
            case '+':
                return 40;
            case '-':
                return 41;
        }
        return 159;
    }

    private int yys49() {
        switch (yytok) {
            case BOOL:
                return 31;
            case FALSE:
                return 32;
            case IDENT:
                return 33;
            case INT:
                return 34;
            case MONEY:
                return 35;
            case STR:
                return 36;
            case TRUE:
                return 37;
            case '!':
                return 38;
            case '(':
                return 39;
            case '+':
                return 40;
            case '-':
                return 41;
        }
        return 159;
    }

    private int yys50() {
        switch (yytok) {
            case BOOL:
                return 31;
            case FALSE:
                return 32;
            case IDENT:
                return 33;
            case INT:
                return 34;
            case MONEY:
                return 35;
            case STR:
                return 36;
            case TRUE:
                return 37;
            case '!':
                return 38;
            case '(':
                return 39;
            case '+':
                return 40;
            case '-':
                return 41;
        }
        return 159;
    }

    private int yys51() {
        switch (yytok) {
            case BOOL:
                return 31;
            case FALSE:
                return 32;
            case IDENT:
                return 33;
            case INT:
                return 34;
            case MONEY:
                return 35;
            case STR:
                return 36;
            case TRUE:
                return 37;
            case '!':
                return 38;
            case '(':
                return 39;
            case '+':
                return 40;
            case '-':
                return 41;
        }
        return 159;
    }

    private int yys52() {
        switch (yytok) {
            case BOOL:
                return 31;
            case FALSE:
                return 32;
            case IDENT:
                return 33;
            case INT:
                return 34;
            case MONEY:
                return 35;
            case STR:
                return 36;
            case TRUE:
                return 37;
            case '!':
                return 38;
            case '(':
                return 39;
            case '+':
                return 40;
            case '-':
                return 41;
        }
        return 159;
    }

    private int yys53() {
        switch (yytok) {
            case BOOL:
                return 31;
            case FALSE:
                return 32;
            case IDENT:
                return 33;
            case INT:
                return 34;
            case MONEY:
                return 35;
            case STR:
                return 36;
            case TRUE:
                return 37;
            case '!':
                return 38;
            case '(':
                return 39;
            case '+':
                return 40;
            case '-':
                return 41;
        }
        return 159;
    }

    private int yys54() {
        switch (yytok) {
            case BOOL:
                return 31;
            case FALSE:
                return 32;
            case IDENT:
                return 33;
            case INT:
                return 34;
            case MONEY:
                return 35;
            case STR:
                return 36;
            case TRUE:
                return 37;
            case '!':
                return 38;
            case '(':
                return 39;
            case '+':
                return 40;
            case '-':
                return 41;
        }
        return 159;
    }

    private int yys55() {
        switch (yytok) {
            case BOOL:
                return 31;
            case FALSE:
                return 32;
            case IDENT:
                return 33;
            case INT:
                return 34;
            case MONEY:
                return 35;
            case STR:
                return 36;
            case TRUE:
                return 37;
            case '!':
                return 38;
            case '(':
                return 39;
            case '+':
                return 40;
            case '-':
                return 41;
        }
        return 159;
    }

    private int yys56() {
        switch (yytok) {
            case OR:
            case ')':
            case NEQ:
            case LEQ:
            case IF:
            case '*':
            case '+':
            case EQ:
            case '}':
            case '>':
            case IDENT:
            case '<':
            case '/':
            case '-':
            case STR:
            case GEQ:
            case AND:
                return yyr17();
        }
        return 159;
    }

    private int yys57() {
        switch (yytok) {
            case AND:
                return 44;
            case EQ:
                return 45;
            case GEQ:
                return 46;
            case LEQ:
                return 47;
            case NEQ:
                return 48;
            case OR:
                return 49;
            case '*':
                return 50;
            case '+':
                return 51;
            case '-':
                return 52;
            case '/':
                return 53;
            case '<':
                return 54;
            case '>':
                return 55;
            case ')':
                return 74;
        }
        return 159;
    }

    private int yys58() {
        switch (yytok) {
            case OR:
            case ')':
            case NEQ:
            case LEQ:
            case IF:
            case '*':
            case '+':
            case EQ:
            case '}':
            case '>':
            case IDENT:
            case '<':
            case '/':
            case '-':
            case STR:
            case GEQ:
            case AND:
                return yyr15();
        }
        return 159;
    }

    private int yys59() {
        switch (yytok) {
            case OR:
            case ')':
            case NEQ:
            case LEQ:
            case IF:
            case '*':
            case '+':
            case EQ:
            case '}':
            case '>':
            case IDENT:
            case '<':
            case '/':
            case '-':
            case STR:
            case GEQ:
            case AND:
                return yyr16();
        }
        return 159;
    }

    private int yys62() {
        switch (yytok) {
            case EQ:
                return 45;
            case GEQ:
                return 46;
            case LEQ:
                return 47;
            case NEQ:
                return 48;
            case '*':
                return 50;
            case '+':
                return 51;
            case '-':
                return 52;
            case '/':
                return 53;
            case '<':
                return 54;
            case '>':
                return 55;
            case OR:
            case ')':
            case IF:
            case '}':
            case IDENT:
            case STR:
            case AND:
                return yyr28();
        }
        return 159;
    }

    private int yys63() {
        switch (yytok) {
            case '*':
                return 50;
            case '+':
                return 51;
            case '-':
                return 52;
            case '/':
                return 53;
            case OR:
            case ')':
            case NEQ:
            case LEQ:
            case IF:
            case EQ:
            case '}':
            case '>':
            case IDENT:
            case '<':
            case STR:
            case GEQ:
            case AND:
                return yyr22();
        }
        return 159;
    }

    private int yys64() {
        switch (yytok) {
            case '*':
                return 50;
            case '+':
                return 51;
            case '-':
                return 52;
            case '/':
                return 53;
            case OR:
            case ')':
            case NEQ:
            case LEQ:
            case IF:
            case EQ:
            case '}':
            case '>':
            case IDENT:
            case '<':
            case STR:
            case GEQ:
            case AND:
                return yyr26();
        }
        return 159;
    }

    private int yys65() {
        switch (yytok) {
            case '*':
                return 50;
            case '+':
                return 51;
            case '-':
                return 52;
            case '/':
                return 53;
            case OR:
            case ')':
            case NEQ:
            case LEQ:
            case IF:
            case EQ:
            case '}':
            case '>':
            case IDENT:
            case '<':
            case STR:
            case GEQ:
            case AND:
                return yyr27();
        }
        return 159;
    }

    private int yys66() {
        switch (yytok) {
            case '*':
                return 50;
            case '+':
                return 51;
            case '-':
                return 52;
            case '/':
                return 53;
            case OR:
            case ')':
            case NEQ:
            case LEQ:
            case IF:
            case EQ:
            case '}':
            case '>':
            case IDENT:
            case '<':
            case STR:
            case GEQ:
            case AND:
                return yyr23();
        }
        return 159;
    }

    private int yys67() {
        switch (yytok) {
            case AND:
                return 44;
            case EQ:
                return 45;
            case GEQ:
                return 46;
            case LEQ:
                return 47;
            case NEQ:
                return 48;
            case '*':
                return 50;
            case '+':
                return 51;
            case '-':
                return 52;
            case '/':
                return 53;
            case '<':
                return 54;
            case '>':
                return 55;
            case OR:
            case ')':
            case IF:
            case '}':
            case IDENT:
            case STR:
                return yyr29();
        }
        return 159;
    }

    private int yys68() {
        switch (yytok) {
            case OR:
            case ')':
            case NEQ:
            case LEQ:
            case IF:
            case '*':
            case '+':
            case EQ:
            case '}':
            case '>':
            case IDENT:
            case '<':
            case '/':
            case '-':
            case STR:
            case GEQ:
            case AND:
                return yyr18();
        }
        return 159;
    }

    private int yys69() {
        switch (yytok) {
            case '*':
                return 50;
            case '/':
                return 53;
            case OR:
            case ')':
            case NEQ:
            case LEQ:
            case '+':
            case IF:
            case EQ:
            case '}':
            case '>':
            case IDENT:
            case '<':
            case '-':
            case STR:
            case GEQ:
            case AND:
                return yyr20();
        }
        return 159;
    }

    private int yys70() {
        switch (yytok) {
            case '*':
                return 50;
            case '/':
                return 53;
            case OR:
            case ')':
            case NEQ:
            case LEQ:
            case '+':
            case IF:
            case EQ:
            case '}':
            case '>':
            case IDENT:
            case '<':
            case '-':
            case STR:
            case GEQ:
            case AND:
                return yyr21();
        }
        return 159;
    }

    private int yys71() {
        switch (yytok) {
            case OR:
            case ')':
            case NEQ:
            case LEQ:
            case IF:
            case '*':
            case '+':
            case EQ:
            case '}':
            case '>':
            case IDENT:
            case '<':
            case '/':
            case '-':
            case STR:
            case GEQ:
            case AND:
                return yyr19();
        }
        return 159;
    }

    private int yys72() {
        switch (yytok) {
            case '*':
                return 50;
            case '+':
                return 51;
            case '-':
                return 52;
            case '/':
                return 53;
            case OR:
            case ')':
            case NEQ:
            case LEQ:
            case IF:
            case EQ:
            case '}':
            case '>':
            case IDENT:
            case '<':
            case STR:
            case GEQ:
            case AND:
                return yyr25();
        }
        return 159;
    }

    private int yys73() {
        switch (yytok) {
            case '*':
                return 50;
            case '+':
                return 51;
            case '-':
                return 52;
            case '/':
                return 53;
            case OR:
            case ')':
            case NEQ:
            case LEQ:
            case IF:
            case EQ:
            case '}':
            case '>':
            case IDENT:
            case '<':
            case STR:
            case GEQ:
            case AND:
                return yyr24();
        }
        return 159;
    }

    private int yys74() {
        switch (yytok) {
            case OR:
            case ')':
            case NEQ:
            case LEQ:
            case IF:
            case '*':
            case '+':
            case EQ:
            case '}':
            case '>':
            case IDENT:
            case '<':
            case '/':
            case '-':
            case STR:
            case GEQ:
            case AND:
                return yyr30();
        }
        return 159;
    }

    private int yyr1() { // top : form
        { result = ((ast.Form)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 1;
    }

    private int yyr39() { // dType : tBool
        { yyrv = new ast.type.Bool(); }
        yysv[yysp-=1] = yyrv;
        return 24;
    }

    private int yyr40() { // dType : tMoney
        { yyrv = new ast.type.Money(); }
        yysv[yysp-=1] = yyrv;
        return 24;
    }

    private int yyr41() { // dType : tInt
        { yyrv = new ast.type.Int(); }
        yysv[yysp-=1] = yyrv;
        return 24;
    }

    private int yyr42() { // dType : tStr
        { yyrv = new ast.type.Str(); }
        yysv[yysp-=1] = yyrv;
        return 24;
    }

    private int yyr9() { // dec : IDENT ':' dType
        { yyrv = new Var(((ast.expression.value.Ident)yysv[yysp-3]),((ast.Type)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        switch (yyst[yysp-1]) {
            case 13: return 20;
            default: return 7;
        }
    }

    private int yyr11() { // elseexpr : ELSE '{' block '}'
        { yyrv = new Else(((ast.statement.Block)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return 15;
    }

    private int yyr12() { // elseexpr : ELSE ifcon
        { yyrv = new Else(((ast.statement.Block)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 15;
    }

    private int yyr15() { // expression : '+' expression
        { yyrv = new Pos(((ast.Expression)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypexpression();
    }

    private int yyr16() { // expression : '-' expression
        { yyrv = new Neg(((ast.Expression)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypexpression();
    }

    private int yyr17() { // expression : '!' expression
        { yyrv = new Not(((ast.Expression)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypexpression();
    }

    private int yyr18() { // expression : expression '*' expression
        { yyrv = new Mul(((ast.Expression)yysv[yysp-3]), ((ast.Expression)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpression();
    }

    private int yyr19() { // expression : expression '/' expression
        { yyrv = new Div(((ast.Expression)yysv[yysp-3]), ((ast.Expression)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpression();
    }

    private int yyr20() { // expression : expression '+' expression
        { yyrv = new Add(((ast.Expression)yysv[yysp-3]), ((ast.Expression)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpression();
    }

    private int yyr21() { // expression : expression '-' expression
        { yyrv = new Sub(((ast.Expression)yysv[yysp-3]), ((ast.Expression)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpression();
    }

    private int yyr22() { // expression : expression EQ expression
        { yyrv = new Eq(((ast.Expression)yysv[yysp-3]), ((ast.Expression)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpression();
    }

    private int yyr23() { // expression : expression NEQ expression
        { yyrv = new NEq(((ast.Expression)yysv[yysp-3]), ((ast.Expression)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpression();
    }

    private int yyr24() { // expression : expression '>' expression
        { yyrv = new GT(((ast.Expression)yysv[yysp-3]), ((ast.Expression)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpression();
    }

    private int yyr25() { // expression : expression '<' expression
        { yyrv = new LT(((ast.Expression)yysv[yysp-3]), ((ast.Expression)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpression();
    }

    private int yyr26() { // expression : expression GEQ expression
        { yyrv = new GEq(((ast.Expression)yysv[yysp-3]), ((ast.Expression)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpression();
    }

    private int yyr27() { // expression : expression LEQ expression
        { yyrv = new LEq(((ast.Expression)yysv[yysp-3]), ((ast.Expression)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpression();
    }

    private int yyr28() { // expression : expression AND expression
        { yyrv = new And(((ast.Expression)yysv[yysp-3]), ((ast.Expression)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpression();
    }

    private int yyr29() { // expression : expression OR expression
        { yyrv = new Or(((ast.Expression)yysv[yysp-3]), ((ast.Expression)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpression();
    }

    private int yyr30() { // expression : '(' expression ')'
        { yyrv = ((ast.Expression)yysv[yysp-2]); }
        yysv[yysp-=3] = yyrv;
        return yypexpression();
    }

    private int yyr31() { // expression : type
        yysp -= 1;
        return yypexpression();
    }

    private int yypexpression() {
        switch (yyst[yysp-1]) {
            case 54: return 72;
            case 53: return 71;
            case 52: return 70;
            case 51: return 69;
            case 50: return 68;
            case 49: return 67;
            case 48: return 66;
            case 47: return 65;
            case 46: return 64;
            case 45: return 63;
            case 44: return 62;
            case 41: return 59;
            case 40: return 58;
            case 39: return 57;
            case 38: return 56;
            case 19: return 42;
            case 18: return 29;
            default: return 73;
        }
    }

    private int yyr2() { // form : FORM IDENT '{' block '}'
        { yyrv = new Form(((ast.expression.value.Ident)yysv[yysp-4]),((ast.statement.Block)yysv[yysp-2])); }
        yysv[yysp-=5] = yyrv;
        return 2;
    }

    private int yyr13() { // ifcon : ifexpr elseexpr
        yysp -= 2;
        return yypifcon();
    }

    private int yyr14() { // ifcon : ifexpr
        yysp -= 1;
        return yypifcon();
    }

    private int yypifcon() {
        switch (yyst[yysp-1]) {
            case 16: return 22;
            default: return 8;
        }
    }

    private int yyr10() { // ifexpr : IF '(' expression ')' '{' block '}'
        { yyrv = new If(((ast.Expression)yysv[yysp-5]),((ast.statement.Block)yysv[yysp-2])); }
        yysv[yysp-=7] = yyrv;
        return 9;
    }

    private int yyr5() { // statement : STR dec
        { yyrv = new Question(((ast.expression.value.Str)yysv[yysp-2]),((ast.statement.Var)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 10;
    }

    private int yyr6() { // statement : IDENT '=' expression
        { yyrv = new Assignment(((ast.expression.value.Ident)yysv[yysp-3]),((ast.Expression)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return 10;
    }

    private int yyr7() { // statement : dec
        yysp -= 1;
        return 10;
    }

    private int yyr8() { // statement : ifcon
        yysp -= 1;
        return 10;
    }

    private int yyr3() { // block : /* empty */
        { yyrv = null; }
        yysv[yysp-=0] = yyrv;
        return yypblock();
    }

    private int yyr4() { // block : block statement
        { if (((ast.statement.Block)yysv[yysp-2]) == null) yyrv = new Block(((ast.Statement)yysv[yysp-1])); else yyrv = new Block(((ast.Statement)yysv[yysp-1]), (Block)((ast.statement.Block)yysv[yysp-2])); }
        yysv[yysp-=2] = yyrv;
        return yypblock();
    }

    private int yypblock() {
        switch (yyst[yysp-1]) {
            case 23: return 43;
            case 5: return 6;
            default: return 76;
        }
    }

    private int yyr32() { // type : INT
        { yyrv = ((ast.expression.value.Int)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 30;
    }

    private int yyr33() { // type : MONEY
        { yyrv = ((ast.expression.value.Money)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 30;
    }

    private int yyr34() { // type : BOOL
        { yyrv = ((ast.expression.value.Bool)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 30;
    }

    private int yyr35() { // type : TRUE
        { yyrv = new ast.expression.value.Bool(true); }
        yysv[yysp-=1] = yyrv;
        return 30;
    }

    private int yyr36() { // type : FALSE
        { yyrv = new ast.expression.value.Bool(false); }
        yysv[yysp-=1] = yyrv;
        return 30;
    }

    private int yyr37() { // type : STR
        { yyrv = ((ast.expression.value.Str)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 30;
    }

    private int yyr38() { // type : IDENT
        { yyrv = ((ast.expression.value.Ident)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 30;
    }

    protected String[] yyerrmsgs = {
    };

private QLLexer lexer; 

private Form result;

public Form getResult() {
  return result;
}

public QLParser(QLLexer lexer) { 
  this.lexer = lexer; 
}

private void yyerror(String msg) { 
  System.err.println(msg); 
}

}
