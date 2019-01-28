/**
 * 遍历
 *
 * @Author
 * @Time
 */
package _collections;


import cn.hutool.core.lang.Console;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoEachArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");

        // for循环遍历
        for (String str : list) {
            Console.log(str);
        }
        Console.log();

        // 迭代器
        Iterator<String> ite = list.iterator();
        while (ite.hasNext()) {
            Console.log(ite.next());
        }
        Console.log();

        // @Deprecated
        // 把链表变为数组
        // 再进行遍历
        String[] strArray = new String[list.size()];
        list.toArray(strArray);

        for (String str : strArray) {
            Console.log(str);
        }
        Console.log();
    }
}
