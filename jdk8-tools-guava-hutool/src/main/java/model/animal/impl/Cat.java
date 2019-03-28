package model.animal.impl;

import cn.hutool.core.lang.Console;
import model.animal.IAnimal;

public class Cat implements IAnimal {

    @Override
    public void eat() {
        Console.log("猫吃鱼");
    }

}
