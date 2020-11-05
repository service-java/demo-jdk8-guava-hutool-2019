package _ch2_hutool.media;

import cn.hutool.extra.mail.MailUtil;
import org.junit.Test;

/**
 * Description: 模块功能
 * User: luo0412
 * Date: 2019-04-03
 * Time: 15:27
 */
public class MailTestDemo {

    @Test
    public void main() {
        MailUtil.send("1095847440@qq.com", "测试", "邮件来自Hutool测试", false);
    }
}
