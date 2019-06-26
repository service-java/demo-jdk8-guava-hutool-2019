package _basics;

import org.junit.Test;

/**
 * 位运算
 *
 * @author Luo_0412
 */
public class BitwiseOperation {
    // 定义变量
    // 60 = 0011 1100
    int a = 60;
    // 13 = 0000 1101
    int b = 13;


    @Test
    public  void main() {
        int c = 0;

        // 位运算演示
        c = a & b;
        // 12
        System.out.println("a & b = " + c);
        c = a | b;
        // 61
        System.out.println("a | b = " + c);
        // 按位异或
        c = a ^ b;
        // 49
        System.out.println("a ^ b = " + c);
        c = ~a;
        // -61
        System.out.println("~a = " + c);

    }

    @Test
    public void hello () {
        int c = 0;

        // 正整数的按位取反是其本身+1的负数
        // 负整数的按位取反是其本身+1的绝对值

        c = a << 2;
        // 240
        System.out.println("a << 2 = " + c);
        c = a >> 2;
        // 15 = 1111
        System.out.println("a >> 2  = " + c);
        c = a >>> 2;
        // 15 = 0000 1111
        System.out.println("a >>> 2 = " + c);
    }

}
