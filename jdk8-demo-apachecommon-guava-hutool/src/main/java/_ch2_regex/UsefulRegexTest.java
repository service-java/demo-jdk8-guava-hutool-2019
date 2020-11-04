package _ch2_regex;

import cn.hutool.core.lang.Console;
import cn.hutool.core.util.ReUtil;
import constant.RegularConstant;
import org.junit.Test;

import java.util.regex.Pattern;

public class UsefulRegexTest {

    @Test
    public void main() {
        Console.log("是否邮箱 -> {} {}",
                ReUtil.isMatch(RegularConstant.email.getRegex(), "1095847440@qq.com"),
                ReUtil.isMatch(RegularConstant.email.getRegex(), "1095847440@")
        );
    }

    @Test
    public void mailTest() {
        final Pattern emailer = Pattern.compile("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*");
        Console.log(emailer.matcher("1095847440@qq.com").matches());
        Console.log(ReUtil.isMatch(emailer, "1095847440@"));
        Console.log(ReUtil.isMatch(emailer, "1095847440@qq.c"));
    }

    @Test
    public void phoner() {
        Console.log("{} {} {}",
                ReUtil.isMatch(RegularConstant.phone.getRegex(), "17816869505"),
                ReUtil.isMatch(RegularConstant.phone.getRegex(), "178168695052"),
                ReUtil.isMatch(RegularConstant.phone.getRegex(), "13646615640")
        );
    }

    @Test
    public void escape() {
        Console.log("replaceAll: {}", ReUtil.escape("我有个$符号{}"));
    }
}
