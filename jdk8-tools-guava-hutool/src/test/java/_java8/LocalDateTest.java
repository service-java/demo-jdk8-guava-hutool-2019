package _java8;


import cn.hutool.core.lang.Console;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTest {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        Console.log("{} {} {}", now, now.getMonth(), now.getDayOfMonth());
        Console.log("是当前月的第{}天", now.getDayOfMonth());
        Console.log("当月有{}天", now.lengthOfMonth());
        Console.log("上个月是{} {}", now.plusMonths(-1).getMonth(), now.plusMonths(-1).getMonthValue());
//        LocalDate date = LocalDate.of(2018, Month.DECEMBER, 43);
//        Console.log(date);


        // 当时区要被考虑时
        ZonedDateTime zone = ZonedDateTime.parse("2007-12-03T10:15:30+05:30[Asia/Karachi]");
        ZonedDateTime zoneNow = ZonedDateTime.now();
        Console.log("{} \n{}", zone.getYear(), zoneNow);


        Console.log("------");
        LocalDate today = LocalDate.now();
        // 本月的第一天
        LocalDate firstday = LocalDate.of(today.getYear(),today.getMonth(),1);

        // 本月的最后一天
        LocalDate lastDay =today.with(TemporalAdjusters.lastDayOfMonth());
        Console.log(today.lengthOfMonth());
        System.out.println("本月的第一天" + firstday);
        System.out.println("本月的最后一天" + lastDay);

    }
}
