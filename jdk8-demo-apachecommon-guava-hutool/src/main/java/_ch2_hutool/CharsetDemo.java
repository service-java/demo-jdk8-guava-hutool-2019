package _ch2_hutool;

import cn.hutool.core.lang.Console;
import cn.hutool.core.util.EscapeUtil;
import org.apache.commons.lang.StringEscapeUtils;

public class CharsetDemo {
    public static void main(String[] args) {
//        Console.log(CharsetUtil.charset("GBK"));

        String str = "A、W重=2.6×V体×Kn$B、Kn系数｡当H≤1m时,Kn取0.75$C、Kn系数｡当1m<H大≤2m时,Kn取0.70$D、Kn系数｡当2m<H大≤3m时,Kn取0.65$E、Kn系数｡当3m<H大≤4m时,Kn取0.60$";
//        Console.log("{} {} {} \n{}",
//                EscapeUtil.escape("1212我"),
//                EscapeUtil.unescape("1212%u6211"),
//                EscapeUtil.safeUnescape("1212%u6211"),
//                EscapeUtil.escape(str));

        Console.log(EscapeUtil.escape(str));
        Console.log(StringEscapeUtils.escapeHtml(str));

    }
}
