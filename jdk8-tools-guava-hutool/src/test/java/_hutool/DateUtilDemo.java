package _hutool;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.Console;

import java.util.Calendar;
import java.util.Date;

public class DateUtilDemo {

    public static void main(String[] args) {

        //当前时间
        Date date = DateUtil.date();

        //当前时间
        Date date2 = DateUtil.date(Calendar.getInstance());

        //当前时间
        Date date3 = DateUtil.date(System.currentTimeMillis());

        //当前时间字符串，格式：yyyy-MM-dd HH:mm:ss
        String now = DateUtil.now();

        //当前日期字符串，格式：yyyy-MM-dd
        String today = DateUtil.today();

        Console.log("{}\n{}\n{}\n{}\n{}\n", date, date2, date3, now, today);

//        Console.log(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
    }
}
