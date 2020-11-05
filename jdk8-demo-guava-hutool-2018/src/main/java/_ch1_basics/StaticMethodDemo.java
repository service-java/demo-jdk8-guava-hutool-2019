package _ch1_basics;

/**
 * Description: 模块功能
 * User: luo0412
 * Date: 2019-04-18
 * Time: 16:40
 */
public class StaticMethodDemo {

    // 静态代码块
    static {
        System.out.print("静态代码块！--");
    }

    // 非静态代码块
    {
        System.out.print("非静态代码块！--");
    }

    public StaticMethodDemo () {
        System.out.print("默认构造方法！--");
    }

    public static void test() {
        System.out.print("静态方法中的内容! --");
        {
            System.out.print("静态方法中的代码块！--");
        }
    }


    public static void main(String[] args) {

//        静态代码块！--非静态代码块！--默认构造方法！--静态方法中的内容! --静态方法中的代码块！--
        StaticMethodDemo test = new StaticMethodDemo();
        StaticMethodDemo.test();

    }
}
