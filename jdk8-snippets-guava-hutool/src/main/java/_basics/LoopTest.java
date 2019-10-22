package _basics;

import org.junit.Test;

/**
 * 循环
 *
 * @author Luo_0412
 */
public class LoopTest {

    @Test
    public void main() {
        // 定义字符串数组
        String[] arr = {"hello", "hi", "world", "java"};
        // Java5引入的增强型for循环
        for (String i : arr) {
            System.out.println(i);
        }
    }

}
