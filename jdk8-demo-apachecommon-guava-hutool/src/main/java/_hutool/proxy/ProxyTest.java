package _hutool.proxy;

import cn.hutool.aop.ProxyUtil;
import entity.animal.CatEntity;
import entity.animal.IAnimal;

public class ProxyTest {
    public static void main(String[] args) {

        IAnimal cat = ProxyUtil.proxy(new CatEntity(), TimeIntervalAspect.class);

        cat.eat();


    }
}
