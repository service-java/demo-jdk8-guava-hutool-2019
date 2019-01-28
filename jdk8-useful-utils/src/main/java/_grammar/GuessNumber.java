package _grammar;

import java.util.Random;
import java.util.Scanner;

/**
 * 猜数游戏
 *
 * @author Luo_0412
 */
public class GuessNumber {

    private static Scanner numInput;

    public static void main(String[] args) {
        // 定义变量，产生0-100(包括0和100)的随机数
        Random rand = new Random();
        int randNum = rand.nextInt(101);
        randNum = 18;
        int yourNum = 0;
        numInput = new Scanner(System.in);

        // while循环猜数，直到猜对break
        System.out.println("Guess a magic number between 0 and 100");
        while (true) {
            System.out.print("Enter your guess: ");
            yourNum = numInput.nextInt();
            if (yourNum == randNum) {
                System.out.println("Yes, the number is " + randNum);
                break;
            } else if (yourNum < randNum) {
                System.out.println("Your guess is too low");
            } else {
                System.out.println("Your guess is too high");
            }
        }
        // System.out.println("Game Over");
    }

}
