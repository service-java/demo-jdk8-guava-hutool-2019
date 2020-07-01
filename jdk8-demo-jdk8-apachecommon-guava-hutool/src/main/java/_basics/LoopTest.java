package _basics;

import cn.hutool.core.lang.Console;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * 循环
 *
 * @author Luo_0412
 */
public class LoopTest {

    @Test
    public void main() {

        Console.log(0.1 + 0.2);
        Console.log(new BigDecimal(0.1).add(new BigDecimal(0.2)));


        // 定义字符串数组
        String[] arr = {"hello", "hi", "world", "java"};
        // Java5引入的增强型for循环
        for (String i : arr) {
            System.out.println(i);
        }
    }

}
