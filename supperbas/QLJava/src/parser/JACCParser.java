package parser;

import java.io.StringReader;
import ast.Form;

public class JACCParser implements IParse {
	@Override
	public Form parse(String src) throws ParseError {
		QLLexer lexer = new QLLexer(new StringReader(src));
		lexer.nextToken();
		QLParser parser = new QLParser(lexer);
		if (!parser.parse()) {
			System.out.println(parser.yyerrmsgs);
			throw new ParseError("error");
		}

		return parser.getResult();
	}

}
