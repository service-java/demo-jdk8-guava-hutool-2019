package _hutool.office;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.LineCaptcha;
import cn.hutool.core.lang.Console;
import org.junit.Test;

/**
 * Description: 模块功能
 * User: luo0412
 * Date: 2019-04-03
 * Time: 15:07
 */
public class CaptchaTestDemo {

    @Test
    public void hello() {
        // 定义图形验证码的长和宽
        LineCaptcha lineCaptcha = CaptchaUtil.createLineCaptcha(200, 100);

        // 图形验证码写出，可以写出到文件，也可以写出到流
        lineCaptcha.write("d:/line.png");

        // 输出code
        Console.log("验证码 {} 输入 1234 是否正确 -> {}", lineCaptcha.getCode(), lineCaptcha.verify("1234"));


        // 重新生成验证码
        lineCaptcha.createCode();
        lineCaptcha.write("d:/line.png");

        // 新的验证码
        Console.log("验证码 {} 输入 1234 是否正确 -> {}", lineCaptcha.getCode(), lineCaptcha.verify("1234"));
    }
}
