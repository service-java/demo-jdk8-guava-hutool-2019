package _hutools;

import cn.hutool.core.bean.DynaBean;
import cn.hutool.core.lang.Console;
import model.User;
import org.junit.Test;

public class BeanUtilDemo {

    public static void main(String[] args) {

        User user = new User();
        user.setAge(10).setName("小花");
        Console.log(user);

        @Deprecated
        DynaBean bean = DynaBean.create(user);
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
        User user = new User();
        user.setAge(10).setName("小花");
        Console.log(user);

        @Deprecated
        DynaBean bean = DynaBean.create(user);
        Console.log(bean);
//        Console.log(bean instanceof Object);

        bean.set("name", "李华");
        bean.set("age", 12);

        String name = bean.get("name");
        Console.log("{} name -> {}", bean, name);

        bean.invoke("testMethod");
    }
}
