package _hutool.collection;

import cn.hutool.core.lang.Console;
import cn.hutool.core.util.NumberUtil;


public class NumberDemo {
    public static void main(String[] args) {

        //
        double te1 = 123456.123456000;
        double te2 = 123456.12845600;
        Console.log(NumberUtil.round(te1, 0));//结果:123456.12
        Console.log(NumberUtil.roundStr(te2, 1));//结果:123456.13
        Console.log(NumberUtil.decimalFormat("#.00", te2));


    }
}
