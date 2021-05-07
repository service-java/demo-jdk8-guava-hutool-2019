package _ch2_hutool.convert;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.lang.Console;
import cn.hutool.core.util.HashUtil;
import cn.hutool.core.util.StrUtil;
import org.junit.Test;
import org.springframework.util.StringUtils;

public class StrUtilDemo {
    public static void main(String[] args) {


//
        // 模板
        String template = "{}爱{}，就像老鼠爱大米";
        //str -> 我爱你，就像老鼠爱大米
        String str = StrUtil.format(template, "我", "你");
        Console.log(str);

        String sub = StrUtil.sub("12312312", 0, 100);
        Console.log(sub);
        //
    }


    @Test
    public void h() {
        Console.log(HashUtil.jsHash("<script>"));
        Console.log(StrUtil.hasBlank("h _ 9"));

        String str2 = "";
        Console.log(StrUtil.isAllEmpty(str2));

        Console.log("{}\n{}\n{}\n{}\n{}\n{}\n{}\n",
                StrUtil.isNotEmpty(""),
                StrUtil.isNotEmpty(null),
                StrUtil.isNotBlank(null),
                StrUtil.isNotBlank(" "),

                StringUtils.isEmpty(""), // true
                StringUtils.isEmpty(" "),
                StringUtils.isEmpty(null) // true
        );
    }


    @Test
    public void trim() {
//        String trim = StrUtil.trim(" sadsa sadasd");
//        Console.log(trim);

        Console.log((String)null);
        Console.log(Convert.toStr(null));
        Console.log(StrUtil.trim(Convert.toStr(null)));

    }

    @Test
    public void nativeSplit() {
        String demo = ",";
        Console.log(demo.split(","));

//        // Hutool的split
//        Console.log(StrSpliter.split(demo, ','));
    }


    @Test
    public void springSplit() {
        String demo = ",";
        String[] split = StringUtils.split(demo, ",");
        Console.log("{}---{}---{}---", split, split[0], split[1]); // >> [, ]---------
    }


    @Test
    public void apacheCommonSplit() {
        String demo = ",";

        // apache的切割方法和原生是一致的
        String[] split = org.apache.commons.lang.StringUtils.split(demo, ",");
        Console.log(split); // >> []
    }
}
