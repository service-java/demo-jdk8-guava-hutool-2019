package _old.bai.file;

import java.io.File;


public class CreateDir {
    public static void main(String args[]) {
        String dirname = "/tmp/user/java/bin";
        // 建在E盘，因为工程文件在E盘
        File d = new File(dirname);
        // 现在创建目录
        d.mkdirs();
    }
}
