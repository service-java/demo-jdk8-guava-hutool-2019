package _collections.other;

import cn.hutool.core.lang.Console;
import org.junit.Test;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

    @Test
    public void main() {

        TreeSet t = new TreeSet<String>();
        t.add("2");
        t.add("1");
        t.add("4");
        t.add("3");
        Console.log(t);

        SortedSet s = Collections.synchronizedSortedSet(t);
        Console.log(s);
    }
}
