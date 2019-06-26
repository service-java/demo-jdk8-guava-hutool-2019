package _basics;

import org.junit.Test;

/**
 * 类型转换
 *
 * @author Luo_0412
 */
public class TypeConversion {
    /**
     * 主函数
     *
     * @param args
     */
    @Test
    public static void main(String[] args) {
        // 浮点数加减并不准确
        System.out.println(1.0D - 0.9D);

        // 除法中体现的double和int
        System.out.println("5.0/2 = " + (5.0 / 2));
        System.out.println("5/2 = " + (5 / 2));
        // j = 5 / 2; // 定义j为double类型
        // (double) 5 / 2;
        // 5D / 2;


    }


    @Test
    public void hello () {
        // 强制类型转化
        int i = 'a';
        System.out.println("a的ASCII码： " + i);
    }
}
