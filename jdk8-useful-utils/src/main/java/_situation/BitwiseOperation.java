package _situation;

/**
 * 位运算
 *
 * @author Luo_0412
 */
public class BitwiseOperation {
    /**
     * 主方法
     *
     * @param args
     */
    public static void main(String[] args) {
        // 定义变量
        int a = 60; // 60 = 0011 1100
        int b = 13; // 13 = 0000 1101
        int c = 0;

        // 位运算演示
        c = a & b;
        System.out.println("a & b = " + c); // 12
        c = a | b;
        System.out.println("a | b = " + c); // 61
        c = a ^ b;  // 按位异或
        System.out.println("a ^ b = " + c); // 49
        c = ~a;
        System.out.println("~a = " + c);    // -61
        // 正整数的按位取反是其本身+1的负数
        // 负整数的按位取反是其本身+1的绝对值
        c = a << 2;
        System.out.println("a << 2 = " + c); // 240
        c = a >> 2;
        System.out.println("a >> 2  = " + c); // 15 = 1111
        c = a >>> 2;
        System.out.println("a >>> 2 = " + c);   // 15 = 0000 1111
    }

}
