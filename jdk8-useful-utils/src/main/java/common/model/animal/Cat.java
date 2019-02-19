package common.model.animal;

import cn.hutool.core.lang.Console;

public class Cat implements IAnimal{

    @Override
    public void eat() {
        Console.log("猫吃鱼");
    }

}
