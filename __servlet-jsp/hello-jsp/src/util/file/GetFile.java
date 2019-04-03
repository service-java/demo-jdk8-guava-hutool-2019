package util.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GetFile {
    private static ArrayList<String> filelist = new ArrayList<String>();

    public static List<String> getPath(String filePath) {
        List<String> list = new ArrayList<String>();
        File root = new File(filePath);
        File[] files = root.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {	// 递归调用
                getPath(file.getAbsolutePath());
                filelist.add(file.getAbsolutePath());
            } else {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String time = sdf.format(new Date(file.lastModified()));
                list.add(file.getAbsolutePath() + "#"
                        + new File(file.getAbsolutePath()).getName() + "#"	+ time + "#"
                        + (new File(file.getAbsolutePath())).length() + "字节");
            }
        }
        return list;
    }

}

