package _ch1_date;

import cn.hutool.core.lang.Console;

import java.util.Calendar;
import java.util.Date;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-11-19 14:41
 */
public class CalendarTest {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        // 2020-06-01
        calendar.setTime(new Date(2020-1900, 6-1, 1));

        // 往后推一个月
        // calendar.add(Calendar.MONTH, 1);

        Console.log("{} {}", calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH));

    }
}
