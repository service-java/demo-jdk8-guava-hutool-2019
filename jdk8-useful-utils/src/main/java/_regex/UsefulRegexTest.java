package _regex;

import cn.hutool.core.lang.Console;
import cn.hutool.core.util.ReUtil;


public class UsefulRegexTest {
    public static void main(String[] args) {
        String mailRegexStr = "^[a-zA-Z]{1,}[0-9]{0,}@(([a-zA-z0-9]-*){1,}.){1,3}[a-zA-z-]{1,}$";

        Console.log("是否邮箱 -> {} {}",
                ReUtil.isMatch(mailRegexStr, "1095847440@qq.com"),
                ReUtil.isMatch(mailRegexStr, "1095847440@")
                );

        // 正则
        Console.log("replaceAll: {}", ReUtil.escape("我有个$符号{}"));

    }
}
