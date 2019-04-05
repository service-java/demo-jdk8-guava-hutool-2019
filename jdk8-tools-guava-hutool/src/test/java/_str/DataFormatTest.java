package _str;

import cn.hutool.core.lang.Console;
import org.junit.Test;

import java.text.DecimalFormat;

public class
DataFormatTest {

    @Test
    public void main() {

//        Console.log(System.nanoTime());

//        Console.log(String.format("%.2f", 200.229d));

        DecimalFormat df = new DecimalFormat(".##");
        Console.log(df.format(12121212.54555d));
    }


    @Test
    public void main2() {

        // @TODO
        // 00开头 -> 16进制
        Console.log(String.format("%09d", 001002007));
        Console.log(String.format("%09d", Integer.parseInt("001002007")));
        Console.log("001002003" + 1);
    }


}
