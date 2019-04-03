package _collections;

import cn.hutool.core.lang.Console;
import org.junit.Test;

import java.util.Arrays;

/**
 * 数组语法测试
 *
 * @author Luo_0412
 */
public class ArrayDemo {

    /**
     * 遍历输出一维数组
     */
    public static void displayArray(int[] arr) {
        // 遍历输出数组
        for (int i : arr) {
            Console.log(i);
        }
    }

    /**
     * 遍历输出
     */
    public static void displayArray2D(int[][] arr) {
        // 注意二维数组
        for (int i = 0, iLen = arr.length; i < iLen; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                Console.log(arr[i][j] + " ");
            }
        }
    }


    @Test
    public void main() {
        final int ARRAY_SIZE = 5;
        int[] array = new int[ARRAY_SIZE];
        array[2] = 1;
        displayArray(array);

        // 数组引用复制
        int[] array2 = array;
        Console.log(array == array2);


        // 修改看看
        array[0] = 200;
        array2[4] = 1000;
        displayArray(array);
        displayArray(array2);

        // 数组复制
        array2 = Arrays.copyOf(array, array.length);
        Console.log(array == array2);

        array[0] = 203;
        array2[4] = 104;
        displayArray(array);
        displayArray(array2);

        // 部分复制
        int[] arrayRangeCopy = Arrays.copyOfRange(array, 2, 6);
        displayArray(arrayRangeCopy);

        // fill方法
        int[] fillArray = new int[5];
        Arrays.fill(fillArray, 5);// 将数组中全部元素赋值为5
        displayArray(fillArray);

        // 搜索
        int[] searchArray = {5, 3, 2, 4, 1};
        Arrays.sort(array);// 将数组排序
        int index = Arrays.binarySearch(searchArray, 4);// 查找元素0在数组中的索引值
        System.out.println("元素0在数组中的索引值：" + index);

        // 字符数组可以直接输出
        char[] charArr = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(charArr);

        // 声名二维数组
        int[][] array2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        displayArray2D(array2D);

        // 再声名一次二维数组
        array2D = new int[3][];

        array2D[0] = new int[3];
        array2D[1] = new int[4];
        array2D[2] = new int[3];
        displayArray2D(array2D);
    }

    @Test
    public void hello () {

    }

    @Test
    public void transposition() {
        int[][] array = new int[3][2];
        int[][] arrayT = new int[2][3];

        // 生成数组
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i + j;
            }
        }
        Console.log(array);

        // 翻转
        for (int i = 0; i < arrayT.length; i++) {
            for (int j = 0; j < arrayT[i].length; j++) {
                arrayT[i][j] = array[j][i];
            }
        }
        Console.log(arrayT);
    }

}
