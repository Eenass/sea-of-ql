package org.uva.sea.ql.visitor.type;

import org.uva.sea.ql.type.*;

/**
 * Created with IntelliJ IDEA.
 * User: dimashifni
 * Date: 2/28/13
 * Time: 12:26 AM
 * To change this template use File | Settings | File Templates.
 */
public interface TypeVisitor<T> {
    T visit(IntType type);
    T visit(MoneyType type);
    T visit(NumericType type);
    T visit(BoolType type);
    T visit(StringType type);
}
