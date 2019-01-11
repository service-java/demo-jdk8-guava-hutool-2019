package dataType;

import java.util.Arrays;

/**
 * 数组语法测试
 *
 * @author Luo_0412
 */
public class DemoArray {

    public static void main(String[] args) {
        // 数组声名
        final int ARRAY_SIZE = 5;
        int[] array = new int[ARRAY_SIZE];
        array[2] = 1;
        displayArray(array);

        // 数组引用复制
        int[] array2 = array;
        if (array == array2) {
            System.out.println("They are same.");
        } // 地址相同
        else {
            System.out.println("They are not same.");
        }

        // 修改看看
        array[0] = 200;
        array2[4] = 1000;
        displayArray(array);
        displayArray(array2);

        // 数组复制
        array2 = Arrays.copyOf(array, array.length);
        if (array == array2) {
            System.out.println("They are same.");
        } // 地址相同
        else {
            System.out.println("They are not same.");
        }

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

    /**
     * 遍历输出一维数组
     */
    public static void displayArray(int[] arr) {
        // 遍历输出数组
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * 遍历输出
     *
     * @param arr
     */
    public static void displayArray2D(int[][] arr) { // 注意二维数组
        for (int i = 0, iLen = arr.length; i < iLen; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
