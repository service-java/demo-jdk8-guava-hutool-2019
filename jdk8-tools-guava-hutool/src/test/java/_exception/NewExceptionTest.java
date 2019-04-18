package _exception;

import cn.hutool.core.lang.Console;
import exception.NewException;
import org.junit.Test;

public class NewExceptionTest {
    // 求圆面积
    public static void showBigArea(double r) throws NewException {
        if (r <= 20) {
            throw new NewException(r);
        }
        // 计算圆的面积
        double area = 3.14 * r * r;
        System.out.println("圆的面积是：" + area);
    }

    @Test
    public void showBigDemo() {
        try {
            // 调用showArea()方法
            showBigArea(10);
        } catch (NewException ex) {
            System.out.println(ex);
        }

        Console.log("理理我吧!!!");
    }
}
