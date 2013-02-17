package org.uva.sea.ql;

import java.io.File;
import java.util.EnumSet;

import javax.servlet.DispatcherType;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.*;
import org.eclipse.jetty.servlet.*;
import org.uva.sea.ql.ast.form.Form;
import org.uva.sea.ql.ast.traversal.codegen.*;
import org.uva.sea.ql.ast.traversal.codegen.base.WebGenerationException;
import org.uva.sea.ql.ast.traversal.typechecking.TypeChecker;
import org.uva.sea.ql.ast.traversal.typechecking.base.ITypeChecker;
import org.uva.sea.ql.base.IStartupController;
import org.uva.sea.ql.parser.*;
import org.uva.sea.ql.parser.antlr.FormParser;
import org.uva.sea.ql.webserver.ServletConfig;
import org.uva.sea.ql.webserver.base.EmptyServlet;

import com.google.inject.servlet.GuiceFilter;

public class StartupController implements IStartupController {
	private final int port;
	private final File inputFile;
	private final String outputFile = "src/main/resources/codegeneration/generated.html";

	final IFormParser parser = new FormParser();
	final ITypeChecker typeChecker = new TypeChecker();
	final IWebGenerator generator = new BootstrapGenerator();

	public StartupController(final File inputFile, int port) {
		this.inputFile = inputFile;
		this.port = port;
	}
	
	@Override
	public void start() {
		Form form;
		try {
			form = parser.parseForm(inputFile);
		}
		catch (ParsingException e) {
			System.err.println(String.format("Failed to parse form: %s", e.getMessage()));
			return;
		}

		if (typeChecker.checkFormErrors(form)) {
			System.err.println("Type checking resulted in the following type errors:");
			typeChecker.writeErrorLog(System.err);
			return;
		}

		try {
			generator.generateFrontend(form, outputFile);
		}
		catch (WebGenerationException e) {
			System.err.println(String.format("Failed to generate file: %s", e.getMessage()));
			return;
		}

		startServer();
	}
	
	
	private void startServer() {
		Server server = new Server(port);

		// Create two different content handlers on different binding paths
		final ServletContextHandler dynamicContentHandler = createServletContextHandler();
		final ResourceHandler staticContentHandler = createStaticContentHandler();
		
		
		HandlerCollection handlers = new HandlerCollection();
		handlers.addHandler(dynamicContentHandler);
		handlers.addHandler(staticContentHandler);
		server.setHandler(handlers);

		try {
			server.start();
			server.join();
		}
		catch (Exception e) {
			System.err.println("Failed to start the server; " + e.getMessage());
		}
	}
	
	
	private ServletContextHandler createServletContextHandler() {
		final ServletContextHandler servletContextHandler = new ServletContextHandler();

		// Spawn the webservices
		servletContextHandler.addEventListener(new ServletConfig());
		servletContextHandler.addFilter(GuiceFilter.class, "/ws/*", EnumSet.of(DispatcherType.REQUEST));
		servletContextHandler.addServlet(EmptyServlet.class, "/ws/*");
		
		return servletContextHandler;
	}
	
	private ResourceHandler createStaticContentHandler() {
		final ResourceHandler resourceHandler = new ResourceHandler();
		resourceHandler.setDirectoriesListed(false);
		resourceHandler.setWelcomeFiles(new String[] { "generated.html" });
		resourceHandler.setResourceBase("./src/main/resources/codegeneration");
		
		return resourceHandler;
	}
}