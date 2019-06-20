package com.wiley.javainterviewsexposed.chapter08;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class FinalReferences {

    @Test
    public void finalReferenceChanges() {
        final int i = 42;
        // i = 43;  <- uncommenting this line would result in a compiler error

        final List<String> list = new ArrayList<>(20);
        // list = new ArrayList(50); <- uncommenting this line will result in a r error
        assertEquals(0, list.size());

        list.add("adding a new value into my list");
        assertEquals(1, list.size());

        list.clear();
        assertEquals(0, list.size());
    }

}
