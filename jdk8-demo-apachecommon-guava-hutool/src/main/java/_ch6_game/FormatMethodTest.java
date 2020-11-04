package _ch6_game;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * format格式相关的代码
 *
 * @author Luo_0412
 */
public class FormatMethodTest {

    public static void main(String[] args) {
        DecimalFormat myFormat = new DecimalFormat();

        // 设置将数字分组为2
        myFormat.setGroupingSize(2);
        String output = myFormat.format(123456.789);
        System.out.println("将数字以每两个数字分组 " + output);

        // 设置不允许数字进行分组
        myFormat.setGroupingUsed(false);
        output = myFormat.format(123456.789);
        System.out.println("不允许数字分组 " + output);


        SimgleFormat("###,###.###", 123456.789); // 调用静态SimgleFormat()方法
        SimgleFormat("00000000.###kg", 123456.789); // 加上单位
        SimgleFormat("000000.000", 123.78); // 按照格式模板格式化数字，不存在的位以0显示

        // 调用静态UseApplyPatternMethodFormat()方法
        UseApplyPatternMethodFormat("#.###%", 0.789); // 将数字转化为百分数形式
        UseApplyPatternMethodFormat("###.##", 123456.789); // 将小数点后格式化为两位
        UseApplyPatternMethodFormat("0.00\u2030", 0.789); // 将数字转化为千分数形式

        //创建日期对象
        GregorianCalendar calendar = new GregorianCalendar();
        String message = String.format("小明的生日：%1$tY年%1$tm月%1$te日", calendar);
        String message2 = String.format("当前时间：%1$tI时%1$tM分%1$tS秒", Calendar.getInstance());
        String message3 = String.format("当前时间：%tT", Calendar.getInstance());

        System.out.println(message);
        System.out.println(message2);
        System.out.println(message3);

        // 进制转换
        System.out.println(String.format("%1$d的八进制表示：%1$o", 99));
        System.out.println(String.format("%1$d的十六进制表示：%1$x", 99));

    }

    /**
     * 使用实例化对象时设置格式化模式
     *
     * @param pattern
     * @param value
     */
    static public void SimgleFormat(String pattern, double value) {
        DecimalFormat myFormat = new DecimalFormat(pattern);
        String output = myFormat.format(value); // 将数字进行格式化
        System.out.println(value + "\t" + pattern + "\t" + output);
    }

    /**
     * 使用applyPattern()方法对数字进行格式化
     *
     * @param pattern
     * @param value
     */
    static public void UseApplyPatternMethodFormat(String pattern, double value) {
        DecimalFormat myFormat = new DecimalFormat();
        myFormat.applyPattern(pattern); // 调用applyPatten()方法设置格式化模板
        System.out.println(value + " \t\t" + pattern + "\t\t" + myFormat.format(value));
    }

}
