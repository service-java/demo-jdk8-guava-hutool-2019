package _ch1_oop;

/**
 * 演示内部?
 *
 * @author Luo_0412
 */
public class OuterClass {
    InnerClass in = new InnerClass(); // 在外部类实例化内部类对象引用

    public void ouf() {
        in.inf(); // 在外部类方法中调用内部类方法
    }

    class InnerClass {
        int y = 0;

        InnerClass() {
        }

        public void inf() {
        }
    }

    public InnerClass doIt() {
        // y=4; //外部类不可以直接访问内部类成员变?
        in.y = 4;
        return new InnerClass(); // 返回内部类引?
    }

    public static void main(String args[]) {
        OuterClass out = new OuterClass();

        // 内部类的对象实例化操作必须在外部类或外部类中的非静?方法中实现
        OuterClass.InnerClass in = out.doIt();
        System.out.println(in);
    }
}
