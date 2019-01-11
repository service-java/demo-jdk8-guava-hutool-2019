package __deprecated.lab.lab1;

/*
 * 骆金?
 * Java programming Autumn 2016
 * Lab 6-1 person?
 */

public class Person {
    // 父类属?? 供继?
    private String name;
    private String address;
    private String phoneNum;
    private String email;

    // 有参构?函?
    Person(String name, String address, String phoneNum, String email) {
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
        this.email = email;
    }

    // 获取名字，供子类继承
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person?: " + this.name;
    }

    public String getInfo() {
        return name + address + phoneNum + email;
    }
}










