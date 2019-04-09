package _file;

import org.junit.Test;

import java.io.*;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

public class FileZipDemo {


    @Test
    public void zipDemo() {
        // 获得保存txt文件的文件夹
        File root = new File("d:\\hello");
        // 创建压缩完成后生成的文件
        File target = new File("d:\\hello.zip");

        // 使用匿名内部类进行文件过滤
        File[] txtFiles = root.listFiles(pathname -> {
            // 获得当前文件夹中全部文本文件
            if (pathname.getName().endsWith(".txt")) {
                return true;
            }
            return false;
        });


        FileOutputStream fos = null;
        ZipOutputStream zos = null;
        FileInputStream fis = null;
        try {
            // 创建FileOutputStream对象
            fos = new FileOutputStream(target);
            zos = new ZipOutputStream(fos);

            // 创建写入压缩文件的数组
            byte[] buffer = new byte[1024];
            for (File txtFile : txtFiles) {
                // 创建ZipEntry对象
                ZipEntry entry = new ZipEntry(txtFile.getName());
                fis = new FileInputStream(txtFile);
                // 在压缩文件中添加一个ZipEntry对象
                zos.putNextEntry(entry);
                int read = 0;
                while ((read = fis.read(buffer)) != -1) {
                    // 将输入写入到压缩文件
                    zos.write(buffer, 0, read);
                }
                // 关闭ZipEntry
                zos.closeEntry();
                // 释放资源
                if (fis != null) {
                    fis.close();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (zos != null) {
                try {
                    zos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    @Test
    public void unzipDemo() {

        String zipPath = "d:\\hello.zip";
        // 获得需要解压缩的zip文件
        File root = new File(zipPath);
        // 创建保存解压缩后生成文件的文件夹
        File target = new File("d:\\hello");
        // 如果保存文件的文件夹不存在，则进行创建
        if (!target.exists()) {
            target.mkdir();
        }

        ZipFile zf = null;
        try {
            // 创建ZipFile对象
            zf = new ZipFile(root);
            // 创建枚举变量
            Enumeration<? extends ZipEntry> e = zf.entries();
            // 遍历枚举变量
            while (e.hasMoreElements()) {
                // 获得ZipEntry对象
                ZipEntry entry = e.nextElement();
                // 如果不是文本文件就不进行解压缩
                if (!entry.getName().endsWith(".txt")) {
                    continue;
                }
                // 如果当前文件不存在，则进行创建
                File currentFile = new File(target + File.separator + entry.getName());
                if (!currentFile.exists()) {
                    currentFile.createNewFile();
                }
                FileOutputStream fos = new FileOutputStream(currentFile);
                // 利用获得的ZipEntry对象的输入流
                InputStream in = zf.getInputStream(entry);
                int buffer = 0;
                // 将输入流写入到本地文件
                while ((buffer = in.read()) != -1) {
                    fos.write(buffer);
                }
                // 释放资源
                in.close();
                fos.close();
            }
        } catch (ZipException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (zf != null) {
                try {
                    // 释放资源
                    zf.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
