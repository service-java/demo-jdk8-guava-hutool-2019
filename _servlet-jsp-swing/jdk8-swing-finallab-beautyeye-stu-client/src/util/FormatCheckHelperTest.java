package util;

public class FormatCheckHelperTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println(FormatCheckHelper.isScoreInRange(101.1f, 0f, 100f));
        System.out.println(FormatCheckHelper.isScoreInRange("111", 0f, 100f));
        System.out.println(FormatCheckHelper.isScoreInRange("99.2", 0f, 100f));

        System.out.println(FormatCheckHelper.isDateType("jell"));       // 长度就不正确的
        System.out.println(FormatCheckHelper.isDateType("2016-s7-10")); // 格式
        System.out.println(FormatCheckHelper.isDateType("2071-02-24"));
        System.out.println(FormatCheckHelper.isDateType("2078-02-29")); // 非常规
        System.out.println(); // 非常规
        System.out.println(FormatCheckHelper.isStrToIntOK("2078-02-29")); // 非常规
        System.out.println(FormatCheckHelper.isStrToIntOK("")); // 非常规
        System.out.println(FormatCheckHelper.isStrToIntOK("10sfvs")); // 非常规
        System.out.println(FormatCheckHelper.isStrToIntOK("112")); // 非常规

    }

}
