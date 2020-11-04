package _ch6_game;

/**
 * 输出
 *
 * @author Luo_0412
 */
public class OutputTest {

    public static void main(String[] args) {
        // 输出猪头
        System.out.println("    66666666 ");
        System.out.println("   {/ o  o /}");
        System.out.println("    ( (oo) )");
        System.out.println("      ____");

        // java的输出语句
        int b = 'A';
        System.out.println("A的ASCII码" + b);
        System.out.write(b); // A
        System.out.write('\n'); // 会换行
//        System.out.print("\n");

        // 转移字符和特殊符号
        System.out.println("输出反斜杠：" + '\\');
        System.out.println("输出五角星：" + '\u2605');
    }

}
