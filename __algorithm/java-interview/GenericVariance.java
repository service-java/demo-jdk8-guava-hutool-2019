package com.wiley.javainterviewsexposed.chapter08;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

public class GenericVariance {

    static class A {}
    static class B extends A {}

    public static GenericStack<A> pushAllA(final List<? extends A> listOfA) {
        final GenericStack<A> stack = new GenericStack<>();
        for (A a : listOfA) {
            stack.push(a);
        }

        return stack;
    }


    @Test
    public void usePushAllA() {
        final ArrayList<A> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new A());
        }

        final GenericStack<A> genericStack = pushAllA(list);

        assertNotNull(genericStack.pop());
    }

    @Test
    public void usePushAllAWithBs() {
        final ArrayList<B> listOfBs = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            listOfBs.add(new B());
        }

        final GenericStack<A> genericStack = pushAllA(listOfBs);

        assertNotNull(genericStack.pop());
    }
}
