// $ANTLR 3.5 C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g 2013-01-21 16:07:23

package org.uva.sea.ql.parser.antlr; 


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class QLLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int BACKSLASH=4;
	public static final int BOOLEAN=5;
	public static final int CL=6;
	public static final int COLON=7;
	public static final int COMMA=8;
	public static final int COMMENT=9;
	public static final int CURRENCY_DOLLAR=10;
	public static final int CURRENCY_EURO=11;
	public static final int DOUBLE_QUOTES=12;
	public static final int DQ=13;
	public static final int FORM=14;
	public static final int FORMIDENT=15;
	public static final int IDENT=16;
	public static final int IF=17;
	public static final int INT=18;
	public static final int INT_DIGIT=19;
	public static final int KEYWORD_BOOLEAN=20;
	public static final int KEYWORD_FALSE=21;
	public static final int KEYWORD_FORM=22;
	public static final int KEYWORD_IF=23;
	public static final int KEYWORD_MONEY=24;
	public static final int KEYWORD_TRUE=25;
	public static final int LB=26;
	public static final int LCB=27;
	public static final int LEFT_BRACKED=28;
	public static final int LEFT_CURLY_BRACKED=29;
	public static final int LINE_COMMENT=30;
	public static final int LOWERCASE_LETTER=31;
	public static final int MONEY=32;
	public static final int MONEY_COMMA=33;
	public static final int POINT=34;
	public static final int QUESTION_MARK=35;
	public static final int RB=36;
	public static final int RCB=37;
	public static final int RIGHT_BRACKED=38;
	public static final int RIGHT_CURLY_BRACKED=39;
	public static final int SINGLE_SPACE=40;
	public static final int STRING=41;
	public static final int UNDERSCORE=42;
	public static final int UPPERCASE_LETTER=43;
	public static final int WS=44;

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
	@Override public String getGrammarFileName() { return "C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g"; }

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:6:7: ( '!' )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:6:9: '!'
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
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:7:7: ( '!=' )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:7:9: '!='
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
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:8:7: ( '&&' )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:8:9: '&&'
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
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:9:7: ( '*' )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:9:9: '*'
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
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:10:7: ( '+' )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:10:9: '+'
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
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:11:7: ( '-' )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:11:9: '-'
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
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:12:7: ( '<' )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:12:9: '<'
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
	// $ANTLR end "T__51"

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:13:7: ( '<=' )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:13:9: '<='
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
	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:14:7: ( '==' )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:14:9: '=='
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
	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:15:7: ( '>' )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:15:9: '>'
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
	// $ANTLR end "T__54"

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:16:7: ( '>=' )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:16:9: '>='
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
	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:17:7: ( '||' )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:17:9: '||'
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
	// $ANTLR end "T__56"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:149:7: ( ( ' ' | '\\t' | '\\n' | '\\r' ) )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:149:9: ( ' ' | '\\t' | '\\n' | '\\r' )
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
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:151:10: ( '/*' ( . )* '*/' )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:151:12: '/*' ( . )* '*/'
			{
			match("/*"); 

			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:151:17: ( . )*
			loop1:
			while (true) {
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
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:151:17: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop1;
				}
			}

			match("*/"); 

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

	// $ANTLR start "LINE_COMMENT"
	public final void mLINE_COMMENT() throws RecognitionException {
		try {
			int _type = LINE_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:153:14: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:153:16: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
			{
			match("//"); 

			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:153:21: (~ ( '\\n' | '\\r' ) )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '\u0000' && LA2_0 <= '\t')||(LA2_0 >= '\u000B' && LA2_0 <= '\f')||(LA2_0 >= '\u000E' && LA2_0 <= '\uFFFF')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:
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
			}

			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:153:35: ( '\\r' )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='\r') ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:153:35: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LINE_COMMENT"

	// $ANTLR start "FORM"
	public final void mFORM() throws RecognitionException {
		try {
			int _type = FORM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:158:7: ( KEYWORD_FORM )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:158:9: KEYWORD_FORM
			{
			mKEYWORD_FORM(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FORM"

	// $ANTLR start "FORMIDENT"
	public final void mFORMIDENT() throws RecognitionException {
		try {
			int _type = FORMIDENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:159:12: ( ( UPPERCASE_LETTER ) ( LOWERCASE_LETTER | UPPERCASE_LETTER | INT_DIGIT )* )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:159:14: ( UPPERCASE_LETTER ) ( LOWERCASE_LETTER | UPPERCASE_LETTER | INT_DIGIT )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:159:34: ( LOWERCASE_LETTER | UPPERCASE_LETTER | INT_DIGIT )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					break loop4;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FORMIDENT"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:161:5: ( KEYWORD_IF )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:161:7: KEYWORD_IF
			{
			mKEYWORD_IF(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "BOOLEAN"
	public final void mBOOLEAN() throws RecognitionException {
		try {
			int _type = BOOLEAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:164:2: ( ( KEYWORD_BOOLEAN | KEYWORD_TRUE | KEYWORD_FALSE ) )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:164:4: ( KEYWORD_BOOLEAN | KEYWORD_TRUE | KEYWORD_FALSE )
			{
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:164:4: ( KEYWORD_BOOLEAN | KEYWORD_TRUE | KEYWORD_FALSE )
			int alt5=3;
			switch ( input.LA(1) ) {
			case 'B':
			case 'b':
				{
				alt5=1;
				}
				break;
			case 'T':
			case 't':
				{
				alt5=2;
				}
				break;
			case 'F':
			case 'f':
				{
				alt5=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:164:6: KEYWORD_BOOLEAN
					{
					mKEYWORD_BOOLEAN(); 

					}
					break;
				case 2 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:164:24: KEYWORD_TRUE
					{
					mKEYWORD_TRUE(); 

					}
					break;
				case 3 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:164:39: KEYWORD_FALSE
					{
					mKEYWORD_FALSE(); 

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
	// $ANTLR end "BOOLEAN"

	// $ANTLR start "MONEY"
	public final void mMONEY() throws RecognitionException {
		try {
			int _type = MONEY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:167:2: ( ( KEYWORD_MONEY ) )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:167:4: ( KEYWORD_MONEY )
			{
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:167:4: ( KEYWORD_MONEY )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:167:6: KEYWORD_MONEY
			{
			mKEYWORD_MONEY(); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MONEY"

	// $ANTLR start "IDENT"
	public final void mIDENT() throws RecognitionException {
		try {
			int _type = IDENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:170:2: ( ( LOWERCASE_LETTER ) ( LOWERCASE_LETTER | UPPERCASE_LETTER | INT_DIGIT | UNDERSCORE )* )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:170:4: ( LOWERCASE_LETTER ) ( LOWERCASE_LETTER | UPPERCASE_LETTER | INT_DIGIT | UNDERSCORE )*
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:170:25: ( LOWERCASE_LETTER | UPPERCASE_LETTER | INT_DIGIT | UNDERSCORE )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||LA6_0=='_'||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:
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
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDENT"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:173:2: ( ( DQ ) ( LOWERCASE_LETTER | UPPERCASE_LETTER | INT_DIGIT | UNDERSCORE | QUESTION_MARK | COLON | SINGLE_SPACE | BACKSLASH )* ( DQ ) )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:173:4: ( DQ ) ( LOWERCASE_LETTER | UPPERCASE_LETTER | INT_DIGIT | UNDERSCORE | QUESTION_MARK | COLON | SINGLE_SPACE | BACKSLASH )* ( DQ )
			{
			if ( input.LA(1)=='\"' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:173:9: ( LOWERCASE_LETTER | UPPERCASE_LETTER | INT_DIGIT | UNDERSCORE | QUESTION_MARK | COLON | SINGLE_SPACE | BACKSLASH )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==' '||(LA7_0 >= '/' && LA7_0 <= ':')||LA7_0=='?'||(LA7_0 >= 'A' && LA7_0 <= 'Z')||LA7_0=='_'||(LA7_0 >= 'a' && LA7_0 <= 'z')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:
					{
					if ( input.LA(1)==' '||(input.LA(1) >= '/' && input.LA(1) <= ':')||input.LA(1)=='?'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					break loop7;
				}
			}

			if ( input.LA(1)=='\"' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:176:2: ( ( INT_DIGIT )+ )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:176:4: ( INT_DIGIT )+
			{
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:176:4: ( INT_DIGIT )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:
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
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "MONEY_COMMA"
	public final void mMONEY_COMMA() throws RecognitionException {
		try {
			int _type = MONEY_COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:181:2: ( ( POINT | COMMA ) )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:
			{
			if ( input.LA(1)==','||input.LA(1)=='.' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MONEY_COMMA"

	// $ANTLR start "LB"
	public final void mLB() throws RecognitionException {
		try {
			int _type = LB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:183:5: ( LEFT_BRACKED )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:
			{
			if ( input.LA(1)=='(' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LB"

	// $ANTLR start "RB"
	public final void mRB() throws RecognitionException {
		try {
			int _type = RB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:184:5: ( RIGHT_BRACKED )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:
			{
			if ( input.LA(1)==')' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RB"

	// $ANTLR start "LCB"
	public final void mLCB() throws RecognitionException {
		try {
			int _type = LCB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:185:5: ( LEFT_CURLY_BRACKED )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:
			{
			if ( input.LA(1)=='{' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LCB"

	// $ANTLR start "RCB"
	public final void mRCB() throws RecognitionException {
		try {
			int _type = RCB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:186:5: ( RIGHT_CURLY_BRACKED )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:
			{
			if ( input.LA(1)=='}' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RCB"

	// $ANTLR start "CL"
	public final void mCL() throws RecognitionException {
		try {
			int _type = CL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:187:4: ( COLON )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:
			{
			if ( input.LA(1)==':' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CL"

	// $ANTLR start "DQ"
	public final void mDQ() throws RecognitionException {
		try {
			int _type = DQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:188:4: ( DOUBLE_QUOTES )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:
			{
			if ( input.LA(1)=='\"' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DQ"

	// $ANTLR start "INT_DIGIT"
	public final void mINT_DIGIT() throws RecognitionException {
		try {
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:195:2: ( '0' .. '9' )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:
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

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_DIGIT"

	// $ANTLR start "UNDERSCORE"
	public final void mUNDERSCORE() throws RecognitionException {
		try {
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:199:2: ( ( '_' ) )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:199:4: ( '_' )
			{
			if ( input.LA(1)=='_' ) {
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
	// $ANTLR end "UNDERSCORE"

	// $ANTLR start "UPPERCASE_LETTER"
	public final void mUPPERCASE_LETTER() throws RecognitionException {
		try {
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:203:2: ( 'A' .. 'Z' )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
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
	// $ANTLR end "UPPERCASE_LETTER"

	// $ANTLR start "LOWERCASE_LETTER"
	public final void mLOWERCASE_LETTER() throws RecognitionException {
		try {
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:207:2: ( 'a' .. 'z' )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
	// $ANTLR end "LOWERCASE_LETTER"

	// $ANTLR start "DOUBLE_QUOTES"
	public final void mDOUBLE_QUOTES() throws RecognitionException {
		try {
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:211:2: ( '\"' )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:211:4: '\"'
			{
			match('\"'); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOUBLE_QUOTES"

	// $ANTLR start "SINGLE_SPACE"
	public final void mSINGLE_SPACE() throws RecognitionException {
		try {
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:215:2: ( ' ' )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:215:4: ' '
			{
			match(' '); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SINGLE_SPACE"

	// $ANTLR start "QUESTION_MARK"
	public final void mQUESTION_MARK() throws RecognitionException {
		try {
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:219:2: ( '?' )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:219:4: '?'
			{
			match('?'); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUESTION_MARK"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:223:2: ( ':' )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:223:4: ':'
			{
			match(':'); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "BACKSLASH"
	public final void mBACKSLASH() throws RecognitionException {
		try {
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:227:2: ( '/' )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:227:4: '/'
			{
			match('/'); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BACKSLASH"

	// $ANTLR start "CURRENCY_EURO"
	public final void mCURRENCY_EURO() throws RecognitionException {
		try {
			int _type = CURRENCY_EURO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:229:2: ( '�' )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:229:4: '�'
			{
			match('\u20AC'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CURRENCY_EURO"

	// $ANTLR start "CURRENCY_DOLLAR"
	public final void mCURRENCY_DOLLAR() throws RecognitionException {
		try {
			int _type = CURRENCY_DOLLAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:232:2: ( '$' )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:232:4: '$'
			{
			match('$'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CURRENCY_DOLLAR"

	// $ANTLR start "LEFT_CURLY_BRACKED"
	public final void mLEFT_CURLY_BRACKED() throws RecognitionException {
		try {
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:237:2: ( '{' )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:237:4: '{'
			{
			match('{'); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LEFT_CURLY_BRACKED"

	// $ANTLR start "RIGHT_CURLY_BRACKED"
	public final void mRIGHT_CURLY_BRACKED() throws RecognitionException {
		try {
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:241:2: ( '}' )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:241:4: '}'
			{
			match('}'); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RIGHT_CURLY_BRACKED"

	// $ANTLR start "LEFT_BRACKED"
	public final void mLEFT_BRACKED() throws RecognitionException {
		try {
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:245:2: ( '(' )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:245:4: '('
			{
			match('('); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LEFT_BRACKED"

	// $ANTLR start "RIGHT_BRACKED"
	public final void mRIGHT_BRACKED() throws RecognitionException {
		try {
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:249:2: ( ')' )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:249:4: ')'
			{
			match(')'); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RIGHT_BRACKED"

	// $ANTLR start "POINT"
	public final void mPOINT() throws RecognitionException {
		try {
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:253:2: ( '.' )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:253:4: '.'
			{
			match('.'); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POINT"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:257:2: ( ',' )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:257:4: ','
			{
			match(','); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "KEYWORD_TRUE"
	public final void mKEYWORD_TRUE() throws RecognitionException {
		try {
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:261:2: ( 'true' | 'True' )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='t') ) {
				alt9=1;
			}
			else if ( (LA9_0=='T') ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:261:4: 'true'
					{
					match("true"); 

					}
					break;
				case 2 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:261:13: 'True'
					{
					match("True"); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_TRUE"

	// $ANTLR start "KEYWORD_FALSE"
	public final void mKEYWORD_FALSE() throws RecognitionException {
		try {
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:265:2: ( 'false' | 'False' )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='f') ) {
				alt10=1;
			}
			else if ( (LA10_0=='F') ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:265:4: 'false'
					{
					match("false"); 

					}
					break;
				case 2 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:265:14: 'False'
					{
					match("False"); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_FALSE"

	// $ANTLR start "KEYWORD_BOOLEAN"
	public final void mKEYWORD_BOOLEAN() throws RecognitionException {
		try {
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:269:2: ( 'boolean' | 'Boolean' )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='b') ) {
				alt11=1;
			}
			else if ( (LA11_0=='B') ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:269:4: 'boolean'
					{
					match("boolean"); 

					}
					break;
				case 2 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:269:16: 'Boolean'
					{
					match("Boolean"); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_BOOLEAN"

	// $ANTLR start "KEYWORD_MONEY"
	public final void mKEYWORD_MONEY() throws RecognitionException {
		try {
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:273:2: ( 'money' | 'Money' )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='m') ) {
				alt12=1;
			}
			else if ( (LA12_0=='M') ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:273:4: 'money'
					{
					match("money"); 

					}
					break;
				case 2 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:273:14: 'Money'
					{
					match("Money"); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_MONEY"

	// $ANTLR start "KEYWORD_FORM"
	public final void mKEYWORD_FORM() throws RecognitionException {
		try {
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:277:2: ( 'form' | 'Form' )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='f') ) {
				alt13=1;
			}
			else if ( (LA13_0=='F') ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:277:4: 'form'
					{
					match("form"); 

					}
					break;
				case 2 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:277:13: 'Form'
					{
					match("Form"); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_FORM"

	// $ANTLR start "KEYWORD_IF"
	public final void mKEYWORD_IF() throws RecognitionException {
		try {
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:281:2: ( 'if' | 'If' )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0=='i') ) {
				alt14=1;
			}
			else if ( (LA14_0=='I') ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:281:4: 'if'
					{
					match("if"); 

					}
					break;
				case 2 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:281:11: 'If'
					{
					match("If"); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_IF"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:8: ( T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | WS | COMMENT | LINE_COMMENT | FORM | FORMIDENT | IF | BOOLEAN | MONEY | IDENT | STRING | INT | MONEY_COMMA | LB | RB | LCB | RCB | CL | DQ | CURRENCY_EURO | CURRENCY_DOLLAR )
		int alt15=32;
		alt15 = dfa15.predict(input);
		switch (alt15) {
			case 1 :
				// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:10: T__45
				{
				mT__45(); 

				}
				break;
			case 2 :
				// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:16: T__46
				{
				mT__46(); 

				}
				break;
			case 3 :
				// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:22: T__47
				{
				mT__47(); 

				}
				break;
			case 4 :
				// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:28: T__48
				{
				mT__48(); 

				}
				break;
			case 5 :
				// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:34: T__49
				{
				mT__49(); 

				}
				break;
			case 6 :
				// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:40: T__50
				{
				mT__50(); 

				}
				break;
			case 7 :
				// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:46: T__51
				{
				mT__51(); 

				}
				break;
			case 8 :
				// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:52: T__52
				{
				mT__52(); 

				}
				break;
			case 9 :
				// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:58: T__53
				{
				mT__53(); 

				}
				break;
			case 10 :
				// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:64: T__54
				{
				mT__54(); 

				}
				break;
			case 11 :
				// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:70: T__55
				{
				mT__55(); 

				}
				break;
			case 12 :
				// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:76: T__56
				{
				mT__56(); 

				}
				break;
			case 13 :
				// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:82: WS
				{
				mWS(); 

				}
				break;
			case 14 :
				// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:85: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 15 :
				// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:93: LINE_COMMENT
				{
				mLINE_COMMENT(); 

				}
				break;
			case 16 :
				// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:106: FORM
				{
				mFORM(); 

				}
				break;
			case 17 :
				// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:111: FORMIDENT
				{
				mFORMIDENT(); 

				}
				break;
			case 18 :
				// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:121: IF
				{
				mIF(); 

				}
				break;
			case 19 :
				// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:124: BOOLEAN
				{
				mBOOLEAN(); 

				}
				break;
			case 20 :
				// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:132: MONEY
				{
				mMONEY(); 

				}
				break;
			case 21 :
				// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:138: IDENT
				{
				mIDENT(); 

				}
				break;
			case 22 :
				// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:144: STRING
				{
				mSTRING(); 

				}
				break;
			case 23 :
				// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:151: INT
				{
				mINT(); 

				}
				break;
			case 24 :
				// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:155: MONEY_COMMA
				{
				mMONEY_COMMA(); 

				}
				break;
			case 25 :
				// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:167: LB
				{
				mLB(); 

				}
				break;
			case 26 :
				// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:170: RB
				{
				mRB(); 

				}
				break;
			case 27 :
				// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:173: LCB
				{
				mLCB(); 

				}
				break;
			case 28 :
				// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:177: RCB
				{
				mRCB(); 

				}
				break;
			case 29 :
				// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:181: CL
				{
				mCL(); 

				}
				break;
			case 30 :
				// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:184: DQ
				{
				mDQ(); 

				}
				break;
			case 31 :
				// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:187: CURRENCY_EURO
				{
				mCURRENCY_EURO(); 

				}
				break;
			case 32 :
				// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:1:201: CURRENCY_DOLLAR
				{
				mCURRENCY_DOLLAR(); 

				}
				break;

		}
	}


	protected DFA15 dfa15 = new DFA15(this);
	static final String DFA15_eotS =
		"\1\uffff\1\43\4\uffff\1\45\1\uffff\1\47\3\uffff\1\27\2\26\1\27\1\26\1"+
		"\27\1\26\1\27\1\26\1\27\2\uffff\1\67\21\uffff\2\27\2\26\1\uffff\1\74\1"+
		"\26\1\27\1\26\1\27\1\26\1\27\2\uffff\2\27\2\26\1\uffff\1\26\1\27\1\26"+
		"\1\27\1\26\1\27\1\115\1\27\1\115\2\26\1\27\1\uffff\1\122\1\26\1\27\1\uffff"+
		"\1\122\1\uffff\1\26\1\27\2\uffff\1\127\1\26\1\27\2\uffff\1\122";
	static final String DFA15_eofS =
		"\132\uffff";
	static final String DFA15_minS =
		"\1\11\1\75\4\uffff\1\75\1\uffff\1\75\2\uffff\1\52\2\141\2\146\2\157\2"+
		"\162\2\157\2\uffff\1\40\21\uffff\1\162\1\154\1\162\1\154\1\uffff\1\60"+
		"\2\157\2\165\2\156\2\uffff\1\155\1\163\1\155\1\163\1\uffff\2\154\4\145"+
		"\1\60\1\145\1\60\3\145\1\uffff\1\60\2\171\1\uffff\1\60\1\uffff\2\141\2"+
		"\uffff\1\60\2\156\2\uffff\1\60";
	static final String DFA15_maxS =
		"\1\u20ac\1\75\4\uffff\1\75\1\uffff\1\75\2\uffff\1\57\2\157\2\146\2\157"+
		"\2\162\2\157\2\uffff\1\172\21\uffff\1\162\1\154\1\162\1\154\1\uffff\1"+
		"\172\2\157\2\165\2\156\2\uffff\1\155\1\163\1\155\1\163\1\uffff\2\154\4"+
		"\145\1\172\1\145\1\172\3\145\1\uffff\1\172\2\171\1\uffff\1\172\1\uffff"+
		"\2\141\2\uffff\1\172\2\156\2\uffff\1\172";
	static final String DFA15_acceptS =
		"\2\uffff\1\3\1\4\1\5\1\6\1\uffff\1\11\1\uffff\1\14\1\15\13\uffff\1\21"+
		"\1\25\1\uffff\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\37\1\40\1\2\1\1\1\10"+
		"\1\7\1\13\1\12\1\16\1\17\4\uffff\1\21\7\uffff\1\26\1\36\4\uffff\1\22\14"+
		"\uffff\1\21\3\uffff\1\20\1\uffff\1\21\2\uffff\1\23\1\21\3\uffff\1\24\1"+
		"\21\1\uffff";
	static final String DFA15_specialS =
		"\132\uffff}>";
	static final String[] DFA15_transitionS = {
			"\2\12\2\uffff\1\12\22\uffff\1\12\1\1\1\30\1\uffff\1\41\1\uffff\1\2\1"+
			"\uffff\1\33\1\34\1\3\1\4\1\32\1\5\1\32\1\13\12\31\1\37\1\uffff\1\6\1"+
			"\7\1\10\2\uffff\1\26\1\20\3\26\1\15\2\26\1\16\3\26\1\24\6\26\1\22\6\26"+
			"\6\uffff\1\27\1\21\3\27\1\14\2\27\1\17\3\27\1\25\6\27\1\23\6\27\1\35"+
			"\1\11\1\36\u202e\uffff\1\40",
			"\1\42",
			"",
			"",
			"",
			"",
			"\1\44",
			"",
			"\1\46",
			"",
			"",
			"\1\50\4\uffff\1\51",
			"\1\53\15\uffff\1\52",
			"\1\55\15\uffff\1\54",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"",
			"",
			"\1\66\1\uffff\1\66\14\uffff\14\66\4\uffff\1\66\1\uffff\32\66\4\uffff"+
			"\1\66\1\uffff\32\66",
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
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\73",
			"",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"",
			"",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\116",
			"\12\26\7\uffff\32\26\6\uffff\32\26",
			"\1\117",
			"\1\120",
			"\1\121",
			"",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\123",
			"\1\124",
			"",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"",
			"\1\125",
			"\1\126",
			"",
			"",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\130",
			"\1\131",
			"",
			"",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27"
	};

	static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
	static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
	static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
	static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
	static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
	static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
	static final short[][] DFA15_transition;

	static {
		int numStates = DFA15_transitionS.length;
		DFA15_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
		}
	}

	protected class DFA15 extends DFA {

		public DFA15(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 15;
			this.eot = DFA15_eot;
			this.eof = DFA15_eof;
			this.min = DFA15_min;
			this.max = DFA15_max;
			this.accept = DFA15_accept;
			this.special = DFA15_special;
			this.transition = DFA15_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | WS | COMMENT | LINE_COMMENT | FORM | FORMIDENT | IF | BOOLEAN | MONEY | IDENT | STRING | INT | MONEY_COMMA | LB | RB | LCB | RCB | CL | DQ | CURRENCY_EURO | CURRENCY_DOLLAR );";
		}
	}

}
