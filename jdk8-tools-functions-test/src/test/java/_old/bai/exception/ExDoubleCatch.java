package _old.bai.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExDoubleCatch {
    // 输入
    private static Scanner kb;

    public static void quotient(int numerator, int denominator) {
        kb = new Scanner(System.in);
        try {
            numerator = kb.nextInt();
            denominator = kb.nextInt();
            System.out.println(numerator / denominator);
        } catch (ArithmeticException e) { // 除以0
            System.out.println("Zero is an invalid denominator. Please try again.");
            quotient(numerator, denominator);
        } catch (InputMismatchException e) { // 非法输入
            System.out.println("You must enter integers. Please try again.");
            quotient(numerator, denominator);
        }
    }

    public static void main(String[] args) {
        int numerator = 0, denominator = 0; // 分配两个int
        quotient(numerator, denominator); // 更安全的输入
    }
}
