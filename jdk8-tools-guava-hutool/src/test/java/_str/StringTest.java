package _str;

import cn.hutool.core.lang.Console;
import org.junit.Test;

/**
 * Description: 模块功能
 * User: luo0412
 * Date: 2019-03-29
 * Time: 10:21
 */
public class StringTest {

    @Test
    public void main() {

        // @TODO
        // 00开头 -> 16进制
        Console.log(String.format("%09d", 001002007));
        Console.log(String.format("%09d", Integer.parseInt("001002007")));
        Console.log("001002003" + 1);
    }

}
