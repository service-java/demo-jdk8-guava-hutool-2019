package _ch2_hutool;

import cn.hutool.core.lang.Console;
import cn.hutool.core.util.RandomUtil;

public class RandomUtilDemo {
    public static void main(String[] args) {


        Console.log("{} {}\n ",
                RandomUtil.randomUUID(), RandomUtil.randomNumbers(12));

    }
}
