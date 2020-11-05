package _ch1_lab.lab2;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * < 骆金? >
 * Java programing Autumn 2016
 * Lab 5-3
 */

public class Time {

    private String hour;
    private String minute;
    private String second;
//	private long elapseTime;

    public Time() {
        hour = new SimpleDateFormat("HH").format(
                new Date(System.currentTimeMillis()));
        minute = new SimpleDateFormat("mm").format(
                new Date(System.currentTimeMillis()));
        second = new SimpleDateFormat("ss").format(
                new Date(System.currentTimeMillis()));
    }

    public Time(long elapseTime) {
        hour = new SimpleDateFormat("HH").format(elapseTime);
        minute = new SimpleDateFormat("mm").format(elapseTime);
        second = new SimpleDateFormat("ss").format(elapseTime);
    }

    public void setTime(long elapseTime) {
        hour = new SimpleDateFormat("HH").format(elapseTime);
        minute = new SimpleDateFormat("mm").format(elapseTime);
        second = new SimpleDateFormat("ss").format(elapseTime);
//		this.elapseTime = elapseTime;
    }

    public String getHour() {
        return hour;
    }

    public String getMinute() {
        return minute;
    }

    public String getSecond() {
        return second;
    }


}
