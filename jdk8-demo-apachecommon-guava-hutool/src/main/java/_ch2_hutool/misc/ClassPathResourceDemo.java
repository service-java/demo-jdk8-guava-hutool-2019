package _ch2_hutool.misc;

import cn.hutool.core.io.resource.ClassPathResource;
import cn.hutool.core.lang.Console;

import java.io.IOException;
import java.util.Properties;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-09-14 14:16
 */
public class ClassPathResourceDemo {

    public static void main(String[] args) throws IOException {

        ClassPathResource resource = new ClassPathResource("test.properties");
        Properties properties = new Properties();
        properties.load(resource.getStream());

        Console.log("Properties: {}", properties);
        String test = properties.getProperty("test.dog");
        Console.log(test);
    }
}
