package _hutools;

import cn.hutool.core.bean.DynaBean;
import cn.hutool.core.lang.Console;
import model.User;

public class BeanUtil {

    public static void main(String[] args) {

        User user = new User();
        user.setAge(10).setName("小花");
        Console.log(user);

        DynaBean bean = DynaBean.create(user);
        Console.log(bean);

        bean.set("name", "李华");
        bean.set("age", 12);

        String name = bean.get("name");//输出“李华”
        Console.log(name);

        bean.invoke("testMethod");

    }

}
