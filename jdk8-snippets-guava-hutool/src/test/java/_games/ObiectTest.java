package _games;

/**
 * 关于对象的简单测试
 *
 * @author Luo_0412
 */
public class ObiectTest {

    public static void main(String[] args) {
        // 需要对象，而不是内置数据结构?
        Integer x = 5;
        x = x + 10;
        System.out.println(x);

        // 字符对象
        Character ch = new Character('a');
        System.out.println(ch);

        // String类是不可改变的，一旦创建，它的值就无法改变。
        char[] helloArray = {'h', 'e', 'l', 'l', 'o', '.'};
        String helloString = new String("world");
        helloString = new String(helloArray);
        System.out.println(helloString);
        System.out.println(helloArray.length);
        System.out.println(helloString.length()); // 对象的方法，带括号

        // 可复用的格式化输出字符串
        float floatVar = 1;
        int intVar = 1;
        String stringVar = "hello";

        String fs;
        fs = String.format("浮点型变量的的值为 " +
                "%f,\n整型变量的值为 " +
                "%d,\n字符串变量的值为 " +
                "%s", floatVar, intVar, stringVar);
        System.out.println(fs); // 复用


    }

}
