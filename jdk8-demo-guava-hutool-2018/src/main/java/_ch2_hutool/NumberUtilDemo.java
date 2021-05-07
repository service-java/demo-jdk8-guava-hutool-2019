package _ch2_hutool;

import cn.hutool.core.lang.Console;
import cn.hutool.core.util.NumberUtil;
import org.junit.Test;


public class NumberUtilDemo {
    public static void main(String[] args) {
        Console.log(NumberUtil.round("123456.123456000", 0)); // 123456
        Console.log(NumberUtil.roundStr("123456.12845600", 1)); // 123456.1
        Console.log(NumberUtil.decimalFormat("#.00", 123456.12845600)); // 123456.13
        Console.log(NumberUtil.decimalFormat("#.############", 123456.12845600)); // 123456.128456
    }

    @Test
    public void hello() {

    }

    @Test
    public void add() {
        // 转成BigDecimal后计算
        double add = NumberUtil.add(23121231312.23123d, 1212312312.123f);
        Console.log(add);
    }
}
