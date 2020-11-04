package _ch1_lab.lab2;

/*
 * < 骆金? >
 * Java programing Autumn 2016
 * Lab 5-3
 */

public class TimeTest {

    public static void main(String[] args) {
        // 声名对象
        Time t1 = new Time();
        System.out.println("当前时间?");
        System.out.print(t1.getHour() + "?");
        System.out.print(t1.getMinute() + "?");
        System.out.println(t1.getSecond() + "?");

        // 再次声明对象
        Time t2 = new Time();
        t2.setTime(555550000);
        System.out.print(t2.getHour() + "?");
        System.out.print(t2.getMinute() + "?");
        System.out.println(t2.getSecond() + "?");


    }

}
