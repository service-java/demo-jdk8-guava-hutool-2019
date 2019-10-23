package _jdk8;

import java.util.Base64;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2019-10-23 11:11
 */
public class Base64Demo {
    public static void main(String[] args) {
        String base64 = Base64.getEncoder().encodeToString("aaa".getBytes());
        System.out.println(base64);

        byte[] bytes = Base64.getDecoder().decode(base64);
        System.out.println(new String(bytes));
    }
}
