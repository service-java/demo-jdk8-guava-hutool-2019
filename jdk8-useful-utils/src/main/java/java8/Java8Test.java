package java8; /**
 * java8特性简介
 */

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Java8Test {
    /**
     * 主方法
     *
     * @param args
     */
    public static void main(String args[]) {
        List<String> names1 = new ArrayList<>();
        names1.add("Google ");
        names1.add("Runoob ");
        names1.add("Taobao ");
        names1.add("Baidu ");
        names1.add("Sina ");

        List<String> names2 = new ArrayList<>();
        names2.add("Google ");
        names2.add("Runoob ");
        names2.add("Taobao ");
        names2.add("Baidu ");
        names2.add("Sina ");

        Java8Test tester = new Java8Test();
        tester.sortUsingJava7(names1);
        tester.sortUsingJava8(names2); // 排序改变本身
        System.out.println(names1);
        System.out.println(names2);
    }

    /**
     * 使用 java 7 排序
     *
     * @param names
     */
    private void sortUsingJava7(List<String> names) {
        Collections.sort(names, new Comparator<String>() {
            //            @Override
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
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
    }
}
