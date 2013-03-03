package org.uva.sea.ql.value;

import org.uva.sea.ql.type.StringType;
import org.uva.sea.ql.type.Type;

/**
 * Created with IntelliJ IDEA.
 * User: dimashifni
 * Date: 2/26/13
 * Time: 11:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringValue extends Value {

    private final String value;

    public StringValue(String value) {
        this.value = value;
    }

    public StringValue getValue(){
        return new StringValue(value);
    }

    @Override
    public Type getType() {
        return new StringType();
    }

    @Override
    public String toString() {
        return value;
    }
}
