package _ch2_tricks;

import cn.hutool.core.lang.Console;
import cn.hutool.core.util.NumberUtil;
import org.junit.Test;

import java.text.DecimalFormat;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-05-24 13:28
 */
public class RemoveTailZeroDemo {

    /**
     * double转String, 去掉0结尾的小数位
     */
    @Test
    public void removeTailZero() {
        // 反面示例
        Console.log("=============\n");
        Console.log(1.20d);
        Console.log(1.0d); // 1.0

        // 抹去尾部的0
        Console.log("=============\n");
        DecimalFormat decimalFormat = new DecimalFormat("#.###########");
        Console.log("抹去尾部的0 -> " + decimalFormat.format(012012.09000));
        Console.log("抹去尾部的0 -> " + decimalFormat.format(001212.0));
        Console.log("hutool抹去尾部的0 -> " + NumberUtil.decimalFormat("#.############", 012012.09000));
    }

}
