package _ch1_file;

import org.junit.Test;

import java.io.*;

/**
 * Description: 模块功能
 * User: luo0412
 * Date: 2019-04-09
 * Time: 12:28
 */
public class FileCopyDemo {

    // java复制文件夹中的所有文件和文件夹到另一个文件夹中
    // https://www.cnblogs.com/lishuo/p/5786842.html

    @Test
    public void copyDemo() {
        String filePath = "d:/tmp";

        String fileName1 = "test.txt";
        String fileName2 = "test2.txt";

        String txtContent = "Hello Java";


        // 创建文件对象
        FileInputStream in = null;
        FileOutputStream out = null;
        File file = new File(filePath, fileName1);
        File file2 = new File(filePath, fileName2);

        // 创建文件
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
