package grammar;

import java.util.Scanner;

/**
 * 回文数判断
 *
 * @author Luo_0412
 */
public class IsPalindromeNumTest {

    // 判断回文数的方法
    public static boolean isPalindrome(String str) {
        char[] tmpArray = str.toCharArray();
        String tmpStr = "";
        for (int i = tmpArray.length - 1; i >= 0; i--) {
            tmpStr += tmpArray[i];
        }
        return tmpStr.equals(str);
    }

    public static void main(String[] args) {
        // 定义变量
        Scanner kb = new Scanner(System.in);
        String inputStr = "";
        int times = 5;

        // 输入判断
        System.out.println("Enter a string: ");
        while (times > 0) {
            inputStr = kb.next();
            if (isPalindrome(inputStr)) {
                System.out.println(inputStr + " is a palindrome");
            } else {
                System.out.println(inputStr + " is not a palindrome");
            }
            times--;
        }

        kb.close();

    }

}
