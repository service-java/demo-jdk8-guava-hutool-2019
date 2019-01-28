package __deprecated._bai.interfacetest;

public abstract class Fruit {
    public String color; // 定义颜色成员变量

    // 定义构?方?
    public Fruit() {
        color = "绿色"; // 对变量color进行初始?
    }

    // 定义抽象方法
    public abstract void harvest(); // 收获的方?

}

class Apple extends Fruit {
    @Override
    public void harvest() {
        System.out.println("苹果已经收获?"); // 输出字符串?苹果已经收获！?
    }
}

class Orange extends Fruit {
    @Override
    public void harvest() {
        System.out.println("桔子已经收获?"); // 输出字符串?桔子已经收获！?
    }
}
