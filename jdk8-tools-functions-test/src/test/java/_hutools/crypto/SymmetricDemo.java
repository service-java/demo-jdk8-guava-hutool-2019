package _hutools.crypto;

import cn.hutool.core.lang.Console;
import cn.hutool.core.util.CharsetUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.symmetric.AES;
import cn.hutool.crypto.symmetric.DES;
import cn.hutool.crypto.symmetric.SymmetricAlgorithm;

public class SymmetricDemo {
    public static void main(String[] args) {
        String content = "test中文";

        // 随机生成密钥
        byte[] key = SecureUtil.generateKey(SymmetricAlgorithm.AES.getValue()).getEncoded();
        // 构建
        AES aes = SecureUtil.aes(key);
        // 加密
        byte[] encrypt = aes.encrypt(content);
        byte[] decrypt = aes.decrypt(encrypt);

        // 解密为字符串
        String encryptHex = aes.encryptHex(content);
        String decryptStr = aes.decryptStr(encryptHex, CharsetUtil.CHARSET_UTF_8);

        Console.log("{}\n{}\n{}\n{}\n{}\n{}\n{}\n",
                content,
                key,
                aes,
                encrypt,
                decrypt,
                encryptHex,
                decryptStr
        );


        // DES
        key = SecureUtil.generateKey(SymmetricAlgorithm.DES.getValue()).getEncoded();
        DES des = SecureUtil.des(key);
        Console.log(des);
    }
}
