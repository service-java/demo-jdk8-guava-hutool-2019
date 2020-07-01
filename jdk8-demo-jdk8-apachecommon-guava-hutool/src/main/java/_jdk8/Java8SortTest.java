package _jdk8; /**
 * java8特性简介
 */

import cn.hutool.core.lang.Console;
import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Java8SortTest {
    List<String> names1 = new ArrayList<>();

    {
        names1.add("Google ");
        names1.add("Runoob ");
        names1.add("Taobao ");
        names1.add("Baidu ");
        names1.add("Sina ");

    }

    @Test
    public void main() {
        Java8SortTest tester = new Java8SortTest();
        tester.sortUsingJava7(names1);
        Console.log(names1);
    }


    @Test
    public void sort() {
        Java8SortTest tester = new Java8SortTest();
        // 排序改变本身???
        tester.sortUsingJava8(names1);
        Console.log(names1);
    }

    /**
     * 使用 java 7 排序
     *
     * @param names
     */
    private void sortUsingJava7(List<String> names) {
        Collections.sort(names, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
    }

    /**
     * 使用 java 8 排序
     *
     * @param names
     */
    private void sortUsingJava8(List<String> names) {
//        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
        Collections.sort(names, String::compareTo);
    }
}
