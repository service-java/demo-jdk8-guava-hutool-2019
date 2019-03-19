package com.example.demo.actuator;

import com.example.demo.service.AyUserService;

import org.springframework.boot.actuate.endpoint.ExposableEndpoint;
import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 描述：自定义端点
 * @author  Ay
 * @date    2017/12/9.
 */
@ConfigurationProperties(prefix = "endpoints.userEndPoints")
public class AyUserEndPoint extends ExposableEndpoint<Map<String,Object>> {

    @Resource
    private AyUserService ayUserService;

    public AyUserEndPoint() {
        super("userEndPoints");
    }

    @Override
    public Map<String, Object> invoke() {
        Map<String, Object> map = new HashMap<String, Object>();
        //当前时间
        map.put("current_time",new Date());
        //用户总数量
        map.put("user_num",ayUserService.findUserTotalNum());
        return map;
    }
}
