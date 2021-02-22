package _ch1_collections;

import cn.hutool.core.lang.Console;
import org.apache.commons.collections.CollectionUtils;
import org.junit.Test;

import java.util.*;

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


    public static void main(String[] args) {

        List<Integer> objects = Arrays.asList(1, 2);
        Console.log(objects);
    }

    @Test
    public void retainDemo() {
        List listA = new ArrayList<String>();
        listA.add("2020-03");
        listA.add("2020-09");
        listA.add("2020-08");
        listA.add("2020-07");

        List listB = new ArrayList<String>();
        listB.add("2020-08");
        listB.add("2020-01");
        listB.add("2020-07");
        listB.add("2020-03");


        List intersection = (ArrayList<String>) CollectionUtils.intersection(listA, listB);
        Collections.sort(intersection);
        System.out.println(intersection);


    }

}
