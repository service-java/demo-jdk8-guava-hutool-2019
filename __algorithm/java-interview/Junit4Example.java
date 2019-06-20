package com.wiley.javainterviewsexposed.chapter08;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Junit4Example {

    private int myInt;

    @Before
    public void assignIntValue() {
        myInt = 42;
    }

    @Test
    public void checkIntValueIsCorrect() {
        Assert.assertEquals(42, myInt);
    }

    @After
    public void unsetIntValue() {
        myInt = -1;
    }
}
