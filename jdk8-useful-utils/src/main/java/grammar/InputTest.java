package grammar;

import java.util.Scanner;

/**
 * 输入
 *
 * @author Luo_0412
 */
public class InputTest {
    /**
     * 主方法
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "";
        int i = 0;
        float f = 0.0f; // 需要加上f

        /**
         * hasNext方法
         */
        if (scan.hasNext()) {
            str = scan.next();
            System.out.println("next接收到：" + str);
        }
        if (scan.hasNextLine()) {
            str = scan.nextLine();
            System.out.println("nextLine接收到：" + str);
        }
        if (scan.hasNextInt()) {
            i = scan.nextInt();
            System.out.println("收到整数：" + i);
        } else {
            System.out.println("收到的不是整数！");
        }
        if (scan.hasNextFloat()) {
            f = scan.nextFloat();
            System.out.println("收到小数：" + f);
        } else {
            System.out.println("收到的不是小数！");  //
        }

        scan.close(); // 清场
    }

}
