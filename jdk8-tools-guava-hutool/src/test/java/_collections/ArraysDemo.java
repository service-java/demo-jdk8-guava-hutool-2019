package _collections;

import cn.hutool.core.lang.Console;
import org.junit.Test;

import java.util.Arrays;

/**
 * Description: 模块功能
 * User: luo0412
 * Date: 2019-04-18
 * Time: 12:09
 */
public class ArraysDemo {
    int a[] = {1, 3, 2, 7, 6, 5, 4, 9};
    int b[] = {1, 3, 2, 7, 6, 5, 4, 9};
    int c[] = {1, 3, 2, 7, 6, 5, 4, 9};
    char d[] = {'a', 'f', 'b', 'c', 'e', 'A', 'C', 'B'};
    char[] e = {'a', 'f', 'b', 'c', 'e', 'A', 'C', 'B'};
    char[] f = {'a', 'f', 'b', 'c', 'e', 'A', 'C', 'B'};

    @Test
    public void sort() {
        Arrays.sort(a);
        Console.log(a);
    }

    @Test
    public void sort2() {
        Arrays.sort(b, 2, 6);
        Console.log(b);
    }

    @Test
    public void parallelSort() {
        Arrays.parallelSort(c);
        Console.log(c);

        Arrays.parallelSort(d);
        Console.log(d);
    }

    @Test
    public void binarySearch() {
        Console.log(e);
        Arrays.sort(e);
        Console.log(e);
        int s = Arrays.binarySearch(e, 'c');
        Console.log(s);
    }

    @Test
    public void equals() {
        /*
         * 元素数量相同，并且相同位置的元素相同。
         * 另外，如果两个数组引用都是null，则它们被认为是相等的 。
         */
        Console.log(Arrays.equals(e, f));
    }


}
