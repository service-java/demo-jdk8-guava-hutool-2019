package _hutool;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.lang.Console;
import cn.hutool.core.util.NumberUtil;
import org.junit.Test;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.List;

public class ConvertDemo {

    public static void main(String[] args) {
        // 小时转换
        String a = "2017-05-06 12:12:00";
        Date value = Convert.toDate(a);
        Console.log("{} {} 小时 -> {}",
                value,
                value.getTime(),
                value.getHours());

        Console.log("{}\n{}\n",
                Convert.toInt("123123"),
                Convert.toLong(123.12d));
    }

    @Test
    public void hello2() {
        String a1 = "123456789";

        //结果为："１２３４５６７８９"
        String sbc = Convert.toSBC(a1);

        Console.log("{} \n{}", sbc, Convert.toDBC(sbc));
    }

    @Test
    public void hello() {
        BigDecimal price = (Convert.toBigDecimal(NumberUtil.roundStr("1213.298", 2)));
        Console.log(NumberUtil.roundStr("1213.298", 2));
        Console.log(price);
    }

    /**
     * double转String, 去掉0结尾的小数位
     */
    @Test
    public void removeTailZero() {
        // 反面示例
        Console.log(1.20d);
        Console.log(1.0d); // 1.0

        // 抹去尾部的0
        DecimalFormat decimalFormat = new DecimalFormat("#.###########");

        Console.log("抹去尾部的0 -> " + decimalFormat.format(012012.09000));
        Console.log("抹去尾部的0 -> " + decimalFormat.format(001212.0));


    }

    @Test
    public void h() {


        Object[] a = {"a", "你", "好", "", 1};
//        List<?> list = Convert.convert(List.class, a);

        // 从4.1.11开始可以这么用
        List<?> list = Convert.toList(a);
        Console.log(list);

    }


}
