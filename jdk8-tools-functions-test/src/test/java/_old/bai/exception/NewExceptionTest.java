package _old.bai.exception;

public class NewExceptionTest {
    public static void showArea(double r) throws NewException { // 创建求圆面积的方?
        if (r <= 20) {
            throw new NewException(r); // 抛出异常
        }
        double area = 3.14 * r * r; // 计算圆的面积
        System.out.println("圆的面积是：" + area); // 输出圆的面积
    }

    public static void main(String[] args) {
        try {
            showArea(10); // 调用showArea()方法，传递半?10
        } catch (NewException ex) {
            System.out.println(ex); // 输出异常信息
        }
    }
}
