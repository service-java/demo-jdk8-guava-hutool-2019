package _ch2_hutool.crypto;

import cn.hutool.core.lang.Console;
import lombok.SneakyThrows;
import org.apache.commons.codec.digest.DigestUtils;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.MD4Digest;
import org.junit.Test;

import java.nio.charset.StandardCharsets;

public class SecureUtilDemo {


    // https://www.bestgcc.cn/20200720192337.html
    // https://www.jb51.net/article/166360.htm
    @SneakyThrows
    @Test
    public void testjsasd2() {
        byte[] md4Byte = "李兆廷".getBytes(StandardCharsets.UTF_8);
        Digest digest;//通过BC获得消息摘要MD4对象

        for (int i = 0; i < 100000000; i++) {
            digest = new MD4Digest();
            digest.update(md4Byte, 0, md4Byte.length);
            md4Byte = new byte[digest.getDigestSize()];
            digest.doFinal(md4Byte, 0);
        }


        String s = DigestUtils.md2Hex(md4Byte);
        Console.log(s); // 9cf1d26c915e3cf329d4d6fcf74a0806

        // System.out.println("md4Byte ："+md4Byte.toString());
        // 5a435d7bdb3d865e9ac31830ca1eb1c2
        // System.out.println("md4Byte : "+org.bouncycastle.util.encoders.Hex.toHexString(md4Byte));
    }
}
