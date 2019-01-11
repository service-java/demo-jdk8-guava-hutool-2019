package __deprecated.bai.file;

import java.io.File;

public class TmpFileDeletion {

    private static void deleteTmpFile(File tmpFile) {// 用于删除单个TMP文件
        String name = tmpFile.getName();// 获得文件名
        if (name.endsWith(".tmp") || name.endsWith(".TMP")) {// 如果文件名以tmp或者TMP结尾
            tmpFile.delete();// 删除文件
        }
    }

    public static void deleteTmpFiles(File root) {
        if (root.isDirectory()) {// 如果是文件夹
            File[] files = root.listFiles();// 获得该文件夹中的全部文件和子文件夹
            for (File file : files) {
                if (file.isDirectory()) {// 如果是子文件夹
                    deleteTmpFiles(file);// 进行迭代
                }
                if (file.isFile()) {// 如果是文件
                    deleteTmpFile(file);// 判断是否需要删除
                }
            }
        }
        if (root.isFile()) {// 如果是文件
            deleteTmpFile(root);// 判断是否需要删除
        }
    }

    public static void main(String[] args) {
        File root = new File("E:\\java测试文件");// 创建测试用文件夹
        deleteTmpFiles(root);// 测试方法

    }
}

