package _ch1_file;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileConcatenationDemo {

    @Test
    public void main() {
        // 获得保存文本文件的文件夹
        File root = new File("E:\\java测试文件");

        // 使用匿名内部类进行文件过滤
        File[] txtFiles = root.listFiles(new FileFilter() {
            @Override
            // 获得当前文件夹中全部文本文件
            public boolean accept(File pathname) {
                if (pathname.getName().endsWith(".txt")) {
                    return true;
                }
                return false;
            }
        });

        FileReader fr = null;
        FileWriter fw = null;
        BufferedReader br = null;

        try {
            fw = new FileWriter("E://hello.txt");
            for (File txtFile : txtFiles) {
                // 创建FileInputStream对象
                fr = new FileReader(txtFile);
                // 创建缓冲输入流
                br = new BufferedReader(fr);
                String line;
                while ((line = br.readLine()) != null) {
                    // 将读入的数据写入到文件中
                    fw.write(line);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
