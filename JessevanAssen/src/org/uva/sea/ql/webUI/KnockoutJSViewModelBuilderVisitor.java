package org.uva.sea.ql.webUI;

import org.uva.sea.ql.ast.*;
import org.uva.sea.ql.ast.expr.*;
import org.uva.sea.ql.ast.expr.value.Bool;
import org.uva.sea.ql.ast.expr.value.Int;
import org.uva.sea.ql.ast.expr.value.Str;
import org.uva.sea.ql.ast.type.TypeVisitor;
import org.uva.sea.ql.ast.type.Unknown;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class KnockoutJSViewModelBuilderVisitor implements ASTNodeVisitor<Void, KnockoutJSViewModelBuilderVisitor.Context>, TypeVisitor<String, Void> {

    public static class Context {
        private final List<String> identities;
        private final StringBuilder objectHierarchy;

        public Context() {
            this.identities = new ArrayList<String>();
            this.objectHierarchy = new StringBuilder();
        }

        public List<String> getIdentities() { return identities; }
        public StringBuilder getObjectHierarchy() { return objectHierarchy; }
    }

    private static final String VIEWMODEL_TEMPLATE = "var _viewModel=new function(){var _self=this;_self.identities=%s;_self.root=%s;})();";

    public String createViewModel(Form form) {
        Context context = new Context();
        form.accept(this, context);

        return String.format(VIEWMODEL_TEMPLATE,
                createIdentityObject(context.identities),
                context.getObjectHierarchy().toString());
    }

    private String createIdentityObject(Iterable<String> identities) {
        StringBuilder stringBuilder = new StringBuilder("{");
        for(Iterator<String> iterator = identities.iterator(); iterator.hasNext(); ) {
            stringBuilder
                    .append(iterator.next())
                    .append(":ko.observable()");

            if(iterator.hasNext())
                stringBuilder.append(",");
        }
        stringBuilder.append("}");

        return stringBuilder.toString();
    }

    @Override
    public Void visit(Add astNode, Context param) {
        visitBinaryExpression(astNode, param, "+");
        return null;
    }

    @Override
    public Void visit(And astNode, Context param) {
        visitBinaryExpression(astNode, param, "&&");
        return null;
    }

    @Override
    public Void visit(Bool astNode, Context param) {
        param.getObjectHierarchy().append(astNode.getValue());
        return null;
    }

    @Override
    public Void visit(Computed astNode, Context param) {
        param.getObjectHierarchy()
                .append("new Computed(\"")
                .append(astNode.getLabel())
                .append("\",function(){return ");
        astNode.getExpression().accept(this, param);
        param.getObjectHierarchy()
                .append(";})");

        return null;
    }

    @Override
    public Void visit(CompositeFormElement astNode, Context param) {
        for(Iterator<FormElement> iterator = astNode.getFormElements().iterator(); iterator.hasNext(); ) {
            iterator.next().accept(this, param);
            if(iterator.hasNext())
                param.getObjectHierarchy().append(",");
        }

        return null;
    }

    @Override
    public Void visit(Declaration astNode, Context param) {
        param.getIdentities().add(astNode.getIdentity().getName());
        return null;
    }

    @Override
    public Void visit(Div astNode, Context param) {
        visitBinaryExpression(astNode, param, "/");
        return null;
    }

    @Override
    public Void visit(Eq astNode, Context param) {
        visitBinaryExpression(astNode, param, "==");
        return null;
    }

    @Override
    public Void visit(Form astNode, Context param) {
        param.getObjectHierarchy().append("new Block(function(){return true;},[");
        astNode.getBody().accept(this, param);
        param.getObjectHierarchy().append("])");
        return null;
    }

    @Override
    public Void visit(GEq astNode, Context param) {
        visitBinaryExpression(astNode, param, ">=");
        return null;
    }

    @Override
    public Void visit(GT astNode, Context param) {
        visitBinaryExpression(astNode, param, ">");
        return null;
    }

    @Override
    public Void visit(Ident astNode, Context param) {
        param.getObjectHierarchy()
                .append("_self.identities.")
                .append(astNode.getName())
                .append("()");
        return null;
    }

    @Override
    public Void visit(If astNode, Context param) {
        param.getObjectHierarchy().append("new Block(function(){return ");
        astNode.getCondition().accept(this, param);
        param.getObjectHierarchy().append(";},[");
        astNode.getIfBody().accept(this, param);
        param.getObjectHierarchy().append("]),new Block(function(){return !");
        astNode.getCondition().accept(this, param);
        param.getObjectHierarchy().append(";},[");
        astNode.getElseBody().accept(this, param);
        param.getObjectHierarchy().append("])");
        return null;
    }

    @Override
    public Void visit(Int astNode, Context param) {
        param.getObjectHierarchy().append(astNode.getValue());
        return null;
    }

    @Override
    public Void visit(LEq astNode, Context param) {
        visitBinaryExpression(astNode, param, "<=");
        return null;
    }

    @Override
    public Void visit(LT astNode, Context param) {
        visitBinaryExpression(astNode, param, "<");
        return null;
    }

    @Override
    public Void visit(Mul astNode, Context param) {
        visitBinaryExpression(astNode, param, "*");
        return null;
    }

    @Override
    public Void visit(Neg astNode, Context param) {
        visitUnaryExpression(astNode, param, "-");
        return null;
    }

    @Override
    public Void visit(NEq astNode, Context param) {
        visitBinaryExpression(astNode, param, "!=");
        return null;
    }

    @Override
    public Void visit(Not astNode, Context param) {
        visitUnaryExpression(astNode, param, "!");
        return null;
    }

    @Override
    public Void visit(Or astNode, Context param) {
        visitBinaryExpression(astNode, param, "||");
        return null;
    }

    @Override
    public Void visit(Pos astNode, Context param) {
        visitUnaryExpression(astNode, param, "+");
        return null;
    }

    @Override
    public Void visit(Question astNode, Context param) {
        astNode.getDeclaration().accept(this, param);
        param.getObjectHierarchy()
                .append("new Question(\"")
                .append(astNode.getQuestion())
                .append("\",\"")
                .append(astNode.getDeclaration().getIdentity().getName())
                .append("\",_self.identities.")
                .append(astNode.getDeclaration().getIdentity().getName())
                .append(",")
                .append(astNode.getDeclaration().getType().accept(this, null))
                .append(")");
        return null;
    }

    @Override
    public Void visit(Str astNode, Context param) {
        param.getObjectHierarchy().append(String.format("\"%s\"", astNode.getValue()));
        return null;
    }

    @Override
    public Void visit(Sub astNode, Context param) {
        visitBinaryExpression(astNode, param, "-");
        return null;
    }

    private void visitUnaryExpression(UnaryExpr unaryExpr, Context param, String operator) {
        param.getObjectHierarchy().append("(").append(operator);
        unaryExpr.getExpression().accept(this, param);
        param.getObjectHierarchy().append(")");
    }

    private void visitBinaryExpression(BinaryExpr binaryExpression, Context param, String operator) {
        param.getObjectHierarchy().append("(");
        binaryExpression.getLeftExpression().accept(this, param);
        param.getObjectHierarchy().append(operator);
        binaryExpression.getRightExpression().accept(this, param);
        param.getObjectHierarchy().append(")");
    }


    @Override
    public String visit(org.uva.sea.ql.ast.type.Bool type, Void param) {
        return "DataType.BOOLEAN";
    }

    @Override
    public String visit(org.uva.sea.ql.ast.type.Int type, Void param) {
        return "DataType.INTEGER";
    }

    @Override
    public String visit(org.uva.sea.ql.ast.type.Str type, Void param) {
        return "DataType.STRING";
    }

    @Override
    public String visit(Unknown type, Void param) {
        throw new RuntimeException("Visit called on unknown type, no type should be unknown at this point!");
    }
}
