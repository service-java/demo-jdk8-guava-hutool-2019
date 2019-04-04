package constant;

import lombok.Getter;

/**
 * Description: 模块功能
 * User: luo0412
 * Date: 2019-04-04
 * Time: 11:10
 */
@Getter
public enum EnumDate {
    YYYY_MM("yyyy-MM", "年-月"),
    YYYY_MM_DD("yyyy-MM-dd", "年-月-日"),
    YYYY_MM_DD_HH_MM("yyyy-MM-dd HH:mm", "年-月-日 时:分"),
    YYYY_MM_DD_HH_MM_SS("yyyy-MM-dd HH:mm:ss", "年-月-日 时:分:秒"),
    YYYY_MM_EN("yyyy/MM", "年/月"),
    YYYY_MM_DD_EN("yyyy/MM/dd", "年/月/日"),
    YYYY_MM_DD_HH_MM_EN("yyyy/MM/dd HH:mm", "年/月/日 时:分"),
    YYYY_MM_DD_HH_MM_SS_EN("yyyy/MM/dd HH:mm:ss", "年/秒月/日 时:分:秒"),
    YYYYMMDDHHSS("yyyyMMddHHmmss", "年月日时分秒"),
    YYYYMMDD("yyyyMMdd", "年月日");

    private String code;
    private String msg;

    EnumDate(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
