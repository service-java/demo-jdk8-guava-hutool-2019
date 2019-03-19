package _old.lab.lab6;

public class StaticInnerClassDemo {
    static int x = 100;

    static class Inner {
        static void doitInner() {
            System.out.println("外部类的成员变量" + x); // 调用外部类的成员变量x
        }

        public static void main(String args[]) { // 定义主方法
            doitInner(); // 访问内部类的方法
        }

    }

}
