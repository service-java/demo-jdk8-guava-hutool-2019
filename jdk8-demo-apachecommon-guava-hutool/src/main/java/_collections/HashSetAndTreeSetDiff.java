package _collections;

import cn.hutool.core.lang.Console;
import entity.classic.StudentEntity;
import org.junit.Test;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetAndTreeSetDiff {

    @Test
    public void main() {

        HashSet<String> hs = new HashSet<>();
        hs.add("hello");
        hs.add("java");

        HashSet<StudentEntity> h = new HashSet<>();
        h.add(new StudentEntity().setName("asd").setAge(11));
        h.add(new StudentEntity().setName("asd").setAge(11));

        Console.log(h);
    }

    @Test
    public  void tree() {
        TreeSet<String> tree = new TreeSet<>();
        // throw NullPointerException
        tree.add(null);
    }
}
