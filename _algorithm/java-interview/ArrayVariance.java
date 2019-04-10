package com.wiley.javainterviewsexposed.chapter08;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class ArrayVariance {

    class A {}
    class B extends A {}

    @Test
    public void showArrayVariance() {

        A a = new B();

        assertTrue(a instanceof A);

        A[] arrayOfA = new B[] {new B()};

        assertFalse(arrayOfA instanceof A[]);
    }
}
