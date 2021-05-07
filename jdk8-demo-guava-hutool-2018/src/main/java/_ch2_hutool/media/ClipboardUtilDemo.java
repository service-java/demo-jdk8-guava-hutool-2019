package _ch2_hutool.media;

import cn.hutool.core.lang.Console;
import cn.hutool.core.swing.clipboard.ClipboardUtil;

import java.awt.datatransfer.Clipboard;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2021-05-07 15:17
 */
public class ClipboardUtilDemo {
    public static void main(String[] args) {

        String str = ClipboardUtil.getStr();
        Console.log(str);
    }
}
