package com.wiley.javainterviewsexposed.chapter08;

import org.junit.Test;

import static junit.framework.Assert.fail;

public class BoxingNullPointer {

    @Test
    public void primitiveNullPointer() {
        final Integer intObject = 42;
        assert(intObject == 42);

        try {
            final int newIntValue = methodWhichMayReturnNull(intObject);
            fail("Assignment of null to primitive should throw NPE");
        } catch (NullPointerException e) {
            // do nothing, test passed
        }
    }

    private Integer methodWhichMayReturnNull(Integer intValue) {
        return null;
    }
}
