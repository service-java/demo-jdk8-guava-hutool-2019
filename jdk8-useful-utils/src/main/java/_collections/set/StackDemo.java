package _collections.set;

import java.util.*;

public class StackDemo {

    static void showPush(java.util.Stack<Integer> st, int a) {
        st.push(new Integer(a));

        System.out.println("push(" + a + ") -> " +
                "stack: " + st);
    }

    static void showPop(java.util.Stack<Integer> st) {
        Integer a = (Integer) st.pop();

        System.out.println("pop(" + a + ") -> " +
                "stack: " + st);
    }

    public static void main(String args[]) {
        java.util.Stack<Integer> st = new java.util.Stack<Integer>();
        System.out.println("stack: " + st);

        showPush(st, 42);
        showPush(st, 66);
        showPush(st, 99);

        showPop(st);
        showPop(st);
        showPop(st);

        // 报错
        try {
            showPop(st);
        } catch (EmptyStackException e) {
            System.out.println("empty stack");
        }
    }
}
