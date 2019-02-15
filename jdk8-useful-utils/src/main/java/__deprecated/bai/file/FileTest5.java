package __deprecated.bai.file;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest5 {// 创建类

    public static void main(String[] args) {// 主方法
        File file = new File("E:/myword", "work.txt"); // 创建文件对象
        FileOutputStream fos = null;
        FileInputStream fis = null;
        DataOutputStream dos = null;
        DataInputStream dis = null;
        try {
            fos = new FileOutputStream(file);// 创建FileOutputStream对象
            dos = new DataOutputStream(fos);// 创建DataOutputStream对象
            dos.writeUTF("明日科技");// 将字符串信息写入到文件中
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {// catch语句处理异常信息
            e.printStackTrace();// 输出异常信息
        } finally {
            if (dos != null) {
                try {
                    dos.close();// 将流关闭
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();// 将流关闭
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        try {
            fis = new FileInputStream(file);// 创建FileInputStream对象
            dis = new DataInputStream(fis);// 创建DataInputStream对象

            System.out.println("文件中的信息是：" + dis.readUTF());// 将文件中信息输出
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (dis != null) {
                try {
                    dis.close();// 将流关闭
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();// 将流关闭
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
