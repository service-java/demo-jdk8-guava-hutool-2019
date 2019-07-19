package _game;

import java.util.Scanner;
/*
 * @author
 * 计算圆面积
 */

public class RadiusArea {
    // 主方法
    public static void main(String[] args) {

        // 定义变量
        double r = 1.0;
        final double PI = 3.14159;
        double area = 1.0;

        // 输入半径，输出面积
        System.out.print("输入半径： ");
        Scanner kb = new Scanner(System.in);
        r = kb.nextDouble();
        area = r * r * PI;
        System.out.println("圆面积： " + area);
        kb.close();  // 及时关闭
    }

}
