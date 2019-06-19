package model.animal;

import cn.hutool.core.lang.Console;
import model.IAnimal;

public class Cat implements IAnimal {

    @Override
    public void eat() {
        Console.log("猫吃鱼");
    }

}
