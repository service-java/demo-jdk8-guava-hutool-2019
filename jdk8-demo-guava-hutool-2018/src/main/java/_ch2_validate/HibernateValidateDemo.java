package _ch2_validate;

import _ch2_validate.entity.HibernateAccount;
import _ch2_validate.util.BeanValidator;
import _ch2_validate.util.ValidationUtil;
import org.junit.Test;

import java.io.IOException;

/**
 * Description: 模块功能
 * User: luo0412
 * Date: 2019-03-21
 * Time: 17:33
 */

public class HibernateValidateDemo {


    @Test
    public void validateUser() throws IOException {

        HibernateAccount account = new HibernateAccount();
        account.setAlias("kalakala").setUserName("wokalakala").setPassWord("密码");

        ValidationUtil.ValidResult validResult = ValidationUtil.validateBean(account);
        if (validResult.hasErrors()) {
            String errors = validResult.getErrors();
            System.out.println(errors);
        }
    }

    // @todo 直接调用有问题?? 会报空指针
    @Test
    public void validateUser2() throws IOException {

        HibernateAccount account = new HibernateAccount();
        account.setAlias("kalakala").setUserName("wokalakala").setPassWord("密码");

        String validator = BeanValidator.validator(account);
        System.out.println(validator);
    }

}
