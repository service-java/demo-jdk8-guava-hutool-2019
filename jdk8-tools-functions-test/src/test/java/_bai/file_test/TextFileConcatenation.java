package _bai.file_test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileConcatenation {

    public static void main(String[] args) {
        File root = new File("E:\\java测试文件");// 获得保存文本文件的文件夹

        File[] txtFiles = root.listFiles(new FileFilter() {// 使用匿名内部类进行文件过滤
            @Override
            public boolean accept(File pathname) {// 获得当前文件夹中全部文本文件
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
            fw = new FileWriter("E://java-test.txt");
            for (File txtFile : txtFiles) {
                fr = new FileReader(txtFile);// 创建FileInputStream对象
                br = new BufferedReader(fr);// 创建缓冲输入流
                String line;
                while ((line = br.readLine()) != null) {
                    fw.write(line);// 将读入的数据写入到文件中
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fw.close();//释放资源
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (br != null) {
                try {
                    br.close();//释放资源
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fr != null) {
                try {
                    fr.close();//释放资源
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
