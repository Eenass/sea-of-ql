package org.uva.sea.ql.parsing;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.apache.commons.io.FileUtils;
import org.uva.sea.ql.ast.Form;
import org.uva.sea.ql.parsing.antlr.QLLexer;
import org.uva.sea.ql.parsing.antlr.QLParser;
import org.uva.sea.ql.parsing.error.SyntacticQLError;
import org.uva.sea.ql.parsing.error.reporting.SyntacticErrorReporter;
import org.uva.sea.ql.parsing.error.reporting.SyntacticErrorReporterImpl;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class FormParser {

    public FormParsingResult parse(File file) throws IOException {
        return parse(FileUtils.readFileToString(file));
    }

    public FormParsingResult parse(String src) {
        SyntacticErrorReporterImpl syntacticErrorReporter = new SyntacticErrorReporterImpl();
        try {
            ANTLRStringStream stream = new ANTLRStringStream(src);
            CommonTokenStream tokens = new CommonTokenStream();
            tokens.setTokenSource(new QLLexer(stream));
            QLParser parser = new QLParser(tokens);
            parser.setErrorReporter(syntacticErrorReporter);
            return new FormParsingResult(parser.form(), syntacticErrorReporter.getErrors());
        } catch (RecognitionException ex) {
            throw new RuntimeException(ex);
        }
    }
}
