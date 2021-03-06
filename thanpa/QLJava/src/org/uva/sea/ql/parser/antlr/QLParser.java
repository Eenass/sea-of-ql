// $ANTLR 3.5 /Users/thanasis/Uva/sea-of-ql/thanpa/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g 2013-01-20 20:41:33

package org.uva.sea.ql.parser.antlr;
import org.uva.sea.ql.ast.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class QLParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "Bool", "Comment", "Ident", "Int", 
		"StringLiteral", "WS", "'!'", "'!='", "'&&'", "'('", "')'", "'*'", "'+'", 
		"'-'", "'/'", "'<'", "'<='", "'=='", "'>'", "'>='", "'||'"
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
	public static final int Bool=4;
	public static final int Comment=5;
	public static final int Ident=6;
	public static final int Int=7;
	public static final int StringLiteral=8;
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
		this.state.ruleMemo = new HashMap[26+1];


	}

	@Override public String[] getTokenNames() { return QLParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/thanasis/Uva/sea-of-ql/thanpa/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g"; }



	// $ANTLR start "primary"
	// /Users/thanasis/Uva/sea-of-ql/thanpa/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:15:1: primary returns [Expr result] : ( Int | Ident | Bool | StringLiteral | '(' x= orExpr ')' );
	public final Expr primary() throws RecognitionException {
		Expr result = null;

		int primary_StartIndex = input.index();

		Token Int1=null;
		Token Ident2=null;
		Token Bool3=null;
		Token StringLiteral4=null;
		Expr x =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return result; }

			// /Users/thanasis/Uva/sea-of-ql/thanpa/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:16:3: ( Int | Ident | Bool | StringLiteral | '(' x= orExpr ')' )
			int alt1=5;
			switch ( input.LA(1) ) {
			case Int:
				{
				alt1=1;
				}
				break;
			case Ident:
				{
				alt1=2;
				}
				break;
			case Bool:
				{
				alt1=3;
				}
				break;
			case StringLiteral:
				{
				alt1=4;
				}
				break;
			case 13:
				{
				alt1=5;
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
					// /Users/thanasis/Uva/sea-of-ql/thanpa/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:16:5: Int
					{
					Int1=(Token)match(input,Int,FOLLOW_Int_in_primary46); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new Int(Integer.parseInt((Int1!=null?Int1.getText():null))); }
					}
					break;
				case 2 :
					// /Users/thanasis/Uva/sea-of-ql/thanpa/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:17:5: Ident
					{
					Ident2=(Token)match(input,Ident,FOLLOW_Ident_in_primary56); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new Ident((Ident2!=null?Ident2.getText():null)); }
					}
					break;
				case 3 :
					// /Users/thanasis/Uva/sea-of-ql/thanpa/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:18:5: Bool
					{
					Bool3=(Token)match(input,Bool,FOLLOW_Bool_in_primary64); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new Bool((Bool3!=null?Bool3.getText():null)); }
					}
					break;
				case 4 :
					// /Users/thanasis/Uva/sea-of-ql/thanpa/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:19:5: StringLiteral
					{
					StringLiteral4=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_primary72); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new StringLiteral((StringLiteral4!=null?StringLiteral4.getText():null)); }
					}
					break;
				case 5 :
					// /Users/thanasis/Uva/sea-of-ql/thanpa/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:20:5: '(' x= orExpr ')'
					{
					match(input,13,FOLLOW_13_in_primary80); if (state.failed) return result;
					pushFollow(FOLLOW_orExpr_in_primary84);
					x=orExpr();
					state._fsp--;
					if (state.failed) return result;
					match(input,14,FOLLOW_14_in_primary86); if (state.failed) return result;
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
			if ( state.backtracking>0 ) { memoize(input, 1, primary_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "primary"



	// $ANTLR start "unExpr"
	// /Users/thanasis/Uva/sea-of-ql/thanpa/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:23:1: unExpr returns [Expr result] : ( '+' x= unExpr | '-' x= unExpr | '!' x= unExpr |x= primary );
	public final Expr unExpr() throws RecognitionException {
		Expr result = null;

		int unExpr_StartIndex = input.index();

		Expr x =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return result; }

			// /Users/thanasis/Uva/sea-of-ql/thanpa/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:24:5: ( '+' x= unExpr | '-' x= unExpr | '!' x= unExpr |x= primary )
			int alt2=4;
			switch ( input.LA(1) ) {
			case 16:
				{
				alt2=1;
				}
				break;
			case 17:
				{
				alt2=2;
				}
				break;
			case 10:
				{
				alt2=3;
				}
				break;
			case Bool:
			case Ident:
			case Int:
			case StringLiteral:
			case 13:
				{
				alt2=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return result;}
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// /Users/thanasis/Uva/sea-of-ql/thanpa/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:24:8: '+' x= unExpr
					{
					match(input,16,FOLLOW_16_in_unExpr111); if (state.failed) return result;
					pushFollow(FOLLOW_unExpr_in_unExpr115);
					x=unExpr();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new Pos(x); }
					}
					break;
				case 2 :
					// /Users/thanasis/Uva/sea-of-ql/thanpa/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:25:8: '-' x= unExpr
					{
					match(input,17,FOLLOW_17_in_unExpr126); if (state.failed) return result;
					pushFollow(FOLLOW_unExpr_in_unExpr130);
					x=unExpr();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new Neg(x); }
					}
					break;
				case 3 :
					// /Users/thanasis/Uva/sea-of-ql/thanpa/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:26:8: '!' x= unExpr
					{
					match(input,10,FOLLOW_10_in_unExpr141); if (state.failed) return result;
					pushFollow(FOLLOW_unExpr_in_unExpr145);
					x=unExpr();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new Not(x); }
					}
					break;
				case 4 :
					// /Users/thanasis/Uva/sea-of-ql/thanpa/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:27:8: x= primary
					{
					pushFollow(FOLLOW_primary_in_unExpr158);
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
			if ( state.backtracking>0 ) { memoize(input, 2, unExpr_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "unExpr"



	// $ANTLR start "mulExpr"
	// /Users/thanasis/Uva/sea-of-ql/thanpa/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:30:1: mulExpr returns [Expr result] : lhs= unExpr (op= ( '*' | '/' ) rhs= unExpr )* ;
	public final Expr mulExpr() throws RecognitionException {
		Expr result = null;

		int mulExpr_StartIndex = input.index();

		Token op=null;
		Expr lhs =null;
		Expr rhs =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return result; }

			// /Users/thanasis/Uva/sea-of-ql/thanpa/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:31:5: (lhs= unExpr (op= ( '*' | '/' ) rhs= unExpr )* )
			// /Users/thanasis/Uva/sea-of-ql/thanpa/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:31:9: lhs= unExpr (op= ( '*' | '/' ) rhs= unExpr )*
			{
			pushFollow(FOLLOW_unExpr_in_mulExpr196);
			lhs=unExpr();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) { result =lhs; }
			// /Users/thanasis/Uva/sea-of-ql/thanpa/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:31:45: (op= ( '*' | '/' ) rhs= unExpr )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==15||LA3_0==18) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /Users/thanasis/Uva/sea-of-ql/thanpa/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:31:47: op= ( '*' | '/' ) rhs= unExpr
					{
					op=input.LT(1);
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
					pushFollow(FOLLOW_unExpr_in_mulExpr216);
					rhs=unExpr();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { 
					      if ((op!=null?op.getText():null).equals("*")) {
					        result = new Mul(result, rhs);
					      }
					      if ((op!=null?op.getText():null).equals("<=")) {
					        result = new Div(result, rhs);      
					      }
					    }
					}
					break;

				default :
					break loop3;
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
			if ( state.backtracking>0 ) { memoize(input, 3, mulExpr_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "mulExpr"



	// $ANTLR start "addExpr"
	// /Users/thanasis/Uva/sea-of-ql/thanpa/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:43:1: addExpr returns [Expr result] : lhs= mulExpr (op= ( '+' | '-' ) rhs= mulExpr )* ;
	public final Expr addExpr() throws RecognitionException {
		Expr result = null;

		int addExpr_StartIndex = input.index();

		Token op=null;
		Expr lhs =null;
		Expr rhs =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return result; }

			// /Users/thanasis/Uva/sea-of-ql/thanpa/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:44:5: (lhs= mulExpr (op= ( '+' | '-' ) rhs= mulExpr )* )
			// /Users/thanasis/Uva/sea-of-ql/thanpa/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:44:9: lhs= mulExpr (op= ( '+' | '-' ) rhs= mulExpr )*
			{
			pushFollow(FOLLOW_mulExpr_in_addExpr257);
			lhs=mulExpr();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) { result =lhs; }
			// /Users/thanasis/Uva/sea-of-ql/thanpa/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:44:46: (op= ( '+' | '-' ) rhs= mulExpr )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= 16 && LA4_0 <= 17)) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /Users/thanasis/Uva/sea-of-ql/thanpa/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:44:48: op= ( '+' | '-' ) rhs= mulExpr
					{
					op=input.LT(1);
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
					pushFollow(FOLLOW_mulExpr_in_addExpr275);
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
					break loop4;
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
			if ( state.backtracking>0 ) { memoize(input, 4, addExpr_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "addExpr"



	// $ANTLR start "relExpr"
	// /Users/thanasis/Uva/sea-of-ql/thanpa/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:55:1: relExpr returns [Expr result] : lhs= addExpr (op= ( '<' | '<=' | '>' | '>=' | '==' | '!=' ) rhs= addExpr )* ;
	public final Expr relExpr() throws RecognitionException {
		Expr result = null;

		int relExpr_StartIndex = input.index();

		Token op=null;
		Expr lhs =null;
		Expr rhs =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return result; }

			// /Users/thanasis/Uva/sea-of-ql/thanpa/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:56:5: (lhs= addExpr (op= ( '<' | '<=' | '>' | '>=' | '==' | '!=' ) rhs= addExpr )* )
			// /Users/thanasis/Uva/sea-of-ql/thanpa/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:56:9: lhs= addExpr (op= ( '<' | '<=' | '>' | '>=' | '==' | '!=' ) rhs= addExpr )*
			{
			pushFollow(FOLLOW_addExpr_in_relExpr310);
			lhs=addExpr();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) { result =lhs; }
			// /Users/thanasis/Uva/sea-of-ql/thanpa/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:56:46: (op= ( '<' | '<=' | '>' | '>=' | '==' | '!=' ) rhs= addExpr )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==11||(LA5_0 >= 19 && LA5_0 <= 23)) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /Users/thanasis/Uva/sea-of-ql/thanpa/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:56:48: op= ( '<' | '<=' | '>' | '>=' | '==' | '!=' ) rhs= addExpr
					{
					op=input.LT(1);
					if ( input.LA(1)==11||(input.LA(1) >= 19 && input.LA(1) <= 23) ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return result;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_addExpr_in_relExpr334);
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
					break loop5;
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
			if ( state.backtracking>0 ) { memoize(input, 5, relExpr_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "relExpr"



	// $ANTLR start "andExpr"
	// /Users/thanasis/Uva/sea-of-ql/thanpa/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:79:1: andExpr returns [Expr result] : lhs= relExpr ( '&&' rhs= relExpr )* ;
	public final Expr andExpr() throws RecognitionException {
		Expr result = null;

		int andExpr_StartIndex = input.index();

		Expr lhs =null;
		Expr rhs =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return result; }

			// /Users/thanasis/Uva/sea-of-ql/thanpa/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:80:5: (lhs= relExpr ( '&&' rhs= relExpr )* )
			// /Users/thanasis/Uva/sea-of-ql/thanpa/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:80:9: lhs= relExpr ( '&&' rhs= relExpr )*
			{
			pushFollow(FOLLOW_relExpr_in_andExpr372);
			lhs=relExpr();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) { result =lhs; }
			// /Users/thanasis/Uva/sea-of-ql/thanpa/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:80:46: ( '&&' rhs= relExpr )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==12) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// /Users/thanasis/Uva/sea-of-ql/thanpa/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:80:48: '&&' rhs= relExpr
					{
					match(input,12,FOLLOW_12_in_andExpr378); if (state.failed) return result;
					pushFollow(FOLLOW_relExpr_in_andExpr382);
					rhs=relExpr();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new And(result, rhs); }
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
			if ( state.backtracking>0 ) { memoize(input, 6, andExpr_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "andExpr"



	// $ANTLR start "orExpr"
	// /Users/thanasis/Uva/sea-of-ql/thanpa/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:84:1: orExpr returns [Expr result] : lhs= andExpr ( '||' rhs= andExpr )* ;
	public final Expr orExpr() throws RecognitionException {
		Expr result = null;

		int orExpr_StartIndex = input.index();

		Expr lhs =null;
		Expr rhs =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return result; }

			// /Users/thanasis/Uva/sea-of-ql/thanpa/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:85:5: (lhs= andExpr ( '||' rhs= andExpr )* )
			// /Users/thanasis/Uva/sea-of-ql/thanpa/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:85:9: lhs= andExpr ( '||' rhs= andExpr )*
			{
			pushFollow(FOLLOW_andExpr_in_orExpr417);
			lhs=andExpr();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) { result = lhs; }
			// /Users/thanasis/Uva/sea-of-ql/thanpa/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:85:48: ( '||' rhs= andExpr )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==24) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// /Users/thanasis/Uva/sea-of-ql/thanpa/QLJava/src/org/uva/sea/ql/parser/antlr/QL.g:85:50: '||' rhs= andExpr
					{
					match(input,24,FOLLOW_24_in_orExpr423); if (state.failed) return result;
					pushFollow(FOLLOW_andExpr_in_orExpr427);
					rhs=andExpr();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new Or(result, rhs); }
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
			if ( state.backtracking>0 ) { memoize(input, 7, orExpr_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "orExpr"

	// Delegated rules



	public static final BitSet FOLLOW_Int_in_primary46 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Ident_in_primary56 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Bool_in_primary64 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_StringLiteral_in_primary72 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_primary80 = new BitSet(new long[]{0x00000000000325D0L});
	public static final BitSet FOLLOW_orExpr_in_primary84 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_primary86 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_unExpr111 = new BitSet(new long[]{0x00000000000325D0L});
	public static final BitSet FOLLOW_unExpr_in_unExpr115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_unExpr126 = new BitSet(new long[]{0x00000000000325D0L});
	public static final BitSet FOLLOW_unExpr_in_unExpr130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_unExpr141 = new BitSet(new long[]{0x00000000000325D0L});
	public static final BitSet FOLLOW_unExpr_in_unExpr145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_in_unExpr158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unExpr_in_mulExpr196 = new BitSet(new long[]{0x0000000000048002L});
	public static final BitSet FOLLOW_set_in_mulExpr204 = new BitSet(new long[]{0x00000000000325D0L});
	public static final BitSet FOLLOW_unExpr_in_mulExpr216 = new BitSet(new long[]{0x0000000000048002L});
	public static final BitSet FOLLOW_mulExpr_in_addExpr257 = new BitSet(new long[]{0x0000000000030002L});
	public static final BitSet FOLLOW_set_in_addExpr265 = new BitSet(new long[]{0x00000000000325D0L});
	public static final BitSet FOLLOW_mulExpr_in_addExpr275 = new BitSet(new long[]{0x0000000000030002L});
	public static final BitSet FOLLOW_addExpr_in_relExpr310 = new BitSet(new long[]{0x0000000000F80802L});
	public static final BitSet FOLLOW_set_in_relExpr318 = new BitSet(new long[]{0x00000000000325D0L});
	public static final BitSet FOLLOW_addExpr_in_relExpr334 = new BitSet(new long[]{0x0000000000F80802L});
	public static final BitSet FOLLOW_relExpr_in_andExpr372 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_12_in_andExpr378 = new BitSet(new long[]{0x00000000000325D0L});
	public static final BitSet FOLLOW_relExpr_in_andExpr382 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_andExpr_in_orExpr417 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_24_in_orExpr423 = new BitSet(new long[]{0x00000000000325D0L});
	public static final BitSet FOLLOW_andExpr_in_orExpr427 = new BitSet(new long[]{0x0000000001000002L});
}
