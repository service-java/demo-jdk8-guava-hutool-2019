package objectCore;

public class FinalTest {
    // 声明final修饰的成员变?
    private final int number = 2;  // final修饰后不能继?, 变量只能赋?一?

    public int getNumber() {
        return number;
    }

    public static void main(String[] args) {
        System.out.println(new FinalTest().getNumber());
        // System.out.println(number); // 报错, 要static修饰 
    }
}
