package _ch2_hutool.media;

import cn.hutool.core.img.Img;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.StrUtil;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-09-14 11:11
 */
public class ImgUtilDemo {

    public static void main(String[] args) {
//        String path = "D:\\upload\\24544286217783800_封面2020-10-140962281-fde0-4cc1-90ed-1ded4f9e07e3.jpg";
        String path = "D:\\upload\\test.png";
        String ext = StrUtil.subAfter(path, ".", true);
        String content = StrUtil.subBefore(path, ".", true);

//        System.out.println(content);
        Img.from(FileUtil.file(path))
                .setQuality(0.06) //压缩比率
                .write(FileUtil.file(content + "_target" + "." + ext));


    }
}
