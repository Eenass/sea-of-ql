// $ANTLR 3.5 /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g 2013-01-19 11:32:18

package org.uva.sea.ql.parser.antlr;
import org.uva.sea.ql.ast.*;
import org.uva.sea.ql.ast.nodetypes.primary.*;
import org.uva.sea.ql.ast.nodetypes.unary.*;
import org.uva.sea.ql.ast.nodetypes.binary.*;
import org.uva.sea.ql.ast.nodetypes.formelement.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class QLParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BRACE_CLOSE", "BRACE_OPEN", "Bool", 
		"COMMENT", "Datatype", "EscapedCharacterSequence", "FORM", "Ident", "Int", 
		"PAREN_CLOSE", "PAREN_OPEN", "Str", "WS", "'!'", "'!='", "'&&'", "'*'", 
		"'+'", "'-'", "'/'", "':'", "'<'", "'<='", "'=='", "'>'", "'>='", "'else'", 
		"'if'", "'||'"
	};
	public static final int EOF=-1;
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
	public static final int BRACE_CLOSE=4;
	public static final int BRACE_OPEN=5;
	public static final int Bool=6;
	public static final int COMMENT=7;
	public static final int Datatype=8;
	public static final int EscapedCharacterSequence=9;
	public static final int FORM=10;
	public static final int Ident=11;
	public static final int Int=12;
	public static final int PAREN_CLOSE=13;
	public static final int PAREN_OPEN=14;
	public static final int Str=15;
	public static final int WS=16;

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
		this.state.ruleMemo = new HashMap[37+1];


	}

	@Override public String[] getTokenNames() { return QLParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g"; }


	  private String removeOuterQuotes(String original) {
	    return original.substring(1, original.length()-1);
	  }



	// $ANTLR start "form"
	// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:26:1: form returns [Form result] : FORM Ident BRACE_OPEN statementList BRACE_CLOSE ;
	public final Form form() throws RecognitionException {
		Form result = null;

		int form_StartIndex = input.index();

		Token Ident1=null;
		List<QLStatement> statementList2 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return result; }

			// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:27:3: ( FORM Ident BRACE_OPEN statementList BRACE_CLOSE )
			// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:27:5: FORM Ident BRACE_OPEN statementList BRACE_CLOSE
			{
			match(input,FORM,FOLLOW_FORM_in_form56); if (state.failed) return result;
			Ident1=(Token)match(input,Ident,FOLLOW_Ident_in_form58); if (state.failed) return result;
			match(input,BRACE_OPEN,FOLLOW_BRACE_OPEN_in_form60); if (state.failed) return result;
			pushFollow(FOLLOW_statementList_in_form62);
			statementList2=statementList();
			state._fsp--;
			if (state.failed) return result;
			match(input,BRACE_CLOSE,FOLLOW_BRACE_CLOSE_in_form64); if (state.failed) return result;
			if ( state.backtracking==0 ) {
				    result = new Form(new Ident((Ident1!=null?Ident1.getText():null)), statementList2);
				  }
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
		return result;
	}
	// $ANTLR end "form"



	// $ANTLR start "block"
	// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:33:1: block returns [List<QLStatement> result] : BRACE_OPEN statementList BRACE_CLOSE ;
	public final List<QLStatement> block() throws RecognitionException {
		List<QLStatement> result = null;

		int block_StartIndex = input.index();

		List<QLStatement> statementList3 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return result; }

			// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:34:3: ( BRACE_OPEN statementList BRACE_CLOSE )
			// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:34:5: BRACE_OPEN statementList BRACE_CLOSE
			{
			match(input,BRACE_OPEN,FOLLOW_BRACE_OPEN_in_block90); if (state.failed) return result;
			pushFollow(FOLLOW_statementList_in_block92);
			statementList3=statementList();
			state._fsp--;
			if (state.failed) return result;
			match(input,BRACE_CLOSE,FOLLOW_BRACE_CLOSE_in_block94); if (state.failed) return result;
			if ( state.backtracking==0 ) {
				    result = statementList3;
				  }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 2, block_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "block"



	// $ANTLR start "statementList"
	// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:40:1: statementList returns [List<QLStatement> result] : (stmnt= statement )* ;
	public final List<QLStatement> statementList() throws RecognitionException {
		List<QLStatement> result = null;

		int statementList_StartIndex = input.index();

		QLStatement stmnt =null;


		    result = new ArrayList<QLStatement>();
		  
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return result; }

			// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:45:3: ( (stmnt= statement )* )
			// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:45:5: (stmnt= statement )*
			{
			// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:45:5: (stmnt= statement )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==Ident||LA1_0==31) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:45:6: stmnt= statement
					{
					pushFollow(FOLLOW_statement_in_statementList132);
					stmnt=statement();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) {result.add(stmnt);}
					}
					break;

				default :
					break loop1;
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
			if ( state.backtracking>0 ) { memoize(input, 3, statementList_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "statementList"



	// $ANTLR start "statement"
	// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:48:1: statement returns [QLStatement result] : ( question | computation | conditional );
	public final QLStatement statement() throws RecognitionException {
		QLStatement result = null;

		int statement_StartIndex = input.index();

		Question question4 =null;
		Computation computation5 =null;
		Conditional conditional6 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return result; }

			// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:49:3: ( question | computation | conditional )
			int alt2=3;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==Ident) ) {
				int LA2_1 = input.LA(2);
				if ( (LA2_1==24) ) {
					int LA2_3 = input.LA(3);
					if ( (LA2_3==Str) ) {
						int LA2_4 = input.LA(4);
						if ( (LA2_4==Datatype) ) {
							alt2=1;
						}
						else if ( (LA2_4==PAREN_OPEN) ) {
							alt2=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return result;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 2, 4, input);
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
								new NoViableAltException("", 2, 3, input);
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
							new NoViableAltException("", 2, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA2_0==31) ) {
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
					// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:49:5: question
					{
					pushFollow(FOLLOW_question_in_statement153);
					question4=question();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = question4; }
					}
					break;
				case 2 :
					// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:50:5: computation
					{
					pushFollow(FOLLOW_computation_in_statement161);
					computation5=computation();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = computation5; }
					}
					break;
				case 3 :
					// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:51:5: conditional
					{
					pushFollow(FOLLOW_conditional_in_statement169);
					conditional6=conditional();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = conditional6; }
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
			if ( state.backtracking>0 ) { memoize(input, 4, statement_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "statement"



	// $ANTLR start "question"
	// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:54:1: question returns [Question result] : Ident ':' Str Datatype ;
	public final Question question() throws RecognitionException {
		Question result = null;

		int question_StartIndex = input.index();

		Token Ident7=null;
		Token Str8=null;
		Token Datatype9=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return result; }

			// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:55:3: ( Ident ':' Str Datatype )
			// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:55:5: Ident ':' Str Datatype
			{
			Ident7=(Token)match(input,Ident,FOLLOW_Ident_in_question188); if (state.failed) return result;
			match(input,24,FOLLOW_24_in_question190); if (state.failed) return result;
			Str8=(Token)match(input,Str,FOLLOW_Str_in_question192); if (state.failed) return result;
			Datatype9=(Token)match(input,Datatype,FOLLOW_Datatype_in_question194); if (state.failed) return result;
			if ( state.backtracking==0 ) {
				    Ident ident = new Ident((Ident7!=null?Ident7.getText():null));
				    Str label = new Str(removeOuterQuotes((Str8!=null?Str8.getText():null)));
				    Str datatype = new Str((Datatype9!=null?Datatype9.getText():null));
				    result = new Question(ident, label, datatype);
			    }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 5, question_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "question"



	// $ANTLR start "computation"
	// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:64:1: computation returns [Computation result] : Ident ':' Str PAREN_OPEN orExpr PAREN_CLOSE ;
	public final Computation computation() throws RecognitionException {
		Computation result = null;

		int computation_StartIndex = input.index();

		Token Ident10=null;
		Token Str11=null;
		QLExpression orExpr12 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return result; }

			// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:65:3: ( Ident ':' Str PAREN_OPEN orExpr PAREN_CLOSE )
			// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:65:5: Ident ':' Str PAREN_OPEN orExpr PAREN_CLOSE
			{
			Ident10=(Token)match(input,Ident,FOLLOW_Ident_in_computation220); if (state.failed) return result;
			match(input,24,FOLLOW_24_in_computation222); if (state.failed) return result;
			Str11=(Token)match(input,Str,FOLLOW_Str_in_computation224); if (state.failed) return result;
			match(input,PAREN_OPEN,FOLLOW_PAREN_OPEN_in_computation226); if (state.failed) return result;
			pushFollow(FOLLOW_orExpr_in_computation228);
			orExpr12=orExpr();
			state._fsp--;
			if (state.failed) return result;
			match(input,PAREN_CLOSE,FOLLOW_PAREN_CLOSE_in_computation230); if (state.failed) return result;
			if ( state.backtracking==0 ) {
			      Ident ident = new Ident((Ident10!=null?Ident10.getText():null));
			      Str label = new Str(removeOuterQuotes((Str11!=null?Str11.getText():null)));
			      QLExpression orExpression = orExpr12;
			      result = new Computation(ident, label, orExpression);
			    }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 6, computation_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "computation"



	// $ANTLR start "conditional"
	// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:74:1: conditional returns [Conditional result] : 'if' '(' condition= orExpr ')' success= block ( ( 'else' )=> 'else' failure= block | () ) ;
	public final Conditional conditional() throws RecognitionException {
		Conditional result = null;

		int conditional_StartIndex = input.index();

		QLExpression condition =null;
		List<QLStatement> success =null;
		List<QLStatement> failure =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return result; }

			// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:75:3: ( 'if' '(' condition= orExpr ')' success= block ( ( 'else' )=> 'else' failure= block | () ) )
			// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:75:5: 'if' '(' condition= orExpr ')' success= block ( ( 'else' )=> 'else' failure= block | () )
			{
			match(input,31,FOLLOW_31_in_conditional255); if (state.failed) return result;
			match(input,PAREN_OPEN,FOLLOW_PAREN_OPEN_in_conditional257); if (state.failed) return result;
			pushFollow(FOLLOW_orExpr_in_conditional261);
			condition=orExpr();
			state._fsp--;
			if (state.failed) return result;
			match(input,PAREN_CLOSE,FOLLOW_PAREN_CLOSE_in_conditional263); if (state.failed) return result;
			pushFollow(FOLLOW_block_in_conditional267);
			success=block();
			state._fsp--;
			if (state.failed) return result;
			// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:76:5: ( ( 'else' )=> 'else' failure= block | () )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==30) && (synpred4_QL())) {
				alt3=1;
			}
			else if ( (LA3_0==EOF||LA3_0==BRACE_CLOSE||LA3_0==Ident||LA3_0==31) ) {
				alt3=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return result;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:76:7: ( 'else' )=> 'else' failure= block
					{
					match(input,30,FOLLOW_30_in_conditional281); if (state.failed) return result;
					pushFollow(FOLLOW_block_in_conditional285);
					failure=block();
					state._fsp--;
					if (state.failed) return result;
					}
					break;
				case 2 :
					// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:77:7: ()
					{
					// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:77:7: ()
					// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:77:9: 
					{
					}

					}
					break;

			}

			if ( state.backtracking==0 ) {
			      if (failure != null) {
			        result = new Conditional(condition, success, failure);
			      } else {
			        result = new Conditional(condition, success);
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
			if ( state.backtracking>0 ) { memoize(input, 7, conditional_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "conditional"



	// $ANTLR start "primary"
	// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:88:1: primary returns [QLExpression result] : ( Int | Bool | Ident | Str | '(' x= orExpr ')' );
	public final QLExpression primary() throws RecognitionException {
		QLExpression result = null;

		int primary_StartIndex = input.index();

		Token Int13=null;
		Token Bool14=null;
		Token Ident15=null;
		Token Str16=null;
		QLExpression x =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return result; }

			// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:89:3: ( Int | Bool | Ident | Str | '(' x= orExpr ')' )
			int alt4=5;
			switch ( input.LA(1) ) {
			case Int:
				{
				alt4=1;
				}
				break;
			case Bool:
				{
				alt4=2;
				}
				break;
			case Ident:
				{
				alt4=3;
				}
				break;
			case Str:
				{
				alt4=4;
				}
				break;
			case PAREN_OPEN:
				{
				alt4=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return result;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:89:5: Int
					{
					Int13=(Token)match(input,Int,FOLLOW_Int_in_primary328); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new Int(Integer.parseInt((Int13!=null?Int13.getText():null))); }
					}
					break;
				case 2 :
					// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:90:5: Bool
					{
					Bool14=(Token)match(input,Bool,FOLLOW_Bool_in_primary338); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new Bool(Boolean.parseBoolean((Bool14!=null?Bool14.getText():null))); }
					}
					break;
				case 3 :
					// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:91:5: Ident
					{
					Ident15=(Token)match(input,Ident,FOLLOW_Ident_in_primary347); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new Ident((Ident15!=null?Ident15.getText():null)); }
					}
					break;
				case 4 :
					// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:92:5: Str
					{
					Str16=(Token)match(input,Str,FOLLOW_Str_in_primary355); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new Str(removeOuterQuotes((Str16!=null?Str16.getText():null))); }
					}
					break;
				case 5 :
					// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:93:5: '(' x= orExpr ')'
					{
					match(input,PAREN_OPEN,FOLLOW_PAREN_OPEN_in_primary365); if (state.failed) return result;
					pushFollow(FOLLOW_orExpr_in_primary369);
					x=orExpr();
					state._fsp--;
					if (state.failed) return result;
					match(input,PAREN_CLOSE,FOLLOW_PAREN_CLOSE_in_primary371); if (state.failed) return result;
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
			if ( state.backtracking>0 ) { memoize(input, 8, primary_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "primary"



	// $ANTLR start "unExpr"
	// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:96:1: unExpr returns [QLExpression result] : ( '+' x= unExpr | '-' x= unExpr | '!' x= unExpr |x= primary );
	public final QLExpression unExpr() throws RecognitionException {
		QLExpression result = null;

		int unExpr_StartIndex = input.index();

		QLExpression x =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return result; }

			// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:97:5: ( '+' x= unExpr | '-' x= unExpr | '!' x= unExpr |x= primary )
			int alt5=4;
			switch ( input.LA(1) ) {
			case 21:
				{
				alt5=1;
				}
				break;
			case 22:
				{
				alt5=2;
				}
				break;
			case 17:
				{
				alt5=3;
				}
				break;
			case Bool:
			case Ident:
			case Int:
			case PAREN_OPEN:
			case Str:
				{
				alt5=4;
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
					// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:97:8: '+' x= unExpr
					{
					match(input,21,FOLLOW_21_in_unExpr392); if (state.failed) return result;
					pushFollow(FOLLOW_unExpr_in_unExpr396);
					x=unExpr();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new Positive(x); }
					}
					break;
				case 2 :
					// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:98:8: '-' x= unExpr
					{
					match(input,22,FOLLOW_22_in_unExpr407); if (state.failed) return result;
					pushFollow(FOLLOW_unExpr_in_unExpr411);
					x=unExpr();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new Negative(x); }
					}
					break;
				case 3 :
					// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:99:8: '!' x= unExpr
					{
					match(input,17,FOLLOW_17_in_unExpr422); if (state.failed) return result;
					pushFollow(FOLLOW_unExpr_in_unExpr426);
					x=unExpr();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new Not(x); }
					}
					break;
				case 4 :
					// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:100:8: x= primary
					{
					pushFollow(FOLLOW_primary_in_unExpr439);
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
			if ( state.backtracking>0 ) { memoize(input, 9, unExpr_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "unExpr"



	// $ANTLR start "mulExpr"
	// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:103:1: mulExpr returns [QLExpression result] : lhs= unExpr (op= ( '*' | '/' ) rhs= unExpr )* ;
	public final QLExpression mulExpr() throws RecognitionException {
		QLExpression result = null;

		int mulExpr_StartIndex = input.index();

		Token op=null;
		QLExpression lhs =null;
		QLExpression rhs =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return result; }

			// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:104:5: (lhs= unExpr (op= ( '*' | '/' ) rhs= unExpr )* )
			// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:104:9: lhs= unExpr (op= ( '*' | '/' ) rhs= unExpr )*
			{
			pushFollow(FOLLOW_unExpr_in_mulExpr477);
			lhs=unExpr();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) { result =lhs; }
			// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:104:45: (op= ( '*' | '/' ) rhs= unExpr )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==20||LA6_0==23) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:104:47: op= ( '*' | '/' ) rhs= unExpr
					{
					op=input.LT(1);
					if ( input.LA(1)==20||input.LA(1)==23 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return result;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_unExpr_in_mulExpr497);
					rhs=unExpr();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { 
						      if ((op!=null?op.getText():null).equals("*")) {
						        result = new Multiply(result, rhs);
						      }
						      if ((op!=null?op.getText():null).equals("/")) {
						        result = new Divide(result, rhs);      
						      }
						    }
					}
					break;

				default :
					break loop6;
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
			if ( state.backtracking>0 ) { memoize(input, 10, mulExpr_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "mulExpr"



	// $ANTLR start "addExpr"
	// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:116:1: addExpr returns [QLExpression result] : lhs= mulExpr (op= ( '+' | '-' ) rhs= mulExpr )* ;
	public final QLExpression addExpr() throws RecognitionException {
		QLExpression result = null;

		int addExpr_StartIndex = input.index();

		Token op=null;
		QLExpression lhs =null;
		QLExpression rhs =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return result; }

			// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:117:5: (lhs= mulExpr (op= ( '+' | '-' ) rhs= mulExpr )* )
			// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:117:9: lhs= mulExpr (op= ( '+' | '-' ) rhs= mulExpr )*
			{
			pushFollow(FOLLOW_mulExpr_in_addExpr539);
			lhs=mulExpr();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) { result =lhs; }
			// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:117:46: (op= ( '+' | '-' ) rhs= mulExpr )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= 21 && LA7_0 <= 22)) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:117:48: op= ( '+' | '-' ) rhs= mulExpr
					{
					op=input.LT(1);
					if ( (input.LA(1) >= 21 && input.LA(1) <= 22) ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return result;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_mulExpr_in_addExpr557);
					rhs=mulExpr();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { 
						      if ((op!=null?op.getText():null).equals("+")) {
						        result = new Add(result, rhs);
						      }
						      if ((op!=null?op.getText():null).equals("-")) {
						        result = new Subtract(result, rhs);      
						      }
						    }
					}
					break;

				default :
					break loop7;
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
			if ( state.backtracking>0 ) { memoize(input, 11, addExpr_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "addExpr"



	// $ANTLR start "relExpr"
	// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:128:1: relExpr returns [QLExpression result] : lhs= addExpr (op= ( '<' | '<=' | '>' | '>=' | '==' | '!=' ) rhs= addExpr )* ;
	public final QLExpression relExpr() throws RecognitionException {
		QLExpression result = null;

		int relExpr_StartIndex = input.index();

		Token op=null;
		QLExpression lhs =null;
		QLExpression rhs =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return result; }

			// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:129:5: (lhs= addExpr (op= ( '<' | '<=' | '>' | '>=' | '==' | '!=' ) rhs= addExpr )* )
			// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:129:9: lhs= addExpr (op= ( '<' | '<=' | '>' | '>=' | '==' | '!=' ) rhs= addExpr )*
			{
			pushFollow(FOLLOW_addExpr_in_relExpr593);
			lhs=addExpr();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) { result =lhs; }
			// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:129:46: (op= ( '<' | '<=' | '>' | '>=' | '==' | '!=' ) rhs= addExpr )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==18||(LA8_0 >= 25 && LA8_0 <= 29)) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:129:48: op= ( '<' | '<=' | '>' | '>=' | '==' | '!=' ) rhs= addExpr
					{
					op=input.LT(1);
					if ( input.LA(1)==18||(input.LA(1) >= 25 && input.LA(1) <= 29) ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return result;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_addExpr_in_relExpr617);
					rhs=addExpr();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { 
						      if ((op!=null?op.getText():null).equals("<")) {
						        result = new LessThan(result, rhs);
						      }
						      if ((op!=null?op.getText():null).equals("<=")) {
						        result = new LessThanOrEqualTo(result, rhs);      
						      }
						      if ((op!=null?op.getText():null).equals(">")) {
						        result = new GreaterThan(result, rhs);
						      }
						      if ((op!=null?op.getText():null).equals(">=")) {
						        result = new GreaterThanOrEqualTo(result, rhs);      
						      }
						      if ((op!=null?op.getText():null).equals("==")) {
						        result = new EqualTo(result, rhs);
						      }
						      if ((op!=null?op.getText():null).equals("!=")) {
						        result = new NotEqualTo(result, rhs);
						      }
						    }
					}
					break;

				default :
					break loop8;
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
			if ( state.backtracking>0 ) { memoize(input, 12, relExpr_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "relExpr"



	// $ANTLR start "andExpr"
	// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:152:1: andExpr returns [QLExpression result] : lhs= relExpr ( '&&' rhs= relExpr )* ;
	public final QLExpression andExpr() throws RecognitionException {
		QLExpression result = null;

		int andExpr_StartIndex = input.index();

		QLExpression lhs =null;
		QLExpression rhs =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return result; }

			// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:153:5: (lhs= relExpr ( '&&' rhs= relExpr )* )
			// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:153:9: lhs= relExpr ( '&&' rhs= relExpr )*
			{
			pushFollow(FOLLOW_relExpr_in_andExpr656);
			lhs=relExpr();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) { result =lhs; }
			// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:153:46: ( '&&' rhs= relExpr )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==19) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:153:48: '&&' rhs= relExpr
					{
					match(input,19,FOLLOW_19_in_andExpr662); if (state.failed) return result;
					pushFollow(FOLLOW_relExpr_in_andExpr666);
					rhs=relExpr();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new And(result, rhs); }
					}
					break;

				default :
					break loop9;
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
			if ( state.backtracking>0 ) { memoize(input, 13, andExpr_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "andExpr"



	// $ANTLR start "orExpr"
	// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:157:1: orExpr returns [QLExpression result] : lhs= andExpr ( '||' rhs= andExpr )* ;
	public final QLExpression orExpr() throws RecognitionException {
		QLExpression result = null;

		int orExpr_StartIndex = input.index();

		QLExpression lhs =null;
		QLExpression rhs =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return result; }

			// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:158:5: (lhs= andExpr ( '||' rhs= andExpr )* )
			// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:158:9: lhs= andExpr ( '||' rhs= andExpr )*
			{
			pushFollow(FOLLOW_andExpr_in_orExpr701);
			lhs=andExpr();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) { result = lhs; }
			// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:158:48: ( '||' rhs= andExpr )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==32) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:158:50: '||' rhs= andExpr
					{
					match(input,32,FOLLOW_32_in_orExpr707); if (state.failed) return result;
					pushFollow(FOLLOW_andExpr_in_orExpr711);
					rhs=andExpr();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new Or(result, rhs); }
					}
					break;

				default :
					break loop10;
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
			if ( state.backtracking>0 ) { memoize(input, 14, orExpr_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "orExpr"

	// $ANTLR start synpred4_QL
	public final void synpred4_QL_fragment() throws RecognitionException {
		// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:76:7: ( 'else' )
		// /home/sander/Documents/workspace/freshSeaOfQL/SanderBenschop/QLJava/src/main/java/org/uva/sea/ql/parser/antlr/QL.g:76:8: 'else'
		{
		match(input,30,FOLLOW_30_in_synpred4_QL276); if (state.failed) return;
		}

	}
	// $ANTLR end synpred4_QL

	// Delegated rules

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



	public static final BitSet FOLLOW_FORM_in_form56 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_Ident_in_form58 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_BRACE_OPEN_in_form60 = new BitSet(new long[]{0x0000000080000810L});
	public static final BitSet FOLLOW_statementList_in_form62 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_BRACE_CLOSE_in_form64 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BRACE_OPEN_in_block90 = new BitSet(new long[]{0x0000000080000810L});
	public static final BitSet FOLLOW_statementList_in_block92 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_BRACE_CLOSE_in_block94 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statementList132 = new BitSet(new long[]{0x0000000080000802L});
	public static final BitSet FOLLOW_question_in_statement153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_computation_in_statement161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditional_in_statement169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Ident_in_question188 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_question190 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Str_in_question192 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Datatype_in_question194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Ident_in_computation220 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_computation222 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Str_in_computation224 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_PAREN_OPEN_in_computation226 = new BitSet(new long[]{0x000000000062D840L});
	public static final BitSet FOLLOW_orExpr_in_computation228 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_PAREN_CLOSE_in_computation230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_conditional255 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_PAREN_OPEN_in_conditional257 = new BitSet(new long[]{0x000000000062D840L});
	public static final BitSet FOLLOW_orExpr_in_conditional261 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_PAREN_CLOSE_in_conditional263 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_block_in_conditional267 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_30_in_conditional281 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_block_in_conditional285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Int_in_primary328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Bool_in_primary338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Ident_in_primary347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Str_in_primary355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PAREN_OPEN_in_primary365 = new BitSet(new long[]{0x000000000062D840L});
	public static final BitSet FOLLOW_orExpr_in_primary369 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_PAREN_CLOSE_in_primary371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_unExpr392 = new BitSet(new long[]{0x000000000062D840L});
	public static final BitSet FOLLOW_unExpr_in_unExpr396 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_unExpr407 = new BitSet(new long[]{0x000000000062D840L});
	public static final BitSet FOLLOW_unExpr_in_unExpr411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_unExpr422 = new BitSet(new long[]{0x000000000062D840L});
	public static final BitSet FOLLOW_unExpr_in_unExpr426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_in_unExpr439 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unExpr_in_mulExpr477 = new BitSet(new long[]{0x0000000000900002L});
	public static final BitSet FOLLOW_set_in_mulExpr485 = new BitSet(new long[]{0x000000000062D840L});
	public static final BitSet FOLLOW_unExpr_in_mulExpr497 = new BitSet(new long[]{0x0000000000900002L});
	public static final BitSet FOLLOW_mulExpr_in_addExpr539 = new BitSet(new long[]{0x0000000000600002L});
	public static final BitSet FOLLOW_set_in_addExpr547 = new BitSet(new long[]{0x000000000062D840L});
	public static final BitSet FOLLOW_mulExpr_in_addExpr557 = new BitSet(new long[]{0x0000000000600002L});
	public static final BitSet FOLLOW_addExpr_in_relExpr593 = new BitSet(new long[]{0x000000003E040002L});
	public static final BitSet FOLLOW_set_in_relExpr601 = new BitSet(new long[]{0x000000000062D840L});
	public static final BitSet FOLLOW_addExpr_in_relExpr617 = new BitSet(new long[]{0x000000003E040002L});
	public static final BitSet FOLLOW_relExpr_in_andExpr656 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_19_in_andExpr662 = new BitSet(new long[]{0x000000000062D840L});
	public static final BitSet FOLLOW_relExpr_in_andExpr666 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_andExpr_in_orExpr701 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_32_in_orExpr707 = new BitSet(new long[]{0x000000000062D840L});
	public static final BitSet FOLLOW_andExpr_in_orExpr711 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_30_in_synpred4_QL276 = new BitSet(new long[]{0x0000000000000002L});
}
