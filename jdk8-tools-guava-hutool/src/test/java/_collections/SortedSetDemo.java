package _collections;

import cn.hutool.core.lang.Console;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    public static void main(String[] args) {

        TreeSet t = new TreeSet<String>();
        t.add("1");
        t.add("2");
        t.add("3");
        t.add("4");
        Console.log(t);

        SortedSet s = Collections.synchronizedSortedSet(t);
        Console.log(s);
    }
}
