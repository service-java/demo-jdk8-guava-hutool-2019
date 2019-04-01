package _str;

/*
 * 骆金参
 * Java programming Autumn 2016
 * Lab 4-1  常用字符串方法练习
 */


public class StringMethodDemo {

    public static void main(String[] args) {
        // equals和equalsIgnoreCase方法
        String s1 = "Welcome";
        String s2 = "welcome";
        Boolean isEqual = s1.equals(s2);
        System.out.println("s1 equals s2: " + isEqual);

        isEqual = s1.equalsIgnoreCase(s2);
        System.out.println("s1 equalsIgnoreCase s2: " + isEqual);

        // compareTo和compareToIgnoreCase方法
        int x = s1.compareTo(s2);
        System.out.println("s1 compareTo s2: " + x);

        x = s1.compareToIgnoreCase(s2);
        System.out.println("s1 compareToIgnoreCase s2: " + x);

        // startsWith和endsWith方法
        Boolean b = s1.startsWith("AAA");
        System.out.println("s1 startsWith 'AAA': " + b);
        b = s1.endsWith("AAA");
        System.out.println("s1 endsWith 'AAA': " + b);

        // length()方法
        x = s1.length();
        System.out.println("s1的长度： " + x);

        // charAt()方法
        char ch = 'a';
        ch = s1.charAt(0);
        System.out.println("s1的第一个字符： " + ch);

        // concat方法
        String s3 = s1.concat(s2);
        System.out.println("s1 concat s2： " + s3);

        // substring方法
        String s1_child1 = s1.substring(1);
        String s1_child2 = s1.substring(1, 5); // 下标1到4，包括4
        System.out.println("s1子串1： " + s1_child1);
        System.out.println("s1子串2： " + s1_child2);

        // 大小写转化方法
        s3 = s1.toLowerCase();
        System.out.println("s1转小写： " + s3);
        s3 = s1.toUpperCase();
        System.out.println("s1转大写： " + s3);

        // trim()方法
        s1 = " Welcome ";
        s3 = s1;
        System.out.println("去除首尾空格之前： " + s3);
        s3 = s3.trim();
        System.out.println("去除首尾空格之后： " + s3);

        // replace()方法
        s1 = "Welcome";
        s3 = s1.replace('e', 'E');
        System.out.println("E 替换 e 的s1： " + s3);

        // split方法
        String str = "welcome to java and html";
        String[] tokens = str.split(" ");
        System.out.println("用split把句子拆成单词： ");
        for (String val : tokens) {
            System.out.println(val);
        }

        // indexOf和lastIndexOf方法
        x = s1.indexOf('e');
        System.out.println("'e'首次出现在s1中的下标： " + x);
        x = s1.indexOf("abc");
        System.out.println("\"abc\"最后一次出现在s1中的下标： " + x);

    }

}
