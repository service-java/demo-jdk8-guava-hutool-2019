package _bai.file_test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

public class UnzipTxtFiles {

    public static void main(String[] args) {

        String zipPath = "E:\\java测试文件.zip";
        File root = new File(zipPath);// 获得需要解压缩的zip文件
        File target = new File("E:\\java测试文件");// 创建保存解压缩后生成文件的文件夹
        if (!target.exists()) {// 如果保存文件的文件夹不存在，则进行创建
            target.mkdir();
        }
        ZipFile zf = null;
        try {
            zf = new ZipFile(root);// 创建ZipFile对象
            Enumeration<? extends ZipEntry> e = zf.entries();// 创建枚举变量
            while (e.hasMoreElements()) {// 遍历枚举变量
                ZipEntry entry = e.nextElement();// 获得ZipEntry对象
                if (!entry.getName().endsWith(".txt")) { // 如果不是文本文件就不进行解压缩
                    continue;
                }
                File currentFile = new File(target + File.separator + entry.getName());
                if (!currentFile.exists()) {// 如果当前文件不存在，则进行创建
                    currentFile.createNewFile();
                }
                FileOutputStream fos = new FileOutputStream(currentFile);
                InputStream in = zf.getInputStream(entry);// 利用获得的ZipEntry对象的输入流
                int buffer = 0;
                while ((buffer = in.read()) != -1) {// 将输入流写入到本地文件
                    fos.write(buffer);
                }
                in.close();// 释放资源
                fos.close();// 释放资源
            }
        } catch (ZipException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (zf != null) {
                try {
                    zf.close();// 释放资源
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
