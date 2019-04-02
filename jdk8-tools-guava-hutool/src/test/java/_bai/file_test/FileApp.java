package _bai.file_test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件操作有关的演示
 *
 * @author Luo_0412
 */
public class FileApp {

    /**
     * 文件创建与删除的切换
     * 文件存在则删除，不存在则创建
     *
     * @param file
     */
    public static void createFile(File file) {
        if (file.exists()) {
            String name = file.getName(); // 获取文件名称
            long length = file.length(); // 获取文件长度
            boolean hidden = file.isHidden(); // 判断文件是否是隐藏文件
            System.out.println("文件名称：" + name); // 输出信息
            System.out.println("文件长度是：" + length);
            System.out.println("该文件是隐藏文件吗？" + hidden);
//            file.delete();
//            System.out.println("文件已删除");
        } else {
            try { // 捕捉可能出现的异常
                file.createNewFile();
                System.out.println("文件已创建");
            } catch (IOException e) { // catch处理该异常
                e.printStackTrace(); // 输出异常信息
            }
        }
    }

    /**
     * 编辑文件内容
     *
     * @param out
     * @param file
     * @param txtContent
     */
    public static void editTxt(File file, FileOutputStream out, String txtContent) {
        try {
            out = new FileOutputStream(file);// 创建FileOutputStream对象
            out.write(txtContent.getBytes());// 将数组中信息写入到文件中
        } catch (FileNotFoundException e) {
            e.printStackTrace();
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

    /**
     * 输出文件信息
     *
     * @param file
     * @param in
     */
    public static void printTxtInfo(File file, FileInputStream in) {
        try {
            in = new FileInputStream(file);
            byte[] content = new byte[1024]; // 创建byte数组
            int length = in.read(content); // 从文件中读取信息
            System.out.println("文件中的信息是：" + new String(content, 0, length)); // 将文件中信息输出
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();// 输出异常信息
        } finally {
            if (in != null) {
                try {
                    in.close();// 关闭流
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 主方法
     *
     * @param args
     */
    public static void main(String[] args) {
        String filePath = "d:/tmp";

        String fileName = "test.txt";
        String txtContent = "helo";
        FileInputStream in = null;
        FileOutputStream out = null;

        File file = new File(filePath, fileName); // 创建文件对象
        createFile(file); // 创建实体文件
        editTxt(file, out, txtContent); // 文件中添加信息

        printTxtInfo(file, in); // 输出文件信息

    }

}
