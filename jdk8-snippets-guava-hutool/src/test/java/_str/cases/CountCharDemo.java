package _str.cases;

import java.util.Scanner;

/**
 * 字符统计
 *
 * @author Luo_0412
 */
public class CountCharDemo {

    /**
     * 主方法
     *
     * @param args
     */
    public static void main(String[] args) {
        // 定义变量
        Scanner input = new Scanner(System.in); // 输入
        String str = "";
        char ch = 'a';

        // 输入字符串和需统计字符
        System.out.print("输入一段字符串：");
        str = input.nextLine(); // 回车以前的内容，可以有空格
        System.out.print("输入要统计的字符：");
        ch = input.next().charAt(0); // 取第一个
        System.out.println("字符 " + ch + " 在字符串中出现了 "
                + counter(ch, str) + " 次");

        input.close(); //清场
    }

    /**
     * 统计字符在字符串中的个数
     *
     * @param ch
     * @param str
     * @return
     */
    public static int counter(char ch, String str) {
        int count = 0; // 计数
        for (int i = 0, len = str.length(); i < len; i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
