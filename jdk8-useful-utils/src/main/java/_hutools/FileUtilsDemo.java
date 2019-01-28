package _hutools;

import cn.hutool.core.io.FileTypeUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.file.FileReader;
import cn.hutool.core.io.file.FileWriter;
import cn.hutool.core.lang.Console;

import java.io.File;

public class FileUtilsDemo {
    public static void main(String[] args) {
        File file = FileUtil.file("d:/picture-web/fruit.jpg");
        String type = FileTypeUtil.getType(file);
        //输出 jpg则说明确实为jpg文件
        Console.log("文件类型 {} ", type);


        FileWriter writer = new FileWriter("test.properties");
        writer.append("追加内容");

        FileReader fileReader = new FileReader("test.properties");
        String result = fileReader.readString();
        Console.log(result);

    }
}
