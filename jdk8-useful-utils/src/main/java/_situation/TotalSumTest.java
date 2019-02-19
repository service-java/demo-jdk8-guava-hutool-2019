package _situation;

import java.util.Scanner;

/**
 * 不定参数计算总和的两种方法
 */

public class TotalSumTest {
    /**
     * 主方法
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("The sum is: " + totalSum(111, 20, 30, 40, 79));
        System.out.println("The sum is: " + totalSum());

        print("Java", "PHP");
        print("Java", "PHP", "Java");
    }


    /**
     * 参数任意个都行
     *
     * @param numbers
     * @return
     */
    public static int totalSum(int... numbers) {
        int total = 0;
        for (int val : numbers) {
            total += val;
        }
        return total;
    }

    /**
     * 需手动结束，推荐上面的
     *
     * @return
     */
    public static int totalSum() {
        System.out.println("start:");
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int x;
        while (scan.hasNextInt()) {
            x = scan.nextInt();
            sum += x;
        }
        scan.close(); // 及时关闭
        return sum;
    }

    /**
     * 输出不定参数个数字符串
     *
     * @param varargs
     */
    private static void print(String... varargs) { // 创建参数可变的方法
        for (int i = 0; i < varargs.length; i++) {
            System.out.print(varargs[i] + " "); // 输出参数的内容
        }
        System.out.println(); // 换行
    }
}
