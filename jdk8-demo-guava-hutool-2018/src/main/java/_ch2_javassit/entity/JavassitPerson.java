package _ch2_javassit.entity;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-11-01 20:33
 */
public class JavassitPerson {
    private String name = "xiaoming";

    public void setName(String var1) {
        this.name = var1;
    }

    public String getName() {
        return this.name;
    }

    public JavassitPerson() {
        this.name = "xiaohong";
    }

    public JavassitPerson(String var1) {
        this.name = var1;
    }

    public void printName() {
        System.out.println(this.name);
    }
}
