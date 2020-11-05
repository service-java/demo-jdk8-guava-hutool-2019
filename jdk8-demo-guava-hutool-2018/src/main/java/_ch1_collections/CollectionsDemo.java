package _ch1_collections;

import cn.hutool.core.lang.Console;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Description: 模块功能
 * User: luo0412
 * Date: 2019-04-18
 * Time: 11:51
 */
public class CollectionsDemo {
    ArrayList<Integer> arrayList = new ArrayList<>();
    ArrayList<Integer> arrayList2 = new ArrayList<Integer>();

    {
        arrayList.add(-1);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(-5);
        arrayList.add(7);
        arrayList.add(4);
        arrayList.add(-9);
        arrayList.add(-7);
        Console.log("arrayList " + arrayList);

    }

    {

        arrayList2.add(-3);
        arrayList2.add(-5);
        arrayList2.add(7);
        Console.log("arrayList2 " + arrayList2);
    }

    @Test
    public void reverse() {
        Collections.reverse(arrayList);
        Console.log(arrayList);
    }

    @Test
    public void rotate() {
        Collections.rotate(arrayList, 5);
        Console.log(arrayList);
    }


    @Test
    public void sort() {
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }

    @Test
    public void sortCompareToDemo() {
        Collections.sort(arrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(arrayList);
    }

    @Test
    public void shuffle() {
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
    }

    @Test
    public void swap() {
        Collections.swap(arrayList, 2, 5);
        System.out.println(arrayList);
    }

    @Test
    public void minAndMax() {
        System.out.println(Collections.max(arrayList));
        System.out.println(Collections.min(arrayList));
    }

    @Test
    public void replaceAll() {
        // 把所有的3替换成 -3
        Collections.replaceAll(arrayList, 3, -3);
        Console.log(arrayList);
    }

    @Test
    public void frequency() {
        System.out.println(Collections.frequency(arrayList, 3));
    }

    @Test
    public void indexOfSubList() {
        ArrayList<Integer> subArrayList = new ArrayList<>();
        subArrayList.add(3);
        subArrayList.add(-5);
        // 2
        System.out.println(Collections.indexOfSubList(arrayList, subArrayList));
    }

    @Test
    public void binarySearch() {
        // 二分查找前 List必须有序
        Collections.sort(arrayList);
        Console.log("arrayList 排序后: " + arrayList);
        // 返回序号 2
        System.out.println(Collections.binarySearch(arrayList, -5));
    }

}
