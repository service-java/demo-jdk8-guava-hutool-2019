package _sorts;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        // 定义要排序的数组
        int[] array = {31, 21, 79, 3, 39,};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                // 如果左侧元素大则交换相邻元素
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            // 输出排序过程
            System.out.println(Arrays.toString(array));
        }
    }
}
