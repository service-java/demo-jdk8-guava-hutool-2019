package com.wiley.javainterviewsexposed.chapter08;

import junit.framework.TestCase;

public class JUnit3Example extends TestCase {

    private int myInt;

    public void setUp() {
        myInt = 42;
    }

    public void testMyIntValue() {
        assertEquals(42, myInt);
    }

    public void tearDown() {
        myInt = -1;
    }
}
