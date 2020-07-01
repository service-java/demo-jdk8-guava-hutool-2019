package _hutool;

import cn.hutool.core.bean.DynaBean;
import cn.hutool.core.lang.Console;
import entity.classic.UserEntity;
import org.junit.Test;

public class BeanUtilDemo {

    public static void main(String[] args) {

        UserEntity userEntity = new UserEntity();
        userEntity.setAge(10).setName("小花");
        Console.log(userEntity);

        @Deprecated
        DynaBean bean = DynaBean.create(userEntity);
        Console.log(bean);
//        Console.log(bean instanceof Object);

        bean.set("name", "李华");
        bean.set("age", 12);

        String name = bean.get("name");
        Console.log("{} name -> {}", bean, name);

        bean.invoke("testMethod");

    }

    @Test
    public void hun() {
        UserEntity userEntity = new UserEntity();
        userEntity.setAge(10).setName("小花");
        Console.log(userEntity);

        @Deprecated
        DynaBean bean = DynaBean.create(userEntity);
        Console.log(bean);
//        Console.log(bean instanceof Object);

        bean.set("name", "李华");
        bean.set("age", 12);

        String name = bean.get("name");
        Console.log("{} name -> {}", bean, name);

        bean.invoke("testMethod");
    }
}
