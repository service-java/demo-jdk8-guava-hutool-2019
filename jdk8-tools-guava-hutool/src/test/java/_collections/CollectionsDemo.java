package _collections;

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

    {
        arrayList.add(-1);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(-5);
        arrayList.add(7);
        arrayList.add(4);
        arrayList.add(-9);
        arrayList.add(-7);
        Console.log(arrayList);
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

}
