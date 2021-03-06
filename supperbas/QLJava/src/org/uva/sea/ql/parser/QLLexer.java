package org.uva.sea.ql.parser;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

import org.uva.sea.ql.ast.ASTNode;
import org.uva.sea.ql.ast.expression.Ident;


public class QLLexer implements QLTokens {
	private static final Map<String, Integer> KEYWORDS;
	private static final Map<String, Ident> IDENTS = new HashMap<String, Ident>();

	static {
		KEYWORDS = new HashMap<String, Integer>();
		KEYWORDS.put("form", FORM);
		KEYWORDS.put("if", IF);
		KEYWORDS.put("else", ELSE);
		KEYWORDS.put("boolean", tBool);
		KEYWORDS.put("true", TRUE);
		KEYWORDS.put("false", FALSE);
		KEYWORDS.put("integer", tInt);
		KEYWORDS.put("string", tStr);
	}

	private int token;
	private int c = ' ';
	private int cOld = ' ';
	private int line;
	private int column;
	public char[] tempStr;

	private ASTNode yylval;
	private final Reader input;

	public QLLexer(Reader input) {
		this.input = input;
		line = 1;
		column = 0;
		nextChar();
	}

	private void nextChar() {
		if (c >= 0) {
			try {
				cOld = c;
				c = input.read();
				// System.out.print((char) c);
				if (c == '\n') {
					// System.out.println();
					line++;
					column = 0;
				}
				column++;
				// System.out.println(c);
			} catch (IOException e) {
				c = -1;
			}
		}

	}

	public int nextToken() {
		boolean inComment = false;
		for (;;) {
			if (inComment) {
				while (c != '*' && c != -1) {
					nextChar();
				}
				if (c == '*') {
					nextChar();
					if (c == '/') {
						nextChar();
						inComment = false;
					}
					continue;
				}
			}

			while (c == ' ' || c == '\t' || c == '\n' || c == '\r') {
				nextChar();
				// System.out.println("WS");
			}

			if (c < 0) {
				return token = ENDINPUT;
			}

			switch (c) {
			case '/': {
				nextChar();
				if (c == '*') {
					inComment = true;
					nextChar();
					continue;
				} else if (c == '/') {
					nextChar();
					while (c != '\n' || c != ENDINPUT)
						nextChar();
					continue;
				}
				return token = '/';
			}
			case ')':
			case '(':
			case '{':
			case '}':
			case '+':
			case '-':
			case ':':
			case ';':
			case '!':
				nextChar();
				return token = cOld;

			case '*': {
				nextChar();
				if (inComment && c == '/') {
					inComment = false;
					nextChar();
					continue;
				}
				return token = '*';
			}

			case '&': {
				nextChar();
				if (c == '&') {
					nextChar();
					return token = AND;
				}
				throw new RuntimeException("Unexpected character: " + (char) c);
			}
			case '|': {
				nextChar();
				if (c == '|') {
					nextChar();
					return token = OR;
				}
				throw new RuntimeException("Unexpected character: " + (char) c);
			}
			case '<': {
				nextChar();
				if (c == '=') {
					nextChar();
					return token = LEQ;
				}
				return '<';
			}
			case '=': {
				nextChar();
				if (c == '=') {
					return token = EQ;
				} else {
					nextChar();
					return token = '=';
				}
				// throw new RuntimeException("Unexpected character: " + (char)
				// c);
			}
			case '>': {
				nextChar();
				if (c == '=') {
					nextChar();
					return token = GEQ;
				}
				return token = '>';
			}

			case '\"': {
				nextChar(); // remove the "
				StringBuilder sb = new StringBuilder();
				do {
					sb.append((char) c);
					nextChar();
					if (c == -1)
						throw new RuntimeException("String ended unexpectedly: " + (char) c);
				} while (c != '\"' && c != -1);
				nextChar(); // for the last
				yylval = new org.uva.sea.ql.ast.expression.value.Str(sb.toString());
				return token = STR;
			}

			default: {

				if (Character.isDigit(c)) {
					int n = 0;
					do {
						n = 10 * n + (c - '0');
						nextChar();
					} while (Character.isDigit(c));
					yylval = new org.uva.sea.ql.ast.expression.value.Int(n);
					// System.out.println("FOUND");
					return token = INT;
				}
				if (Character.isLetter(c)) {
					StringBuilder sb = new StringBuilder();
					do {
						sb.append((char) c);
						nextChar();
					} while (Character.isLetterOrDigit(c));
					String name = sb.toString();
					if (KEYWORDS.containsKey(name)) {
						// System.out.println("FOUND!");
						return token = KEYWORDS.get(name);
					}

					if (IDENTS.containsKey(name)) {
						// System.out.println("FOUND!");
						yylval = IDENTS.get(name);
						return token = IDENT;
					}
					yylval = new Ident(name);
					IDENTS.put(name, (Ident) yylval);
					return token = IDENT;
				}
				throw new RuntimeException("Unexpected character: " + (char) c);
			}
			}
		}
	}

	public int getToken() {
		return token;
	}

	public ASTNode getSemantic() {
		return yylval;
	}

	public int getLine() {
		return line;
	}

	public int getColumn() {
		return column;
	}

}
