package com.wiley.javainterviewsexposed.chapter08;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class Strings {

    @Test
    public void stringCreation() {
        final String helloString1 = new String("Hello World!");
        final String helloString2 = "Hello World!";

        assertEquals(helloString1, helloString2);
    }

    @Test
    public void stringChanges() {
        final String greeting = "Good Morning, Dave";
        final String substring = greeting.substring(4);

        assertTrue(substring.equals("Good"));
        assertFalse(greeting.equals(substring));
        assertTrue(greeting.equals("Good Morning, Dave"));
    }

    @Test
    public void intEquality() {
        // Explicitly calling new String so the instances
        // are in different memory locations
        final Integer int1 = Integer.valueOf(new String("100"));
        final Integer int2 = Integer.valueOf(new String("100"));

        assertTrue(int1 == int2);
    }
}
