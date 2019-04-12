package _hutool.crypto;

import cn.hutool.core.lang.Console;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.asymmetric.Sign;
import cn.hutool.crypto.asymmetric.SignAlgorithm;
import org.junit.Test;

public class DigestDemo {

    @Test
    public void main() {
        byte[] data = "风流云散".getBytes();
        Sign sign = SecureUtil.sign(SignAlgorithm.MD5withRSA);

        // 签名
        byte[] signed = sign.sign(data);

        // 验证签名
        boolean verify = sign.verify(data, signed);
        Console.log(
            "{}\n{}\n{}\n",
            data,
            signed,
            verify);
    }

}
