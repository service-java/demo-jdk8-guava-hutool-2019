package constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.regex.Pattern;

/**
 * Description: 模块功能
 * User: luo0412
 * Date: 2019-04-04
 * Time: 11:16
 */
@Getter
@AllArgsConstructor
public enum RegularConstant {
//    public final static Pattern number = java.util.regex.Pattern.compile("^[0-9]*$");
//    public final  Pattern urler = java.util.regex.Pattern.compile("http(s)?://([\\w-]+\\.)+[\\w-]+(/[\\w- ./?%&=]*)?");
//    public static final Pattern phoner =
//            java.util.regex.Pattern.compile("^0{0,1}(13[0-9]|15[0-9]|14[0-9]|18[0-9]|17[0-9])[0-9]{8}$");
//
//    public static final Pattern chineser = java.util.regex.Pattern.compile("[\u4e00-\u9fa5]");
//
//    public static final Pattern iper =
//            java.util.regex.Pattern.compile("(((2[0-4]\\d)|(25[0-5]))|(1\\d{2})|([1-9]\\d)|(\\d))[.](((2[0-4]\\d)|(25[0-5]))|(1\\d{2})|([1-9]\\d)|(\\d))[.](((2[0-4]\\d)|(25[0-5]))|(1\\d{2})|([1-9]\\d)|(\\d))[.](((2[0-4]\\d)|(25[0-5]))|(1\\d{2})|([1-9]\\d)|(\\d))");
//
//    public static final Pattern idCarder =
//            java.util.regex.Pattern.compile("^(\\d{6})(\\d{4})(\\d{2})(\\d{2})(\\d{3})([0-9]|X)$");
//
//    public static final Pattern usernameer =
//            java.util.regex.Pattern.compile("^[\\u4E00-\\u9FA5\\uf900-\\ufa2d_a-zA-Z][\\u4E00-\\u9FA5\\uf900-\\ufa2d\\w]{1,19}$");
//    public static final Pattern datetimeer =
//            java.util.regex.Pattern.compile("^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))(\\s(((0?[0-9])|([1-2][0-3]))\\:([0-5]?[0-9])((\\s)|(\\:([0-5]?[0-9])))))?$");
//
//    public final Pattern scripter =
//            java.util.regex.Pattern.compile("(.*<script.* src=[\'\"])(.*?)(\\??)(\\d*)([\'\"].*>.*)", java.util.regex.Pattern.CASE_INSENSITIVE);
//
//    public final Pattern linker =
//            java.util.regex.Pattern.compile("(.*<link.* href=[\'\"])(.*?)(\\??)(\\d*)([\'\"].*>.*)", java.util.regex.Pattern.CASE_INSENSITIVE);


    email("^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$", "邮箱"),
    phone("^(?:\\+?86)?1(?:3\\d{3}|5[^4\\D]\\d{2}|8\\d{3}|7(?:[01356789]\\d{2}|4(?:0\\d|1[0-2]|9\\d))|9[189]\\d{2}|6[567]\\d{2}|4[579]\\d{2})\\d{6}$", "手机");

    private String regex;
    private String msg;
}
