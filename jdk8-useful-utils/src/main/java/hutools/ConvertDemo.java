package hutools;

import cn.hutool.core.lang.Console;

import java.text.DecimalFormat;

public class ConvertDemo {

    public static void main(String[] args) {

//        BigDecimal price = (Convert.toBigDecimal(NumberUtil.roundStr("1213.298", 2)));
//        Console.log(price);


        DecimalFormat decimalFormat = new DecimalFormat("#.###########");
        String DJ = decimalFormat.format(12.090);
        Console.log(DJ);
    }
}
