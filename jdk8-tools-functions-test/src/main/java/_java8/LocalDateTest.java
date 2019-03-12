package _java8;


import cn.hutool.core.lang.Console;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZonedDateTime;

public class LocalDateTest {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        Console.log("{} {} {}", now, now.getMonth(), now.getDayOfMonth());

//        LocalDate date = LocalDate.of(2018, Month.DECEMBER, 43);
//        Console.log(date);


        // 当时区要被考虑时
        ZonedDateTime zone = ZonedDateTime.parse("2007-12-03T10:15:30+05:30[Asia/Karachi]");
        ZonedDateTime zoneNow = ZonedDateTime.now();
        Console.log("{} \n{}", zone.getYear(), zoneNow);

    }
}
