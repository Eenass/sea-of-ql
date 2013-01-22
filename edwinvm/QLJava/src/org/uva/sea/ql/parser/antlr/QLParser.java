// $ANTLR 3.4 C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g 2013-01-21 15:21:32

package org.uva.sea.ql.parser.antlr;
import org.uva.sea.ql.ast.*;
import org.uva.sea.ql.ast.expressions.*;
import org.uva.sea.ql.ast.values.*;
import org.uva.sea.ql.ast.types.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class QLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Bool", "COMMENT", "Ident", "Int", "String", "WS", "'!'", "'!='", "'&&'", "'('", "')'", "'*'", "'+'", "'-'", "'/'", "':'", "'<'", "'<='", "'='", "'=='", "'>'", "'>='", "'boolean'", "'else'", "'if'", "'integer'", "'string'", "'{'", "'||'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int Bool=4;
    public static final int COMMENT=5;
    public static final int Ident=6;
    public static final int Int=7;
    public static final int String=8;
    public static final int WS=9;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public QLParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public QLParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.ruleMemo = new HashMap[43+1];
         

    }

    public String[] getTokenNames() { return QLParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g"; }



    // $ANTLR start "form"
    // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:18:1: form : ( primary )+ ;
    public final void form() throws RecognitionException {
        int form_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return ; }

            // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:18:5: ( ( primary )+ )
            // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:18:7: ( primary )+
            {
            // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:18:7: ( primary )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Bool||(LA1_0 >= Ident && LA1_0 <= String)||LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:18:7: primary
            	    {
            	    pushFollow(FOLLOW_primary_in_form39);
            	    primary();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 1, form_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "form"



    // $ANTLR start "formStatement"
    // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:20:1: formStatement returns [FormStatement result] : ( question | computedQuestion | conditionBlock );
    public final FormStatement formStatement() throws RecognitionException {
        FormStatement result = null;

        int formStatement_StartIndex = input.index();

        Question question1 =null;

        ComputedQuestion computedQuestion2 =null;

        ConditionBlock conditionBlock3 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return result; }

            // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:21:5: ( question | computedQuestion | conditionBlock )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==String) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==Ident) ) {
                    int LA2_3 = input.LA(3);

                    if ( (LA2_3==19) ) {
                        alt2=1;
                    }
                    else if ( (LA2_3==22) ) {
                        alt2=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return result;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 3, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return result;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA2_0==28) ) {
                alt2=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:21:9: question
                    {
                    pushFollow(FOLLOW_question_in_formStatement58);
                    question1=question();

                    state._fsp--;
                    if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = question1; }

                    }
                    break;
                case 2 :
                    // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:22:9: computedQuestion
                    {
                    pushFollow(FOLLOW_computedQuestion_in_formStatement78);
                    computedQuestion2=computedQuestion();

                    state._fsp--;
                    if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = computedQuestion2; }

                    }
                    break;
                case 3 :
                    // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:23:9: conditionBlock
                    {
                    pushFollow(FOLLOW_conditionBlock_in_formStatement90);
                    conditionBlock3=conditionBlock();

                    state._fsp--;
                    if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = conditionBlock3; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, formStatement_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "formStatement"



    // $ANTLR start "question"
    // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:26:1: question returns [Question result] : String Ident ':' t= type ;
    public final Question question() throws RecognitionException {
        Question result = null;

        int question_StartIndex = input.index();

        Token String4=null;
        Token Ident5=null;
        Type t =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return result; }

            // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:27:5: ( String Ident ':' t= type )
            // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:27:9: String Ident ':' t= type
            {
            String4=(Token)match(input,String,FOLLOW_String_in_question117); if (state.failed) return result;

            Ident5=(Token)match(input,Ident,FOLLOW_Ident_in_question119); if (state.failed) return result;

            match(input,19,FOLLOW_19_in_question121); if (state.failed) return result;

            pushFollow(FOLLOW_type_in_question125);
            t=type();

            state._fsp--;
            if (state.failed) return result;

            if ( state.backtracking==0 ) { result = new Question(new org.uva.sea.ql.ast.values.Str((String4!=null?String4.getText():null)), new Ident((Ident5!=null?Ident5.getText():null)), t); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, question_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "question"



    // $ANTLR start "computedQuestion"
    // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:30:1: computedQuestion returns [ComputedQuestion result] : String Ident '=' e= orExpr ;
    public final ComputedQuestion computedQuestion() throws RecognitionException {
        ComputedQuestion result = null;

        int computedQuestion_StartIndex = input.index();

        Token String6=null;
        Token Ident7=null;
        Expr e =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return result; }

            // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:31:5: ( String Ident '=' e= orExpr )
            // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:31:9: String Ident '=' e= orExpr
            {
            String6=(Token)match(input,String,FOLLOW_String_in_computedQuestion152); if (state.failed) return result;

            Ident7=(Token)match(input,Ident,FOLLOW_Ident_in_computedQuestion154); if (state.failed) return result;

            match(input,22,FOLLOW_22_in_computedQuestion156); if (state.failed) return result;

            pushFollow(FOLLOW_orExpr_in_computedQuestion160);
            e=orExpr();

            state._fsp--;
            if (state.failed) return result;

            if ( state.backtracking==0 ) { result = new ComputedQuestion(new org.uva.sea.ql.ast.values.Str((String6!=null?String6.getText():null)), new Ident((Ident7!=null?Ident7.getText():null)), e); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, computedQuestion_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "computedQuestion"



    // $ANTLR start "conditionBlock"
    // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:34:1: conditionBlock returns [ConditionBlock result] : ( 'if' '(' condition= orExpr ')' '{' (ifBody= formStatement )+ '}' 'else' ( '{' )? (elseBody= formStatement )+ ( '}' )? | 'if' '(' x= orExpr ')' '{' ( formStatement )+ '}' );
    public final ConditionBlock conditionBlock() throws RecognitionException {
        ConditionBlock result = null;

        int conditionBlock_StartIndex = input.index();

        Expr condition =null;

        FormStatement ifBody =null;

        FormStatement elseBody =null;

        Expr x =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return result; }

            // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:35:5: ( 'if' '(' condition= orExpr ')' '{' (ifBody= formStatement )+ '}' 'else' ( '{' )? (elseBody= formStatement )+ ( '}' )? | 'if' '(' x= orExpr ')' '{' ( formStatement )+ '}' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                int LA8_1 = input.LA(2);

                if ( (synpred8_QL()) ) {
                    alt8=1;
                }
                else if ( (true) ) {
                    alt8=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return result;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:35:9: 'if' '(' condition= orExpr ')' '{' (ifBody= formStatement )+ '}' 'else' ( '{' )? (elseBody= formStatement )+ ( '}' )?
                    {
                    match(input,28,FOLLOW_28_in_conditionBlock185); if (state.failed) return result;

                    match(input,13,FOLLOW_13_in_conditionBlock187); if (state.failed) return result;

                    pushFollow(FOLLOW_orExpr_in_conditionBlock191);
                    condition=orExpr();

                    state._fsp--;
                    if (state.failed) return result;

                    match(input,14,FOLLOW_14_in_conditionBlock193); if (state.failed) return result;

                    match(input,31,FOLLOW_31_in_conditionBlock195); if (state.failed) return result;

                    // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:35:49: (ifBody= formStatement )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==String||LA3_0==28) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:35:49: ifBody= formStatement
                    	    {
                    	    pushFollow(FOLLOW_formStatement_in_conditionBlock199);
                    	    ifBody=formStatement();

                    	    state._fsp--;
                    	    if (state.failed) return result;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                    	    if (state.backtracking>0) {state.failed=true; return result;}
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    match(input,33,FOLLOW_33_in_conditionBlock202); if (state.failed) return result;

                    match(input,27,FOLLOW_27_in_conditionBlock204); if (state.failed) return result;

                    // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:35:76: ( '{' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==31) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:35:77: '{'
                            {
                            match(input,31,FOLLOW_31_in_conditionBlock207); if (state.failed) return result;

                            }
                            break;

                    }


                    // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:35:91: (elseBody= formStatement )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==String) ) {
                            int LA5_2 = input.LA(2);

                            if ( (synpred6_QL()) ) {
                                alt5=1;
                            }


                        }
                        else if ( (LA5_0==28) ) {
                            int LA5_3 = input.LA(2);

                            if ( (synpred6_QL()) ) {
                                alt5=1;
                            }


                        }


                        switch (alt5) {
                    	case 1 :
                    	    // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:35:91: elseBody= formStatement
                    	    {
                    	    pushFollow(FOLLOW_formStatement_in_conditionBlock213);
                    	    elseBody=formStatement();

                    	    state._fsp--;
                    	    if (state.failed) return result;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                    	    if (state.backtracking>0) {state.failed=true; return result;}
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:35:107: ( '}' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==33) ) {
                        int LA6_1 = input.LA(2);

                        if ( (synpred7_QL()) ) {
                            alt6=1;
                        }
                    }
                    switch (alt6) {
                        case 1 :
                            // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:35:108: '}'
                            {
                            match(input,33,FOLLOW_33_in_conditionBlock217); if (state.failed) return result;

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) { result = new ConditionBlock(condition, ifBody, elseBody); }

                    }
                    break;
                case 2 :
                    // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:37:9: 'if' '(' x= orExpr ')' '{' ( formStatement )+ '}'
                    {
                    match(input,28,FOLLOW_28_in_conditionBlock239); if (state.failed) return result;

                    match(input,13,FOLLOW_13_in_conditionBlock241); if (state.failed) return result;

                    pushFollow(FOLLOW_orExpr_in_conditionBlock245);
                    x=orExpr();

                    state._fsp--;
                    if (state.failed) return result;

                    match(input,14,FOLLOW_14_in_conditionBlock247); if (state.failed) return result;

                    match(input,31,FOLLOW_31_in_conditionBlock249); if (state.failed) return result;

                    // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:37:35: ( formStatement )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==String||LA7_0==28) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:37:35: formStatement
                    	    {
                    	    pushFollow(FOLLOW_formStatement_in_conditionBlock251);
                    	    formStatement();

                    	    state._fsp--;
                    	    if (state.failed) return result;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                    	    if (state.backtracking>0) {state.failed=true; return result;}
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    match(input,33,FOLLOW_33_in_conditionBlock254); if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = new ConditionBlock(condition, ifBody); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, conditionBlock_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "conditionBlock"



    // $ANTLR start "primary"
    // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:41:1: primary returns [Expr result] : ( Int | Bool | String | Ident | '(' x= orExpr ')' );
    public final Expr primary() throws RecognitionException {
        Expr result = null;

        int primary_StartIndex = input.index();

        Token Int8=null;
        Token Bool9=null;
        Token String10=null;
        Token Ident11=null;
        Expr x =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return result; }

            // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:42:5: ( Int | Bool | String | Ident | '(' x= orExpr ')' )
            int alt9=5;
            switch ( input.LA(1) ) {
            case Int:
                {
                alt9=1;
                }
                break;
            case Bool:
                {
                alt9=2;
                }
                break;
            case String:
                {
                alt9=3;
                }
                break;
            case Ident:
                {
                alt9=4;
                }
                break;
            case 13:
                {
                alt9=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:42:9: Int
                    {
                    Int8=(Token)match(input,Int,FOLLOW_Int_in_primary287); if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = new org.uva.sea.ql.ast.values.Int(Integer.parseInt((Int8!=null?Int8.getText():null))); }

                    }
                    break;
                case 2 :
                    // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:43:9: Bool
                    {
                    Bool9=(Token)match(input,Bool,FOLLOW_Bool_in_primary302); if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = new org.uva.sea.ql.ast.values.Bool(Boolean.parseBoolean((Bool9!=null?Bool9.getText():null))); }

                    }
                    break;
                case 3 :
                    // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:44:9: String
                    {
                    String10=(Token)match(input,String,FOLLOW_String_in_primary316); if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = new org.uva.sea.ql.ast.values.Str((String10!=null?String10.getText():null)); }

                    }
                    break;
                case 4 :
                    // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:45:9: Ident
                    {
                    Ident11=(Token)match(input,Ident,FOLLOW_Ident_in_primary328); if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = new Ident((Ident11!=null?Ident11.getText():null)); }

                    }
                    break;
                case 5 :
                    // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:46:9: '(' x= orExpr ')'
                    {
                    match(input,13,FOLLOW_13_in_primary341); if (state.failed) return result;

                    pushFollow(FOLLOW_orExpr_in_primary345);
                    x=orExpr();

                    state._fsp--;
                    if (state.failed) return result;

                    match(input,14,FOLLOW_14_in_primary347); if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = x; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, primary_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "primary"



    // $ANTLR start "unExpr"
    // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:49:1: unExpr returns [Expr result] : ( '+' x= unExpr | '-' x= unExpr | '!' x= unExpr |x= primary );
    public final Expr unExpr() throws RecognitionException {
        Expr result = null;

        int unExpr_StartIndex = input.index();

        Expr x =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return result; }

            // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:50:5: ( '+' x= unExpr | '-' x= unExpr | '!' x= unExpr |x= primary )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt10=1;
                }
                break;
            case 17:
                {
                alt10=2;
                }
                break;
            case 10:
                {
                alt10=3;
                }
                break;
            case Bool:
            case Ident:
            case Int:
            case String:
            case 13:
                {
                alt10=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:50:9: '+' x= unExpr
                    {
                    match(input,16,FOLLOW_16_in_unExpr375); if (state.failed) return result;

                    pushFollow(FOLLOW_unExpr_in_unExpr379);
                    x=unExpr();

                    state._fsp--;
                    if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = new Pos(x); }

                    }
                    break;
                case 2 :
                    // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:51:9: '-' x= unExpr
                    {
                    match(input,17,FOLLOW_17_in_unExpr391); if (state.failed) return result;

                    pushFollow(FOLLOW_unExpr_in_unExpr395);
                    x=unExpr();

                    state._fsp--;
                    if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = new Neg(x); }

                    }
                    break;
                case 3 :
                    // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:52:9: '!' x= unExpr
                    {
                    match(input,10,FOLLOW_10_in_unExpr407); if (state.failed) return result;

                    pushFollow(FOLLOW_unExpr_in_unExpr411);
                    x=unExpr();

                    state._fsp--;
                    if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = new Not(x); }

                    }
                    break;
                case 4 :
                    // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:53:9: x= primary
                    {
                    pushFollow(FOLLOW_primary_in_unExpr425);
                    x=primary();

                    state._fsp--;
                    if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = x; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, unExpr_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "unExpr"



    // $ANTLR start "mulExpr"
    // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:56:1: mulExpr returns [Expr result] : lhs= unExpr (op= ( '*' | '/' ) rhs= unExpr )* ;
    public final Expr mulExpr() throws RecognitionException {
        Expr result = null;

        int mulExpr_StartIndex = input.index();

        Token op=null;
        Expr lhs =null;

        Expr rhs =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return result; }

            // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:57:5: (lhs= unExpr (op= ( '*' | '/' ) rhs= unExpr )* )
            // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:57:9: lhs= unExpr (op= ( '*' | '/' ) rhs= unExpr )*
            {
            pushFollow(FOLLOW_unExpr_in_mulExpr463);
            lhs=unExpr();

            state._fsp--;
            if (state.failed) return result;

            if ( state.backtracking==0 ) { result =lhs; }

            // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:57:45: (op= ( '*' | '/' ) rhs= unExpr )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15||LA11_0==18) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:57:47: op= ( '*' | '/' ) rhs= unExpr
            	    {
            	    op=(Token)input.LT(1);

            	    if ( input.LA(1)==15||input.LA(1)==18 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return result;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unExpr_in_mulExpr483);
            	    rhs=unExpr();

            	    state._fsp--;
            	    if (state.failed) return result;

            	    if ( state.backtracking==0 ) { 
            	            if ((op!=null?op.getText():null).equals("*"))  { result = new Mul(result, rhs); }
            	            if ((op!=null?op.getText():null).equals("<=")) { result = new Div(result, rhs); }
            	        }

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, mulExpr_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "mulExpr"



    // $ANTLR start "addExpr"
    // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:64:1: addExpr returns [Expr result] : lhs= mulExpr (op= ( '+' | '-' ) rhs= mulExpr )* ;
    public final Expr addExpr() throws RecognitionException {
        Expr result = null;

        int addExpr_StartIndex = input.index();

        Token op=null;
        Expr lhs =null;

        Expr rhs =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return result; }

            // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:65:5: (lhs= mulExpr (op= ( '+' | '-' ) rhs= mulExpr )* )
            // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:65:9: lhs= mulExpr (op= ( '+' | '-' ) rhs= mulExpr )*
            {
            pushFollow(FOLLOW_mulExpr_in_addExpr521);
            lhs=mulExpr();

            state._fsp--;
            if (state.failed) return result;

            if ( state.backtracking==0 ) { result =lhs; }

            // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:65:46: (op= ( '+' | '-' ) rhs= mulExpr )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0 >= 16 && LA12_0 <= 17)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:65:48: op= ( '+' | '-' ) rhs= mulExpr
            	    {
            	    op=(Token)input.LT(1);

            	    if ( (input.LA(1) >= 16 && input.LA(1) <= 17) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return result;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_mulExpr_in_addExpr539);
            	    rhs=mulExpr();

            	    state._fsp--;
            	    if (state.failed) return result;

            	    if ( state.backtracking==0 ) { 
            	            if ((op!=null?op.getText():null).equals("+")) { result = new Add(result, rhs); }
            	            if ((op!=null?op.getText():null).equals("-")) { result = new Sub(result, rhs); }
            	        }

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, addExpr_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "addExpr"



    // $ANTLR start "relExpr"
    // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:72:1: relExpr returns [Expr result] : lhs= addExpr (op= ( '<' | '<=' | '>' | '>=' | '==' | '!=' ) rhs= addExpr )* ;
    public final Expr relExpr() throws RecognitionException {
        Expr result = null;

        int relExpr_StartIndex = input.index();

        Token op=null;
        Expr lhs =null;

        Expr rhs =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return result; }

            // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:73:5: (lhs= addExpr (op= ( '<' | '<=' | '>' | '>=' | '==' | '!=' ) rhs= addExpr )* )
            // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:73:9: lhs= addExpr (op= ( '<' | '<=' | '>' | '>=' | '==' | '!=' ) rhs= addExpr )*
            {
            pushFollow(FOLLOW_addExpr_in_relExpr574);
            lhs=addExpr();

            state._fsp--;
            if (state.failed) return result;

            if ( state.backtracking==0 ) { result =lhs; }

            // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:73:46: (op= ( '<' | '<=' | '>' | '>=' | '==' | '!=' ) rhs= addExpr )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==11||(LA13_0 >= 20 && LA13_0 <= 21)||(LA13_0 >= 23 && LA13_0 <= 25)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:73:48: op= ( '<' | '<=' | '>' | '>=' | '==' | '!=' ) rhs= addExpr
            	    {
            	    op=(Token)input.LT(1);

            	    if ( input.LA(1)==11||(input.LA(1) >= 20 && input.LA(1) <= 21)||(input.LA(1) >= 23 && input.LA(1) <= 25) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return result;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_addExpr_in_relExpr598);
            	    rhs=addExpr();

            	    state._fsp--;
            	    if (state.failed) return result;

            	    if ( state.backtracking==0 ) { 
            	            if ((op!=null?op.getText():null).equals("<"))  { result = new LT(result, rhs);  }
            	            if ((op!=null?op.getText():null).equals("<=")) { result = new LEq(result, rhs); }
            	            if ((op!=null?op.getText():null).equals(">"))  { result = new GT(result, rhs);  }
            	            if ((op!=null?op.getText():null).equals(">=")) { result = new GEq(result, rhs); }
            	            if ((op!=null?op.getText():null).equals("==")) { result = new Eq(result, rhs);  }
            	            if ((op!=null?op.getText():null).equals("!=")) { result = new NEq(result, rhs); }
            	        }

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 10, relExpr_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "relExpr"



    // $ANTLR start "andExpr"
    // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:84:1: andExpr returns [Expr result] : lhs= relExpr ( '&&' rhs= relExpr )* ;
    public final Expr andExpr() throws RecognitionException {
        Expr result = null;

        int andExpr_StartIndex = input.index();

        Expr lhs =null;

        Expr rhs =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return result; }

            // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:85:5: (lhs= relExpr ( '&&' rhs= relExpr )* )
            // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:85:9: lhs= relExpr ( '&&' rhs= relExpr )*
            {
            pushFollow(FOLLOW_relExpr_in_andExpr636);
            lhs=relExpr();

            state._fsp--;
            if (state.failed) return result;

            if ( state.backtracking==0 ) { result =lhs; }

            // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:85:46: ( '&&' rhs= relExpr )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==12) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:85:48: '&&' rhs= relExpr
            	    {
            	    match(input,12,FOLLOW_12_in_andExpr642); if (state.failed) return result;

            	    pushFollow(FOLLOW_relExpr_in_andExpr646);
            	    rhs=relExpr();

            	    state._fsp--;
            	    if (state.failed) return result;

            	    if ( state.backtracking==0 ) { result = new And(result, rhs); }

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 11, andExpr_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "andExpr"



    // $ANTLR start "orExpr"
    // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:89:1: orExpr returns [Expr result] : lhs= andExpr ( '||' rhs= andExpr )* ;
    public final Expr orExpr() throws RecognitionException {
        Expr result = null;

        int orExpr_StartIndex = input.index();

        Expr lhs =null;

        Expr rhs =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return result; }

            // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:90:5: (lhs= andExpr ( '||' rhs= andExpr )* )
            // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:90:9: lhs= andExpr ( '||' rhs= andExpr )*
            {
            pushFollow(FOLLOW_andExpr_in_orExpr681);
            lhs=andExpr();

            state._fsp--;
            if (state.failed) return result;

            if ( state.backtracking==0 ) { result = lhs; }

            // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:90:48: ( '||' rhs= andExpr )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==32) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:90:50: '||' rhs= andExpr
            	    {
            	    match(input,32,FOLLOW_32_in_orExpr687); if (state.failed) return result;

            	    pushFollow(FOLLOW_andExpr_in_orExpr691);
            	    rhs=andExpr();

            	    state._fsp--;
            	    if (state.failed) return result;

            	    if ( state.backtracking==0 ) { result = new Or(result, rhs); }

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 12, orExpr_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "orExpr"



    // $ANTLR start "type"
    // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:93:1: type returns [Type result] : ( 'integer' | 'string' | 'boolean' );
    public final Type type() throws RecognitionException {
        Type result = null;

        int type_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return result; }

            // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:94:5: ( 'integer' | 'string' | 'boolean' )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt16=1;
                }
                break;
            case 30:
                {
                alt16=2;
                }
                break;
            case 26:
                {
                alt16=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }

            switch (alt16) {
                case 1 :
                    // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:94:9: 'integer'
                    {
                    match(input,29,FOLLOW_29_in_type719); if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = new org.uva.sea.ql.ast.types.Int();    }

                    }
                    break;
                case 2 :
                    // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:95:9: 'string'
                    {
                    match(input,30,FOLLOW_30_in_type731); if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = new org.uva.sea.ql.ast.types.Str(); }

                    }
                    break;
                case 3 :
                    // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:96:9: 'boolean'
                    {
                    match(input,26,FOLLOW_26_in_type744); if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = new org.uva.sea.ql.ast.types.Bool();   }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 13, type_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "type"

    // $ANTLR start synpred6_QL
    public final void synpred6_QL_fragment() throws RecognitionException {
        FormStatement elseBody =null;


        // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:35:91: (elseBody= formStatement )
        // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:35:91: elseBody= formStatement
        {
        pushFollow(FOLLOW_formStatement_in_synpred6_QL213);
        elseBody=formStatement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred6_QL

    // $ANTLR start synpred7_QL
    public final void synpred7_QL_fragment() throws RecognitionException {
        // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:35:108: ( '}' )
        // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:35:108: '}'
        {
        match(input,33,FOLLOW_33_in_synpred7_QL217); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred7_QL

    // $ANTLR start synpred8_QL
    public final void synpred8_QL_fragment() throws RecognitionException {
        Expr condition =null;

        FormStatement ifBody =null;

        FormStatement elseBody =null;


        // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:35:9: ( 'if' '(' condition= orExpr ')' '{' (ifBody= formStatement )+ '}' 'else' ( '{' )? (elseBody= formStatement )+ ( '}' )? )
        // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:35:9: 'if' '(' condition= orExpr ')' '{' (ifBody= formStatement )+ '}' 'else' ( '{' )? (elseBody= formStatement )+ ( '}' )?
        {
        match(input,28,FOLLOW_28_in_synpred8_QL185); if (state.failed) return ;

        match(input,13,FOLLOW_13_in_synpred8_QL187); if (state.failed) return ;

        pushFollow(FOLLOW_orExpr_in_synpred8_QL191);
        condition=orExpr();

        state._fsp--;
        if (state.failed) return ;

        match(input,14,FOLLOW_14_in_synpred8_QL193); if (state.failed) return ;

        match(input,31,FOLLOW_31_in_synpred8_QL195); if (state.failed) return ;

        // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:35:49: (ifBody= formStatement )+
        int cnt17=0;
        loop17:
        do {
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==String||LA17_0==28) ) {
                alt17=1;
            }


            switch (alt17) {
        	case 1 :
        	    // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:35:49: ifBody= formStatement
        	    {
        	    pushFollow(FOLLOW_formStatement_in_synpred8_QL199);
        	    ifBody=formStatement();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt17 >= 1 ) break loop17;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(17, input);
                    throw eee;
            }
            cnt17++;
        } while (true);


        match(input,33,FOLLOW_33_in_synpred8_QL202); if (state.failed) return ;

        match(input,27,FOLLOW_27_in_synpred8_QL204); if (state.failed) return ;

        // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:35:76: ( '{' )?
        int alt18=2;
        int LA18_0 = input.LA(1);

        if ( (LA18_0==31) ) {
            alt18=1;
        }
        switch (alt18) {
            case 1 :
                // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:35:77: '{'
                {
                match(input,31,FOLLOW_31_in_synpred8_QL207); if (state.failed) return ;

                }
                break;

        }


        // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:35:91: (elseBody= formStatement )+
        int cnt19=0;
        loop19:
        do {
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==String||LA19_0==28) ) {
                alt19=1;
            }


            switch (alt19) {
        	case 1 :
        	    // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:35:91: elseBody= formStatement
        	    {
        	    pushFollow(FOLLOW_formStatement_in_synpred8_QL213);
        	    elseBody=formStatement();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt19 >= 1 ) break loop19;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(19, input);
                    throw eee;
            }
            cnt19++;
        } while (true);


        // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:35:107: ( '}' )?
        int alt20=2;
        int LA20_0 = input.LA(1);

        if ( (LA20_0==33) ) {
            alt20=1;
        }
        switch (alt20) {
            case 1 :
                // C:\\WINNT\\profiles\\6188583\\My Documents\\GitHub\\sea-of-ql\\edwinvm\\QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:35:108: '}'
                {
                match(input,33,FOLLOW_33_in_synpred8_QL217); if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred8_QL

    // Delegated rules

    public final boolean synpred7_QL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_QL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_QL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_QL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_QL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_QL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_primary_in_form39 = new BitSet(new long[]{0x00000000000021D2L});
    public static final BitSet FOLLOW_question_in_formStatement58 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_computedQuestion_in_formStatement78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionBlock_in_formStatement90 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_question117 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_Ident_in_question119 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_question121 = new BitSet(new long[]{0x0000000064000000L});
    public static final BitSet FOLLOW_type_in_question125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_computedQuestion152 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_Ident_in_computedQuestion154 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_computedQuestion156 = new BitSet(new long[]{0x00000000000325D0L});
    public static final BitSet FOLLOW_orExpr_in_computedQuestion160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_conditionBlock185 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_conditionBlock187 = new BitSet(new long[]{0x00000000000325D0L});
    public static final BitSet FOLLOW_orExpr_in_conditionBlock191 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_conditionBlock193 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_conditionBlock195 = new BitSet(new long[]{0x0000000010000100L});
    public static final BitSet FOLLOW_formStatement_in_conditionBlock199 = new BitSet(new long[]{0x0000000210000100L});
    public static final BitSet FOLLOW_33_in_conditionBlock202 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_conditionBlock204 = new BitSet(new long[]{0x0000000090000100L});
    public static final BitSet FOLLOW_31_in_conditionBlock207 = new BitSet(new long[]{0x0000000010000100L});
    public static final BitSet FOLLOW_formStatement_in_conditionBlock213 = new BitSet(new long[]{0x0000000210000102L});
    public static final BitSet FOLLOW_33_in_conditionBlock217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_conditionBlock239 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_conditionBlock241 = new BitSet(new long[]{0x00000000000325D0L});
    public static final BitSet FOLLOW_orExpr_in_conditionBlock245 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_conditionBlock247 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_conditionBlock249 = new BitSet(new long[]{0x0000000010000100L});
    public static final BitSet FOLLOW_formStatement_in_conditionBlock251 = new BitSet(new long[]{0x0000000210000100L});
    public static final BitSet FOLLOW_33_in_conditionBlock254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Int_in_primary287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Bool_in_primary302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_primary316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Ident_in_primary328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_primary341 = new BitSet(new long[]{0x00000000000325D0L});
    public static final BitSet FOLLOW_orExpr_in_primary345 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_primary347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_unExpr375 = new BitSet(new long[]{0x00000000000325D0L});
    public static final BitSet FOLLOW_unExpr_in_unExpr379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_unExpr391 = new BitSet(new long[]{0x00000000000325D0L});
    public static final BitSet FOLLOW_unExpr_in_unExpr395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_unExpr407 = new BitSet(new long[]{0x00000000000325D0L});
    public static final BitSet FOLLOW_unExpr_in_unExpr411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_unExpr425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unExpr_in_mulExpr463 = new BitSet(new long[]{0x0000000000048002L});
    public static final BitSet FOLLOW_set_in_mulExpr471 = new BitSet(new long[]{0x00000000000325D0L});
    public static final BitSet FOLLOW_unExpr_in_mulExpr483 = new BitSet(new long[]{0x0000000000048002L});
    public static final BitSet FOLLOW_mulExpr_in_addExpr521 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_set_in_addExpr529 = new BitSet(new long[]{0x00000000000325D0L});
    public static final BitSet FOLLOW_mulExpr_in_addExpr539 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_addExpr_in_relExpr574 = new BitSet(new long[]{0x0000000003B00802L});
    public static final BitSet FOLLOW_set_in_relExpr582 = new BitSet(new long[]{0x00000000000325D0L});
    public static final BitSet FOLLOW_addExpr_in_relExpr598 = new BitSet(new long[]{0x0000000003B00802L});
    public static final BitSet FOLLOW_relExpr_in_andExpr636 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_andExpr642 = new BitSet(new long[]{0x00000000000325D0L});
    public static final BitSet FOLLOW_relExpr_in_andExpr646 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_andExpr_in_orExpr681 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_orExpr687 = new BitSet(new long[]{0x00000000000325D0L});
    public static final BitSet FOLLOW_andExpr_in_orExpr691 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_29_in_type719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_type731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_type744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formStatement_in_synpred6_QL213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred7_QL217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred8_QL185 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred8_QL187 = new BitSet(new long[]{0x00000000000325D0L});
    public static final BitSet FOLLOW_orExpr_in_synpred8_QL191 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred8_QL193 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_synpred8_QL195 = new BitSet(new long[]{0x0000000010000100L});
    public static final BitSet FOLLOW_formStatement_in_synpred8_QL199 = new BitSet(new long[]{0x0000000210000100L});
    public static final BitSet FOLLOW_33_in_synpred8_QL202 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_synpred8_QL204 = new BitSet(new long[]{0x0000000090000100L});
    public static final BitSet FOLLOW_31_in_synpred8_QL207 = new BitSet(new long[]{0x0000000010000100L});
    public static final BitSet FOLLOW_formStatement_in_synpred8_QL213 = new BitSet(new long[]{0x0000000210000102L});
    public static final BitSet FOLLOW_33_in_synpred8_QL217 = new BitSet(new long[]{0x0000000000000002L});

}