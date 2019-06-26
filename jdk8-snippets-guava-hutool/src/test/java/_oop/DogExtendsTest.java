package _oop;

/**
 * 演示继承
 *
 * @author Luo_0412
 */
class Animal {
    public void move() {
        System.out.println("动物可以摩擦摩擦");
    }
}

/**
 * Dog?
 *
 * @author Luo_0412
 */
class Dog extends Animal {
    @Override
    public void move() {
        super.move(); // 应用super类的方法, 会输?
        System.out.println("狗也是动?,狗还可以边跑边叫");
    }
}

/**
 * Dog的测试类
 *
 * @author Luo_0412
 */
public class DogExtendsTest {
    public static void main(String args[]) {
        Animal a = new Animal(); // Animal 对象
        Animal b = new Dog(); // Dog 对象

        a.move();
        b.move();
    }
}
