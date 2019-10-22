package _java8;


import cn.hutool.core.lang.Console;
import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class LocalDateTest {
    @Test
    public void methodsDemo() {
        LocalDate now = LocalDate.now();
        Console.log("{} {} {}", now, now.getMonth(), now.getDayOfMonth());
        Console.log("是本月的第{}天", now.getDayOfMonth());
        Console.log("当月有{}天", now.lengthOfMonth());
        Console.log("上个月是{} {}", now.plusMonths(-1).getMonth(), now.plusMonths(-1).getMonthValue());
        Console.log("上个月有{} 天", now.plusMonths(-1).lengthOfMonth());
        //        LocalDate date = LocalDate.of(2018, Month.DECEMBER, 43);
//        Console.log(date);
    }


    @Test
    public void zoneDateTimeTest() {
        // 当时区要被考虑时
        ZonedDateTime zone = ZonedDateTime.parse("2007-12-03T10:15:30+05:30[Asia/Karachi]");
        ZonedDateTime zoneNow = ZonedDateTime.now();
        Console.log("年: {} {}", zone.getYear(), zoneNow);
    }

    @Test
    public void monthFirstAndLastDay() {
        // 本月的第一天
        LocalDate today = LocalDate.now();
        LocalDate firstday = LocalDate.of(today.getYear(), today.getMonth(), 1);
        // 本月的最后一天
        LocalDate lastDay = today.with(TemporalAdjusters.lastDayOfMonth());

        Console.log("本月有{}天", today.lengthOfMonth());
        Console.log("本月的第一天" + firstday);
        Console.log("本月的最后一天" + lastDay);
    }


    @Test
    public void german() {
        LocalDate independenceDay = LocalDate.of(2014, Month.JULY, 4);
        DayOfWeek dayOfWeek = independenceDay.getDayOfWeek();
        // FRIDAY
        System.out.println(dayOfWeek);

        DateTimeFormatter germanFormatter =
                DateTimeFormatter
                        .ofLocalizedDate(FormatStyle.MEDIUM)
                        .withLocale(Locale.GERMAN);

        LocalDate xmas = LocalDate.parse("24.12.2014", germanFormatter);
        // 2014-12-24
        System.out.println(xmas);
    }


    @Test
    public void plusTomorrow() {
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plus(1, ChronoUnit.DAYS);
        LocalDate yesterday = tomorrow.minusDays(2);

        System.out.println(today);
        System.out.println(tomorrow);
        System.out.println(yesterday);
    }


    @Test
    public void period() {

    }
}


