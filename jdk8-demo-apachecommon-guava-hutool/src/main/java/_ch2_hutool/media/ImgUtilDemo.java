package _ch2_hutool.media;

import cn.hutool.core.img.Img;
import cn.hutool.core.io.FileUtil;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-09-14 11:11
 */
public class ImgUtilDemo {

    public static void main(String[] args) {
        Img.from(FileUtil.file("e:/pic/1111.png"))
                .setQuality(0.8)//压缩比率
                .write(FileUtil.file("e:/pic/1111_target.jpg"));
    }
}
