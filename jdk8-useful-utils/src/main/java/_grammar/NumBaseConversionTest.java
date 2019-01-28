package _grammar;

import java.util.Scanner;

/**
 * IP地址 二进制转化成十进制
 *
 * @author Luo_0412 骆金参
 * 输入示例  11001100100101000001010101110010
 * 输出示例  204.148.21.114
 */
public class NumBaseConversionTest {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in); // 引入输入
        String binaryStr = kb.nextLine(); // 输入二进制ip地址

        // 将ip地址拆成4段
        String str1 = binaryStr.substring(0, 8);
        String str2 = binaryStr.substring(8, 16);
        String str3 = binaryStr.substring(16, 24);
        String str4 = binaryStr.substring(24, 32);

        // 利用Interger提供的valueOf方法实现进制的转化
        System.out.println(Integer.valueOf(str1, 2).toString() + "."
                + Integer.valueOf(str2, 2).toString() + "."
                + Integer.valueOf(str3, 2).toString() + "."
                + Integer.valueOf(str4, 2).toString());

        kb.close(); // 清场工作
    }

}
