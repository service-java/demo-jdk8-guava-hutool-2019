package _oop;

public class StaticTest {
    private static int count; // 定义静?变量保存实例化次数

    public StaticTest() {
        count++;
    }

    public static void main(String[] args) {
        StaticTest sv1 = new StaticTest();
        StaticTest sv2 = new StaticTest();
        StaticTest sv3 = new StaticTest();

        System.out.println("创建?" + count + "个StaticTest类型的对象！");
        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);
    }
}
