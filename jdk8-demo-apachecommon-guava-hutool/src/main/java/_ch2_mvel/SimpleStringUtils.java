package _ch2_mvel;

/**
 * 字符串工具
 *
 * @author valsong
 */
public class SimpleStringUtils {

    /**
     * 判断字符串不为空
     *
     * @param str
     * @return
     */
    public static boolean isNotBlank(String str) {
        return !isBlank(str);
    }

    /**
     * 判断字符串为空
     *
     * @param str
     * @return
     */
    public static boolean isBlank(String str) {
        if (str == null || "".equals(str.trim())) {
            return true;
        }
        return false;
    }

    /**
     * 去首尾空格
     *
     * @param s
     * @return
     */
    public static <T> String trim(T s) {
        if (s instanceof String) {
            return s == null ? null : ((String) s).trim();
        } else {
            return s == null ? null : String.valueOf(s).trim();
        }
    }

    /**
     * 下划线命名转驼峰式
     *
     * @param str
     * @return
     */
    public static String toCamel(String str) {
        if (SimpleStringUtils.isBlank(str)) {
            return str;
        }
        StringBuffer buffer = new StringBuffer();
        str = str.toLowerCase().trim();
        char[] charArray = str.toCharArray();
        if (charArray != null) {
            for (int i = 0; i < charArray.length; i++) {
                if ('_' == charArray[i]) {
                    i = i + 1;
                    buffer.append(Character.toUpperCase(charArray[i]));
                } else {
                    buffer.append(charArray[i]);
                }
            }
        }
        return buffer.toString();
    }

    /**
     * 驼峰转下划线
     *
     * @param str
     * @return
     */
    public static String toUnderline(String str) {
        if (SimpleStringUtils.isBlank(str)) {
            return str;
        }
        StringBuffer buffer = new StringBuffer();
        str = str.trim();
        char[] charArray = str.toCharArray();
        if (charArray != null) {
            for (int i = 0; i < charArray.length; i++) {
                if (Character.isUpperCase(charArray[i])) {
                    buffer.append("_");
                    buffer.append(Character.toLowerCase(charArray[i]));
                } else {
                    buffer.append(charArray[i]);
                }
            }
        }
        return buffer.toString();
    }

}
