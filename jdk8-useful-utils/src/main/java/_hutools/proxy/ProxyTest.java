package _hutools.proxy;

import cn.hutool.aop.ProxyUtil;
import common.model.animal.Cat;
import common.model.animal.IAnimal;

public class ProxyTest {
    public static void main(String[] args) {

        IAnimal cat = ProxyUtil.proxy(new Cat(), TimeIntervalAspect.class);
        cat.eat();
        cat.eat();
        cat.eat();

    }
}
