package org.uva.sea.ql.visitor.expression;

import org.uva.sea.ql.ast.expression.*;
import org.uva.sea.ql.type.Type;

import java.util.ArrayList;
import java.util.List;

public class ExpressionValidator implements ExpressionVisitor<Boolean> {
    private List<String> errors = new ArrayList<String>();

    @Override
    public Boolean visit(Add node) {
        Boolean compatible = false;
        Boolean checkLhs = node.getLhs().accept(this);
        Boolean checkRhs = node.getRhs().accept(this);

        if (!(checkLhs && checkRhs)) {
            return false;
        }

        Type lhsType = node.getLhs().getType();
        Type rhsType = node.getRhs().getType();
        compatible = lhsType.isCompatibleTo(rhsType);
        if(!compatible)
        {
            errors.add("incompatible type for +");
        }

        return compatible;
    }

    @Override
    public Boolean visit(And node) {
        Boolean compatible = false;
        Boolean checkLhs = node.getLhs().accept(this);
        Boolean checkRhs = node.getRhs().accept(this);

        if (!(checkLhs && checkRhs)) {
            return false;
        }

        Type lhsType = node.getLhs().getType();
        Type rhsType = node.getRhs().getType();
        compatible = lhsType.isCompatibleTo(rhsType);
        if(!compatible)
        {
            errors.add("incompatible type for &&");
        }

        return compatible;
    }

    @Override
    public Boolean visit(Div node) {
        Boolean compatible = false;
        Boolean checkLhs = node.getLhs().accept(this);
        Boolean checkRhs = node.getRhs().accept(this);

        if (!(checkLhs && checkRhs)) {
            return false;
        }

        Type lhsType = node.getLhs().getType();
        Type rhsType = node.getRhs().getType();
        compatible = lhsType.isCompatibleTo(rhsType);
        if(!compatible)
        {
            errors.add("incompatible type for /");
        }

        return compatible;
    }

    @Override
    public Boolean visit(Eq node) {
        Boolean compatible = false;
        Boolean checkLhs = node.getLhs().accept(this);
        Boolean checkRhs = node.getRhs().accept(this);

        if (!(checkLhs && checkRhs)) {
            return false;
        }

        Type lhsType = node.getLhs().getType();
        Type rhsType = node.getRhs().getType();
        compatible = lhsType.isCompatibleTo(rhsType);
        if(!compatible)
        {
            errors.add("incompatible type for ==");
        }

        return compatible;
    }

    @Override
    public Boolean visit(GEq node) {
        Boolean compatible = false;
        Boolean checkLhs = node.getLhs().accept(this);
        Boolean checkRhs = node.getRhs().accept(this);

        if (!(checkLhs && checkRhs)) {
            return false;
        }

        Type lhsType = node.getLhs().getType();
        Type rhsType = node.getRhs().getType();
        compatible = lhsType.isCompatibleTo(rhsType);
        if(!compatible)
        {
            errors.add("incompatible type for >=");
        }

        return compatible;
    }

    @Override
    public Boolean visit(GT node) {
        Boolean compatible = false;
        Boolean checkLhs = node.getLhs().accept(this);
        Boolean checkRhs = node.getRhs().accept(this);

        if (!(checkLhs && checkRhs)) {
            return false;
        }

        Type lhsType = node.getLhs().getType();
        Type rhsType = node.getRhs().getType();
        compatible = lhsType.isCompatibleTo(rhsType);
        if(!compatible)
        {
            errors.add("incompatible type for >");
        }

        return compatible;
    }

    @Override
    public Boolean visit(Ident node) {
        if(node == null){
            errors.add("undefined variable");
            return false;
        }
        return true;
    }

    @Override
    public Boolean visit(Int node) {
        return node.getType().isCompatibleToInteger();
    }

    @Override
    public Boolean visit(Bool node) {
        return node.getType().isCompatibleToBoolean();
    }

    @Override
    public Boolean visit(StringLiteral node) {
        return node.getType().isCompatibleToString();
    }

    @Override
    public Boolean visit(Money node) {
        return node.getType().isCompatibleToMoney();
    }

    @Override
    public Boolean visit(LEq node) {
        Boolean compatible = false;
        Boolean checkLhs = node.getLhs().accept(this);
        Boolean checkRhs = node.getRhs().accept(this);

        if (!(checkLhs && checkRhs)) {
            return false;
        }

        Type lhsType = node.getLhs().getType();
        Type rhsType = node.getRhs().getType();
        compatible = lhsType.isCompatibleTo(rhsType);
        if(!compatible)
        {
            errors.add("incompatible type for <=");
        }

        return compatible;
    }

    @Override
    public Boolean visit(LT node) {
        Boolean compatible = false;
        Boolean checkLhs = node.getLhs().accept(this);
        Boolean checkRhs = node.getRhs().accept(this);

        if (!(checkLhs && checkRhs)) {
            return false;
        }

        Type lhsType = node.getLhs().getType();
        Type rhsType = node.getRhs().getType();
        compatible = lhsType.isCompatibleTo(rhsType);
        if(!compatible)
        {
            errors.add("incompatible type for <");
        }

        return compatible;
    }

    @Override
    public Boolean visit(Mul node) {
        Boolean compatible = false;
        Boolean checkLhs = node.getLhs().accept(this);
        Boolean checkRhs = node.getRhs().accept(this);

        if (!(checkLhs && checkRhs)) {
            return false;
        }

        Type lhsType = node.getLhs().getType();
        Type rhsType = node.getRhs().getType();
        compatible = lhsType.isCompatibleTo(rhsType);
        if(!compatible)
        {
            errors.add("incompatible type for *");
        }

        return compatible;
    }

    @Override
    public Boolean visit(Neg node) {
        return node.getType().isCompatibleToInteger();
    }

    @Override
    public Boolean visit(NEq node) {
        Boolean compatible = false;
        Boolean checkLhs = node.getLhs().accept(this);
        Boolean checkRhs = node.getRhs().accept(this);

        if (!(checkLhs && checkRhs)) {
            return false;
        }

        Type lhsType = node.getLhs().getType();
        Type rhsType = node.getRhs().getType();
        compatible = lhsType.isCompatibleTo(rhsType);
        if(!compatible)
        {
            errors.add("incompatible type for !=");
        }

        return compatible;
    }

    @Override
    public Boolean visit(Not node) {
        return node.getType().isCompatibleToBoolean();
    }

    @Override
    public Boolean visit(Or node) {
        Boolean compatible = false;
        Boolean checkLhs = node.getLhs().accept(this);
        Boolean checkRhs = node.getRhs().accept(this);

        if (!(checkLhs && checkRhs)) {
            return false;
        }

        Type lhsType = node.getLhs().getType();
        Type rhsType = node.getRhs().getType();
        compatible = lhsType.isCompatibleTo(rhsType);
        if(!compatible)
        {
            errors.add("incompatible type for ||");
        }

        return compatible;
    }

    @Override
    public Boolean visit(Pos node) {
        return node.getType().isCompatibleToInteger();
    }

    @Override
    public Boolean visit(Sub node) {
        Boolean compatible = false;
        Boolean checkLhs = node.getLhs().accept(this);
        Boolean checkRhs = node.getRhs().accept(this);

        if (!(checkLhs && checkRhs)) {
            return false;
        }

        Type lhsType = node.getLhs().getType();
        Type rhsType = node.getRhs().getType();
        compatible = lhsType.isCompatibleTo(rhsType);
        if(!compatible)
        {
            errors.add("incompatible type for /");
        }

        return compatible;
    }

    public List<String> getErrors() {
        return errors;
    }
}
