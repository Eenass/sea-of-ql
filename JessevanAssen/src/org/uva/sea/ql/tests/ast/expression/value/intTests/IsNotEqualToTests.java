package org.uva.sea.ql.tests.ast.expression.value.intTests;

import org.junit.Test;
import org.uva.sea.ql.ast.expression.value.Bool;
import org.uva.sea.ql.ast.expression.value.Int;

import static junit.framework.Assert.assertEquals;

public class IsNotEqualToTests {

    @Test
    public void twoIntsAreEqual_isNotEqualToReturnsFalse() {
        assertEquals(
                new Bool(false),
                new Int(10).isNotEqualTo(new Int(10))
        );
    }

    @Test
    public void twoIntsAreNotEqual_isNotEqualToReturnsTrue() {
        assertEquals(
                new Bool(true),
                new Int(1).isNotEqualTo(new Int(2))
        );    }

}
