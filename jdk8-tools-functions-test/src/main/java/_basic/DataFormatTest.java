package _basic;

import cn.hutool.core.lang.Console;

import java.text.DecimalFormat;

public class DataFormatTest {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat(".##");
        Console.log(df.format(12121212.54555d));
    }
}
