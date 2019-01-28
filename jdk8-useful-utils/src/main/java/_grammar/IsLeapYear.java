package _grammar;

/**
 * 判断平年
 *
 * @author Luo_0412
 */
public class IsLeapYear {

    public static void main(String[] args) {
        int year = 2016;// 定义当前年
        boolean isLeapYear = false;// 保存今年是否为闰年
        if (year % 400 == 0) {// 判断今年是否为闰年
            isLeapYear = true;
        } else if ((year % 4 == 0) && (year % 100 != 0)) {
            isLeapYear = true;
        } else {
            isLeapYear = false;
        }
        if (isLeapYear) {// 保存判断结果
            System.out.println("今年是闰年！");
        } else {
            System.out.println("今年不是闰年！");
        }
    }
}
