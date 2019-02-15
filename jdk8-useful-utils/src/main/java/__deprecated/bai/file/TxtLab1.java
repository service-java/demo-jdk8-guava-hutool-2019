package __deprecated.bai.file;
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
        // TODO Auto-generated method stub
        String filePath = "E:/github-project/luo-Java-Algorithm/tmp";
        String fileName1 = "test.txt";
        String fileName2 = "test2.txt";
        String txtContent = "Hello Java World";
        FileInputStream in = null;
        FileOutputStream out = null;

        File file = new File(filePath, fileName1); // 创建文件对象
        File file2 = new File(filePath, fileName2);
        try { // 捕捉可能出现的异常
            file.createNewFile();
//            file2.createNewFile();
            System.out.println("文件已创建");
        } catch (IOException e) { // catch处理该异常
            e.printStackTrace(); // 输出异常信息
        }

        try {
            out = new FileOutputStream(file);// 创建FileOutputStream对象
            out.write(txtContent.getBytes());// 将数组中信息写入到文件中
            out.close();

            in = new FileInputStream(file);
            byte[] content = new byte[1024]; // 创建byte数组
            int length = in.read(content); // 从文件中读取信息
            String copyContent = new String(content, 0, length);
            in.close();

            out = new FileOutputStream(file2);// 创建FileOutputStream对象
            out.write(copyContent.getBytes());// 将数组中信息写入到文件中
            out.close();
            System.out.println("文件已复制");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("待复制文件");
        } catch (IOException e) {
            e.printStackTrace(); // 输出异常信息
        } finally {
            // 如果输出流存在
            if (out != null) {
                try {
                    out.close();// 将流关闭
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
