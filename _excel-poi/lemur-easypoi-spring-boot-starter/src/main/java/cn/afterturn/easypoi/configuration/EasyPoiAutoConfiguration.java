package cn.afterturn.easypoi.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.BeanNameViewResolver;

/**
 * Created by xfworld on 2017-11-22.
 **/
@Configuration
//@AutoConfigureAfter(WebMvcAutoConfiguration.class)
@EnableConfigurationProperties(EasyPoiProperties.class)
//@ConditionalOnClass
//easy.poi.base.enable 不存在默认为true，若存在==true则创建，否则==false不创建
@ConditionalOnProperty(prefix = "easy.poi.base", name = "enable", matchIfMissing = true)
@ComponentScan(basePackages = {"cn.afterturn.easypoi.view"})
public class EasyPoiAutoConfiguration {


    @Autowired
    private EasyPoiProperties easyPoiProperties;


    /**
     * 通过 order 属性来定义视图解析器的优先级, order 值越小优先级越高
     * @return resolver 视图跳转
     */
    @Bean
    public BeanNameViewResolver beanNameViewResolver() {
        BeanNameViewResolver resolver = new BeanNameViewResolver();
        resolver.setOrder(10);
        return resolver;
    }


}
