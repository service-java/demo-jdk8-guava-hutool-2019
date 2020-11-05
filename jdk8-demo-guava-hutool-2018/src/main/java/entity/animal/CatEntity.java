package entity.animal;

import cn.hutool.core.lang.Console;

public class CatEntity implements IAnimal {

    @Override
    public void eat() {
        Console.log("猫吃鱼");
    }

}
