package _collections;

import cn.hutool.core.lang.Console;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ArrayList方法测试
 *
 * @author Luo_0412
 */
public class ArrayListDemo {

    static ArrayList list = new ArrayList<String>();

    // 遍历输出
    public static void displayArrayList(ArrayList<?> aList) {
        for (int i = 0; i < aList.size(); i++) {
            Console.log(aList.get(i));
        }
    }

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
    public void replace () {

        // 替换
        list.set(0, "Liang Xikun");
        displayArrayList(list);
    }


    @Test
    public void remove () {

        // 移除
        list.remove(2);
        displayArrayList(list);
    }

}
