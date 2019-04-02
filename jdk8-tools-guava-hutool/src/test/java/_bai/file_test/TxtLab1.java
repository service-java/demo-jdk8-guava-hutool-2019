package _bai.file_test;
/**
 * 骆金参
 * lab8-2 复制文件内容到另一个文件
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TxtLab1 {

    public static void main(String[] args) {
        String filePath = "d:/tmp";

        String fileName1 = "test.txt";
        String fileName2 = "test2.txt";
        String txtContent = "HibernateValidateTest Java World";
        FileInputStream in = null;
        FileOutputStream out = null;

        // 创建文件对象
        File file = new File(filePath, fileName1);
        File file2 = new File(filePath, fileName2);

        try {
            file.createNewFile();
//            file2.createNewFile();
            System.out.println("文件已创建");
        } catch (IOException e) {
            // 输出异常信息
            e.printStackTrace();
        }

        try {
            // 创建FileOutputStream对象
            out = new FileOutputStream(file);
            // 将数组中信息写入到文件中
            out.write(txtContent.getBytes());
            out.close();

            in = new FileInputStream(file);
            // 创建byte数组
            byte[] content = new byte[1024];
            // 从文件中读取信息
            int length = in.read(content);
            String copyContent = new String(content, 0, length);
            in.close();

            // 创建FileOutputStream对象
            out = new FileOutputStream(file2);
            // 将数组中信息写入到文件中
            out.write(copyContent.getBytes());
            out.close();
            System.out.println("文件已复制");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("待复制文件");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 如果输出流存在
            if (out != null) {
                try {
                    // 将流关闭
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
