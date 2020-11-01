package _basics;

import cn.hutool.core.lang.Console;
import org.junit.Test;

import java.time.LocalDate;

/**
 * 类型转换
 *
 * @author Luo_0412
 */
public class TypeConversion {

    @Test
    public void main() {
        // 浮点数加减并不准确
        System.out.println(1.0D - 0.9D);

        // 除法中体现的double和int
        System.out.println("5.0/2 = " + (5.0 / 2));
        System.out.println("5/2 = " + (5 / 2));
        // j = 5 / 2; // 定义j为double类型
        // (double) 5 / 2;
        // 5D / 2;


    }


    @Test
    public void hello () {
        // 强制类型转化
        int i = 'a';
        System.out.println("a的ASCII码： " + i);
    }

    @Test
    public void hello2 () {
        Integer integer = Integer.valueOf(LocalDate.now().getYear());
        Console.log(integer);
    }


    @Test
    public void hello22 () {
        Long i  = 11L;
        Console.log(i);
    }

    @Test
    public void hello2223 () {
        int a = 5, b = 4;
        double d;
        d = a / b;
        System.out.println(d); // 1.0
    }


}
