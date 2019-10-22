package _file;

import org.junit.Test;

import java.io.File;

public class FileDeleteDemo {

    // 用于删除单个TMP文件
    private static void deleteFile(File file) {
        String name = file.getName();

        // 如果文件名以tmp或者TMP结尾 -> 删除
        if (name.endsWith(".txt") || name.endsWith(".txt")) {
            file.delete();
        }
    }


    /**
     * 文件夹遍历, 文件则删除
     * @param root
     */
    private static void deleteAllFile(File root) {
        if (root.isDirectory()) {
            File[] files = root.listFiles();
            for (File file : files) {
                if (file.isDirectory()) {
                    deleteAllFile(file);
                } else if (file.isFile()) {
                    deleteFile(file);
                }
            }
        } else if (root.isFile()) {
            // 判断是否需要删除
            deleteFile(root);
        }
    }

    @Test
    public void deleteAllTxtInTempDirectory() {
        // 创建测试用文件夹
        File root = new File("E:\\hello");
        deleteAllFile(root);
    }
}

