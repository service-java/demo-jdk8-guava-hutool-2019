package _games;

import java.util.Scanner;

/**
 * 换硬币 求余
 *
 * @author Luo_0412
 */
public class ExchangeCoins {

    private static Scanner moneyInput;

    public static void main(String[] args) {
        // 声名变量
        int[] coinArray = {1000, 500, 100, 50, 10, 5, 2, 1};
        String[] strArray = new String[]{"10元", "5元", "1元",
                "5角", "1角",
                "5分", "2分", "1分"};
        int[] numArray = {0, 0, 0, 0, 0, 0, 0, 0};

        double money = 1.0;
        final int TIMES = 100;
        int money_tmp = 1;  // 临时存储放大100倍的money

        // 输入金额
        System.out.print("enter an amount in double,");
        System.out.print("for example 78.56: ");
        moneyInput = new Scanner(System.in);
        money = moneyInput.nextDouble();
        money_tmp = (int) (money * TIMES);

        // 计算个数
        for (int i = 0; i < coinArray.length; i++) {
            numArray[i] = money_tmp / coinArray[i];
            money_tmp -= numArray[i] * coinArray[i];
        }

        // 输出个数
        System.out.println("Your amount " + money + " consists of:");
        for (int i = 0; i < coinArray.length; i++) {
            System.out.println("\t" + numArray[i] + "个" + strArray[i]);
        }
    }

}

