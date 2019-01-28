package __deprecated._bai.file;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class FileLab3 {

    public static void main(String[] args) throws ClassNotFoundException {
        String filePath = "E:/github-project/luo-Java-Algorithm/tmp";
        String fileName = "test.dat";
        int[] arr = {1, 2, 3, 4, 5};
        double pi = 3.14159;
        Date date = new Date();
        File file = new File(filePath, fileName); // 创建文件对象
        FileOutputStream fos = null;
        FileInputStream fis = null;
        DataOutputStream dos = null;
        ObjectOutputStream objOut = null;
        ObjectInputStream objIn = null;
        DataInputStream dis = null;


        try {
            fos = new FileOutputStream(file);// 创建FileOutputStream对象

            dos = new DataOutputStream(fos);// 创建DataOutputStream对象
            objOut = new ObjectOutputStream(fos);
            objOut.writeObject(date);
            dos.writeDouble(pi);


            for (int i = 0, len = arr.length; i < len; i++) {
                dos.writeInt(arr[i]);
            }

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
            fis = new FileInputStream(file); // 文件输入流
            objIn = new ObjectInputStream(fis); // 对象输入数据流
            dis = new DataInputStream(fis); // 数据输入流

            System.out.println("对象是：" + objIn.readObject());// 将文件中信息输出
            System.out.println("double是：" + dis.readDouble());// 将文件中信息输出

            for (int i = 0, len = arr.length; i < len; i++) {
                System.out.println("arr[" + i + "] : " + dis.readInt());// 将文件中信息输出
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
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
