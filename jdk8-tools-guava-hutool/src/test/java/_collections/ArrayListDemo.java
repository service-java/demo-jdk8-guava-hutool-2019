package _collections;

import cn.hutool.core.lang.Console;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * ArrayList方法测试
 *
 * @author Luo_0412
 */
public class ArrayListDemo {

    static ArrayList list = new ArrayList<String>();


    {
        list.add("Yao Zhengwei");
        list.add("Hu Bin");
        list.add(1, "Tao Limin");
    }

    @Test
    public void each() {

        // for循环遍历
        for (Object str : list) {
            Console.log(str);
        }
    }

    @Test
    public void each2() {
        // 迭代器
        Iterator<String> ite = list.iterator();
        while (ite.hasNext()) {
            Console.log(ite.next());
        }
    }

    @Test
    @Deprecated
    public void each3() {
        // 把链表变为数组 再进行遍历
        String[] strArray = new String[list.size()];
        list.toArray(strArray);

        for (String str : strArray) {
            Console.log(str);
        }
    }


    @Test
    public void replace() {

        // 替换
        list.set(0, "Liang Xikun");
        Console.log(list);
    }


    @Test
    public void remove() {

        // 移除
        list.remove(2);
        Console.log(list);
    }

    @Test
    public void transform() {
        List arrayList = new ArrayList<String>();
        arrayList.add("1");
        arrayList.add("2");

        Object[] objects = arrayList.toArray();
        Console.log(objects);
        // 存在问题
//        Console.log("arrayList转数组 -> {}", objects);
        Console.log("数组转list -> {}", Arrays.asList(objects));

    }

}
