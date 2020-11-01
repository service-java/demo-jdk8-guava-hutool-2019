package _date;

import cn.hutool.core.lang.Console;
import org.joda.time.LocalDate;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-09-21 9:34
 */
public class JodaTimeTest {

    public static void main(String[] args) {

        LocalDate current = new LocalDate();
        LocalDate localDate = null;
        for (int i = 0; i < 20; i++) {
            localDate = current.minusMonths(i+1);
            Console.log(localDate.getYear() + "." + localDate.getMonthOfYear());
        }
    }
}
