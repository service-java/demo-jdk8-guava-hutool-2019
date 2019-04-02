package _bai.file_test;

import org.junit.Test;

import java.io.*;
import java.net.URL;

/**
 * Description: 模块功能
 * User: luo0412
 * Date: 2019-04-02
 * Time: 14:39
 */
public class FileTestDemo {

    @Test
    public void createDir() {
        String dirname = "/tmp/user2222/java/bin";
        // 建在E盘 -> 因为工程文件在E盘
        File d = new File(dirname);
        // 现在创建目录
        d.mkdirs();
    }

    @Test
    public void catchUrl() throws IOException {
        URL url = new URL("http://www.w3cschool.cc");
        InputStreamReader inputStreamReader = new InputStreamReader(url.openStream());
        BufferedReader reader = new BufferedReader(inputStreamReader);
        FileWriter fileWriter = new FileWriter("data.html");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String line;

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
        reader.close();
        bufferedWriter.close();
    }

    @Test
    public void listDir() {
        String dirname = "d:/tmp";
        File file = new File(dirname);

        if (file.isDirectory()) {
            System.out.println("遍历文件夹 " + dirname + " 的第一层 -> ");
            String s[] = file.list();

            for (int i = 0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i]);
                if (f.isDirectory()) {
                    System.out.println("目录: " + s[i]);
                } else {
                    System.out.println("文件: " + s[i]);
                }
            }

        } else {
            System.out.println(dirname + " 不是文件夹");
        }
    }



}
