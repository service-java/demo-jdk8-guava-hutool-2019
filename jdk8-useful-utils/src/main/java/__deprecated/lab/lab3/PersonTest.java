package __deprecated.lab.lab3;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("明日科技", "?", 11);
        System.out.println("员工1的信?");
        System.out.print("姓名?" + person1.getName() + " ");
        System.out.print("性别?" + person1.getGender() + " ");
        System.out.println("年龄?" + person1.getAge() + " ");
        System.out.println("员工2的信?");
        System.out.print("姓名?" + person2.getName() + " ");
        System.out.print("性别?" + person2.getGender() + " ");
        System.out.print("年龄?" + person2.getAge() + " ");
    }
}
