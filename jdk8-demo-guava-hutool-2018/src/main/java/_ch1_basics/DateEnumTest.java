package _ch1_basics;

import cn.hutool.core.lang.Console;
import constant.DateEnum;
import org.junit.Test;

/**
 * Description: 模块功能
 * User: luo0412
 * Date: 2019-04-04
 * Time: 11:11
 */
public class DateEnumTest {

    @Test
    public void hello() {
        String code = DateEnum.YYYY_MM_DD.getCode();
        Console.log(code);
    }
}
