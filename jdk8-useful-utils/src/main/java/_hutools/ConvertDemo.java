package _hutools;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.lang.Console;

import java.text.DecimalFormat;
import java.util.Date;

public class ConvertDemo {

    public static void main(String[] args) {

//        BigDecimal price = (Convert.toBigDecimal(NumberUtil.roundStr("1213.298", 2)));
//        Console.log(price);


        DecimalFormat decimalFormat = new DecimalFormat("#.###########");
        String DJ = decimalFormat.format(12.090);
        Console.log(DJ);


        // 小时转换
        String a = "2017-05-06 12:12:00";
        Date value = Convert.toDate(a);

        Console.log("{}\n{}\n小时: {}\n",
                value,
                value.getTime(),
                value.getHours());
    }
}
