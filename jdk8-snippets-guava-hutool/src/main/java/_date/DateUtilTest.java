package _date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期工具测试
 *
 * @author Luo_0412
 */
public class DateUtilTest {

    public static void main(String[] args) {
        /**
         * 判断时刻先后
         */
        Date now = new Date();
        long tMillis = System.currentTimeMillis() - 5000; // 当前时间+5秒
        Date otherDate = new Date(tMillis); // 创建累加5秒后的时间

        if (otherDate.after(now)) {
            System.out.println("now之后");
        } else {
            System.out.println("now之前");
        }

        /**
         * 另一种比较方式
         */
        int compare = otherDate.compareTo(now); // 存储比较结果
        switch (compare) {
            case 0:
                System.out.println("两个日期相等");
                break;
            case 1:
                System.out.println("otherDate大于now对象");
                break;
            case -1:
                System.out.println("otherDate小于now对象");
                break;
            default:
                System.out.println(compare);
                break;
        }

        // 使用 toString()显示日期时间
        Date date = new Date(); // Tue Nov 08 09:02:46 CST 2016
        System.out.println("toString(): " + date.toString());

        // 使用format显示时间日期
        String str = String.format("Current Date/Time : %tc", date);
        System.out.println(str); // 星期二 十一月 08 09:03:09 CST 2016

        // 使用printf格式化日期
        System.out.printf("%1$s %2$tB %2$td, %2$tY",
                "Due date:", date); // 十一月 08, 2016
        System.out.println();

        // 使用<标志。它表明先前被格式化的参数要被再次使用
        System.out.printf("%s %tB %<te, %<tY",
                "Due date:", date);
        System.out.println(); // 十一月 8, 2016

        // 使用SimpleDateFormat格式化日期
        Date dNow = new Date();
        SimpleDateFormat ft =
                new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("Current Date: " + ft.format(dNow));
    }

}
