package _hutool.crypto;

import cn.hutool.core.lang.Console;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.digest.MD5;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-09-14 9:38
 */
public class MD5Demo {

    public static void main(String[] args) {

        MD5 md5 = SecureUtil.md5();
        String s = md5.digestHex16("1212");
        Console.log(s);
    }
}
