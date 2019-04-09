package _file;

import org.junit.Test;

import java.io.File;

public class FileDeleteDemo {

    // 用于删除单个TMP文件
    private static void deleteSingleTmp(File tmpFile) {
        String name = tmpFile.getName();
        // 如果文件名以tmp或者TMP结尾 -> 删除
        if (name.endsWith(".tmp") || name.endsWith(".TMP")) {
            tmpFile.delete();
        }
    }

    private static void deleteAllTmp(File root) {
        // 如果是文件夹
        if (root.isDirectory()) {
            // 获得该文件夹中的全部文件和子文件夹
            File[] files = root.listFiles();
            for (File file : files) {
                // 如果是子文件夹
                if (file.isDirectory()) {
                    // 进行迭代
                    deleteAllTmp(file);
                }

                if (file.isFile()) {
                    // 判断是否需要删除
                    deleteSingleTmp(file);
                }
            }
        }

        // 如果是文件
        if (root.isFile()) {
            // 判断是否需要删除
            deleteSingleTmp(root);
        }
    }

    @Test
    public void demo() {
        // 创建测试用文件夹
        File root = new File("E:\\hello");
        deleteAllTmp(root);
    }
}

