package _hutool;

import cn.hutool.core.lang.Console;
import cn.hutool.core.swing.clipboard.ClipboardUtil;
import cn.hutool.core.util.RuntimeUtil;

public class RuntimeUtilDemo {
    public static void main(String[] args) {
        // 输出命令行结果
        String str = RuntimeUtil.execForStr("ipconfig");
        Console.log(str);

        // 输出粘贴板内容
        Console.log(ClipboardUtil.getStr());
    }

}
