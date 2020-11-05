package _ch2_hutool;

import cn.hutool.core.date.BetweenFormater;
import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.Console;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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

        Console.log(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
    }

    @Test
    public void hello() {
        String format1 = DateUtil.format(new Date(), "hh:mm yyyy/MM/dd");
//        String format = DateUtil.format(new Date(), "hh:ss yyyy/MM/dd");
        Console.log(format1);
    }


    @Test
    public void fastDateFormatDemo() {

    }

    @Test
    public void between() {
        String dateStr1 = "2017-03-01 22:33:23";
        Date date1 = DateUtil.parse(dateStr1);

        String dateStr2 = "2017-04-01 23:33:23";
        Date date2 = DateUtil.parse(dateStr2);

        // 相差一个月，31天
        long betweenDay = DateUtil.between(date1, date2, DateUnit.DAY);
        String formatBetween = DateUtil.formatBetween(betweenDay, BetweenFormater.Level.MINUTE); // @todo
        Console.log("{} {}", betweenDay, formatBetween);
    }

    @Test
    public void getDatePart() {
        Date date = DateUtil.date();
        System.out.println(DateUtil.year(date));

        // 获得月份，从0开始计数!!!
        System.out.println(DateUtil.month(date));

        // 获得月份枚举
        System.out.println(DateUtil.monthEnum(date));
    }

}
