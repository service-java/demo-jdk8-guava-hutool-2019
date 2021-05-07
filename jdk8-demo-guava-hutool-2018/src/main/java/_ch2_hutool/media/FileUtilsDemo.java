package _ch2_hutool.media;

import cn.hutool.core.io.FileTypeUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.file.FileReader;
import cn.hutool.core.io.file.FileWriter;
import cn.hutool.core.lang.Console;
import org.junit.Test;

import java.io.File;

public class FileUtilsDemo {
    @Test
    public void getPicType() {

        File file = FileUtil.file("d:/picture-web/fruit.jpg");

        String type = FileTypeUtil.getType(file);
        //输出 jpg则说明确实为jpg文件
        Console.log("文件类型 {} ", type);
    }

    @Test
    public void ls() {
        reFn("d:/upload");
    }

    public void reFn(File ll) {
      this.reFn(ll.getPath());
    }

    public void reFn(String path) {
        File[] ls = FileUtil.ls(path);
        for (File l : ls) {
            if (l.isDirectory()) {
                this.reFn(l);
            } else {
                Console.log(l.getAbsolutePath());
            }
        }

    }

    @Test
    public void appendTxt() {
        FileWriter writer = new FileWriter("test.properties");
        writer.append("追加内容");

        FileReader fileReader = new FileReader("test.properties");
        String result = fileReader.readString();
        Console.log(result);
    }


//    @Test
//    public void copy () {
//        BufferedInputStream in = FileUtil.getInputStream("test.txt");
//        OutputStream out = FileUtil.getOutputStream("test2.txt");
//
//        long copySize = IoUtil.copy(in, out, IoUtil.DEFAULT_BUFFER_SIZE);
//        IoUtil.write(out, true, );
//    }

}
