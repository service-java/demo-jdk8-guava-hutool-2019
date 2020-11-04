package _ch1_lab.lab3;

public class MaxMinTest {
    public static void main(String[] args) {
        double[] array = new double[5];
        for (int i = 0; i < array.length; i++) {// 初始化数?
            array[i] = 100 * Math.random();
        }
        System.out.println("源数组：");
        for (int i = 0; i < array.length; i++) {// 显示数组中的各个元素
            System.out.println(array[i]);
        }
        System.out.println("?大?：" + MaxMin.getResult(array).getMax());// 显示?大??
        System.out.println("?小?：" + MaxMin.getResult(array).getMin());// 显示?小??
    }
}
