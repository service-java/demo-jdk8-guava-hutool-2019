package _hutools.collection;

import cn.hutool.core.lang.Console;
import cn.hutool.core.util.EscapeUtil;

public class CharsetDemo {
    public static void main(String[] args) {
//        Console.log(CharsetUtil.charset("GBK"));

        Console.log("{} {} {}",
                EscapeUtil.escape("1212我"),
                EscapeUtil.unescape("1212%u6211"),
                EscapeUtil.safeUnescape("1212%u6211")
        );
    }
}
