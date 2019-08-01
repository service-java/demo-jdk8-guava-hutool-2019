package _string;

/*
 *
 * Java programming Autumn 2016
 * Lab 4-1  常用字符串方法练习
 */


import cn.hutool.core.lang.Console;
import org.apache.commons.lang.StringUtils;
import org.junit.Test;

public class StringMethodDemo {
    String s1 = "Welcome";
    String s2 = "welcome";

    @Test
    public void main() {
        // equals和equalsIgnoreCase方法
        Console.log(s1.equals(s2));
        Console.log(s1.equalsIgnoreCase(s2));

        // compareTo和compareToIgnoreCase方法
        Console.log(s1.compareTo(s2));
        Console.log(s1.compareToIgnoreCase(s2));


        // indexOf和lastIndexOf方法
        System.out.println("'e'首次出现在s1中的下标： " + s1.indexOf('e'));
        System.out.println("\"abc\"最后一次出现在s1中的下标： " + s1.indexOf("abc"));
    }


    @Test
    public void hello() {
        // startsWith和endsWith方法
        Console.log(s1.startsWith("AAA"));
        Console.log(s1.endsWith("AAA"));

        // concat方法
        String s3 = s1.concat(s2);
        Console.log(s3);


        // 大小写转化方法
        Console.log(s1.toLowerCase());
        Console.log(s1.toUpperCase());


        // trim()方法
        s1 = " Welcome ";
        s3 = s1;
        Console.log("去除首尾空格之前： \n{} \n去除首尾空格之后： \n{} ", s3, s3.trim());
    }

    @Test
    public void basic() {
        // length()方法
        Console.log(s1.length());

        // charAt()方法
        char ch = s1.charAt(0);
        System.out.println("s1的第一个字符： " + ch);

        // substring方法
        String s1_child1 = s1.substring(1);
        String s1_child2 = s1.substring(1, 5);
        Console.log("s1子串1：{}\ns1子串2：{}", s1_child1, s1_child2);

    }

    @Test
    public void replace() {
        // replace()方法
        System.out.println("E 替换 e 的s1： " + s1.replace('e', 'E'));

        // split方法
        String str = "welcome to java and html";
        String[] tokens = str.split(" ");
        for (String val : tokens) {
            System.out.println(val);
        }
    }


    @Test
    public void split() {
        // 定义字符串
        String str = "joe@gaddisBooks.com";
        // 字符串拆成数组
        String[] tokens = str.split("[@.]");
        for (String val : tokens) {
            System.out.println(val);
        }
    }


    @Test
    public void equalDemo() {
        String message = " So say we all! ";
        String message1 = " So say we all! ";
        String message2 = new String(" So say we all! ");


        // 类似缓存机制演示
        // true false 0
        Console.log("{} {} {}",
                message == message1,
                message == message2,
                message.compareTo(message1));

        // true true??
        message2 = message.intern();
        Console.log("{} {}",
                message1 == message2,
                message1.equals(message2));
    }

    @Test
    public void demo() {
        // 声名数组
        String fullName = "Cynthia Susan Smith";
        char[] nameArray = new char[5];
        // 字符串提取方法
        fullName.getChars(8, 13, nameArray, 0);
        //字符串转化成数组
        nameArray = fullName.substring(8, 13).toCharArray();

        // 输出字符串和数组
        System.out.println("The string is: " + fullName);
        System.out.println("The values in the nameArray are: ");
        for (char val : nameArray) {
            System.out.print(val + " ");
        }
    }


    @Test
    public void subString () {
        String path = "d:/opts/upload";
        int i = path.lastIndexOf("/") + 1;
        String substring = StringUtils.substring(path, i);
        Console.log(substring);
    }

}
