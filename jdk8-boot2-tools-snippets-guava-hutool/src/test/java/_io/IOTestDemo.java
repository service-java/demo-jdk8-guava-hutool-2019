package _io;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Description: 模块功能
 * User: luo0412
 * Date: 2019-04-02
 * Time: 14:21
 */
public class IOTestDemo {

    public static void main(String[] args) throws IOException {

        char c;

        // 1. 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter characters, 'q' to quit.");

        // 读取字符
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');


        // 2. 使用 System.in 创建 BufferedReader
        br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'q' to quit.");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("q"));
    }

    @Test
    public void demo2() {

    }

    @Test
    public void demo3() {

    }
}
