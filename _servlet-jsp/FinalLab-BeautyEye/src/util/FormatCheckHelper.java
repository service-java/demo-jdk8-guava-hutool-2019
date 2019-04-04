package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class FormatCheckHelper {

    /**
     * 检查成绩是否在范围内
     *
     * @param score
     * @param min
     * @param max
     * @return
     */
    public static Boolean isScoreInRange(float score, float min, float max) {
        if (min <= score && score <= max) {
            return true;
        }
        return false;
    }

    public static Boolean isScoreInRange(String score, float min, float max) {
        float s = 0f;
        try {
            s = Float.parseFloat(score);
        } catch (Exception e) {
            return false; // 转化失败也是错误
        }

        if (min <= s && s <= max) {
            return true;
        }
        return false;
    }

    /**
     * 检查是否符合日期规范
     *
     * @param dateStr
     * @return
     */
    // http://outofmemory.cn/code-snippet/2271/java-review-charaeter-chuan-shifou-hefa-date
    public static Boolean isDateType(String dateStr) {
        // 为空错误
        if (dateStr == null) {
            return false;
        }

        // 检查长度,长度不一致显然是错误的
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        if (dateStr.trim().length() != dateFormat.toPattern().length()) {
            return false;
        }

        // 如果转化失败就是错误的
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(dateStr.trim());
        } catch (ParseException pe) {
            return false;
        }
        return true; // 结合上述,默认返回正确
    }

    /**
     * 判断字符串能否转化成int
     *
     * @param str
     * @return
     */
    public static boolean isStrToIntOK(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


}
