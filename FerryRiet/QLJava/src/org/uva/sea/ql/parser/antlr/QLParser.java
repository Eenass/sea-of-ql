// $ANTLR 3.5 D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g 2013-01-22 22:38:52

package org.uva.sea.ql.parser.antlr;
import org.uva.sea.ql.ast.*;
import org.uva.sea.ql.ast.types.*;
import org.uva.sea.ql.ast.operators.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class QLParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BooleanLiteral", "COLON", "COMMENT", 
		"Ident", "IntLiteral", "LBRACE", "RBRACE", "StringLiteral", "WS", "'!'", 
		"'!='", "'&&'", "'('", "')'", "'*'", "'+'", "'-'", "'/'", "'<'", "'<='", 
		"'=='", "'>'", "'>='", "'boolean'", "'else'", "'form'", "'if'", "'money'", 
		"'string'", "'||'"
	};
	public static final int EOF=-1;
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
	public static final int BooleanLiteral=4;
	public static final int COLON=5;
	public static final int COMMENT=6;
	public static final int Ident=7;
	public static final int IntLiteral=8;
	public static final int LBRACE=9;
	public static final int RBRACE=10;
	public static final int StringLiteral=11;
	public static final int WS=12;

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
	@Override public String getGrammarFileName() { return "D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g"; }



	// $ANTLR start "qlprogram"
	// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:17:1: qlprogram returns [QLProgram result] : 'form' Ident cb= compoundStatement ;
	public final QLProgram qlprogram() throws RecognitionException {
		QLProgram result = null;

		int qlprogram_StartIndex = input.index();

		Token Ident1=null;
		Statement cb =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return result; }

			// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:18:5: ( 'form' Ident cb= compoundStatement )
			// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:18:7: 'form' Ident cb= compoundStatement
			{
			match(input,29,FOLLOW_29_in_qlprogram48); if (state.failed) return result;
			Ident1=(Token)match(input,Ident,FOLLOW_Ident_in_qlprogram50); if (state.failed) return result;
			pushFollow(FOLLOW_compoundStatement_in_qlprogram55);
			cb=compoundStatement();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) { result = new QLProgram(Ident1, cb) ; }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 1, qlprogram_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "qlprogram"



	// $ANTLR start "compoundStatement"
	// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:21:1: compoundStatement returns [Statement result] : LBRACE (st= statement )* RBRACE ;
	public final Statement compoundStatement() throws RecognitionException {
		Statement result = null;

		int compoundStatement_StartIndex = input.index();

		Statement st =null;

		 CompoundStatement compoundStatement = new CompoundStatement() ; 
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return result; }

			// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:23:5: ( LBRACE (st= statement )* RBRACE )
			// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:23:7: LBRACE (st= statement )* RBRACE
			{
			match(input,LBRACE,FOLLOW_LBRACE_in_compoundStatement86); if (state.failed) return result;
			// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:24:7: (st= statement )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==Ident||LA1_0==LBRACE||LA1_0==30) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:24:8: st= statement
					{
					pushFollow(FOLLOW_statement_in_compoundStatement98);
					st=statement();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { compoundStatement.addStatement(st) ; }
					}
					break;

				default :
					break loop1;
				}
			}

			match(input,RBRACE,FOLLOW_RBRACE_in_compoundStatement113); if (state.failed) return result;
			if ( state.backtracking==0 ) { result = compoundStatement ; }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 2, compoundStatement_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "compoundStatement"



	// $ANTLR start "statement"
	// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:28:1: statement returns [Statement result] : ( Ident COLON StringLiteral type ( '(' x= orExpr ')' )? | 'if' '(' ex= orExpr ')' ctrue= compoundStatement ( 'else' cfalse= compoundStatement )? |cst= compoundStatement );
	public final Statement statement() throws RecognitionException {
		Statement result = null;

		int statement_StartIndex = input.index();

		Token Ident2=null;
		Token StringLiteral3=null;
		Expr x =null;
		Expr ex =null;
		Statement ctrue =null;
		Statement cfalse =null;
		Statement cst =null;
		TypeDescription type4 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return result; }

			// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:29:5: ( Ident COLON StringLiteral type ( '(' x= orExpr ')' )? | 'if' '(' ex= orExpr ')' ctrue= compoundStatement ( 'else' cfalse= compoundStatement )? |cst= compoundStatement )
			int alt4=3;
			switch ( input.LA(1) ) {
			case Ident:
				{
				alt4=1;
				}
				break;
			case 30:
				{
				alt4=2;
				}
				break;
			case LBRACE:
				{
				alt4=3;
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
					// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:29:7: Ident COLON StringLiteral type ( '(' x= orExpr ')' )?
					{
					Ident2=(Token)match(input,Ident,FOLLOW_Ident_in_statement148); if (state.failed) return result;
					match(input,COLON,FOLLOW_COLON_in_statement150); if (state.failed) return result;
					StringLiteral3=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_statement152); if (state.failed) return result;
					pushFollow(FOLLOW_type_in_statement154);
					type4=type();
					state._fsp--;
					if (state.failed) return result;
					// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:29:38: ( '(' x= orExpr ')' )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==16) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:29:39: '(' x= orExpr ')'
							{
							match(input,16,FOLLOW_16_in_statement157); if (state.failed) return result;
							pushFollow(FOLLOW_orExpr_in_statement161);
							x=orExpr();
							state._fsp--;
							if (state.failed) return result;
							match(input,17,FOLLOW_17_in_statement163); if (state.failed) return result;
							}
							break;

					}

					if ( state.backtracking==0 ) { result = new LineStatement(new Ident(Ident2),StringLiteral3,type4,x); }
					}
					break;
				case 2 :
					// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:30:7: 'if' '(' ex= orExpr ')' ctrue= compoundStatement ( 'else' cfalse= compoundStatement )?
					{
					match(input,30,FOLLOW_30_in_statement175); if (state.failed) return result;
					match(input,16,FOLLOW_16_in_statement177); if (state.failed) return result;
					pushFollow(FOLLOW_orExpr_in_statement181);
					ex=orExpr();
					state._fsp--;
					if (state.failed) return result;
					match(input,17,FOLLOW_17_in_statement183); if (state.failed) return result;
					pushFollow(FOLLOW_compoundStatement_in_statement187);
					ctrue=compoundStatement();
					state._fsp--;
					if (state.failed) return result;
					// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:30:54: ( 'else' cfalse= compoundStatement )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==28) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:30:55: 'else' cfalse= compoundStatement
							{
							match(input,28,FOLLOW_28_in_statement190); if (state.failed) return result;
							pushFollow(FOLLOW_compoundStatement_in_statement194);
							cfalse=compoundStatement();
							state._fsp--;
							if (state.failed) return result;
							}
							break;

					}

					if ( state.backtracking==0 ) { result = new ConditionalStatement(ex,ctrue,cfalse) ; }
					}
					break;
				case 3 :
					// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:31:8: cst= compoundStatement
					{
					pushFollow(FOLLOW_compoundStatement_in_statement209);
					cst=compoundStatement();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = cst ;}
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
			if ( state.backtracking>0 ) { memoize(input, 3, statement_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "statement"



	// $ANTLR start "type"
	// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:34:1: type returns [TypeDescription result] : ( 'boolean' | 'string' | 'money' );
	public final TypeDescription type() throws RecognitionException {
		TypeDescription result = null;

		int type_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return result; }

			// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:35:5: ( 'boolean' | 'string' | 'money' )
			int alt5=3;
			switch ( input.LA(1) ) {
			case 27:
				{
				alt5=1;
				}
				break;
			case 32:
				{
				alt5=2;
				}
				break;
			case 31:
				{
				alt5=3;
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
					// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:35:7: 'boolean'
					{
					match(input,27,FOLLOW_27_in_type234); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new BooleanType() ;}
					}
					break;
				case 2 :
					// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:36:7: 'string'
					{
					match(input,32,FOLLOW_32_in_type244); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new StringType() ;}
					}
					break;
				case 3 :
					// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:37:7: 'money'
					{
					match(input,31,FOLLOW_31_in_type255); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new MoneyType() ;}
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
			if ( state.backtracking>0 ) { memoize(input, 4, type_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "type"



	// $ANTLR start "primary"
	// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:40:1: primary returns [Expr result] : ( IntLiteral | Ident | BooleanLiteral | StringLiteral | '(' x= orExpr ')' );
	public final Expr primary() throws RecognitionException {
		Expr result = null;

		int primary_StartIndex = input.index();

		Token IntLiteral5=null;
		Token Ident6=null;
		Token BooleanLiteral7=null;
		Token StringLiteral8=null;
		Expr x =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return result; }

			// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:41:3: ( IntLiteral | Ident | BooleanLiteral | StringLiteral | '(' x= orExpr ')' )
			int alt6=5;
			switch ( input.LA(1) ) {
			case IntLiteral:
				{
				alt6=1;
				}
				break;
			case Ident:
				{
				alt6=2;
				}
				break;
			case BooleanLiteral:
				{
				alt6=3;
				}
				break;
			case StringLiteral:
				{
				alt6=4;
				}
				break;
			case 16:
				{
				alt6=5;
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
					// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:41:5: IntLiteral
					{
					IntLiteral5=(Token)match(input,IntLiteral,FOLLOW_IntLiteral_in_primary278); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new IntLiteral(Integer.parseInt((IntLiteral5!=null?IntLiteral5.getText():null))); }
					}
					break;
				case 2 :
					// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:42:5: Ident
					{
					Ident6=(Token)match(input,Ident,FOLLOW_Ident_in_primary291); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new Ident(Ident6); }
					}
					break;
				case 3 :
					// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:43:5: BooleanLiteral
					{
					BooleanLiteral7=(Token)match(input,BooleanLiteral,FOLLOW_BooleanLiteral_in_primary309); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new BooleanLiteral((BooleanLiteral7!=null?BooleanLiteral7.getText():null)) ;}
					}
					break;
				case 4 :
					// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:44:5: StringLiteral
					{
					StringLiteral8=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_primary318); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new StringLiteral((StringLiteral8!=null?StringLiteral8.getText():null)) ;}
					}
					break;
				case 5 :
					// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:45:5: '(' x= orExpr ')'
					{
					match(input,16,FOLLOW_16_in_primary328); if (state.failed) return result;
					pushFollow(FOLLOW_orExpr_in_primary332);
					x=orExpr();
					state._fsp--;
					if (state.failed) return result;
					match(input,17,FOLLOW_17_in_primary334); if (state.failed) return result;
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
			if ( state.backtracking>0 ) { memoize(input, 5, primary_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "primary"



	// $ANTLR start "unExpr"
	// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:48:1: unExpr returns [Expr result] : ( '+' x= unExpr | '-' x= unExpr | '!' x= unExpr |x= primary );
	public final Expr unExpr() throws RecognitionException {
		Expr result = null;

		int unExpr_StartIndex = input.index();

		Expr x =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return result; }

			// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:49:5: ( '+' x= unExpr | '-' x= unExpr | '!' x= unExpr |x= primary )
			int alt7=4;
			switch ( input.LA(1) ) {
			case 19:
				{
				alt7=1;
				}
				break;
			case 20:
				{
				alt7=2;
				}
				break;
			case 13:
				{
				alt7=3;
				}
				break;
			case BooleanLiteral:
			case Ident:
			case IntLiteral:
			case StringLiteral:
			case 16:
				{
				alt7=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return result;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:49:8: '+' x= unExpr
					{
					match(input,19,FOLLOW_19_in_unExpr359); if (state.failed) return result;
					pushFollow(FOLLOW_unExpr_in_unExpr363);
					x=unExpr();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new Pos(x); }
					}
					break;
				case 2 :
					// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:50:8: '-' x= unExpr
					{
					match(input,20,FOLLOW_20_in_unExpr374); if (state.failed) return result;
					pushFollow(FOLLOW_unExpr_in_unExpr378);
					x=unExpr();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new Neg(x); }
					}
					break;
				case 3 :
					// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:51:8: '!' x= unExpr
					{
					match(input,13,FOLLOW_13_in_unExpr389); if (state.failed) return result;
					pushFollow(FOLLOW_unExpr_in_unExpr393);
					x=unExpr();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new Not(x); }
					}
					break;
				case 4 :
					// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:52:8: x= primary
					{
					pushFollow(FOLLOW_primary_in_unExpr406);
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
			if ( state.backtracking>0 ) { memoize(input, 6, unExpr_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "unExpr"



	// $ANTLR start "mulExpr"
	// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:55:1: mulExpr returns [Expr result] : lhs= unExpr (op= ( '*' | '/' ) rhs= unExpr )* ;
	public final Expr mulExpr() throws RecognitionException {
		Expr result = null;

		int mulExpr_StartIndex = input.index();

		Token op=null;
		Expr lhs =null;
		Expr rhs =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return result; }

			// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:56:5: (lhs= unExpr (op= ( '*' | '/' ) rhs= unExpr )* )
			// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:56:9: lhs= unExpr (op= ( '*' | '/' ) rhs= unExpr )*
			{
			pushFollow(FOLLOW_unExpr_in_mulExpr444);
			lhs=unExpr();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) { result =lhs; }
			// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:56:45: (op= ( '*' | '/' ) rhs= unExpr )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==18||LA8_0==21) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:56:47: op= ( '*' | '/' ) rhs= unExpr
					{
					op=input.LT(1);
					if ( input.LA(1)==18||input.LA(1)==21 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return result;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_unExpr_in_mulExpr464);
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
			if ( state.backtracking>0 ) { memoize(input, 7, mulExpr_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "mulExpr"



	// $ANTLR start "addExpr"
	// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:67:1: addExpr returns [Expr result] : lhs= mulExpr (op= ( '+' | '-' ) rhs= mulExpr )* ;
	public final Expr addExpr() throws RecognitionException {
		Expr result = null;

		int addExpr_StartIndex = input.index();

		Token op=null;
		Expr lhs =null;
		Expr rhs =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return result; }

			// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:68:5: (lhs= mulExpr (op= ( '+' | '-' ) rhs= mulExpr )* )
			// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:68:9: lhs= mulExpr (op= ( '+' | '-' ) rhs= mulExpr )*
			{
			pushFollow(FOLLOW_mulExpr_in_addExpr502);
			lhs=mulExpr();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) { result =lhs; }
			// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:68:46: (op= ( '+' | '-' ) rhs= mulExpr )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= 19 && LA9_0 <= 20)) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:68:48: op= ( '+' | '-' ) rhs= mulExpr
					{
					op=input.LT(1);
					if ( (input.LA(1) >= 19 && input.LA(1) <= 20) ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return result;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_mulExpr_in_addExpr520);
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
			if ( state.backtracking>0 ) { memoize(input, 8, addExpr_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "addExpr"



	// $ANTLR start "relExpr"
	// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:79:1: relExpr returns [Expr result] : lhs= addExpr (op= ( '<' | '<=' | '>' | '>=' | '==' | '!=' ) rhs= addExpr )* ;
	public final Expr relExpr() throws RecognitionException {
		Expr result = null;

		int relExpr_StartIndex = input.index();

		Token op=null;
		Expr lhs =null;
		Expr rhs =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return result; }

			// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:80:5: (lhs= addExpr (op= ( '<' | '<=' | '>' | '>=' | '==' | '!=' ) rhs= addExpr )* )
			// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:80:9: lhs= addExpr (op= ( '<' | '<=' | '>' | '>=' | '==' | '!=' ) rhs= addExpr )*
			{
			pushFollow(FOLLOW_addExpr_in_relExpr555);
			lhs=addExpr();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) { result =lhs; }
			// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:80:46: (op= ( '<' | '<=' | '>' | '>=' | '==' | '!=' ) rhs= addExpr )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==14||(LA10_0 >= 22 && LA10_0 <= 26)) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:80:48: op= ( '<' | '<=' | '>' | '>=' | '==' | '!=' ) rhs= addExpr
					{
					op=input.LT(1);
					if ( input.LA(1)==14||(input.LA(1) >= 22 && input.LA(1) <= 26) ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return result;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_addExpr_in_relExpr579);
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
			if ( state.backtracking>0 ) { memoize(input, 9, relExpr_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "relExpr"



	// $ANTLR start "andExpr"
	// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:103:1: andExpr returns [Expr result] : lhs= relExpr ( '&&' rhs= relExpr )* ;
	public final Expr andExpr() throws RecognitionException {
		Expr result = null;

		int andExpr_StartIndex = input.index();

		Expr lhs =null;
		Expr rhs =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return result; }

			// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:104:5: (lhs= relExpr ( '&&' rhs= relExpr )* )
			// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:104:9: lhs= relExpr ( '&&' rhs= relExpr )*
			{
			pushFollow(FOLLOW_relExpr_in_andExpr617);
			lhs=relExpr();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) { result =lhs; }
			// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:104:46: ( '&&' rhs= relExpr )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==15) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:104:48: '&&' rhs= relExpr
					{
					match(input,15,FOLLOW_15_in_andExpr623); if (state.failed) return result;
					pushFollow(FOLLOW_relExpr_in_andExpr627);
					rhs=relExpr();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new And(result, rhs); }
					}
					break;

				default :
					break loop11;
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
			if ( state.backtracking>0 ) { memoize(input, 10, andExpr_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "andExpr"



	// $ANTLR start "orExpr"
	// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:107:1: orExpr returns [Expr result] : lhs= andExpr ( '||' rhs= andExpr )* ;
	public final Expr orExpr() throws RecognitionException {
		Expr result = null;

		int orExpr_StartIndex = input.index();

		Expr lhs =null;
		Expr rhs =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return result; }

			// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:108:5: (lhs= andExpr ( '||' rhs= andExpr )* )
			// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:108:9: lhs= andExpr ( '||' rhs= andExpr )*
			{
			pushFollow(FOLLOW_andExpr_in_orExpr661);
			lhs=andExpr();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) { result = lhs; }
			// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:108:48: ( '||' rhs= andExpr )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==33) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// D:\\Users\\Ferry\\Desktop\\sea-of-ql\\FerryRiet\\QLJava\\src\\org\\uva\\sea\\ql\\parser\\antlr\\QL.g:108:50: '||' rhs= andExpr
					{
					match(input,33,FOLLOW_33_in_orExpr667); if (state.failed) return result;
					pushFollow(FOLLOW_andExpr_in_orExpr671);
					rhs=andExpr();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = new Or(result, rhs); }
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
			if ( state.backtracking>0 ) { memoize(input, 11, orExpr_StartIndex); }

		}
		return result;
	}
	// $ANTLR end "orExpr"

	// Delegated rules



	public static final BitSet FOLLOW_29_in_qlprogram48 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_Ident_in_qlprogram50 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_compoundStatement_in_qlprogram55 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACE_in_compoundStatement86 = new BitSet(new long[]{0x0000000040000680L});
	public static final BitSet FOLLOW_statement_in_compoundStatement98 = new BitSet(new long[]{0x0000000040000680L});
	public static final BitSet FOLLOW_RBRACE_in_compoundStatement113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Ident_in_statement148 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLON_in_statement150 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_StringLiteral_in_statement152 = new BitSet(new long[]{0x0000000188000000L});
	public static final BitSet FOLLOW_type_in_statement154 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_16_in_statement157 = new BitSet(new long[]{0x0000000000192990L});
	public static final BitSet FOLLOW_orExpr_in_statement161 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_statement163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_statement175 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_statement177 = new BitSet(new long[]{0x0000000000192990L});
	public static final BitSet FOLLOW_orExpr_in_statement181 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_statement183 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_compoundStatement_in_statement187 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_28_in_statement190 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_compoundStatement_in_statement194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compoundStatement_in_statement209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_type234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_type244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_type255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IntLiteral_in_primary278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Ident_in_primary291 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BooleanLiteral_in_primary309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_StringLiteral_in_primary318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_primary328 = new BitSet(new long[]{0x0000000000192990L});
	public static final BitSet FOLLOW_orExpr_in_primary332 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_primary334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_unExpr359 = new BitSet(new long[]{0x0000000000192990L});
	public static final BitSet FOLLOW_unExpr_in_unExpr363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_unExpr374 = new BitSet(new long[]{0x0000000000192990L});
	public static final BitSet FOLLOW_unExpr_in_unExpr378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_unExpr389 = new BitSet(new long[]{0x0000000000192990L});
	public static final BitSet FOLLOW_unExpr_in_unExpr393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_in_unExpr406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unExpr_in_mulExpr444 = new BitSet(new long[]{0x0000000000240002L});
	public static final BitSet FOLLOW_set_in_mulExpr452 = new BitSet(new long[]{0x0000000000192990L});
	public static final BitSet FOLLOW_unExpr_in_mulExpr464 = new BitSet(new long[]{0x0000000000240002L});
	public static final BitSet FOLLOW_mulExpr_in_addExpr502 = new BitSet(new long[]{0x0000000000180002L});
	public static final BitSet FOLLOW_set_in_addExpr510 = new BitSet(new long[]{0x0000000000192990L});
	public static final BitSet FOLLOW_mulExpr_in_addExpr520 = new BitSet(new long[]{0x0000000000180002L});
	public static final BitSet FOLLOW_addExpr_in_relExpr555 = new BitSet(new long[]{0x0000000007C04002L});
	public static final BitSet FOLLOW_set_in_relExpr563 = new BitSet(new long[]{0x0000000000192990L});
	public static final BitSet FOLLOW_addExpr_in_relExpr579 = new BitSet(new long[]{0x0000000007C04002L});
	public static final BitSet FOLLOW_relExpr_in_andExpr617 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_15_in_andExpr623 = new BitSet(new long[]{0x0000000000192990L});
	public static final BitSet FOLLOW_relExpr_in_andExpr627 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_andExpr_in_orExpr661 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_33_in_orExpr667 = new BitSet(new long[]{0x0000000000192990L});
	public static final BitSet FOLLOW_andExpr_in_orExpr671 = new BitSet(new long[]{0x0000000200000002L});
}
