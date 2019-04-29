package com.bee.sample.ch17.conf;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class MessageCenterHealthIndicator implements HealthIndicator {

    public MessageCenterHealthIndicator() {
    }

    @Override
    public Health health() {

        int errorCode = check(); //
        if (errorCode != 0) {
            return Health.down().withDetail("Message", "error " + errorCode).build();
        }
        return Health.up().build();
    }

    protected int check() {
        // 模拟返回一个错误状态
        return 1;
    }
}
