package org.uva.sea.ql.test;

import junit.framework.Assert;

import org.junit.Test;
import org.uva.sea.ql.ast.elements.Form;
import org.uva.sea.ql.common.ElementVisitor;
import org.uva.sea.ql.common.QLException;
import org.uva.sea.ql.parser.ParseError;
import org.uva.sea.ql.validation.AstValidationError;
import org.uva.sea.ql.validation.ValidationElementVisitor;

public class TestValidator extends TestExpressions {
    public TestValidator() {
        super();
    }

    @Test
    public final void testValidatorVisitorFromFile() {
        try {
            final Form e = parser.parseFile();
            this.validateForm(e);
        } catch (ParseError ex) {
            failForParseException(ex);
        }
    }

    @Test
    public final void testValidatorVisitorPositive() {
        try {
            final Form e = parser.parseFull(getQL());
            this.validateForm(e);
        } catch (ParseError ex) {
            failForParseException(ex);
        }

    }

    private final void failForParseException(ParseError ex) {
        Assert.fail("Parse Exception occured during test: " + ex.getMessage());
    }

    private final void validateForm(Form f) {

        try {
            f.accept(new ValidationElementVisitor());

        } catch (QLException ex) {
            Assert.fail("Visitor Exception occured during test: "
                    + ex.getMessage());
        }
    }

    @Test
    public final void testValidatorVisitorLeftBoolNegative() {
        try {
            Form f = parser.parseFull(getQL("money", "boolean", "boolean",
                    "hasSoldHouse && (hasBoughtHouse || hasMaintLoan)"));
            ValidationElementVisitor visitor = new ValidationElementVisitor();
            f.accept(visitor);
            Assert.assertEquals(true, visitor.hasErrors());

            f = parser.parseFull(getQL("boolean", "money", "boolean",
                    "hasSoldHouse && (hasBoughtHouse || hasMaintLoan)"));
            visitor = new ValidationElementVisitor();
            f.accept(visitor);
            Assert.assertEquals(true, visitor.hasErrors());
        } catch (AstValidationError ex) {
            Assert.fail("unexpected exception occured: " + ex.getMessage());
        } catch (QLException ex) {
            Assert.fail("unexpected exception occured: " + ex.getMessage());
        }
    }

    @Test
    public final void testValidatorVisitorLeftBoolNegativeErrorCollection() {
        try {
            final Form e = parser.parseFull(getQL("money", "boolean",
                    "boolean",
                    "hasSoldHouse && (hasBoughtHouse || hasMaintLoan)"));
            final ValidationElementVisitor visitor = new ValidationElementVisitor();
            Assert.assertTrue(Form.class.equals(e.getClass()));
            final Form f = (Form) e;
            f.accept(visitor);
            Assert.assertEquals(true, visitor.hasErrors());
        } catch (AstValidationError ex) {
            Assert.fail("unexpected exception occured: " + ex.getMessage());
        } catch (QLException ex) {
            Assert.fail("unexpected exception occured: " + ex.getMessage());
        }

        try {
            final Form e = parser.parseFull(getQL("boolean", "money",
                    "boolean",
                    "hasSoldHouse && (hasBoughtHouse || hasMaintLoan)"));
            final ValidationElementVisitor visitor = new ValidationElementVisitor();
            Assert.assertTrue(Form.class.equals(e.getClass()));
            final Form f = (Form) e;
            f.accept(visitor);
            Assert.assertEquals(true, visitor.hasErrors());
        } catch (AstValidationError ex) {
            Assert.fail("unexpected exception occured: " + ex.getMessage());
        } catch (QLException ex) {
            Assert.fail("unexpected exception occured: " + ex.getMessage());
        }

    }

    @Test
    public final void testValidatorVisitorRightBoolNegative() {
        try {
            Form f = parser.parseFull(getQL("boolean", "money", "boolean",
                    "hasSoldHouse && (hasBoughtHouse || hasMaintLoan)"));
            ValidationElementVisitor visitor = new ValidationElementVisitor();
            f.accept(visitor);
            Assert.assertEquals(true, visitor.hasErrors());

            f = parser.parseFull(getQL("boolean", "boolean", "money",
                    "hasSoldHouse && (hasBoughtHouse || hasMaintLoan)"));
            visitor = new ValidationElementVisitor();
            f.accept(visitor);
            Assert.assertEquals(true, visitor.hasErrors());

            f = parser.parseFull(getQL("boolean", "boolean", "money",
                    "hasSoldHouse < 20000"));
            visitor = new ValidationElementVisitor();
            f.accept(visitor);
            Assert.assertEquals(true, visitor.hasErrors());

            f = parser.parseFull(getQL("money", "boolean", "money",
                    "hasSoldHouse"));
            visitor = new ValidationElementVisitor();
            f.accept(visitor);
            Assert.assertEquals(true, visitor.hasErrors());

            f = parser.parseFull(getQL("money", "boolean", "money",
                    "hasSoldHouse == hasBoughtHouse"));
            visitor = new ValidationElementVisitor();
            f.accept(visitor);
            Assert.assertEquals(true, visitor.hasErrors());
        } catch (AstValidationError ex) {
            Assert.fail("unexpected exception occured: " + ex.getMessage());
        } catch (QLException ex) {
            Assert.fail("unexpected exception occured: " + ex.getMessage());
        }
    }

    private String getQL() {
        return this.getQL("boolean", "boolean", "boolean",
                "hasSoldHouse && (hasBoughtHouse || hasMaintLoan)");
    }

    private String getQL(String hasSoldHouseType, String hasBoughHouseType,
            String hasMaintLoanType, String ifCondition) {
        return "form Box1HouseOwning {\n"
                + "taxId: \"Please enter your tax identification number\" string\n"
                + "hasSoldHouse: \"Did you sell a house in 2010?\" "
                + hasSoldHouseType
                + "\n"
                + "hasBoughtHouse: \"Did you by a house in 2010?\" "
                + hasBoughHouseType
                + "\n"
                + "hasMaintLoan: \"Did you enter a loan for maintenance/reconstruction?\" "
                + hasMaintLoanType
                + "\n"
                + "if ("
                + ifCondition
                + ") {\n"
                + " sellingPrice: \"Price the house was sold for:\" money\n"
                + " privateDebt: \"Private debts for the sold house:\" money\n"
                + " valueResidue: \"Value residue:\" money(sellingPrice - privateDebt)\n"
                + " if(valueResidue > 20000) {\n"
                + " 	askedForPermissionValRes20 : \"Did you ask for permission to have a value residue larger than 20000?\" boolean\n"
                + " }\n"
                + "  /**\n"
                + "  this is a multi line comment\n"
                + "  */\n"
                + "  if(sellingPrice < 80000) {\n"
                + " 	askedForPermissionSelPri80 : \"Did you ask for permission to sell a house for less than 80000?\" boolean\n"
                + " 	if(askedForPermissionSelPri80) {\n"
                + " 		askedForPermissionSelPri80Who : \"Who did you ask for permission to sell a house for less than 80000?\" boolean\n"
                + "	}\n" + " }\n" + " }\n" + "}\n";
    }
}
