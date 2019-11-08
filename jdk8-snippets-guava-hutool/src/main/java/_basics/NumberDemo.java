package _basics;

import cn.hutool.core.lang.Console;
import cn.hutool.core.util.NumberUtil;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2019-11-08 13:20
 */
public class NumberDemo {
    public static void main(String[] args) {

        Double num = 1.23d;
        Console.log(Math.round(num));
        Console.log(Math.ceil(num));
        Console.log(Math.floor(num));

    }

    @Test
    public void round() {
        BigDecimal round = NumberUtil.round(2.125d, 2);
        Console.log(round);
    }
}
