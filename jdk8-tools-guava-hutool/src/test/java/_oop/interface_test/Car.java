package _oop.interface_test;

public abstract class Car {
    public abstract String getInfo();
    // 只声名方法不去实?  不能实例?
    // 声名的方法子类必须重?
    // 子类不能实现抽象父类的所有方? 也要abstract
}

class Benz extends Car {

    @Override
    public String getInfo() {
        return "Benz";
    }

}

class BMW extends Car {

    @Override
    public String getInfo() {
        return "BMW";
    }

}
