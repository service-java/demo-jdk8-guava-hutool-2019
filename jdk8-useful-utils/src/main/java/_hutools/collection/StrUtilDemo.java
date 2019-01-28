package _hutools.collection;

import cn.hutool.core.lang.Console;
import cn.hutool.core.util.HashUtil;
import cn.hutool.core.util.StrUtil;

public class StrUtilDemo {
    public static void main(String[] args) {

        Console.log(HashUtil.jsHash("<script>"));

        Console.log(StrUtil.hasBlank("h _ 9"));

        // 模板
        String template = "{}爱{}，就像老鼠爱大米";
        //str -> 我爱你，就像老鼠爱大米
        String str = StrUtil.format(template, "我", "你");
        Console.log(str);

        String str2 = "";
        Console.log(StrUtil.isAllEmpty(str));
    }
}
