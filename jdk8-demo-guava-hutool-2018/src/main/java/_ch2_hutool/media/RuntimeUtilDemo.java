package _ch2_hutool.media;

import cn.hutool.core.lang.Console;
import cn.hutool.core.util.RuntimeUtil;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2021-05-07 15:19
 */
public class RuntimeUtilDemo {
    public static void main(String[] args) {
        String str = RuntimeUtil.execForStr("ipconfig");
        Console.log(str);
    }
}
