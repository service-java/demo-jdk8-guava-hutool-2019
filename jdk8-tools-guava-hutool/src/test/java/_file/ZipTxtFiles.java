package _file;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipTxtFiles {

    public static void main(String[] args) {
        File root = new File("d:\\java测试文件");// 获得保存txt文件的文件夹
        File target = new File("d:\\java测试文件.zip");// 创建压缩完成后生成的文件
        File[] txtFiles = root.listFiles(new FileFilter() {// 使用匿名内部类进行文件过滤

            @Override
            public boolean accept(File pathname) {// 获得当前文件夹中全部文本文件
                if (pathname.getName().endsWith(".txt")) {
                    return true;
                }
                return false;
            }
        });
        FileOutputStream fos = null;
        ZipOutputStream zos = null;
        FileInputStream fis = null;
        try {
            fos = new FileOutputStream(target);// 创建FileOutputStream对象
            zos = new ZipOutputStream(fos);// 创建ZipOutputStream对象
            byte[] buffer = new byte[1024];// 创建写入压缩文件的数组
            for (File txtFile : txtFiles) {
                ZipEntry entry = new ZipEntry(txtFile.getName());// 创建ZipEntry对象
                fis = new FileInputStream(txtFile);// 创建FileInputStream对象
                zos.putNextEntry(entry);// 在压缩文件中添加一个ZipEntry对象
                int read = 0;
                while ((read = fis.read(buffer)) != -1) {
                    zos.write(buffer, 0, read);// 将输入写入到压缩文件
                }
                zos.closeEntry();// 关闭ZipEntry
                if (fis != null) {
                    fis.close();// 释放资源
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();// 释放资源
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (zos != null) {
                try {
                    zos.close();// 释放资源
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();// 释放资源
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
