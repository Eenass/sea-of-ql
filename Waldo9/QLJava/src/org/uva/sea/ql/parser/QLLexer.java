// $ANTLR 3.4 C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g 2013-01-28 14:18:11

	package org.uva.sea.ql.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class QLLexer extends Lexer {
    public static final int EOF=-1;
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
    public static final int T__34=34;
    public static final int Bool=4;
    public static final int COMMENT=5;
    public static final int Ident=6;
    public static final int Int=7;
    public static final int NEWLINE=8;
    public static final int String=9;
    public static final int WS=10;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public QLLexer() {} 
    public QLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public QLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:6:7: ( '!' )
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:6:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:7:7: ( '!=' )
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:7:9: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:8:7: ( '&&' )
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:8:9: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:9:7: ( '(' )
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:9:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:10:7: ( ')' )
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:10:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:11:7: ( '*' )
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:11:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:12:7: ( '+' )
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:12:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:13:7: ( '-' )
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:13:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:14:7: ( '/' )
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:14:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:15:7: ( ':' )
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:15:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:16:7: ( '<' )
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:16:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:17:7: ( '<=' )
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:17:9: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:18:7: ( '==' )
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:18:9: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:19:7: ( '>' )
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:19:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:20:7: ( '>=' )
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:20:9: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:21:7: ( 'bool' )
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:21:9: 'bool'
            {
            match("bool"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:22:7: ( 'else' )
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:22:9: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:23:7: ( 'form' )
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:23:9: 'form'
            {
            match("form"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:24:7: ( 'if' )
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:24:9: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:25:7: ( 'int' )
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:25:9: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:26:7: ( 'string' )
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:26:9: 'string'
            {
            match("string"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:27:7: ( '{' )
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:27:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:28:7: ( '||' )
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:28:9: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:29:7: ( '}' )
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:29:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:119:3: ( ( ' ' | '\\t' | NEWLINE ) )
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:119:5: ( ' ' | '\\t' | NEWLINE )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:121:8: ( ( '/*' ( . )* '*/' | '//' (~ ( NEWLINE ) )* ) )
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:121:10: ( '/*' ( . )* '*/' | '//' (~ ( NEWLINE ) )* )
            {
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:121:10: ( '/*' ( . )* '*/' | '//' (~ ( NEWLINE ) )* )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='/') ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='*') ) {
                    alt3=1;
                }
                else if ( (LA3_1=='/') ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:121:11: '/*' ( . )* '*/'
                    {
                    match("/*"); 



                    // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:121:16: ( . )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0=='*') ) {
                            int LA1_1 = input.LA(2);

                            if ( (LA1_1=='/') ) {
                                alt1=2;
                            }
                            else if ( ((LA1_1 >= '\u0000' && LA1_1 <= '.')||(LA1_1 >= '0' && LA1_1 <= '\uFFFF')) ) {
                                alt1=1;
                            }


                        }
                        else if ( ((LA1_0 >= '\u0000' && LA1_0 <= ')')||(LA1_0 >= '+' && LA1_0 <= '\uFFFF')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:121:16: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    match("*/"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:121:26: '//' (~ ( NEWLINE ) )*
                    {
                    match("//"); 



                    // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:121:31: (~ ( NEWLINE ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0 >= '\u0000' && LA2_0 <= '\t')||(LA2_0 >= '\u000B' && LA2_0 <= '\f')||(LA2_0 >= '\u000E' && LA2_0 <= '\uFFFF')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:123:17: ( ( '\\n' | '\\r' ) )
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:
            {
            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "String"
    public final void mString() throws RecognitionException {
        try {
            int _type = String;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:125:7: ( ( '\"' ( . )* '\"' ) )
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:125:9: ( '\"' ( . )* '\"' )
            {
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:125:9: ( '\"' ( . )* '\"' )
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:125:10: '\"' ( . )* '\"'
            {
            match('\"'); 

            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:125:14: ( . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\"') ) {
                    alt4=2;
                }
                else if ( ((LA4_0 >= '\u0000' && LA4_0 <= '!')||(LA4_0 >= '#' && LA4_0 <= '\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:125:14: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match('\"'); 

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "String"

    // $ANTLR start "Bool"
    public final void mBool() throws RecognitionException {
        try {
            int _type = Bool;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:127:5: ( ( 'true' | 'false' ) )
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:127:7: ( 'true' | 'false' )
            {
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:127:7: ( 'true' | 'false' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='t') ) {
                alt5=1;
            }
            else if ( (LA5_0=='f') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:127:8: 'true'
                    {
                    match("true"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:127:17: 'false'
                    {
                    match("false"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Bool"

    // $ANTLR start "Ident"
    public final void mIdent() throws RecognitionException {
        try {
            int _type = Ident;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:129:6: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:129:8: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:129:27: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||LA6_0=='_'||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Ident"

    // $ANTLR start "Int"
    public final void mInt() throws RecognitionException {
        try {
            int _type = Int;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:131:4: ( ( '0' .. '9' )+ )
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:131:6: ( '0' .. '9' )+
            {
            // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:131:6: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Int"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | WS | COMMENT | String | Bool | Ident | Int )
        int alt8=30;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:10: T__11
                {
                mT__11(); 


                }
                break;
            case 2 :
                // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:16: T__12
                {
                mT__12(); 


                }
                break;
            case 3 :
                // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:22: T__13
                {
                mT__13(); 


                }
                break;
            case 4 :
                // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:28: T__14
                {
                mT__14(); 


                }
                break;
            case 5 :
                // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:34: T__15
                {
                mT__15(); 


                }
                break;
            case 6 :
                // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:40: T__16
                {
                mT__16(); 


                }
                break;
            case 7 :
                // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:46: T__17
                {
                mT__17(); 


                }
                break;
            case 8 :
                // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:52: T__18
                {
                mT__18(); 


                }
                break;
            case 9 :
                // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:58: T__19
                {
                mT__19(); 


                }
                break;
            case 10 :
                // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:64: T__20
                {
                mT__20(); 


                }
                break;
            case 11 :
                // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:70: T__21
                {
                mT__21(); 


                }
                break;
            case 12 :
                // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:76: T__22
                {
                mT__22(); 


                }
                break;
            case 13 :
                // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:82: T__23
                {
                mT__23(); 


                }
                break;
            case 14 :
                // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:88: T__24
                {
                mT__24(); 


                }
                break;
            case 15 :
                // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:94: T__25
                {
                mT__25(); 


                }
                break;
            case 16 :
                // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:100: T__26
                {
                mT__26(); 


                }
                break;
            case 17 :
                // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:106: T__27
                {
                mT__27(); 


                }
                break;
            case 18 :
                // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:112: T__28
                {
                mT__28(); 


                }
                break;
            case 19 :
                // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:118: T__29
                {
                mT__29(); 


                }
                break;
            case 20 :
                // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:124: T__30
                {
                mT__30(); 


                }
                break;
            case 21 :
                // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:130: T__31
                {
                mT__31(); 


                }
                break;
            case 22 :
                // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:136: T__32
                {
                mT__32(); 


                }
                break;
            case 23 :
                // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:142: T__33
                {
                mT__33(); 


                }
                break;
            case 24 :
                // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:148: T__34
                {
                mT__34(); 


                }
                break;
            case 25 :
                // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:154: WS
                {
                mWS(); 


                }
                break;
            case 26 :
                // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:157: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 27 :
                // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:165: String
                {
                mString(); 


                }
                break;
            case 28 :
                // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:172: Bool
                {
                mBool(); 


                }
                break;
            case 29 :
                // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:177: Ident
                {
                mIdent(); 


                }
                break;
            case 30 :
                // C:\\Users\\Wouter Kwakernaak\\sea-of-ql\\Waldo9\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:183: Int
                {
                mInt(); 


                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\1\uffff\1\33\6\uffff\1\35\1\uffff\1\37\1\uffff\1\41\5\30\5\uffff"+
        "\1\30\12\uffff\4\30\1\56\7\30\1\uffff\1\66\2\30\1\71\1\72\1\73\1"+
        "\30\1\uffff\1\30\1\76\3\uffff\1\76\1\30\1\uffff\1\100\1\uffff";
    static final String DFA8_eofS =
        "\101\uffff";
    static final String DFA8_minS =
        "\1\11\1\75\6\uffff\1\52\1\uffff\1\75\1\uffff\1\75\1\157\1\154\1"+
        "\141\1\146\1\164\5\uffff\1\162\12\uffff\1\157\1\163\1\162\1\154"+
        "\1\60\1\164\1\162\1\165\1\154\1\145\1\155\1\163\1\uffff\1\60\1\151"+
        "\1\145\3\60\1\145\1\uffff\1\156\1\60\3\uffff\1\60\1\147\1\uffff"+
        "\1\60\1\uffff";
    static final String DFA8_maxS =
        "\1\175\1\75\6\uffff\1\57\1\uffff\1\75\1\uffff\1\75\1\157\1\154\1"+
        "\157\1\156\1\164\5\uffff\1\162\12\uffff\1\157\1\163\1\162\1\154"+
        "\1\172\1\164\1\162\1\165\1\154\1\145\1\155\1\163\1\uffff\1\172\1"+
        "\151\1\145\3\172\1\145\1\uffff\1\156\1\172\3\uffff\1\172\1\147\1"+
        "\uffff\1\172\1\uffff";
    static final String DFA8_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\12\1\uffff\1\15\6\uffff"+
        "\1\26\1\27\1\30\1\31\1\33\1\uffff\1\35\1\36\1\2\1\1\1\32\1\11\1"+
        "\14\1\13\1\17\1\16\14\uffff\1\23\7\uffff\1\24\2\uffff\1\20\1\21"+
        "\1\22\2\uffff\1\34\1\uffff\1\25";
    static final String DFA8_specialS =
        "\101\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\25\2\uffff\1\25\22\uffff\1\25\1\1\1\26\3\uffff\1\2\1\uffff"+
            "\1\3\1\4\1\5\1\6\1\uffff\1\7\1\uffff\1\10\12\31\1\11\1\uffff"+
            "\1\12\1\13\1\14\2\uffff\32\30\6\uffff\1\30\1\15\2\30\1\16\1"+
            "\17\2\30\1\20\11\30\1\21\1\27\6\30\1\22\1\23\1\24",
            "\1\32",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\34\4\uffff\1\34",
            "",
            "\1\36",
            "",
            "\1\40",
            "\1\42",
            "\1\43",
            "\1\45\15\uffff\1\44",
            "\1\46\7\uffff\1\47",
            "\1\50",
            "",
            "",
            "",
            "",
            "",
            "\1\51",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\67",
            "\1\70",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\74",
            "",
            "\1\75",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\77",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | WS | COMMENT | String | Bool | Ident | Int );";
        }
    }
 

}