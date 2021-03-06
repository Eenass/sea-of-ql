// $ANTLR 3.5 /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g 2013-02-18 11:08:42

package org.uva.sea.ql.parser.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class QLLexer extends Lexer {
	public static final int EOF=-1;
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
	public static final int T__35=35;
	public static final int BooleanLiteral=4;
	public static final int COLON=5;
	public static final int COMMENT=6;
	public static final int Ident=7;
	public static final int IntegerLiteral=8;
	public static final int LBRACE=9;
	public static final int MoneyLiteral=10;
	public static final int RBRACE=11;
	public static final int StringLiteral=12;
	public static final int WS=13;

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
	@Override public String getGrammarFileName() { return "/Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g"; }

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:6:7: ( '!' )
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:6:9: '!'
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
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:7:7: ( '!=' )
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:7:9: '!='
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
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:8:7: ( '&&' )
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:8:9: '&&'
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
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:9:7: ( '(' )
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:9:9: '('
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
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:10:7: ( ')' )
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:10:9: ')'
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
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:11:7: ( '*' )
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:11:9: '*'
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
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:12:7: ( '+' )
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:12:9: '+'
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
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:13:7: ( '-' )
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:13:9: '-'
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
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:14:7: ( '/' )
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:14:9: '/'
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
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:15:7: ( '<' )
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:15:9: '<'
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
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:16:7: ( '<=' )
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:16:9: '<='
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
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:17:7: ( '==' )
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:17:9: '=='
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
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:18:7: ( '>' )
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:18:9: '>'
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
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:19:7: ( '>=' )
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:19:9: '>='
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
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:20:7: ( 'boolean' )
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:20:9: 'boolean'
			{
			match("boolean"); 

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
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:21:7: ( 'else' )
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:21:9: 'else'
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
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:22:7: ( 'form' )
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:22:9: 'form'
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
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:23:7: ( 'if' )
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:23:9: 'if'
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
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:24:7: ( 'integer' )
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:24:9: 'integer'
			{
			match("integer"); 

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
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:25:7: ( 'money' )
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:25:9: 'money'
			{
			match("money"); 

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
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:26:7: ( 'string' )
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:26:9: 'string'
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
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:27:7: ( '||' )
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:27:9: '||'
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
	// $ANTLR end "T__35"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:135:5: ( ( ' ' | '\\t' | '\\n' | '\\r' ) )
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:135:7: ( ' ' | '\\t' | '\\n' | '\\r' )
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

	// $ANTLR start "StringLiteral"
	public final void mStringLiteral() throws RecognitionException {
		try {
			int _type = StringLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:139:15: ( '\"' (~ ( '\\n' | '\\r' | '\\f' | '\"' ) )* '\"' )
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:139:17: '\"' (~ ( '\\n' | '\\r' | '\\f' | '\"' ) )* '\"'
			{
			match('\"'); 
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:139:21: (~ ( '\\n' | '\\r' | '\\f' | '\"' ) )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||LA1_0=='\u000B'||(LA1_0 >= '\u000E' && LA1_0 <= '!')||(LA1_0 >= '#' && LA1_0 <= '\uFFFF')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||input.LA(1)=='\u000B'||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
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
					break loop1;
				}
			}

			match('\"'); 
			setText(getText().substring(1, getText().length()-1));
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "StringLiteral"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:141:8: ( ':' )
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:141:10: ':'
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
	// $ANTLR end "COLON"

	// $ANTLR start "LBRACE"
	public final void mLBRACE() throws RecognitionException {
		try {
			int _type = LBRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:142:8: ( '{' )
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:142:10: '{'
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
	// $ANTLR end "LBRACE"

	// $ANTLR start "RBRACE"
	public final void mRBRACE() throws RecognitionException {
		try {
			int _type = RBRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:143:8: ( '}' )
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:143:10: '}'
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
	// $ANTLR end "RBRACE"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:146:5: ( '/*' ( . )* '*/' | '//' (~ '\\n' )* )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='/') ) {
				int LA4_1 = input.LA(2);
				if ( (LA4_1=='*') ) {
					alt4=1;
				}
				else if ( (LA4_1=='/') ) {
					alt4=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:146:7: '/*' ( . )* '*/'
					{
					match("/*"); 

					// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:146:12: ( . )*
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( (LA2_0=='*') ) {
							int LA2_1 = input.LA(2);
							if ( (LA2_1=='/') ) {
								alt2=2;
							}
							else if ( ((LA2_1 >= '\u0000' && LA2_1 <= '.')||(LA2_1 >= '0' && LA2_1 <= '\uFFFF')) ) {
								alt2=1;
							}

						}
						else if ( ((LA2_0 >= '\u0000' && LA2_0 <= ')')||(LA2_0 >= '+' && LA2_0 <= '\uFFFF')) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:146:12: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop2;
						}
					}

					match("*/"); 

					_channel=HIDDEN;
					}
					break;
				case 2 :
					// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:147:7: '//' (~ '\\n' )*
					{
					match("//"); 

					// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:147:12: (~ '\\n' )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\uFFFF')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\uFFFF') ) {
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
							break loop3;
						}
					}

					_channel=HIDDEN;
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "BooleanLiteral"
	public final void mBooleanLiteral() throws RecognitionException {
		try {
			int _type = BooleanLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:151:5: ( 'true' | 'false' | 'TRUE' | 'FALSE' )
			int alt5=4;
			switch ( input.LA(1) ) {
			case 't':
				{
				alt5=1;
				}
				break;
			case 'f':
				{
				alt5=2;
				}
				break;
			case 'T':
				{
				alt5=3;
				}
				break;
			case 'F':
				{
				alt5=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:151:7: 'true'
					{
					match("true"); 

					}
					break;
				case 2 :
					// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:151:15: 'false'
					{
					match("false"); 

					}
					break;
				case 3 :
					// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:151:25: 'TRUE'
					{
					match("TRUE"); 

					}
					break;
				case 4 :
					// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:151:34: 'FALSE'
					{
					match("FALSE"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BooleanLiteral"

	// $ANTLR start "Ident"
	public final void mIdent() throws RecognitionException {
		try {
			int _type = Ident;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:154:6: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:154:10: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:154:29: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||LA6_0=='_'||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:
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
	// $ANTLR end "Ident"

	// $ANTLR start "IntegerLiteral"
	public final void mIntegerLiteral() throws RecognitionException {
		try {
			int _type = IntegerLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:156:15: ( ( '0' .. '9' )+ )
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:156:17: ( '0' .. '9' )+
			{
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:156:17: ( '0' .. '9' )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:
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
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IntegerLiteral"

	// $ANTLR start "MoneyLiteral"
	public final void mMoneyLiteral() throws RecognitionException {
		try {
			int _type = MoneyLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:158:13: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ ) )
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:158:15: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )
			{
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:158:15: ( '0' .. '9' )+
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
					// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:
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

			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:158:27: ( '.' ( '0' .. '9' )+ )
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:158:28: '.' ( '0' .. '9' )+
			{
			match('.'); 
			// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:158:32: ( '0' .. '9' )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:
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
					if ( cnt9 >= 1 ) break loop9;
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
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
	// $ANTLR end "MoneyLiteral"

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | WS | StringLiteral | COLON | LBRACE | RBRACE | COMMENT | BooleanLiteral | Ident | IntegerLiteral | MoneyLiteral )
		int alt10=32;
		alt10 = dfa10.predict(input);
		switch (alt10) {
			case 1 :
				// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:1:10: T__14
				{
				mT__14(); 

				}
				break;
			case 2 :
				// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:1:16: T__15
				{
				mT__15(); 

				}
				break;
			case 3 :
				// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:1:22: T__16
				{
				mT__16(); 

				}
				break;
			case 4 :
				// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:1:28: T__17
				{
				mT__17(); 

				}
				break;
			case 5 :
				// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:1:34: T__18
				{
				mT__18(); 

				}
				break;
			case 6 :
				// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:1:40: T__19
				{
				mT__19(); 

				}
				break;
			case 7 :
				// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:1:46: T__20
				{
				mT__20(); 

				}
				break;
			case 8 :
				// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:1:52: T__21
				{
				mT__21(); 

				}
				break;
			case 9 :
				// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:1:58: T__22
				{
				mT__22(); 

				}
				break;
			case 10 :
				// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:1:64: T__23
				{
				mT__23(); 

				}
				break;
			case 11 :
				// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:1:70: T__24
				{
				mT__24(); 

				}
				break;
			case 12 :
				// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:1:76: T__25
				{
				mT__25(); 

				}
				break;
			case 13 :
				// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:1:82: T__26
				{
				mT__26(); 

				}
				break;
			case 14 :
				// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:1:88: T__27
				{
				mT__27(); 

				}
				break;
			case 15 :
				// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:1:94: T__28
				{
				mT__28(); 

				}
				break;
			case 16 :
				// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:1:100: T__29
				{
				mT__29(); 

				}
				break;
			case 17 :
				// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:1:106: T__30
				{
				mT__30(); 

				}
				break;
			case 18 :
				// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:1:112: T__31
				{
				mT__31(); 

				}
				break;
			case 19 :
				// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:1:118: T__32
				{
				mT__32(); 

				}
				break;
			case 20 :
				// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:1:124: T__33
				{
				mT__33(); 

				}
				break;
			case 21 :
				// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:1:130: T__34
				{
				mT__34(); 

				}
				break;
			case 22 :
				// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:1:136: T__35
				{
				mT__35(); 

				}
				break;
			case 23 :
				// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:1:142: WS
				{
				mWS(); 

				}
				break;
			case 24 :
				// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:1:145: StringLiteral
				{
				mStringLiteral(); 

				}
				break;
			case 25 :
				// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:1:159: COLON
				{
				mCOLON(); 

				}
				break;
			case 26 :
				// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:1:165: LBRACE
				{
				mLBRACE(); 

				}
				break;
			case 27 :
				// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:1:172: RBRACE
				{
				mRBRACE(); 

				}
				break;
			case 28 :
				// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:1:179: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 29 :
				// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:1:187: BooleanLiteral
				{
				mBooleanLiteral(); 

				}
				break;
			case 30 :
				// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:1:202: Ident
				{
				mIdent(); 

				}
				break;
			case 31 :
				// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:1:208: IntegerLiteral
				{
				mIntegerLiteral(); 

				}
				break;
			case 32 :
				// /Users/Ferry/sea-of-ql/FerryRiet/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:1:223: MoneyLiteral
				{
				mMoneyLiteral(); 

				}
				break;

		}
	}


	protected DFA10 dfa10 = new DFA10(this);
	static final String DFA10_eotS =
		"\1\uffff\1\36\6\uffff\1\40\1\42\1\uffff\1\44\6\33\6\uffff\3\33\1\uffff"+
		"\1\60\10\uffff\4\33\1\66\6\33\2\uffff\4\33\1\uffff\7\33\1\110\1\111\4"+
		"\33\2\116\2\33\2\uffff\1\116\1\33\1\122\1\33\1\uffff\1\116\2\33\1\uffff"+
		"\1\126\1\127\1\130\3\uffff";
	static final String DFA10_eofS =
		"\131\uffff";
	static final String DFA10_minS =
		"\1\11\1\75\6\uffff\1\52\1\75\1\uffff\1\75\1\157\1\154\1\141\1\146\1\157"+
		"\1\164\6\uffff\1\162\1\122\1\101\1\uffff\1\56\10\uffff\1\157\1\163\1\162"+
		"\1\154\1\60\1\164\1\156\1\162\1\165\1\125\1\114\2\uffff\1\154\1\145\1"+
		"\155\1\163\1\uffff\2\145\1\151\1\145\1\105\1\123\1\145\2\60\1\145\1\147"+
		"\1\171\1\156\2\60\1\105\1\141\2\uffff\1\60\1\145\1\60\1\147\1\uffff\1"+
		"\60\1\156\1\162\1\uffff\3\60\3\uffff";
	static final String DFA10_maxS =
		"\1\175\1\75\6\uffff\1\57\1\75\1\uffff\1\75\1\157\1\154\1\157\1\156\1\157"+
		"\1\164\6\uffff\1\162\1\122\1\101\1\uffff\1\71\10\uffff\1\157\1\163\1\162"+
		"\1\154\1\172\1\164\1\156\1\162\1\165\1\125\1\114\2\uffff\1\154\1\145\1"+
		"\155\1\163\1\uffff\2\145\1\151\1\145\1\105\1\123\1\145\2\172\1\145\1\147"+
		"\1\171\1\156\2\172\1\105\1\141\2\uffff\1\172\1\145\1\172\1\147\1\uffff"+
		"\1\172\1\156\1\162\1\uffff\3\172\3\uffff";
	static final String DFA10_acceptS =
		"\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff\1\14\7\uffff\1\26\1\27\1\30"+
		"\1\31\1\32\1\33\3\uffff\1\36\1\uffff\1\2\1\1\1\34\1\11\1\13\1\12\1\16"+
		"\1\15\13\uffff\1\37\1\40\4\uffff\1\22\21\uffff\1\20\1\21\4\uffff\1\35"+
		"\3\uffff\1\24\3\uffff\1\25\1\17\1\23";
	static final String DFA10_specialS =
		"\131\uffff}>";
	static final String[] DFA10_transitionS = {
			"\2\23\2\uffff\1\23\22\uffff\1\23\1\1\1\24\3\uffff\1\2\1\uffff\1\3\1\4"+
			"\1\5\1\6\1\uffff\1\7\1\uffff\1\10\12\34\1\25\1\uffff\1\11\1\12\1\13\2"+
			"\uffff\5\33\1\32\15\33\1\31\6\33\6\uffff\1\33\1\14\2\33\1\15\1\16\2\33"+
			"\1\17\3\33\1\20\5\33\1\21\1\30\6\33\1\26\1\22\1\27",
			"\1\35",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\37\4\uffff\1\37",
			"\1\41",
			"",
			"\1\43",
			"\1\45",
			"\1\46",
			"\1\50\15\uffff\1\47",
			"\1\51\7\uffff\1\52",
			"\1\53",
			"\1\54",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\55",
			"\1\56",
			"\1\57",
			"",
			"\1\61\1\uffff\12\34",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"\1\67",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\74",
			"",
			"",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"",
			"\1\101",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"\1\117",
			"\1\120",
			"",
			"",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"\1\121",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"\1\123",
			"",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"\1\124",
			"\1\125",
			"",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"",
			"",
			""
	};

	static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
	static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
	static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
	static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
	static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
	static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
	static final short[][] DFA10_transition;

	static {
		int numStates = DFA10_transitionS.length;
		DFA10_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
		}
	}

	protected class DFA10 extends DFA {

		public DFA10(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 10;
			this.eot = DFA10_eot;
			this.eof = DFA10_eof;
			this.min = DFA10_min;
			this.max = DFA10_max;
			this.accept = DFA10_accept;
			this.special = DFA10_special;
			this.transition = DFA10_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | WS | StringLiteral | COLON | LBRACE | RBRACE | COMMENT | BooleanLiteral | Ident | IntegerLiteral | MoneyLiteral );";
		}
	}

}
