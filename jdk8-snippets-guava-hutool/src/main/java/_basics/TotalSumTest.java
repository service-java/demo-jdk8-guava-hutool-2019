package _basics;

import org.junit.Test;

import java.util.Scanner;

/**
 * 不定参数计算总和的两种方法
 */

public class TotalSumTest {

    @Test
    public void main() {
        System.out.println("The sum is: " + totalSum(111, 20, 30, 40, 79));
//        System.out.println("The sum is: " + totalSum());

//        print("Java", "PHP");
//        print("Java", "PHP", "Java");
    }


    public int totalSum(int... numbers) {
        int total = 0;
        for (int val : numbers) {
            total += val;
        }
        return total;
    }


    public  int totalSum() {
        System.out.println("start:");
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int x;
        // 输入非int终止
        while (scan.hasNextInt()) {
            x = scan.nextInt();
            sum += x;
        }
        // 及时关闭
        scan.close();
        return sum;
    }

    /**
     * 输出不定参数个数字符串
     *
     * @param varargs
     */
//    private  void print(String... varargs) {
//        // 创建参数可变的方法
//        for (int i = 0; i < varargs.length; i++) {
//            System.out.print(varargs[i] + " ");
//        }
//        // 换行
//        System.out.println();
//    }
}
