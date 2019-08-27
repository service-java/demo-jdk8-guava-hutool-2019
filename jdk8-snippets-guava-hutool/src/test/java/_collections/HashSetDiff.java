package _collections;

import cn.hutool.core.lang.Console;
import entity.classic.Student;

import java.util.HashSet;

public class HashSetDiff {
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();
        hs.add("hello");
        hs.add("java");

        HashSet<Student> h = new HashSet<>();
        h.add(new Student().setName("asd").setAge(11));
        h.add(new Student().setName("asd").setAge(11));

        Console.log(h);
    }
}
