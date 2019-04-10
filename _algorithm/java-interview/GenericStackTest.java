package com.wiley.javainterviewsexposed.chapter08;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;

public class GenericStackTest {

    private GenericStack<Integer> stackUnderTest;

    @Before
    public void createStack() {
        stackUnderTest = new GenericStack<>();
    }

    @Test
    public void stackManipulations() {
        assertNull(stackUnderTest.pop());
        for (int i = 0; i < 10; i++) {
            stackUnderTest.push(i);
        }

        for (int i = 9; i >= 0; i--) {
            assertEquals(Integer.valueOf(i), stackUnderTest.pop());
        }

        assertNull(stackUnderTest.pop());
    }
}
