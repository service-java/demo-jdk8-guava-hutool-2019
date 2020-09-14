package _hutool.convert;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.lang.Console;
import cn.hutool.core.util.NumberUtil;
import org.junit.Test;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.List;

public class ConvertDemo {

    @Test
    public void convertDate() {
        // 小时转换
        String a = "2017-05-06 12:12:00";
        Date value = Convert.toDate(a);
        Console.log("{} \n时间戳 {} \n小时 {}",
                value,
                value.getTime(),
                value.getHours());
    }

/*    @Test
    public void sbc2DBC() {
        String a1 = "123456789";

        // 结果为："１２３４５６７８９"
        String sbc = Convert.toSBC(a1);

        Console.log("{} \n{}", sbc, Convert.toDBC(sbc));
    }*/


    @Test
    public void roundStr() {
        BigDecimal price = (Convert.toBigDecimal(NumberUtil.roundStr("1213.298", 2)));
        Console.log(NumberUtil.roundStr("1213.298", 2));
        Console.log(price);
    }


    @Test
    public void arr2List() {
        Object[] a = {"a", "你", "好", "", 1};
//        List<?> list = Convert.convert(List.class, a);

        // 从4.1.11开始可以这么用
        List<?> list = Convert.toList(a);
        Console.log(list);


        long[] b = {1,2,3,4,5};
        String bStr = Convert.toStr(b);
        System.out.println(bStr); // "[1, 2, 3, 4, 5]"

        String[] b2 = { "1", "2", "3", "4" };
        Double[] doubleArray = Convert.toDoubleArray(b2);
        Console.log(doubleArray); // [1.0, 2.0, 3.0, 4.0]

    }


    @Test
    public void digitToChinese() {
        String digitUppercase = Convert.digitToChinese(67556.32);
        System.out.println(digitUppercase); // 陆万柒仟伍佰伍拾陆元叁角贰分
    }

}
