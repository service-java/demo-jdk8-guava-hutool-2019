package com.bee.sample.ch12.conf;

import java.io.UnsupportedEncodingException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.listener.PatternTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;

@Configuration
public class RedisChannelListenerConf {


    @Bean
    MessageListenerAdapter listenerAdapter() {
        MessageListenerAdapter adapter = new MessageListenerAdapter(new MyRedisChannelListener());
        adapter.setSerializer(new JdkSerializationRedisSerializer());
        return adapter;

    }

    @Bean
    RedisMessageListenerContainer container(RedisConnectionFactory connectionFactory,
                                            MessageListenerAdapter listenerAdapter) {
        RedisMessageListenerContainer container = new RedisMessageListenerContainer();
        container.setConnectionFactory(connectionFactory);
        //订阅所有news.* 频道内容
        container.addMessageListener(listenerAdapter, new PatternTopic("news.*"));
        return container;
    }
}

class MyRedisChannelListener implements MessageListener {

    public void onMessage(Message message, byte[] pattern) {
        byte[] channal = message.getChannel();
        byte[] bs = message.getBody();
        try {
            String content = new String(bs, "UTF-8");
            String p = new String(channal, "UTF-8");
            System.out.println("get " + content + " from " + p);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

}
