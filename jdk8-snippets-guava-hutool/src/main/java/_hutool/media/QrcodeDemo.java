package _hutool.media;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;
import org.junit.Test;

public class QrcodeDemo {

    @Test
    public void genQrcode() {
        // 生成指定url对应的二维码到文件，宽和高都是300像素
        String randStr = RandomUtil.randomString(24);
        QrCodeUtil.generate(
                "http://hutool.cn/",
                300, 300,
                FileUtil.file("d:/temp/" + randStr + ".jpg")
        );

    }
}
