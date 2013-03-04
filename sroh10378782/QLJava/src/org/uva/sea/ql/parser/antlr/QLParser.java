// $ANTLR 3.5 C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g 2013-02-25 01:22:47

package org.uva.sea.ql.parser.antlr;

import org.uva.sea.ql.ast.nodes.expressions.*;
import org.uva.sea.ql.ast.nodes.statements.*;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class QLParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BACKSLASH", "BOOLEAN", "CL", 
		"COLON", "COMMA", "COMMENT", "CURRENCY_DOLLAR", "CURRENCY_EURO", "DOUBLE_QUOTES", 
		"DQ", "ELSE", "FORM", "FORMIDENT", "IDENT", "IF", "INT", "INT_DIGIT", 
		"KEYWORD_BOOLEAN", "KEYWORD_ELSE", "KEYWORD_FALSE", "KEYWORD_FORM", "KEYWORD_IF", 
		"KEYWORD_MONEY", "KEYWORD_TRUE", "LB", "LCB", "LEFT_BRACKED", "LEFT_CURLY_BRACKED", 
		"LINE_COMMENT", "LOWERCASE_LETTER", "MONEY", "MONEY_COMMA", "POINT", "QUESTION_MARK", 
		"RB", "RCB", "RIGHT_BRACKED", "RIGHT_CURLY_BRACKED", "SINGLE_SPACE", "STRING", 
		"UNDERSCORE", "UPPERCASE_LETTER", "WS", "'!'", "'!='", "'&&'", "'*'", 
		"'+'", "'-'", "'<'", "'<='", "'=='", "'>'", "'>='", "'||'"
	};
	public static final int EOF=-1;
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
	public static final int T__57=57;
	public static final int T__58=58;
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
	public static final int ELSE=14;
	public static final int FORM=15;
	public static final int FORMIDENT=16;
	public static final int IDENT=17;
	public static final int IF=18;
	public static final int INT=19;
	public static final int INT_DIGIT=20;
	public static final int KEYWORD_BOOLEAN=21;
	public static final int KEYWORD_ELSE=22;
	public static final int KEYWORD_FALSE=23;
	public static final int KEYWORD_FORM=24;
	public static final int KEYWORD_IF=25;
	public static final int KEYWORD_MONEY=26;
	public static final int KEYWORD_TRUE=27;
	public static final int LB=28;
	public static final int LCB=29;
	public static final int LEFT_BRACKED=30;
	public static final int LEFT_CURLY_BRACKED=31;
	public static final int LINE_COMMENT=32;
	public static final int LOWERCASE_LETTER=33;
	public static final int MONEY=34;
	public static final int MONEY_COMMA=35;
	public static final int POINT=36;
	public static final int QUESTION_MARK=37;
	public static final int RB=38;
	public static final int RCB=39;
	public static final int RIGHT_BRACKED=40;
	public static final int RIGHT_CURLY_BRACKED=41;
	public static final int SINGLE_SPACE=42;
	public static final int STRING=43;
	public static final int UNDERSCORE=44;
	public static final int UPPERCASE_LETTER=45;
	public static final int WS=46;

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
		this.state.ruleMemo = new HashMap[61+1];


	}

	@Override public String[] getTokenNames() { return QLParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g"; }



	// $ANTLR start "start"
	// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:19:1: start returns [Statement result] : fD= formDeclaration ;
	public final Statement start() throws RecognitionException {
		Statement result = null;

		int start_StartIndex = input.index();

		Statement fD =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return result; }

			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:20:2: (fD= formDeclaration )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:20:4: fD= formDeclaration
			{
			pushFollow(FOLLOW_formDeclaration_in_start48);
			fD=formDeclaration();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) { result = fD; }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 1, start_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "start"



	// $ANTLR start "formDeclaration"
	// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:23:1: formDeclaration returns [Statement result] : ( FORM i= FORMIDENT b= block |x= block |x= statement |x= ifStatement |x= ifElseStatement );
	public final Statement formDeclaration() throws RecognitionException {
		Statement result = null;

		int formDeclaration_StartIndex = input.index();

		Token i=null;
		Statement b =null;
		Statement x =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return result; }

			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:24:2: ( FORM i= FORMIDENT b= block |x= block |x= statement |x= ifStatement |x= ifElseStatement )
			int alt1=5;
			switch ( input.LA(1) ) {
			case FORM:
				{
				alt1=1;
				}
				break;
			case LCB:
				{
				alt1=2;
				}
				break;
			case IDENT:
				{
				alt1=3;
				}
				break;
			case IF:
				{
				int LA1_4 = input.LA(2);
				if ( (synpred3_QL()) ) {
					alt1=3;
				}
				else if ( (synpred4_QL()) ) {
					alt1=4;
				}
				else if ( (true) ) {
					alt1=5;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return result;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:24:4: FORM i= FORMIDENT b= block
					{
					match(input,FORM,FOLLOW_FORM_in_formDeclaration65); if (state.failed) return result;
					i=(Token)match(input,FORMIDENT,FOLLOW_FORMIDENT_in_formDeclaration69); if (state.failed) return result;
					pushFollow(FOLLOW_block_in_formDeclaration73);
					b=block();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new Form(new Ident((i!=null?i.getText():null)), b);}
					}
					break;
				case 2 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:26:4: x= block
					{
					pushFollow(FOLLOW_block_in_formDeclaration84);
					x=block();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = x; }
					}
					break;
				case 3 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:27:4: x= statement
					{
					pushFollow(FOLLOW_statement_in_formDeclaration93);
					x=statement();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = x; }
					}
					break;
				case 4 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:28:4: x= ifStatement
					{
					pushFollow(FOLLOW_ifStatement_in_formDeclaration102);
					x=ifStatement();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = x; }
					}
					break;
				case 5 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:29:4: x= ifElseStatement
					{
					pushFollow(FOLLOW_ifElseStatement_in_formDeclaration111);
					x=ifElseStatement();
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
			if ( state.backtracking>0 ) { memoize(input, 2, formDeclaration_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "formDeclaration"



	// $ANTLR start "blockContent"
	// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:32:1: blockContent returns [ArrayList<Statement> result] : (v= statement )* ;
	public final ArrayList<Statement> blockContent() throws RecognitionException {
		ArrayList<Statement> result = null;

		int blockContent_StartIndex = input.index();

		Statement v =null;


			    	result = new ArrayList<Statement>();
			
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return result; }

			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:37:6: ( (v= statement )* )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:37:8: (v= statement )*
			{
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:37:8: (v= statement )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= IDENT && LA2_0 <= IF)) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:37:9: v= statement
					{
					pushFollow(FOLLOW_statement_in_blockContent143);
					v=statement();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result.add(v); }
					}
					break;

				default :
					break loop2;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 3, blockContent_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "blockContent"



	// $ANTLR start "block"
	// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:40:1: block returns [Statement result] : LCB b= blockContent RCB ;
	public final Statement block() throws RecognitionException {
		Statement result = null;

		int block_StartIndex = input.index();

		ArrayList<Statement> b =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return result; }

			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:41:2: ( LCB b= blockContent RCB )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:41:4: LCB b= blockContent RCB
			{
			match(input,LCB,FOLLOW_LCB_in_block164); if (state.failed) return result;
			pushFollow(FOLLOW_blockContent_in_block168);
			b=blockContent();
			state._fsp--;
			if (state.failed) return result;
			match(input,RCB,FOLLOW_RCB_in_block170); if (state.failed) return result;
			if ( state.backtracking==0 ) { result = new Block(b); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 4, block_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "block"



	// $ANTLR start "ifStatement"
	// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:44:1: ifStatement returns [Statement result] : ic= ifCondition ib= block ;
	public final Statement ifStatement() throws RecognitionException {
		Statement result = null;

		int ifStatement_StartIndex = input.index();

		Expr ic =null;
		Statement ib =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return result; }

			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:45:2: (ic= ifCondition ib= block )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:45:4: ic= ifCondition ib= block
			{
			pushFollow(FOLLOW_ifCondition_in_ifStatement189);
			ic=ifCondition();
			state._fsp--;
			if (state.failed) return result;
			pushFollow(FOLLOW_block_in_ifStatement193);
			ib=block();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) { result = new IfThen(ic, ib);}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 5, ifStatement_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "ifStatement"



	// $ANTLR start "ifElseStatement"
	// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:47:1: ifElseStatement returns [Statement result] : ic= ifCondition ib= block ELSE eb= block ;
	public final Statement ifElseStatement() throws RecognitionException {
		Statement result = null;

		int ifElseStatement_StartIndex = input.index();

		Expr ic =null;
		Statement ib =null;
		Statement eb =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return result; }

			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:48:2: (ic= ifCondition ib= block ELSE eb= block )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:48:4: ic= ifCondition ib= block ELSE eb= block
			{
			pushFollow(FOLLOW_ifCondition_in_ifElseStatement211);
			ic=ifCondition();
			state._fsp--;
			if (state.failed) return result;
			pushFollow(FOLLOW_block_in_ifElseStatement215);
			ib=block();
			state._fsp--;
			if (state.failed) return result;
			match(input,ELSE,FOLLOW_ELSE_in_ifElseStatement217); if (state.failed) return result;
			pushFollow(FOLLOW_block_in_ifElseStatement221);
			eb=block();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) { result = new IfThenElse(ic, ib, eb);}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 6, ifElseStatement_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "ifElseStatement"



	// $ANTLR start "statement"
	// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:51:1: statement returns [Statement result] : (cqd= compQuestionDeclaration |qd= questionDeclaration |ie= ifElseStatement |is= ifStatement );
	public final Statement statement() throws RecognitionException {
		Statement result = null;

		int statement_StartIndex = input.index();

		Statement cqd =null;
		Statement qd =null;
		Statement ie =null;
		Statement is =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return result; }

			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:52:2: (cqd= compQuestionDeclaration |qd= questionDeclaration |ie= ifElseStatement |is= ifStatement )
			int alt3=4;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==IDENT) ) {
				int LA3_1 = input.LA(2);
				if ( (synpred6_QL()) ) {
					alt3=1;
				}
				else if ( (synpred7_QL()) ) {
					alt3=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return result;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA3_0==IF) ) {
				int LA3_2 = input.LA(2);
				if ( (synpred8_QL()) ) {
					alt3=3;
				}
				else if ( (true) ) {
					alt3=4;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return result;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:52:4: cqd= compQuestionDeclaration
					{
					pushFollow(FOLLOW_compQuestionDeclaration_in_statement242);
					cqd=compQuestionDeclaration();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = cqd; }
					}
					break;
				case 2 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:53:4: qd= questionDeclaration
					{
					pushFollow(FOLLOW_questionDeclaration_in_statement251);
					qd=questionDeclaration();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = qd; }
					}
					break;
				case 3 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:54:4: ie= ifElseStatement
					{
					pushFollow(FOLLOW_ifElseStatement_in_statement260);
					ie=ifElseStatement();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = ie; }
					}
					break;
				case 4 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:55:4: is= ifStatement
					{
					pushFollow(FOLLOW_ifStatement_in_statement269);
					is=ifStatement();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = is; }
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
			if ( state.backtracking>0 ) { memoize(input, 7, statement_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "statement"



	// $ANTLR start "ifCondition"
	// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:58:1: ifCondition returns [Expr result] : ( IF LB x= IDENT RB | IF LB e= orExpr RB );
	public final Expr ifCondition() throws RecognitionException {
		Expr result = null;

		int ifCondition_StartIndex = input.index();

		Token x=null;
		Expr e =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return result; }

			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:59:2: ( IF LB x= IDENT RB | IF LB e= orExpr RB )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==IF) ) {
				int LA4_1 = input.LA(2);
				if ( (LA4_1==LB) ) {
					int LA4_2 = input.LA(3);
					if ( (LA4_2==IDENT) ) {
						int LA4_3 = input.LA(4);
						if ( (LA4_3==RB) ) {
							int LA4_5 = input.LA(5);
							if ( (synpred9_QL()) ) {
								alt4=1;
							}
							else if ( (true) ) {
								alt4=2;
							}

						}
						else if ( (LA4_3==BACKSLASH||(LA4_3 >= 48 && LA4_3 <= 58)) ) {
							alt4=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return result;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 4, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA4_2==BOOLEAN||LA4_2==INT||LA4_2==LB||LA4_2==MONEY||LA4_2==STRING||LA4_2==47||(LA4_2 >= 51 && LA4_2 <= 52)) ) {
						alt4=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return result;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return result;}
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
				if (state.backtracking>0) {state.failed=true; return result;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:59:4: IF LB x= IDENT RB
					{
					match(input,IF,FOLLOW_IF_in_ifCondition287); if (state.failed) return result;
					match(input,LB,FOLLOW_LB_in_ifCondition289); if (state.failed) return result;
					x=(Token)match(input,IDENT,FOLLOW_IDENT_in_ifCondition293); if (state.failed) return result;
					match(input,RB,FOLLOW_RB_in_ifCondition295); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new Ident((x!=null?x.getText():null)); }
					}
					break;
				case 2 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:60:4: IF LB e= orExpr RB
					{
					match(input,IF,FOLLOW_IF_in_ifCondition302); if (state.failed) return result;
					match(input,LB,FOLLOW_LB_in_ifCondition304); if (state.failed) return result;
					pushFollow(FOLLOW_orExpr_in_ifCondition308);
					e=orExpr();
					state._fsp--;
					if (state.failed) return result;
					match(input,RB,FOLLOW_RB_in_ifCondition310); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = e; }
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
			if ( state.backtracking>0 ) { memoize(input, 8, ifCondition_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "ifCondition"



	// $ANTLR start "typeMoney"
	// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:63:1: typeMoney returns [Expr result] : m= MONEY ;
	public final Expr typeMoney() throws RecognitionException {
		Expr result = null;

		int typeMoney_StartIndex = input.index();

		Token m=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return result; }

			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:64:2: (m= MONEY )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:64:4: m= MONEY
			{
			m=(Token)match(input,MONEY,FOLLOW_MONEY_in_typeMoney329); if (state.failed) return result;
			if ( state.backtracking==0 ) {result = new Money((m!=null?m.getText():null));}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 9, typeMoney_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "typeMoney"



	// $ANTLR start "typeBoolean"
	// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:67:1: typeBoolean returns [Expr result] : b= BOOLEAN ;
	public final Expr typeBoolean() throws RecognitionException {
		Expr result = null;

		int typeBoolean_StartIndex = input.index();

		Token b=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return result; }

			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:68:2: (b= BOOLEAN )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:68:4: b= BOOLEAN
			{
			b=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_typeBoolean349); if (state.failed) return result;
			if ( state.backtracking==0 ) {result = new Bool((b!=null?b.getText():null));}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 10, typeBoolean_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "typeBoolean"



	// $ANTLR start "typeInteger"
	// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:71:1: typeInteger returns [Expr result] : i= INT ;
	public final Expr typeInteger() throws RecognitionException {
		Expr result = null;

		int typeInteger_StartIndex = input.index();

		Token i=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return result; }

			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:72:2: (i= INT )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:72:4: i= INT
			{
			i=(Token)match(input,INT,FOLLOW_INT_in_typeInteger369); if (state.failed) return result;
			if ( state.backtracking==0 ) {result = new Int((i!=null?i.getText():null));}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 11, typeInteger_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "typeInteger"



	// $ANTLR start "compTypeMoney"
	// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:75:1: compTypeMoney returns [Expr result] : MONEY LB (x= addExpr |x= mulExpr ) RB ;
	public final Expr compTypeMoney() throws RecognitionException {
		Expr result = null;

		int compTypeMoney_StartIndex = input.index();

		Expr x =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return result; }

			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:76:2: ( MONEY LB (x= addExpr |x= mulExpr ) RB )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:76:4: MONEY LB (x= addExpr |x= mulExpr ) RB
			{
			match(input,MONEY,FOLLOW_MONEY_in_compTypeMoney386); if (state.failed) return result;
			match(input,LB,FOLLOW_LB_in_compTypeMoney388); if (state.failed) return result;
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:76:13: (x= addExpr |x= mulExpr )
			int alt5=2;
			switch ( input.LA(1) ) {
			case 51:
				{
				int LA5_1 = input.LA(2);
				if ( (synpred10_QL()) ) {
					alt5=1;
				}
				else if ( (true) ) {
					alt5=2;
				}

				}
				break;
			case 52:
				{
				int LA5_2 = input.LA(2);
				if ( (synpred10_QL()) ) {
					alt5=1;
				}
				else if ( (true) ) {
					alt5=2;
				}

				}
				break;
			case 47:
				{
				int LA5_3 = input.LA(2);
				if ( (synpred10_QL()) ) {
					alt5=1;
				}
				else if ( (true) ) {
					alt5=2;
				}

				}
				break;
			case INT:
				{
				int LA5_4 = input.LA(2);
				if ( (synpred10_QL()) ) {
					alt5=1;
				}
				else if ( (true) ) {
					alt5=2;
				}

				}
				break;
			case STRING:
				{
				int LA5_5 = input.LA(2);
				if ( (synpred10_QL()) ) {
					alt5=1;
				}
				else if ( (true) ) {
					alt5=2;
				}

				}
				break;
			case MONEY:
				{
				int LA5_6 = input.LA(2);
				if ( (synpred10_QL()) ) {
					alt5=1;
				}
				else if ( (true) ) {
					alt5=2;
				}

				}
				break;
			case BOOLEAN:
				{
				int LA5_7 = input.LA(2);
				if ( (synpred10_QL()) ) {
					alt5=1;
				}
				else if ( (true) ) {
					alt5=2;
				}

				}
				break;
			case LB:
				{
				int LA5_8 = input.LA(2);
				if ( (synpred10_QL()) ) {
					alt5=1;
				}
				else if ( (true) ) {
					alt5=2;
				}

				}
				break;
			case IDENT:
				{
				int LA5_9 = input.LA(2);
				if ( (synpred10_QL()) ) {
					alt5=1;
				}
				else if ( (true) ) {
					alt5=2;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return result;}
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:76:15: x= addExpr
					{
					pushFollow(FOLLOW_addExpr_in_compTypeMoney394);
					x=addExpr();
					state._fsp--;
					if (state.failed) return result;
					}
					break;
				case 2 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:76:27: x= mulExpr
					{
					pushFollow(FOLLOW_mulExpr_in_compTypeMoney400);
					x=mulExpr();
					state._fsp--;
					if (state.failed) return result;
					}
					break;

			}

			match(input,RB,FOLLOW_RB_in_compTypeMoney404); if (state.failed) return result;
			if ( state.backtracking==0 ) { result = new CompMoney(x); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 12, compTypeMoney_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "compTypeMoney"



	// $ANTLR start "compTypeBoolean"
	// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:79:1: compTypeBoolean returns [Expr result] : BOOLEAN LB bx= boolExpr RB ;
	public final Expr compTypeBoolean() throws RecognitionException {
		Expr result = null;

		int compTypeBoolean_StartIndex = input.index();

		Expr bx =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return result; }

			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:80:2: ( BOOLEAN LB bx= boolExpr RB )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:80:4: BOOLEAN LB bx= boolExpr RB
			{
			match(input,BOOLEAN,FOLLOW_BOOLEAN_in_compTypeBoolean421); if (state.failed) return result;
			match(input,LB,FOLLOW_LB_in_compTypeBoolean423); if (state.failed) return result;
			pushFollow(FOLLOW_boolExpr_in_compTypeBoolean427);
			bx=boolExpr();
			state._fsp--;
			if (state.failed) return result;
			match(input,RB,FOLLOW_RB_in_compTypeBoolean429); if (state.failed) return result;
			if ( state.backtracking==0 ) { result = new CompBool(bx); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 13, compTypeBoolean_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "compTypeBoolean"



	// $ANTLR start "compTypeInteger"
	// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:83:1: compTypeInteger returns [Expr result] : INT LB (x= addExpr |x= mulExpr ) RB ;
	public final Expr compTypeInteger() throws RecognitionException {
		Expr result = null;

		int compTypeInteger_StartIndex = input.index();

		Expr x =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return result; }

			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:84:2: ( INT LB (x= addExpr |x= mulExpr ) RB )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:84:4: INT LB (x= addExpr |x= mulExpr ) RB
			{
			match(input,INT,FOLLOW_INT_in_compTypeInteger446); if (state.failed) return result;
			match(input,LB,FOLLOW_LB_in_compTypeInteger448); if (state.failed) return result;
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:84:11: (x= addExpr |x= mulExpr )
			int alt6=2;
			switch ( input.LA(1) ) {
			case 51:
				{
				int LA6_1 = input.LA(2);
				if ( (synpred11_QL()) ) {
					alt6=1;
				}
				else if ( (true) ) {
					alt6=2;
				}

				}
				break;
			case 52:
				{
				int LA6_2 = input.LA(2);
				if ( (synpred11_QL()) ) {
					alt6=1;
				}
				else if ( (true) ) {
					alt6=2;
				}

				}
				break;
			case 47:
				{
				int LA6_3 = input.LA(2);
				if ( (synpred11_QL()) ) {
					alt6=1;
				}
				else if ( (true) ) {
					alt6=2;
				}

				}
				break;
			case INT:
				{
				int LA6_4 = input.LA(2);
				if ( (synpred11_QL()) ) {
					alt6=1;
				}
				else if ( (true) ) {
					alt6=2;
				}

				}
				break;
			case STRING:
				{
				int LA6_5 = input.LA(2);
				if ( (synpred11_QL()) ) {
					alt6=1;
				}
				else if ( (true) ) {
					alt6=2;
				}

				}
				break;
			case MONEY:
				{
				int LA6_6 = input.LA(2);
				if ( (synpred11_QL()) ) {
					alt6=1;
				}
				else if ( (true) ) {
					alt6=2;
				}

				}
				break;
			case BOOLEAN:
				{
				int LA6_7 = input.LA(2);
				if ( (synpred11_QL()) ) {
					alt6=1;
				}
				else if ( (true) ) {
					alt6=2;
				}

				}
				break;
			case LB:
				{
				int LA6_8 = input.LA(2);
				if ( (synpred11_QL()) ) {
					alt6=1;
				}
				else if ( (true) ) {
					alt6=2;
				}

				}
				break;
			case IDENT:
				{
				int LA6_9 = input.LA(2);
				if ( (synpred11_QL()) ) {
					alt6=1;
				}
				else if ( (true) ) {
					alt6=2;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return result;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:84:13: x= addExpr
					{
					pushFollow(FOLLOW_addExpr_in_compTypeInteger454);
					x=addExpr();
					state._fsp--;
					if (state.failed) return result;
					}
					break;
				case 2 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:84:25: x= mulExpr
					{
					pushFollow(FOLLOW_mulExpr_in_compTypeInteger460);
					x=mulExpr();
					state._fsp--;
					if (state.failed) return result;
					}
					break;

			}

			match(input,RB,FOLLOW_RB_in_compTypeInteger464); if (state.failed) return result;
			if ( state.backtracking==0 ) { result = new CompInt(x); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 14, compTypeInteger_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "compTypeInteger"



	// $ANTLR start "compQuestionDeclaration"
	// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:87:1: compQuestionDeclaration returns [Statement result] : (i= IDENT CL s= STRING cb= compTypeBoolean |i= IDENT CL s= STRING cm= compTypeMoney |i= IDENT CL s= STRING ci= compTypeInteger );
	public final Statement compQuestionDeclaration() throws RecognitionException {
		Statement result = null;

		int compQuestionDeclaration_StartIndex = input.index();

		Token i=null;
		Token s=null;
		Expr cb =null;
		Expr cm =null;
		Expr ci =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return result; }

			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:88:2: (i= IDENT CL s= STRING cb= compTypeBoolean |i= IDENT CL s= STRING cm= compTypeMoney |i= IDENT CL s= STRING ci= compTypeInteger )
			int alt7=3;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==IDENT) ) {
				int LA7_1 = input.LA(2);
				if ( (LA7_1==CL) ) {
					int LA7_2 = input.LA(3);
					if ( (LA7_2==STRING) ) {
						switch ( input.LA(4) ) {
						case BOOLEAN:
							{
							alt7=1;
							}
							break;
						case MONEY:
							{
							alt7=2;
							}
							break;
						case INT:
							{
							alt7=3;
							}
							break;
						default:
							if (state.backtracking>0) {state.failed=true; return result;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 7, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}

					else {
						if (state.backtracking>0) {state.failed=true; return result;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 7, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return result;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return result;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:88:4: i= IDENT CL s= STRING cb= compTypeBoolean
					{
					i=(Token)match(input,IDENT,FOLLOW_IDENT_in_compQuestionDeclaration483); if (state.failed) return result;
					match(input,CL,FOLLOW_CL_in_compQuestionDeclaration485); if (state.failed) return result;
					s=(Token)match(input,STRING,FOLLOW_STRING_in_compQuestionDeclaration489); if (state.failed) return result;
					pushFollow(FOLLOW_compTypeBoolean_in_compQuestionDeclaration493);
					cb=compTypeBoolean();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new ComputedQuestion( new Ident((i!=null?i.getText():null)), new Str((s!=null?s.getText():null)), cb ); }
					}
					break;
				case 2 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:89:4: i= IDENT CL s= STRING cm= compTypeMoney
					{
					i=(Token)match(input,IDENT,FOLLOW_IDENT_in_compQuestionDeclaration502); if (state.failed) return result;
					match(input,CL,FOLLOW_CL_in_compQuestionDeclaration504); if (state.failed) return result;
					s=(Token)match(input,STRING,FOLLOW_STRING_in_compQuestionDeclaration508); if (state.failed) return result;
					pushFollow(FOLLOW_compTypeMoney_in_compQuestionDeclaration512);
					cm=compTypeMoney();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new ComputedQuestion( new Ident((i!=null?i.getText():null)),  new Str((s!=null?s.getText():null)), cm ); }
					}
					break;
				case 3 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:90:4: i= IDENT CL s= STRING ci= compTypeInteger
					{
					i=(Token)match(input,IDENT,FOLLOW_IDENT_in_compQuestionDeclaration521); if (state.failed) return result;
					match(input,CL,FOLLOW_CL_in_compQuestionDeclaration523); if (state.failed) return result;
					s=(Token)match(input,STRING,FOLLOW_STRING_in_compQuestionDeclaration527); if (state.failed) return result;
					pushFollow(FOLLOW_compTypeInteger_in_compQuestionDeclaration531);
					ci=compTypeInteger();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new ComputedQuestion( new Ident((i!=null?i.getText():null)),  new Str((s!=null?s.getText():null)), ci ); }
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
			if ( state.backtracking>0 ) { memoize(input, 15, compQuestionDeclaration_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "compQuestionDeclaration"



	// $ANTLR start "questionDeclaration"
	// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:93:1: questionDeclaration returns [Statement result] : (i= IDENT CL s= STRING tb= typeBoolean |i= IDENT CL s= STRING tm= typeMoney |i= IDENT CL s= STRING ti= typeInteger );
	public final Statement questionDeclaration() throws RecognitionException {
		Statement result = null;

		int questionDeclaration_StartIndex = input.index();

		Token i=null;
		Token s=null;
		Expr tb =null;
		Expr tm =null;
		Expr ti =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return result; }

			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:94:2: (i= IDENT CL s= STRING tb= typeBoolean |i= IDENT CL s= STRING tm= typeMoney |i= IDENT CL s= STRING ti= typeInteger )
			int alt8=3;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==IDENT) ) {
				int LA8_1 = input.LA(2);
				if ( (LA8_1==CL) ) {
					int LA8_2 = input.LA(3);
					if ( (LA8_2==STRING) ) {
						switch ( input.LA(4) ) {
						case BOOLEAN:
							{
							alt8=1;
							}
							break;
						case MONEY:
							{
							alt8=2;
							}
							break;
						case INT:
							{
							alt8=3;
							}
							break;
						default:
							if (state.backtracking>0) {state.failed=true; return result;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 8, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}

					else {
						if (state.backtracking>0) {state.failed=true; return result;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 8, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return result;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
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
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:94:4: i= IDENT CL s= STRING tb= typeBoolean
					{
					i=(Token)match(input,IDENT,FOLLOW_IDENT_in_questionDeclaration551); if (state.failed) return result;
					match(input,CL,FOLLOW_CL_in_questionDeclaration553); if (state.failed) return result;
					s=(Token)match(input,STRING,FOLLOW_STRING_in_questionDeclaration557); if (state.failed) return result;
					pushFollow(FOLLOW_typeBoolean_in_questionDeclaration561);
					tb=typeBoolean();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new Question( new Ident((i!=null?i.getText():null)), new Str((s!=null?s.getText():null)), tb ); }
					}
					break;
				case 2 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:95:4: i= IDENT CL s= STRING tm= typeMoney
					{
					i=(Token)match(input,IDENT,FOLLOW_IDENT_in_questionDeclaration570); if (state.failed) return result;
					match(input,CL,FOLLOW_CL_in_questionDeclaration572); if (state.failed) return result;
					s=(Token)match(input,STRING,FOLLOW_STRING_in_questionDeclaration576); if (state.failed) return result;
					pushFollow(FOLLOW_typeMoney_in_questionDeclaration580);
					tm=typeMoney();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new Question( new Ident((i!=null?i.getText():null)),  new Str((s!=null?s.getText():null)), tm ); }
					}
					break;
				case 3 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:96:4: i= IDENT CL s= STRING ti= typeInteger
					{
					i=(Token)match(input,IDENT,FOLLOW_IDENT_in_questionDeclaration589); if (state.failed) return result;
					match(input,CL,FOLLOW_CL_in_questionDeclaration591); if (state.failed) return result;
					s=(Token)match(input,STRING,FOLLOW_STRING_in_questionDeclaration595); if (state.failed) return result;
					pushFollow(FOLLOW_typeInteger_in_questionDeclaration599);
					ti=typeInteger();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new Question( new Ident((i!=null?i.getText():null)),  new Str((s!=null?s.getText():null)), ti ); }
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
			if ( state.backtracking>0 ) { memoize(input, 16, questionDeclaration_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "questionDeclaration"



	// $ANTLR start "boolExpr"
	// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:99:1: boolExpr returns [Expr result] : (rx= relExpr |ax= andExpr |ox= orExpr );
	public final Expr boolExpr() throws RecognitionException {
		Expr result = null;

		int boolExpr_StartIndex = input.index();

		Expr rx =null;
		Expr ax =null;
		Expr ox =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return result; }

			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:100:2: (rx= relExpr |ax= andExpr |ox= orExpr )
			int alt9=3;
			switch ( input.LA(1) ) {
			case 51:
				{
				int LA9_1 = input.LA(2);
				if ( (synpred16_QL()) ) {
					alt9=1;
				}
				else if ( (synpred17_QL()) ) {
					alt9=2;
				}
				else if ( (true) ) {
					alt9=3;
				}

				}
				break;
			case 52:
				{
				int LA9_2 = input.LA(2);
				if ( (synpred16_QL()) ) {
					alt9=1;
				}
				else if ( (synpred17_QL()) ) {
					alt9=2;
				}
				else if ( (true) ) {
					alt9=3;
				}

				}
				break;
			case 47:
				{
				int LA9_3 = input.LA(2);
				if ( (synpred16_QL()) ) {
					alt9=1;
				}
				else if ( (synpred17_QL()) ) {
					alt9=2;
				}
				else if ( (true) ) {
					alt9=3;
				}

				}
				break;
			case INT:
				{
				int LA9_4 = input.LA(2);
				if ( (synpred16_QL()) ) {
					alt9=1;
				}
				else if ( (synpred17_QL()) ) {
					alt9=2;
				}
				else if ( (true) ) {
					alt9=3;
				}

				}
				break;
			case STRING:
				{
				int LA9_5 = input.LA(2);
				if ( (synpred16_QL()) ) {
					alt9=1;
				}
				else if ( (synpred17_QL()) ) {
					alt9=2;
				}
				else if ( (true) ) {
					alt9=3;
				}

				}
				break;
			case MONEY:
				{
				int LA9_6 = input.LA(2);
				if ( (synpred16_QL()) ) {
					alt9=1;
				}
				else if ( (synpred17_QL()) ) {
					alt9=2;
				}
				else if ( (true) ) {
					alt9=3;
				}

				}
				break;
			case BOOLEAN:
				{
				int LA9_7 = input.LA(2);
				if ( (synpred16_QL()) ) {
					alt9=1;
				}
				else if ( (synpred17_QL()) ) {
					alt9=2;
				}
				else if ( (true) ) {
					alt9=3;
				}

				}
				break;
			case LB:
				{
				int LA9_8 = input.LA(2);
				if ( (synpred16_QL()) ) {
					alt9=1;
				}
				else if ( (synpred17_QL()) ) {
					alt9=2;
				}
				else if ( (true) ) {
					alt9=3;
				}

				}
				break;
			case IDENT:
				{
				int LA9_9 = input.LA(2);
				if ( (synpred16_QL()) ) {
					alt9=1;
				}
				else if ( (synpred17_QL()) ) {
					alt9=2;
				}
				else if ( (true) ) {
					alt9=3;
				}

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
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:100:4: rx= relExpr
					{
					pushFollow(FOLLOW_relExpr_in_boolExpr619);
					rx=relExpr();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = rx; }
					}
					break;
				case 2 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:101:4: ax= andExpr
					{
					pushFollow(FOLLOW_andExpr_in_boolExpr628);
					ax=andExpr();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = ax; }
					}
					break;
				case 3 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:102:4: ox= orExpr
					{
					pushFollow(FOLLOW_orExpr_in_boolExpr637);
					ox=orExpr();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = ox; }
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
			if ( state.backtracking>0 ) { memoize(input, 17, boolExpr_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "boolExpr"



	// $ANTLR start "primary"
	// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:105:1: primary returns [Expr result] : (i= INT |s= STRING |m= MONEY |b= BOOLEAN | LB x= orExpr RB |i= IDENT );
	public final Expr primary() throws RecognitionException {
		Expr result = null;

		int primary_StartIndex = input.index();

		Token i=null;
		Token s=null;
		Token m=null;
		Token b=null;
		Expr x =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return result; }

			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:106:3: (i= INT |s= STRING |m= MONEY |b= BOOLEAN | LB x= orExpr RB |i= IDENT )
			int alt10=6;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt10=1;
				}
				break;
			case STRING:
				{
				alt10=2;
				}
				break;
			case MONEY:
				{
				alt10=3;
				}
				break;
			case BOOLEAN:
				{
				alt10=4;
				}
				break;
			case LB:
				{
				alt10=5;
				}
				break;
			case IDENT:
				{
				alt10=6;
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
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:106:5: i= INT
					{
					i=(Token)match(input,INT,FOLLOW_INT_in_primary659); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new Int((i!=null?i.getText():null)); }
					}
					break;
				case 2 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:107:5: s= STRING
					{
					s=(Token)match(input,STRING,FOLLOW_STRING_in_primary671); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new Str((s!=null?s.getText():null)); }
					}
					break;
				case 3 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:108:5: m= MONEY
					{
					m=(Token)match(input,MONEY,FOLLOW_MONEY_in_primary683); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new Money((m!=null?m.getText():null)); }
					}
					break;
				case 4 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:109:5: b= BOOLEAN
					{
					b=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_primary693); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new Bool((b!=null?b.getText():null)); }
					}
					break;
				case 5 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:110:5: LB x= orExpr RB
					{
					match(input,LB,FOLLOW_LB_in_primary702); if (state.failed) return result;
					pushFollow(FOLLOW_orExpr_in_primary706);
					x=orExpr();
					state._fsp--;
					if (state.failed) return result;
					match(input,RB,FOLLOW_RB_in_primary708); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = x; }
					}
					break;
				case 6 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:111:5: i= IDENT
					{
					i=(Token)match(input,IDENT,FOLLOW_IDENT_in_primary718); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new Ident((i!=null?i.getText():null)); }
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
			if ( state.backtracking>0 ) { memoize(input, 18, primary_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "primary"



	// $ANTLR start "unExpr"
	// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:114:1: unExpr returns [Expr result] : ( '+' x= unExpr | '-' x= unExpr | '!' x= unExpr |x= primary );
	public final Expr unExpr() throws RecognitionException {
		Expr result = null;

		int unExpr_StartIndex = input.index();

		Expr x =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return result; }

			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:115:5: ( '+' x= unExpr | '-' x= unExpr | '!' x= unExpr |x= primary )
			int alt11=4;
			switch ( input.LA(1) ) {
			case 51:
				{
				alt11=1;
				}
				break;
			case 52:
				{
				alt11=2;
				}
				break;
			case 47:
				{
				alt11=3;
				}
				break;
			case BOOLEAN:
			case IDENT:
			case INT:
			case LB:
			case MONEY:
			case STRING:
				{
				alt11=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return result;}
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:115:8: '+' x= unExpr
					{
					match(input,51,FOLLOW_51_in_unExpr744); if (state.failed) return result;
					pushFollow(FOLLOW_unExpr_in_unExpr748);
					x=unExpr();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new Pos(x); }
					}
					break;
				case 2 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:116:8: '-' x= unExpr
					{
					match(input,52,FOLLOW_52_in_unExpr759); if (state.failed) return result;
					pushFollow(FOLLOW_unExpr_in_unExpr763);
					x=unExpr();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new Neg(x); }
					}
					break;
				case 3 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:117:8: '!' x= unExpr
					{
					match(input,47,FOLLOW_47_in_unExpr774); if (state.failed) return result;
					pushFollow(FOLLOW_unExpr_in_unExpr778);
					x=unExpr();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new Not(x); }
					}
					break;
				case 4 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:118:8: x= primary
					{
					pushFollow(FOLLOW_primary_in_unExpr791);
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
			if ( state.backtracking>0 ) { memoize(input, 19, unExpr_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "unExpr"



	// $ANTLR start "mulExpr"
	// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:121:1: mulExpr returns [Expr result] : lhs= unExpr (op= ( '*' | '/' ) rhs= unExpr )* ;
	public final Expr mulExpr() throws RecognitionException {
		Expr result = null;

		int mulExpr_StartIndex = input.index();

		Token op=null;
		Expr lhs =null;
		Expr rhs =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return result; }

			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:122:5: (lhs= unExpr (op= ( '*' | '/' ) rhs= unExpr )* )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:122:9: lhs= unExpr (op= ( '*' | '/' ) rhs= unExpr )*
			{
			pushFollow(FOLLOW_unExpr_in_mulExpr829);
			lhs=unExpr();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) { result =lhs; }
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:122:45: (op= ( '*' | '/' ) rhs= unExpr )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==BACKSLASH||LA12_0==50) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:122:47: op= ( '*' | '/' ) rhs= unExpr
					{
					op=input.LT(1);
					if ( input.LA(1)==BACKSLASH||input.LA(1)==50 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return result;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_unExpr_in_mulExpr849);
					rhs=unExpr();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { 
					      if ((op!=null?op.getText():null).equals("*")) {
					        result = new Mul(result, rhs);
					      }
					      if ((op!=null?op.getText():null).equals("/")) {
					        result = new Div(result, rhs);      
					      }
					    }
					}
					break;

				default :
					break loop12;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 20, mulExpr_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "mulExpr"



	// $ANTLR start "addExpr"
	// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:134:1: addExpr returns [Expr result] : lhs= mulExpr (op= ( '+' | '-' ) rhs= mulExpr )* ;
	public final Expr addExpr() throws RecognitionException {
		Expr result = null;

		int addExpr_StartIndex = input.index();

		Token op=null;
		Expr lhs =null;
		Expr rhs =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return result; }

			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:135:5: (lhs= mulExpr (op= ( '+' | '-' ) rhs= mulExpr )* )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:135:9: lhs= mulExpr (op= ( '+' | '-' ) rhs= mulExpr )*
			{
			pushFollow(FOLLOW_mulExpr_in_addExpr890);
			lhs=mulExpr();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) { result =lhs; }
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:135:46: (op= ( '+' | '-' ) rhs= mulExpr )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( ((LA13_0 >= 51 && LA13_0 <= 52)) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:135:48: op= ( '+' | '-' ) rhs= mulExpr
					{
					op=input.LT(1);
					if ( (input.LA(1) >= 51 && input.LA(1) <= 52) ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return result;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_mulExpr_in_addExpr908);
					rhs=mulExpr();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { 
					      if ((op!=null?op.getText():null).equals("+")) {
					        result = new Add(result, rhs);
					      }
					      if ((op!=null?op.getText():null).equals("-")) {
					        result = new Sub(result, rhs);      
					      }
					    }
					}
					break;

				default :
					break loop13;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 21, addExpr_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "addExpr"



	// $ANTLR start "relExpr"
	// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:146:1: relExpr returns [Expr result] : lhs= addExpr (op= ( '<' | '<=' | '>' | '>=' | '==' | '!=' ) rhs= addExpr )* ;
	public final Expr relExpr() throws RecognitionException {
		Expr result = null;

		int relExpr_StartIndex = input.index();

		Token op=null;
		Expr lhs =null;
		Expr rhs =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return result; }

			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:147:5: (lhs= addExpr (op= ( '<' | '<=' | '>' | '>=' | '==' | '!=' ) rhs= addExpr )* )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:147:9: lhs= addExpr (op= ( '<' | '<=' | '>' | '>=' | '==' | '!=' ) rhs= addExpr )*
			{
			pushFollow(FOLLOW_addExpr_in_relExpr943);
			lhs=addExpr();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) { result =lhs; }
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:147:46: (op= ( '<' | '<=' | '>' | '>=' | '==' | '!=' ) rhs= addExpr )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==48||(LA14_0 >= 53 && LA14_0 <= 57)) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:147:48: op= ( '<' | '<=' | '>' | '>=' | '==' | '!=' ) rhs= addExpr
					{
					op=input.LT(1);
					if ( input.LA(1)==48||(input.LA(1) >= 53 && input.LA(1) <= 57) ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return result;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_addExpr_in_relExpr967);
					rhs=addExpr();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { 
					      if ((op!=null?op.getText():null).equals("<")) {
					        result = new LT(result, rhs);
					      }
					      if ((op!=null?op.getText():null).equals("<=")) {
					        result = new LEq(result, rhs);      
					      }
					      if ((op!=null?op.getText():null).equals(">")) {
					        result = new GT(result, rhs);
					      }
					      if ((op!=null?op.getText():null).equals(">=")) {
					        result = new GEq(result, rhs);      
					      }
					      if ((op!=null?op.getText():null).equals("==")) {
					        result = new Eq(result, rhs);
					      }
					      if ((op!=null?op.getText():null).equals("!=")) {
					        result = new NEq(result, rhs);
					      }
					    }
					}
					break;

				default :
					break loop14;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 22, relExpr_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "relExpr"



	// $ANTLR start "andExpr"
	// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:170:1: andExpr returns [Expr result] : lhs= relExpr ( '&&' rhs= relExpr )* ;
	public final Expr andExpr() throws RecognitionException {
		Expr result = null;

		int andExpr_StartIndex = input.index();

		Expr lhs =null;
		Expr rhs =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return result; }

			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:171:5: (lhs= relExpr ( '&&' rhs= relExpr )* )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:171:9: lhs= relExpr ( '&&' rhs= relExpr )*
			{
			pushFollow(FOLLOW_relExpr_in_andExpr1005);
			lhs=relExpr();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) { result =lhs; }
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:171:46: ( '&&' rhs= relExpr )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==49) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:171:48: '&&' rhs= relExpr
					{
					match(input,49,FOLLOW_49_in_andExpr1011); if (state.failed) return result;
					pushFollow(FOLLOW_relExpr_in_andExpr1015);
					rhs=relExpr();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new And(result, rhs); }
					}
					break;

				default :
					break loop15;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 23, andExpr_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "andExpr"



	// $ANTLR start "orExpr"
	// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:175:1: orExpr returns [Expr result] : lhs= andExpr ( '||' rhs= andExpr )* ;
	public final Expr orExpr() throws RecognitionException {
		Expr result = null;

		int orExpr_StartIndex = input.index();

		Expr lhs =null;
		Expr rhs =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return result; }

			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:176:5: (lhs= andExpr ( '||' rhs= andExpr )* )
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:176:9: lhs= andExpr ( '||' rhs= andExpr )*
			{
			pushFollow(FOLLOW_andExpr_in_orExpr1051);
			lhs=andExpr();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) { result = lhs; }
			// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:176:48: ( '||' rhs= andExpr )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==58) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:176:50: '||' rhs= andExpr
					{
					match(input,58,FOLLOW_58_in_orExpr1057); if (state.failed) return result;
					pushFollow(FOLLOW_andExpr_in_orExpr1061);
					rhs=andExpr();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new Or(result, rhs); }
					}
					break;

				default :
					break loop16;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 24, orExpr_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "orExpr"

	// $ANTLR start synpred3_QL
	public final void synpred3_QL_fragment() throws RecognitionException {
		Statement x =null;

		// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:27:4: (x= statement )
		// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:27:4: x= statement
		{
		pushFollow(FOLLOW_statement_in_synpred3_QL93);
		x=statement();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred3_QL

	// $ANTLR start synpred4_QL
	public final void synpred4_QL_fragment() throws RecognitionException {
		Statement x =null;

		// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:28:4: (x= ifStatement )
		// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:28:4: x= ifStatement
		{
		pushFollow(FOLLOW_ifStatement_in_synpred4_QL102);
		x=ifStatement();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred4_QL

	// $ANTLR start synpred6_QL
	public final void synpred6_QL_fragment() throws RecognitionException {
		Statement cqd =null;

		// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:52:4: (cqd= compQuestionDeclaration )
		// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:52:4: cqd= compQuestionDeclaration
		{
		pushFollow(FOLLOW_compQuestionDeclaration_in_synpred6_QL242);
		cqd=compQuestionDeclaration();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred6_QL

	// $ANTLR start synpred7_QL
	public final void synpred7_QL_fragment() throws RecognitionException {
		Statement qd =null;

		// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:53:4: (qd= questionDeclaration )
		// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:53:4: qd= questionDeclaration
		{
		pushFollow(FOLLOW_questionDeclaration_in_synpred7_QL251);
		qd=questionDeclaration();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred7_QL

	// $ANTLR start synpred8_QL
	public final void synpred8_QL_fragment() throws RecognitionException {
		Statement ie =null;

		// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:54:4: (ie= ifElseStatement )
		// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:54:4: ie= ifElseStatement
		{
		pushFollow(FOLLOW_ifElseStatement_in_synpred8_QL260);
		ie=ifElseStatement();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred8_QL

	// $ANTLR start synpred9_QL
	public final void synpred9_QL_fragment() throws RecognitionException {
		Token x=null;

		// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:59:4: ( IF LB x= IDENT RB )
		// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:59:4: IF LB x= IDENT RB
		{
		match(input,IF,FOLLOW_IF_in_synpred9_QL287); if (state.failed) return;
		match(input,LB,FOLLOW_LB_in_synpred9_QL289); if (state.failed) return;
		x=(Token)match(input,IDENT,FOLLOW_IDENT_in_synpred9_QL293); if (state.failed) return;
		match(input,RB,FOLLOW_RB_in_synpred9_QL295); if (state.failed) return;
		}

	}
	// $ANTLR end synpred9_QL

	// $ANTLR start synpred10_QL
	public final void synpred10_QL_fragment() throws RecognitionException {
		Expr x =null;

		// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:76:15: (x= addExpr )
		// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:76:15: x= addExpr
		{
		pushFollow(FOLLOW_addExpr_in_synpred10_QL394);
		x=addExpr();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred10_QL

	// $ANTLR start synpred11_QL
	public final void synpred11_QL_fragment() throws RecognitionException {
		Expr x =null;

		// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:84:13: (x= addExpr )
		// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:84:13: x= addExpr
		{
		pushFollow(FOLLOW_addExpr_in_synpred11_QL454);
		x=addExpr();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred11_QL

	// $ANTLR start synpred16_QL
	public final void synpred16_QL_fragment() throws RecognitionException {
		Expr rx =null;

		// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:100:4: (rx= relExpr )
		// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:100:4: rx= relExpr
		{
		pushFollow(FOLLOW_relExpr_in_synpred16_QL619);
		rx=relExpr();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred16_QL

	// $ANTLR start synpred17_QL
	public final void synpred17_QL_fragment() throws RecognitionException {
		Expr ax =null;

		// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:101:4: (ax= andExpr )
		// C:\\Users\\Turambar\\eclipse-workspace\\sea-of-ql\\sroh10378782\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:101:4: ax= andExpr
		{
		pushFollow(FOLLOW_andExpr_in_synpred17_QL628);
		ax=andExpr();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred17_QL

	// Delegated rules

	public final boolean synpred16_QL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred16_QL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred10_QL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred10_QL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
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
	public final boolean synpred4_QL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred4_QL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred9_QL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred9_QL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred17_QL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred17_QL_fragment(); // can never throw exception
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
	public final boolean synpred11_QL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred11_QL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred3_QL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred3_QL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_formDeclaration_in_start48 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FORM_in_formDeclaration65 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_FORMIDENT_in_formDeclaration69 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_block_in_formDeclaration73 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_formDeclaration84 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_formDeclaration93 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_formDeclaration102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifElseStatement_in_formDeclaration111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_blockContent143 = new BitSet(new long[]{0x0000000000060002L});
	public static final BitSet FOLLOW_LCB_in_block164 = new BitSet(new long[]{0x0000008000060000L});
	public static final BitSet FOLLOW_blockContent_in_block168 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_RCB_in_block170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifCondition_in_ifStatement189 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_block_in_ifStatement193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifCondition_in_ifElseStatement211 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_block_in_ifElseStatement215 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_ELSE_in_ifElseStatement217 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_block_in_ifElseStatement221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compQuestionDeclaration_in_statement242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_questionDeclaration_in_statement251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifElseStatement_in_statement260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifCondition287 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_LB_in_ifCondition289 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_IDENT_in_ifCondition293 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_RB_in_ifCondition295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifCondition302 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_LB_in_ifCondition304 = new BitSet(new long[]{0x00188804100A0020L});
	public static final BitSet FOLLOW_orExpr_in_ifCondition308 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_RB_in_ifCondition310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MONEY_in_typeMoney329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_typeBoolean349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_typeInteger369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MONEY_in_compTypeMoney386 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_LB_in_compTypeMoney388 = new BitSet(new long[]{0x00188804100A0020L});
	public static final BitSet FOLLOW_addExpr_in_compTypeMoney394 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_mulExpr_in_compTypeMoney400 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_RB_in_compTypeMoney404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_compTypeBoolean421 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_LB_in_compTypeBoolean423 = new BitSet(new long[]{0x00188804100A0020L});
	public static final BitSet FOLLOW_boolExpr_in_compTypeBoolean427 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_RB_in_compTypeBoolean429 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_compTypeInteger446 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_LB_in_compTypeInteger448 = new BitSet(new long[]{0x00188804100A0020L});
	public static final BitSet FOLLOW_addExpr_in_compTypeInteger454 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_mulExpr_in_compTypeInteger460 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_RB_in_compTypeInteger464 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_compQuestionDeclaration483 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_CL_in_compQuestionDeclaration485 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_STRING_in_compQuestionDeclaration489 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_compTypeBoolean_in_compQuestionDeclaration493 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_compQuestionDeclaration502 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_CL_in_compQuestionDeclaration504 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_STRING_in_compQuestionDeclaration508 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_compTypeMoney_in_compQuestionDeclaration512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_compQuestionDeclaration521 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_CL_in_compQuestionDeclaration523 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_STRING_in_compQuestionDeclaration527 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_compTypeInteger_in_compQuestionDeclaration531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_questionDeclaration551 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_CL_in_questionDeclaration553 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_STRING_in_questionDeclaration557 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_typeBoolean_in_questionDeclaration561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_questionDeclaration570 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_CL_in_questionDeclaration572 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_STRING_in_questionDeclaration576 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_typeMoney_in_questionDeclaration580 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_questionDeclaration589 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_CL_in_questionDeclaration591 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_STRING_in_questionDeclaration595 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_typeInteger_in_questionDeclaration599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relExpr_in_boolExpr619 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_andExpr_in_boolExpr628 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_orExpr_in_boolExpr637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_primary659 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_primary671 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MONEY_in_primary683 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_primary693 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_primary702 = new BitSet(new long[]{0x00188804100A0020L});
	public static final BitSet FOLLOW_orExpr_in_primary706 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_RB_in_primary708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_primary718 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_unExpr744 = new BitSet(new long[]{0x00188804100A0020L});
	public static final BitSet FOLLOW_unExpr_in_unExpr748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_unExpr759 = new BitSet(new long[]{0x00188804100A0020L});
	public static final BitSet FOLLOW_unExpr_in_unExpr763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_unExpr774 = new BitSet(new long[]{0x00188804100A0020L});
	public static final BitSet FOLLOW_unExpr_in_unExpr778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_in_unExpr791 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unExpr_in_mulExpr829 = new BitSet(new long[]{0x0004000000000012L});
	public static final BitSet FOLLOW_set_in_mulExpr837 = new BitSet(new long[]{0x00188804100A0020L});
	public static final BitSet FOLLOW_unExpr_in_mulExpr849 = new BitSet(new long[]{0x0004000000000012L});
	public static final BitSet FOLLOW_mulExpr_in_addExpr890 = new BitSet(new long[]{0x0018000000000002L});
	public static final BitSet FOLLOW_set_in_addExpr898 = new BitSet(new long[]{0x00188804100A0020L});
	public static final BitSet FOLLOW_mulExpr_in_addExpr908 = new BitSet(new long[]{0x0018000000000002L});
	public static final BitSet FOLLOW_addExpr_in_relExpr943 = new BitSet(new long[]{0x03E1000000000002L});
	public static final BitSet FOLLOW_set_in_relExpr951 = new BitSet(new long[]{0x00188804100A0020L});
	public static final BitSet FOLLOW_addExpr_in_relExpr967 = new BitSet(new long[]{0x03E1000000000002L});
	public static final BitSet FOLLOW_relExpr_in_andExpr1005 = new BitSet(new long[]{0x0002000000000002L});
	public static final BitSet FOLLOW_49_in_andExpr1011 = new BitSet(new long[]{0x00188804100A0020L});
	public static final BitSet FOLLOW_relExpr_in_andExpr1015 = new BitSet(new long[]{0x0002000000000002L});
	public static final BitSet FOLLOW_andExpr_in_orExpr1051 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_58_in_orExpr1057 = new BitSet(new long[]{0x00188804100A0020L});
	public static final BitSet FOLLOW_andExpr_in_orExpr1061 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_statement_in_synpred3_QL93 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_synpred4_QL102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compQuestionDeclaration_in_synpred6_QL242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_questionDeclaration_in_synpred7_QL251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifElseStatement_in_synpred8_QL260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_synpred9_QL287 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_LB_in_synpred9_QL289 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_IDENT_in_synpred9_QL293 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_RB_in_synpred9_QL295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_addExpr_in_synpred10_QL394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_addExpr_in_synpred11_QL454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relExpr_in_synpred16_QL619 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_andExpr_in_synpred17_QL628 = new BitSet(new long[]{0x0000000000000002L});
}
