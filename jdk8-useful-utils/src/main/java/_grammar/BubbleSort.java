package _grammar;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {31, 21, 79, 3, 39,};// 定义?要排序的数组
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {// 如果左侧元素大则交换相邻元素
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(array));// 输出排序过程
        }
    }
}
