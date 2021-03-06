package org.uva.sea.ql.parser.test.expr;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.uva.sea.ql.ast.expr.atom.Bool;
import org.uva.sea.ql.ast.expr.atom.Ident;
import org.uva.sea.ql.ast.expr.atom.Int;
import org.uva.sea.ql.ast.expr.atom.Money;
import org.uva.sea.ql.ast.expr.atom.String;
import org.uva.sea.ql.parser.test.IParse;
import org.uva.sea.ql.parser.test.ParseError;

public class Atoms {

	private IParse parser;

	public Atoms() {
		this.parser = new Parser();
	}

	@Test
	public void bools() throws ParseError {
		assertEquals(Bool.class, parser.parse("true").getClass());
		assertEquals(Bool.class, parser.parse("false").getClass());
	}

	@Test
	public void idents() throws ParseError {
		assertEquals(Ident.class, parser.parse("a").getClass());
		assertEquals(Ident.class, parser.parse("abc").getClass());
		assertEquals(Ident.class, parser.parse("ABC").getClass());
		assertEquals(Ident.class, parser.parse("ABCDEF").getClass());
		assertEquals(Ident.class, parser.parse("abc2323").getClass());
		assertEquals(Ident.class, parser.parse("a2bc232").getClass());
		assertEquals(Ident.class, parser.parse("a2bc232aa").getClass());
	}

	@Test
	public void ints() throws ParseError {
		assertEquals(Int.class, parser.parse("0").getClass());
		assertEquals(Int.class, parser.parse("1223").getClass());
		assertEquals(Int.class, parser.parse("234234234").getClass());
	}

	@Test
	public void moneys() throws ParseError {
		assertEquals(Money.class, parser.parse("100.00").getClass());
		assertEquals(Money.class, parser.parse("1.00").getClass());
		assertEquals(Money.class, parser.parse("0.50").getClass());
	}

	@Test
	public void strings() throws ParseError {
		final java.lang.String test1 = "\"A short string\"";
		assertEquals(String.class, parser.parse(test1).getClass());
	}

}
