package __deprecated._lab.lab1;
/*
 * 骆金?
 * Java programming Autumn 2016
 * Lab 6-1 MyDate?  保存受聘日期
 */

import java.text.SimpleDateFormat;
import java.util.Date;

/* 此类保存年月?  */
public class MyDate {
    // 私有属?? 年月?
    private String year;
    private String month;
    private String day;

    // 无参构?函? 获取当前日期
    MyDate() {
        year = new SimpleDateFormat("Y").format(
                new Date(System.currentTimeMillis()));
        ;
        month = new SimpleDateFormat("M").format(
                new Date(System.currentTimeMillis()));
        ;
        day = new SimpleDateFormat("d").format(
                new Date(System.currentTimeMillis()));
        ;
    }

    // 获取年月?
    public String getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }

    public String getDay() {
        return day;
    }

}
