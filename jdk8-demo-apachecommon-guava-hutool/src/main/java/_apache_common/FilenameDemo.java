package _apache_common;

import cn.hutool.core.lang.Console;
import org.apache.commons.io.FilenameUtils;
import org.junit.Test;

import java.io.File;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2019-10-30 13:54
 */
public class FilenameDemo {

    @Test
    public  void main() {
        File file = new File("d://happy.jpg");
        String extension = FilenameUtils.getExtension(file.getName());
        String baseName = FilenameUtils.getBaseName(file.getName());

        Console.log(extension);
        Console.log(baseName);

//        BeanUtil.copyProperties();
//        BeanUtils.copyProperties();
    }
}
