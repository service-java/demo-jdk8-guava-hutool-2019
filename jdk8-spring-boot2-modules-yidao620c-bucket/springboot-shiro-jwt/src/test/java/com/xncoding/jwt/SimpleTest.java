package com.xncoding.jwt;

import com.xncoding.jwt.common.util.JWTUtil;
import com.xncoding.jwt.shiro.ShiroKit;
import org.junit.Test;

/**
 * SimpleTest
 *
 * @author XiongNeng
 * @version 1.0
 * @since 2018/1/4
 */
public class SimpleTest {

    @Test
    public void testJwt() {
        // 用户名
        String username = "admin";

        //随机数
        String salt = ShiroKit.getRandomSalt(16);

        //原密码
        String password = "12345678";
        String encodedPassword = ShiroKit.md5(password, username + salt);
        System.out.println("随机数salt:" + salt);
        System.out.println("输入密码: " + password);
        System.out.println("加密后的密码:" + encodedPassword);

        // 生成token
        String token = JWTUtil.sign(username, encodedPassword);
        System.out.println("token=" + token);

        // 验证token
        boolean isVerified = JWTUtil.verify(token, username, encodedPassword);
        System.out.println(isVerified);

    }

}
