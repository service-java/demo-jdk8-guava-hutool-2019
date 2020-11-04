package _ch2_hutool.crypto;

import cn.hutool.core.lang.Console;
import cn.hutool.core.util.CharsetUtil;
import cn.hutool.core.util.URLUtil;
import cn.hutool.crypto.Mode;
import cn.hutool.crypto.Padding;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.symmetric.AES;
import org.junit.Test;

public class AESDemo {
    // 原始内容
    final String content = "date=1209-12-09";
    // 秘钥
    final String keyStr = "1234567890123456";
    // 偏移量
    final String iv = "1234567890123456";

    @Test
    public void aes() {

        // 随机生成密钥
//      byte[]  key = SecureUtil.generateKey(SymmetricAlgorithm.AES.getValue()).getEncoded();

        // 构建
        AES aes = SecureUtil.aes(keyStr.getBytes());

        // 加密
//        byte[] encrypt = aes.encrypt(content);
//        byte[] decrypt = aes.decrypt(encrypt);

        // 解密为字符串
        // 默认pkcs5padding
        String encryptBase64 = aes.encryptBase64(content, CharsetUtil.UTF_8);
//        String decryptStr = aes.decryptStrFromBase64(encryptBase64, CharsetUtil.CHARSET_UTF_8);
        String decryptStr = aes.decryptStr(encryptBase64, CharsetUtil.CHARSET_UTF_8);

        Console.log("原始内容:{}\n密钥:{}\n加密后的字符串:{}\n解密后:{}",
                content,
                keyStr,
                encryptBase64,
                decryptStr
        );

    }


    @Test
    public void aesCBC() {
        // 原始内容
        AES aes = new AES(Mode.CBC, Padding.PKCS5Padding, keyStr.getBytes(), iv.getBytes());

        String encryptBase64 = aes.encryptBase64(content, CharsetUtil.UTF_8);
        String decryptStr = aes.decryptStr(encryptBase64, CharsetUtil.CHARSET_UTF_8);

        Console.log("原始内容:{}\n密钥:{}\n偏移量:{}\n加密后的字符串:{}\n解密后:{}",
                content,
                keyStr,
                iv,
                encryptBase64,
                decryptStr);
    }


    @Test
    public void aesCBCDemo2() {
        // 原始内容
        AES aes = new AES(Mode.CBC, Padding.PKCS5Padding, keyStr.getBytes(), iv.getBytes());

        String decryptStr = aes.decryptStr(URLUtil.encode("JZJ5QiVuFHFi4C9Uh2VJoXCBaIBEFXvv621jK5/nNv8="), CharsetUtil.CHARSET_UTF_8);

        Console.log("密钥:{}\n偏移量:{}\n解密后:{}",
                keyStr,
                iv,
                decryptStr);
    }




}
