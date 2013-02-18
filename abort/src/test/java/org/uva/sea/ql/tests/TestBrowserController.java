package org.uva.sea.ql.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.uva.sea.ql.base.*;
import org.uva.sea.ql.util.BrowserUtil;

public class TestBrowserController extends TestBase {
	@Test
	public void testOpenBrowserInvalidURL() {
		
		boolean exceptionThrown = false;
		try {
			BrowserUtil.openURL("invalidURL");
		}
		catch (BrowserException e) {
			exceptionThrown = true;
		}
		assertTrue(exceptionThrown);
	}
	
	@Test
	public void testOpenBrowserValidURL() {
		try {
			BrowserUtil.openURL("http://www.google.nl");
		}
		catch (BrowserException e) {
			fail();
		}
	}
}
