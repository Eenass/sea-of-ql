package org.uva.sea.ql.parser.jacc;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

import org.uva.sea.ql.ast.*;
import org.uva.sea.ql.ast.literal.*;

public class QLLexer implements QLTokens {
	private static final Map<String, Integer> KEYWORDS;
	
	static {
		KEYWORDS = new HashMap<String, Integer>();
		KEYWORDS.put("form", FORM);
		KEYWORDS.put("if", IF);
		KEYWORDS.put("else", ELSE);
		KEYWORDS.put("integer", INTEGER);
		KEYWORDS.put("boolean", BOOLEAN);
		KEYWORDS.put("string", STRING);
		KEYWORDS.put("money", MONEY);
		KEYWORDS.put("true", BOOLEANLITERAL);
		KEYWORDS.put("false", BOOLEANLITERAL);
	}
	
	
	private int token;
	private int c = ' ';
	
	private ASTNode yylval;
	private final Reader input;

	public QLLexer(Reader input) {
		this.input = input;
		nextChar();
	}
	
	
	private void nextChar() {
		if (c >= 0) {
			try {
				c = input.read();
			}
			catch (IOException e) {
				c = -1;
			}
		}
		
	}
	
	public int nextToken() {
		boolean inComment = false;
		for (;;) {
			
			// Skip multiline comments
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
			
			// Skip whitespace
			while (c == ' ' || c == '\t' || c == '\n' || c == '\r') {
				nextChar();
				System.out.println("WS");
			}
			
			// End of input stream reached
			if (c < 0) {
				return token = ENDINPUT;
			}
			
			// Detect tokens
			switch (c) {
			    
				// Start of a multiline comment (/*) token, or arithmetic division (/) token
				case '/': {
			    	nextChar();
			    	if (c == '*') {
			    		inComment = true;
			    		nextChar();
			    		continue;
			    	}
			    	return token = '/'; 
			    }
				
				// Statement end
				case ';': nextChar(); return token = ';';
				
				// Block tokens
				case '}': nextChar(); return token = '}';
			    case '{': nextChar(); return token = '{';
				
				// Parenthesis
			    case ')': nextChar(); return token = ')';
			    case '(': nextChar(); return token = '(';
			    
			    // End of multiline comment (*/) token, or arithmetic multiplication (*) token
			    case '*': {
			    	nextChar();
			    	if (inComment && c == '/') {
			    		inComment = false;
			    		nextChar();
			    		continue;
			    	}
			    	return token = '*';
			    }
			    
			    // Arithmetic addition (+) token
			    case '+': nextChar(); return token = '+';
			    
			    // Arithmetic subtraction (-) token
			    case '-': nextChar(); return token = '-';
			    
			    // Logical AND (&&) token
			    case '&': {
			    	nextChar(); 
			    	if  (c == '&') {
			    		nextChar();
			    		return token = AND;
			    	}
			    	throw new RuntimeException("Unexpected character: " + (char)c);
			    }
			    
			    // Logical OR (||) token
			    case '|': {
			    	nextChar(); 
			    	if  (c == '|') {
			    		nextChar();
			    		return token = OR;
			    	}
			    	throw new RuntimeException("Unexpected character: " + (char)c);
			    }
			    
			    // Logical NOT (!) token
			    case '!': nextChar(); return token = '!';
			    
			    // Relational < and LEQ (<=) tokens
			    case '<': {
			    	nextChar();
			    	if (c == '=') {
			    		nextChar();
			    		return token = LEQ;
			    	}
			    	return '<';
			    }
			    
			    // Relational EQ (==) token
			    case '=': { 
			    	nextChar(); 
			    	if  (c == '=') {
			    		return token = EQ;
			    	}
			    	throw new RuntimeException("Unexpected character: " + (char)c);
			    }
			    
			    // Relational > and GEQ (>=) tokens
			    case '>': {
			    	nextChar();
			    	if (c == '=') {
			    		nextChar();
			    		return token = GEQ;
			    	}
			    	return token = '>';
			    }
			    
			    // Variable assignment (:) token
			    case ':': nextChar(); return token = ':';
			    
			    // String token ".*"
			    case '"': {
		    		StringBuilder sb = new StringBuilder();
		    		nextChar();
		    		while(c != '"') {
		    			sb.append((char)c);
		    			nextChar();
		    		}
		    		nextChar();
		    		String name = sb.toString();
					yylval = new StringLiteral(name);
		    		return token = STRINGLITERAL;
		    	}
			    
			    default: {
			    	
			    	// Numeric token
			    	if (Character.isDigit(c)) {
			    		String number = "";
			    		int dots = 0;
			    		while(true) {
			    			if (Character.isDigit(c)) {
			    				number += Character.getNumericValue(c);
			    			} else if (c == '.') {
			    				number += ".";
			    				dots++;
			    			} else {
			    				break;
			    			}
			    			nextChar();
			    		}
			    		if (dots == 0) {
			    			yylval = new IntegerLiteral(Integer.parseInt(number));
			    			return token = INTEGERLITERAL;
			    		} else if (dots == 1) {
			    			yylval = new MoneyLiteral(Float.parseFloat(number));
			    			return token = MONEYLITERAL;
			    		}
			    	}
			    	
			    	// Identifier token [a-zA-Z]+
			    	if (Character.isLetter(c)) {
			    		StringBuilder sb = new StringBuilder();
			    		do {
			    			sb.append((char)c);
			    			nextChar();
			    		}
			    		while (Character.isLetterOrDigit(c));
			    		String name = sb.toString();
			    		// Boolean literal [true|false] tokens
			    		if (name.equals("true")) yylval = new BooleanLiteral(true);
			    		if (name.equals("false")) yylval = new BooleanLiteral(false);
			    		// Check for reserved words
			    		if (KEYWORDS.containsKey(name)) {
			    			return token = KEYWORDS.get(name);
			    		}
						yylval = new Identifier(name);
			    		return token = IDENTIFIER;
			    	}
			    	
			    	throw new RuntimeException("Unexpected character: " + (char)c);
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


}
