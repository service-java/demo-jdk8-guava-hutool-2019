package _basics;

import org.junit.Test;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-10-23 14:40
 */
public class ControlTest {

    @Test
    public void badIf() {

        int i = 1, j = 1, k =1;
        if(i > j)
        if( j > k)
        System.out.print("A");
        else
        System.out.print("B"); // 所以什么也不输出

    }
}
