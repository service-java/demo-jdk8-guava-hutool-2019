package com.example.demo.api;

import com.example.demo.domain.AyUser;

/**
 * 描述：用戶接口
 * @author  Ay
 * @date    2017/12/16.
 */
public interface AyUserDubboService {

    AyUser findByUserNameAndPassword(String name, String password);
}
