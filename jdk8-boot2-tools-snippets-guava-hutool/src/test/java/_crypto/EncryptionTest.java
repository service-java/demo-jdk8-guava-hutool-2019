package _crypto;

import org.junit.Test;

import java.util.Scanner;

/*
 * 骆金参
 * Java programming Autumn 2016
 * Lab 4-6  加密
 */

public class EncryptionTest {

    // 加密方法
    public static void encrypt(String str) {
        StringBuffer ciphertext = new StringBuffer();
        String[] tokens = str.toUpperCase().split(" ");

        for (int i = 0; i < tokens.length; i++) {
            tokens[i] = tokens[i].substring(1) + tokens[i].charAt(0) + "AY";
            ciphertext.append(tokens[i] + " ");
        }
        System.out.println(ciphertext.toString());
    }

    @Test
    public static void main(String[] args) {
        // 定义变量
        Scanner kb = new Scanner(System.in);
        String plaintext = "";

        // 输入明文
        System.out.print("Enter a string:");
        plaintext = kb.nextLine();

        // 加密并输出密文
        encrypt(plaintext);

        // 清场工作
        kb.close();

    }

}
