// Output created by jacc on Sun Jan 27 20:33:31 CET 2013

package org.uva.sea.ql.parser.jacc;

        import org.uva.sea.ql.ast.*;
        import org.uva.sea.ql.ast.exp.*;
        import org.uva.sea.ql.ast.data.*;
        import org.uva.sea.ql.ast.value.*;

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
                case 68:
                    yyn = yys0();
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 69:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 136;
                            continue;
                    }
                    yyn = 139;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 70:
                    yyn = yys2();
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 71:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr1();
                            continue;
                    }
                    yyn = 139;
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
                case 72:
                    switch (yytok) {
                        case IDENT:
                            yyn = 23;
                            continue;
                    }
                    yyn = 139;
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
                case 73:
                    yyn = yys5();
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 74:
                    yyn = yys6();
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 75:
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
                case 76:
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
                case 77:
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
                case 78:
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
                case 79:
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
                case 80:
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
                case 81:
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
                case 82:
                    yyn = yys14();
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
                case 83:
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
                case 84:
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
                case 85:
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
                case 86:
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
                case 87:
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
                case 88:
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
                case 89:
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
                case 90:
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
                case 91:
                    switch (yytok) {
                        case '{':
                            yyn = 40;
                            continue;
                    }
                    yyn = 139;
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 92:
                    yyn = yys24();
                    continue;

                case 25:
                    yyst[yysp] = 25;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 93:
                    yyn = yys25();
                    continue;

                case 26:
                    yyst[yysp] = 26;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 94:
                    yyn = yys26();
                    continue;

                case 27:
                    yyst[yysp] = 27;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 95:
                    yyn = yys27();
                    continue;

                case 28:
                    yyst[yysp] = 28;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 96:
                    yyn = yys28();
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 97:
                    yyn = yys29();
                    continue;

                case 30:
                    yyst[yysp] = 30;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 98:
                    yyn = yys30();
                    continue;

                case 31:
                    yyst[yysp] = 31;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 99:
                    yyn = yys31();
                    continue;

                case 32:
                    yyst[yysp] = 32;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 100:
                    yyn = yys32();
                    continue;

                case 33:
                    yyst[yysp] = 33;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 101:
                    yyn = yys33();
                    continue;

                case 34:
                    yyst[yysp] = 34;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 102:
                    yyn = yys34();
                    continue;

                case 35:
                    yyst[yysp] = 35;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 103:
                    yyn = yys35();
                    continue;

                case 36:
                    yyst[yysp] = 36;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 104:
                    yyn = yys36();
                    continue;

                case 37:
                    yyst[yysp] = 37;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 105:
                    yyn = yys37();
                    continue;

                case 38:
                    yyst[yysp] = 38;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 106:
                    yyn = yys38();
                    continue;

                case 39:
                    yyst[yysp] = 39;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 107:
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
                case 108:
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
                case 109:
                    yyn = yys41();
                    continue;

                case 42:
                    yyst[yysp] = 42;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 110:
                    switch (yytok) {
                        case BOOL:
                            yyn = 48;
                            continue;
                        case INT:
                            yyn = 51;
                            continue;
                        case MON:
                            yyn = 52;
                            continue;
                        case STR:
                            yyn = 53;
                            continue;
                        case '}':
                            yyn = yyr5();
                            continue;
                    }
                    yyn = 139;
                    continue;

                case 43:
                    yyst[yysp] = 43;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 111:
                    switch (yytok) {
                        case IDENT:
                            yyn = 55;
                            continue;
                    }
                    yyn = 139;
                    continue;

                case 44:
                    yyst[yysp] = 44;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 112:
                    switch (yytok) {
                        case STR:
                        case MON:
                        case '}':
                        case INT:
                        case BOOL:
                            yyn = yyr29();
                            continue;
                    }
                    yyn = 139;
                    continue;

                case 45:
                    yyst[yysp] = 45;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 113:
                    switch (yytok) {
                        case '}':
                            yyn = yyr4();
                            continue;
                    }
                    yyn = 139;
                    continue;

                case 46:
                    yyst[yysp] = 46;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 114:
                    switch (yytok) {
                        case STR:
                        case MON:
                        case '}':
                        case INT:
                        case BOOL:
                            yyn = yyr30();
                            continue;
                    }
                    yyn = 139;
                    continue;

                case 47:
                    yyst[yysp] = 47;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 115:
                    switch (yytok) {
                        case '}':
                            yyn = 56;
                            continue;
                    }
                    yyn = 139;
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
                case 116:
                    switch (yytok) {
                        case IDENT:
                            yyn = yyr7();
                            continue;
                    }
                    yyn = 139;
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
                case 117:
                    switch (yytok) {
                        case '=':
                            yyn = 57;
                            continue;
                    }
                    yyn = 139;
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
                case 118:
                    switch (yytok) {
                        case '(':
                            yyn = 58;
                            continue;
                    }
                    yyn = 139;
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
                case 119:
                    switch (yytok) {
                        case IDENT:
                            yyn = yyr8();
                            continue;
                    }
                    yyn = 139;
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
                case 120:
                    switch (yytok) {
                        case IDENT:
                            yyn = yyr9();
                            continue;
                    }
                    yyn = 139;
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
                case 121:
                    switch (yytok) {
                        case IDENT:
                            yyn = yyr10();
                            continue;
                    }
                    yyn = 139;
                    continue;

                case 54:
                    yyst[yysp] = 54;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 122:
                    switch (yytok) {
                        case STR:
                        case MON:
                        case '}':
                        case INT:
                        case BOOL:
                            yyn = yyr31();
                            continue;
                    }
                    yyn = 139;
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
                case 123:
                    switch (yytok) {
                        case '=':
                            yyn = 59;
                            continue;
                    }
                    yyn = 139;
                    continue;

                case 56:
                    yyst[yysp] = 56;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 124:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr3();
                            continue;
                    }
                    yyn = 139;
                    continue;

                case 57:
                    yyst[yysp] = 57;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 125:
                    yyn = yys57();
                    continue;

                case 58:
                    yyst[yysp] = 58;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 126:
                    yyn = yys58();
                    continue;

                case 59:
                    yyst[yysp] = 59;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 127:
                    switch (yytok) {
                        case STRING_VAL:
                            yyn = 62;
                            continue;
                    }
                    yyn = 139;
                    continue;

                case 60:
                    yyst[yysp] = 60;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 128:
                    yyn = yys60();
                    continue;

                case 61:
                    yyst[yysp] = 61;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 129:
                    yyn = yys61();
                    continue;

                case 62:
                    yyst[yysp] = 62;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 130:
                    switch (yytok) {
                        case STR:
                        case MON:
                        case '}':
                        case INT:
                        case BOOL:
                            yyn = yyr6();
                            continue;
                    }
                    yyn = 139;
                    continue;

                case 63:
                    yyst[yysp] = 63;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 131:
                    switch (yytok) {
                        case STR:
                        case MON:
                        case '}':
                        case INT:
                        case BOOL:
                            yyn = yyr32();
                            continue;
                    }
                    yyn = 139;
                    continue;

                case 64:
                    yyst[yysp] = 64;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 132:
                    switch (yytok) {
                        case '{':
                            yyn = 65;
                            continue;
                    }
                    yyn = 139;
                    continue;

                case 65:
                    yyst[yysp] = 65;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 133:
                    switch (yytok) {
                        case IDENT:
                            yyn = 49;
                            continue;
                        case IF:
                            yyn = 50;
                            continue;
                    }
                    yyn = 139;
                    continue;

                case 66:
                    yyst[yysp] = 66;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 134:
                    switch (yytok) {
                        case BOOL:
                            yyn = 48;
                            continue;
                        case INT:
                            yyn = 51;
                            continue;
                        case MON:
                            yyn = 52;
                            continue;
                        case STR:
                            yyn = 53;
                            continue;
                        case '}':
                            yyn = 67;
                            continue;
                    }
                    yyn = 139;
                    continue;

                case 67:
                    yyst[yysp] = 67;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 135:
                    switch (yytok) {
                        case STR:
                        case MON:
                        case '}':
                        case INT:
                        case BOOL:
                            yyn = yyr33();
                            continue;
                    }
                    yyn = 139;
                    continue;

                case 136:
                    return true;
                case 137:
                    yyerror("stack overflow");
                case 138:
                    return false;
                case 139:
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

    private int yys0() {
        switch (yytok) {
            case FORM:
                return 4;
            case IDENT:
                return 5;
            case INT_VAL:
                return 6;
            case '!':
                return 7;
            case '(':
                return 8;
            case '+':
                return 9;
            case '-':
                return 10;
        }
        return 139;
    }

    private int yys2() {
        switch (yytok) {
            case AND:
                return 11;
            case EQ:
                return 12;
            case GEQ:
                return 13;
            case LEQ:
                return 14;
            case NEQ:
                return 15;
            case OR:
                return 16;
            case '*':
                return 17;
            case '+':
                return 18;
            case '-':
                return 19;
            case '/':
                return 20;
            case '<':
                return 21;
            case '>':
                return 22;
            case ENDINPUT:
                return yyr2();
        }
        return 139;
    }

    private int yys5() {
        switch (yytok) {
            case '>':
            case '<':
            case OR:
            case '-':
            case '+':
            case NEQ:
            case '/':
            case ';':
            case EQ:
            case '*':
            case ')':
            case LEQ:
            case GEQ:
            case ENDINPUT:
            case AND:
                return yyr27();
        }
        return 139;
    }

    private int yys6() {
        switch (yytok) {
            case '>':
            case '<':
            case OR:
            case '-':
            case '+':
            case NEQ:
            case '/':
            case ';':
            case EQ:
            case '*':
            case ')':
            case LEQ:
            case GEQ:
            case ENDINPUT:
            case AND:
                return yyr26();
        }
        return 139;
    }

    private int yys7() {
        switch (yytok) {
            case IDENT:
                return 5;
            case INT_VAL:
                return 6;
            case '!':
                return 7;
            case '(':
                return 8;
            case '+':
                return 9;
            case '-':
                return 10;
        }
        return 139;
    }

    private int yys8() {
        switch (yytok) {
            case IDENT:
                return 5;
            case INT_VAL:
                return 6;
            case '!':
                return 7;
            case '(':
                return 8;
            case '+':
                return 9;
            case '-':
                return 10;
        }
        return 139;
    }

    private int yys9() {
        switch (yytok) {
            case IDENT:
                return 5;
            case INT_VAL:
                return 6;
            case '!':
                return 7;
            case '(':
                return 8;
            case '+':
                return 9;
            case '-':
                return 10;
        }
        return 139;
    }

    private int yys10() {
        switch (yytok) {
            case IDENT:
                return 5;
            case INT_VAL:
                return 6;
            case '!':
                return 7;
            case '(':
                return 8;
            case '+':
                return 9;
            case '-':
                return 10;
        }
        return 139;
    }

    private int yys11() {
        switch (yytok) {
            case IDENT:
                return 5;
            case INT_VAL:
                return 6;
            case '!':
                return 7;
            case '(':
                return 8;
            case '+':
                return 9;
            case '-':
                return 10;
        }
        return 139;
    }

    private int yys12() {
        switch (yytok) {
            case IDENT:
                return 5;
            case INT_VAL:
                return 6;
            case '!':
                return 7;
            case '(':
                return 8;
            case '+':
                return 9;
            case '-':
                return 10;
        }
        return 139;
    }

    private int yys13() {
        switch (yytok) {
            case IDENT:
                return 5;
            case INT_VAL:
                return 6;
            case '!':
                return 7;
            case '(':
                return 8;
            case '+':
                return 9;
            case '-':
                return 10;
        }
        return 139;
    }

    private int yys14() {
        switch (yytok) {
            case IDENT:
                return 5;
            case INT_VAL:
                return 6;
            case '!':
                return 7;
            case '(':
                return 8;
            case '+':
                return 9;
            case '-':
                return 10;
        }
        return 139;
    }

    private int yys15() {
        switch (yytok) {
            case IDENT:
                return 5;
            case INT_VAL:
                return 6;
            case '!':
                return 7;
            case '(':
                return 8;
            case '+':
                return 9;
            case '-':
                return 10;
        }
        return 139;
    }

    private int yys16() {
        switch (yytok) {
            case IDENT:
                return 5;
            case INT_VAL:
                return 6;
            case '!':
                return 7;
            case '(':
                return 8;
            case '+':
                return 9;
            case '-':
                return 10;
        }
        return 139;
    }

    private int yys17() {
        switch (yytok) {
            case IDENT:
                return 5;
            case INT_VAL:
                return 6;
            case '!':
                return 7;
            case '(':
                return 8;
            case '+':
                return 9;
            case '-':
                return 10;
        }
        return 139;
    }

    private int yys18() {
        switch (yytok) {
            case IDENT:
                return 5;
            case INT_VAL:
                return 6;
            case '!':
                return 7;
            case '(':
                return 8;
            case '+':
                return 9;
            case '-':
                return 10;
        }
        return 139;
    }

    private int yys19() {
        switch (yytok) {
            case IDENT:
                return 5;
            case INT_VAL:
                return 6;
            case '!':
                return 7;
            case '(':
                return 8;
            case '+':
                return 9;
            case '-':
                return 10;
        }
        return 139;
    }

    private int yys20() {
        switch (yytok) {
            case IDENT:
                return 5;
            case INT_VAL:
                return 6;
            case '!':
                return 7;
            case '(':
                return 8;
            case '+':
                return 9;
            case '-':
                return 10;
        }
        return 139;
    }

    private int yys21() {
        switch (yytok) {
            case IDENT:
                return 5;
            case INT_VAL:
                return 6;
            case '!':
                return 7;
            case '(':
                return 8;
            case '+':
                return 9;
            case '-':
                return 10;
        }
        return 139;
    }

    private int yys22() {
        switch (yytok) {
            case IDENT:
                return 5;
            case INT_VAL:
                return 6;
            case '!':
                return 7;
            case '(':
                return 8;
            case '+':
                return 9;
            case '-':
                return 10;
        }
        return 139;
    }

    private int yys24() {
        switch (yytok) {
            case '>':
            case '<':
            case OR:
            case '-':
            case '+':
            case NEQ:
            case '/':
            case ';':
            case EQ:
            case '*':
            case ')':
            case LEQ:
            case GEQ:
            case ENDINPUT:
            case AND:
                return yyr13();
        }
        return 139;
    }

    private int yys25() {
        switch (yytok) {
            case AND:
                return 11;
            case EQ:
                return 12;
            case GEQ:
                return 13;
            case LEQ:
                return 14;
            case NEQ:
                return 15;
            case OR:
                return 16;
            case '*':
                return 17;
            case '+':
                return 18;
            case '-':
                return 19;
            case '/':
                return 20;
            case '<':
                return 21;
            case '>':
                return 22;
            case ')':
                return 41;
        }
        return 139;
    }

    private int yys26() {
        switch (yytok) {
            case '>':
            case '<':
            case OR:
            case '-':
            case '+':
            case NEQ:
            case '/':
            case ';':
            case EQ:
            case '*':
            case ')':
            case LEQ:
            case GEQ:
            case ENDINPUT:
            case AND:
                return yyr11();
        }
        return 139;
    }

    private int yys27() {
        switch (yytok) {
            case '>':
            case '<':
            case OR:
            case '-':
            case '+':
            case NEQ:
            case '/':
            case ';':
            case EQ:
            case '*':
            case ')':
            case LEQ:
            case GEQ:
            case ENDINPUT:
            case AND:
                return yyr12();
        }
        return 139;
    }

    private int yys28() {
        switch (yytok) {
            case EQ:
                return 12;
            case GEQ:
                return 13;
            case LEQ:
                return 14;
            case NEQ:
                return 15;
            case '*':
                return 17;
            case '+':
                return 18;
            case '-':
                return 19;
            case '/':
                return 20;
            case '<':
                return 21;
            case '>':
                return 22;
            case ';':
            case OR:
            case ')':
            case ENDINPUT:
            case AND:
                return yyr24();
        }
        return 139;
    }

    private int yys29() {
        switch (yytok) {
            case '*':
                return 17;
            case '+':
                return 18;
            case '-':
                return 19;
            case '/':
                return 20;
            case '>':
            case '<':
            case ';':
            case OR:
            case NEQ:
            case EQ:
            case ')':
            case LEQ:
            case GEQ:
            case ENDINPUT:
            case AND:
                return yyr18();
        }
        return 139;
    }

    private int yys30() {
        switch (yytok) {
            case '*':
                return 17;
            case '+':
                return 18;
            case '-':
                return 19;
            case '/':
                return 20;
            case '>':
            case '<':
            case ';':
            case OR:
            case NEQ:
            case EQ:
            case ')':
            case LEQ:
            case GEQ:
            case ENDINPUT:
            case AND:
                return yyr22();
        }
        return 139;
    }

    private int yys31() {
        switch (yytok) {
            case '*':
                return 17;
            case '+':
                return 18;
            case '-':
                return 19;
            case '/':
                return 20;
            case '>':
            case '<':
            case ';':
            case OR:
            case NEQ:
            case EQ:
            case ')':
            case LEQ:
            case GEQ:
            case ENDINPUT:
            case AND:
                return yyr23();
        }
        return 139;
    }

    private int yys32() {
        switch (yytok) {
            case '*':
                return 17;
            case '+':
                return 18;
            case '-':
                return 19;
            case '/':
                return 20;
            case '>':
            case '<':
            case ';':
            case OR:
            case NEQ:
            case EQ:
            case ')':
            case LEQ:
            case GEQ:
            case ENDINPUT:
            case AND:
                return yyr19();
        }
        return 139;
    }

    private int yys33() {
        switch (yytok) {
            case AND:
                return 11;
            case EQ:
                return 12;
            case GEQ:
                return 13;
            case LEQ:
                return 14;
            case NEQ:
                return 15;
            case '*':
                return 17;
            case '+':
                return 18;
            case '-':
                return 19;
            case '/':
                return 20;
            case '<':
                return 21;
            case '>':
                return 22;
            case ';':
            case OR:
            case ')':
            case ENDINPUT:
                return yyr25();
        }
        return 139;
    }

    private int yys34() {
        switch (yytok) {
            case '>':
            case '<':
            case OR:
            case '-':
            case '+':
            case NEQ:
            case '/':
            case ';':
            case EQ:
            case '*':
            case ')':
            case LEQ:
            case GEQ:
            case ENDINPUT:
            case AND:
                return yyr14();
        }
        return 139;
    }

    private int yys35() {
        switch (yytok) {
            case '*':
                return 17;
            case '/':
                return 20;
            case '>':
            case '<':
            case OR:
            case '-':
            case '+':
            case ';':
            case NEQ:
            case EQ:
            case ')':
            case LEQ:
            case GEQ:
            case ENDINPUT:
            case AND:
                return yyr16();
        }
        return 139;
    }

    private int yys36() {
        switch (yytok) {
            case '*':
                return 17;
            case '/':
                return 20;
            case '>':
            case '<':
            case OR:
            case '-':
            case '+':
            case ';':
            case NEQ:
            case EQ:
            case ')':
            case LEQ:
            case GEQ:
            case ENDINPUT:
            case AND:
                return yyr17();
        }
        return 139;
    }

    private int yys37() {
        switch (yytok) {
            case '>':
            case '<':
            case OR:
            case '-':
            case '+':
            case NEQ:
            case '/':
            case ';':
            case EQ:
            case '*':
            case ')':
            case LEQ:
            case GEQ:
            case ENDINPUT:
            case AND:
                return yyr15();
        }
        return 139;
    }

    private int yys38() {
        switch (yytok) {
            case '*':
                return 17;
            case '+':
                return 18;
            case '-':
                return 19;
            case '/':
                return 20;
            case '>':
            case '<':
            case ';':
            case OR:
            case NEQ:
            case EQ:
            case ')':
            case LEQ:
            case GEQ:
            case ENDINPUT:
            case AND:
                return yyr21();
        }
        return 139;
    }

    private int yys39() {
        switch (yytok) {
            case '*':
                return 17;
            case '+':
                return 18;
            case '-':
                return 19;
            case '/':
                return 20;
            case '>':
            case '<':
            case ';':
            case OR:
            case NEQ:
            case EQ:
            case ')':
            case LEQ:
            case GEQ:
            case ENDINPUT:
            case AND:
                return yyr20();
        }
        return 139;
    }

    private int yys40() {
        switch (yytok) {
            case BOOL:
                return 48;
            case IDENT:
                return 49;
            case IF:
                return 50;
            case INT:
                return 51;
            case MON:
                return 52;
            case STR:
                return 53;
        }
        return 139;
    }

    private int yys41() {
        switch (yytok) {
            case '>':
            case '<':
            case OR:
            case '-':
            case '+':
            case NEQ:
            case '/':
            case ';':
            case EQ:
            case '*':
            case ')':
            case LEQ:
            case GEQ:
            case ENDINPUT:
            case AND:
                return yyr28();
        }
        return 139;
    }

    private int yys57() {
        switch (yytok) {
            case IDENT:
                return 5;
            case INT_VAL:
                return 6;
            case '!':
                return 7;
            case '(':
                return 8;
            case '+':
                return 9;
            case '-':
                return 10;
        }
        return 139;
    }

    private int yys58() {
        switch (yytok) {
            case IDENT:
                return 5;
            case INT_VAL:
                return 6;
            case '!':
                return 7;
            case '(':
                return 8;
            case '+':
                return 9;
            case '-':
                return 10;
        }
        return 139;
    }

    private int yys60() {
        switch (yytok) {
            case AND:
                return 11;
            case EQ:
                return 12;
            case GEQ:
                return 13;
            case LEQ:
                return 14;
            case NEQ:
                return 15;
            case OR:
                return 16;
            case '*':
                return 17;
            case '+':
                return 18;
            case '-':
                return 19;
            case '/':
                return 20;
            case '<':
                return 21;
            case '>':
                return 22;
            case ';':
                return 63;
        }
        return 139;
    }

    private int yys61() {
        switch (yytok) {
            case AND:
                return 11;
            case EQ:
                return 12;
            case GEQ:
                return 13;
            case LEQ:
                return 14;
            case NEQ:
                return 15;
            case OR:
                return 16;
            case '*':
                return 17;
            case '+':
                return 18;
            case '-':
                return 19;
            case '/':
                return 20;
            case '<':
                return 21;
            case '>':
                return 22;
            case ')':
                return 64;
        }
        return 139;
    }

    private int yyr1() { // top : form
        { result = yysv[yysp-1]; }
        yysv[yysp-=1] = yyrv;
        return 1;
    }

    private int yyr2() { // top : expr
        { result = ((Expression)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 1;
    }

    private int yyr29() { // compound : ifStm
        { yyrv = new CompoundStatement(yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypcompound();
    }

    private int yyr30() { // compound : stm
        { yyrv = yysv[yysp-1]; }
        yysv[yysp-=1] = yyrv;
        return yypcompound();
    }

    private int yyr31() { // compound : compound question
        { yyrv = ((CompoundStatement)yysv[yysp-2]); }
        yysv[yysp-=2] = yyrv;
        return yypcompound();
    }

    private int yypcompound() {
        switch (yyst[yysp-1]) {
            case 40: return 42;
            default: return 66;
        }
    }

    private int yyr7() { // dType : BOOL
        { yyrv = new BooleanType();; }
        yysv[yysp-=1] = yyrv;
        return 43;
    }

    private int yyr8() { // dType : INT
        { yyrv = new IntegerType(); }
        yysv[yysp-=1] = yyrv;
        return 43;
    }

    private int yyr9() { // dType : MON
        { yyrv = new MoneyType(); }
        yysv[yysp-=1] = yyrv;
        return 43;
    }

    private int yyr10() { // dType : STR
        { yyrv = new StringType(); }
        yysv[yysp-=1] = yyrv;
        return 43;
    }

    private int yyr11() { // expr : '+' expr
        { yyrv = new Positive(((Expression)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypexpr();
    }

    private int yyr12() { // expr : '-' expr
        { yyrv = new Negative(((Expression)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypexpr();
    }

    private int yyr13() { // expr : '!' expr
        { yyrv = new Not(((Expression)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypexpr();
    }

    private int yyr14() { // expr : expr '*' expr
        { yyrv = new Multiply(((Expression)yysv[yysp-3]), ((Expression)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr15() { // expr : expr '/' expr
        { yyrv = new Divide(((Expression)yysv[yysp-3]), ((Expression)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr16() { // expr : expr '+' expr
        { yyrv = new Add(((Expression)yysv[yysp-3]), ((Expression)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr17() { // expr : expr '-' expr
        { yyrv = new Substitute(((Expression)yysv[yysp-3]), ((Expression)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr18() { // expr : expr EQ expr
        { yyrv = new Equals(((Expression)yysv[yysp-3]), ((Expression)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr19() { // expr : expr NEQ expr
        { yyrv = new NotEquals(((Expression)yysv[yysp-3]), ((Expression)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr20() { // expr : expr '>' expr
        { yyrv = new GreaterThan(((Expression)yysv[yysp-3]), ((Expression)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr21() { // expr : expr '<' expr
        { yyrv = new SmallerThan(((Expression)yysv[yysp-3]), ((Expression)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr22() { // expr : expr GEQ expr
        { yyrv = new GreaterOrEquals(((Expression)yysv[yysp-3]), ((Expression)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr23() { // expr : expr LEQ expr
        { yyrv = new SmallerOrEquals(((Expression)yysv[yysp-3]), ((Expression)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr24() { // expr : expr AND expr
        { yyrv = new And(((Expression)yysv[yysp-3]), ((Expression)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr25() { // expr : expr OR expr
        { yyrv = new Or(((Expression)yysv[yysp-3]), ((Expression)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr26() { // expr : INT_VAL
        { yyrv = ((IntegerValue)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypexpr();
    }

    private int yyr27() { // expr : IDENT
        { yyrv = ((Identifier)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypexpr();
    }

    private int yyr28() { // expr : '(' expr ')'
        { yyrv = ((Expression)yysv[yysp-2]); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yypexpr() {
        switch (yyst[yysp-1]) {
            case 57: return 60;
            case 22: return 39;
            case 21: return 38;
            case 20: return 37;
            case 19: return 36;
            case 18: return 35;
            case 17: return 34;
            case 16: return 33;
            case 15: return 32;
            case 14: return 31;
            case 13: return 30;
            case 12: return 29;
            case 11: return 28;
            case 10: return 27;
            case 9: return 26;
            case 8: return 25;
            case 7: return 24;
            case 0: return 2;
            default: return 61;
        }
    }

    private int yyr3() { // form : FORM IDENT '{' body '}'
        { yyrv = new Form(yysv[yysp-2]); }
        yysv[yysp-=5] = yyrv;
        return 3;
    }

    private int yyr33() { // ifStm : IF '(' expr ')' '{' compound '}'
        { yyrv = new IfStatement(((Expression)yysv[yysp-5]), ((CompoundStatement)yysv[yysp-2])); }
        yysv[yysp-=7] = yyrv;
        return 44;
    }

    private int yyr6() { // question : dType IDENT '=' STRING_VAL
        { yyrv = new Question(((DataType)yysv[yysp-4]), ((Identifier)yysv[yysp-3]), ((StringValue)yysv[yysp-1]) ); }
        yysv[yysp-=4] = yyrv;
        switch (yyst[yysp-1]) {
            case 40: return 45;
            default: return 54;
        }
    }

    private int yyr32() { // stm : IDENT '=' expr ';'
        { yyrv = new Assignment(((Identifier)yysv[yysp-4]), ((Expression)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return 46;
    }

    private int yyr4() { // body : question
        { yyrv = yysv[yysp-1]; }
        yysv[yysp-=1] = yyrv;
        return 47;
    }

    private int yyr5() { // body : compound
        { yyrv = ((CompoundStatement)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 47;
    }

    protected String[] yyerrmsgs = {
    };


private QLLexer lexer; 
private ASTNode result;

public ASTNode getResult(){
        return result;
}


public QLParser(QLLexer lexer) { 
  this.lexer = lexer; 
}

private void yyerror(String msg) { 
  System.err.println(msg); 
}

}
