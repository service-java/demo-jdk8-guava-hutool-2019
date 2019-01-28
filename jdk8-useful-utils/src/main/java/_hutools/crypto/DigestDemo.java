package _hutools.crypto;

import cn.hutool.core.lang.Console;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.asymmetric.Sign;
import cn.hutool.crypto.asymmetric.SignAlgorithm;

public class DigestDemo {

    public static void main(String[] args) {
        byte[] data = "风流云散".getBytes();
        Sign sign = SecureUtil.sign(SignAlgorithm.MD5withRSA);

        // 签名
        byte[] signed = sign.sign(data);

        // 验证签名
        boolean verify = sign.verify(data, signed);
        Console.log(
            "{}\n{}\n{}\n{}\n",
            data,
            sign,
            signed,
            verify);
    }

}
