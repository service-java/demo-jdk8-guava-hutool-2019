package com.bee.sample.ch4.config;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.beetl.core.GroupTemplate;
import org.beetl.core.Tag;
import org.beetl.core.TagFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.bee.sample.ch4.util.beetl.SimpleFunction;
import com.bee.sample.ch4.util.beetl.SimpleTag;

@Configuration
public class BeetlExtConfig {

    @Autowired
    GroupTemplate groupTemplate;

    @Autowired
    ApplicationContext applicationContext;

    @PostConstruct
    public void config() {
        Map<String, Object> shared = new HashMap<>();
        shared.put("jsVersion", System.currentTimeMillis());
        groupTemplate.registerFunction("hi", applicationContext.getBean(SimpleFunction.class));
        groupTemplate.registerTagFactory("myTag", new TagFactory() {
            public Tag createTag() {
                return applicationContext.getBean(SimpleTag.class);
            }
        });

        URL url = BeetlExtConfig.class.getResource("/templates/functions");
        System.out.print("==================" + url);
    }

//		@Bean /*另外一种配置方法，实现BeetlTemplateCustomize*/
//	  public BeetlTemplateCustomize beetlTemplateCustomize(){
//	    return new BeetlTemplateCustomize(){
//	      public void customize(GroupTemplate groupTemplate){
//
//	      }
//	    };
//	  }

}
