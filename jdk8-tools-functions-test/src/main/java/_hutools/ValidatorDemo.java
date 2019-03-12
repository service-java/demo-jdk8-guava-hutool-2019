package _hutools;


import cn.hutool.core.lang.Console;
import cn.hutool.core.lang.Validator;
import cn.hutool.core.util.IdcardUtil;

public class ValidatorDemo {
    public static void main(String[] args) {

        // 校验邮箱
        boolean isEmail = Validator.isEmail("loolly@gmail.com");
        boolean isEmail2 = Validator.isEmail("@gmail.com");
        boolean isEmail3 = Validator.isEmail("loolly@");
        boolean isEmail4 = Validator.isEmail("loolly@gmail");
        Console.log("是否邮箱 {} {} {} {}", isEmail, isEmail2, isEmail3, isEmail4);

        //
        // Validator.isByRegex("需要验证字段的正则表达式", "被验证内容");
        // Validator.validateChinese("我是一段zhongwen", "内容中包含非中文");

        Console.log("身份证是否合法 -> {} {} " ,
                IdcardUtil.isValidCard("330226199804121594"),
                IdcardUtil.isValidCard("330226199604121594"));

    }
}
