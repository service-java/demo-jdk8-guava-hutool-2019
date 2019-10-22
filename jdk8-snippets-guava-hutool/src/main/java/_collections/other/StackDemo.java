package _collections.other;

import cn.hutool.core.lang.Console;
import org.junit.Test;

import java.util.*;

public class StackDemo {

    @Test
    public void hello() {
        Stack<Integer> st = new Stack<>();
        Console.log(st);

        st.push(new Integer(41));
        st.push(new Integer(42));
        st.push(new Integer(43));
        Console.log("stack: {}", st);
        Console.log("{} {} {}", st.pop(), st.pop(), st.pop());

        try {
            st.pop();
        } catch (EmptyStackException e) {
            e.printStackTrace();
        }
    }
}
