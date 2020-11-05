package _ch6_game;

import java.util.Random;
import java.util.Scanner;

/**
 * 买彩票
 *
 * @author Luo_0412
 */
public class BuyLottery {

    private static Scanner numInput;

    public static void main(String[] args) {
        // 定义变量，产生10-99(包括10和99)的随机数
        Random rand = new Random();
        int randNum = rand.nextInt(90) + 10;
        int yourNum = 0;
        numInput = new Scanner(System.in);

        // 输入自己购买的彩票号码
        System.out.print("Enter your lottery pick (two digits):");
        yourNum = numInput.nextInt();
        System.out.println("The lottery number is " + randNum);

        // 判断中奖金额
        if (yourNum == randNum) {
            System.out.println("Match two digit: you win $10,000");
        } else {
            // 拆开来这四个数字 ，分别定义变量
            int randNum1 = randNum / 10;
            int randNum2 = randNum % 10;
            int num1 = yourNum / 10;
            int num2 = yourNum % 10;
            if (randNum1 == num2 && randNum2 == num1) {
                System.out.println("Match two digit: you win $3,000");
            } else if (randNum1 == num1 || randNum1 == num2
                    || randNum2 == num1 || randNum2 == num2) {
                System.out.println("Match one digit: you win $1,000");
            } else {
                System.out.println("Match zero digit: you win $0");
            }
        }
    }

}
