package __deprecated.lab.lab1;

/*
 * 骆金?
 * Java programming Autumn 2016
 * Lab 6-1 person的测试程?
 */

public class PersonTest {

    public static void main(String[] args) {
        // 定义对象
        MyDate myDate = new MyDate(); // 声名受聘日期对象
        Person person = new Person("叶凡", "葬帝?", "123", "123@qq.com");
        Student stu = new Student("狠人", "葬帝?", "123", "123@qq.com");
        Employee emp = new Employee("无始", "葬帝?", "123", "123@qq.com",
                "6-101", 2000, myDate);
        Faculty faculty = new Faculty("叶凡", "葬帝?", "123", "123@qq.com",
                "6-101", 8000, myDate,
                "6:00-18:00", "天帝");
        Staff staff = new Staff("无始", "葬帝?", "123", "123@qq.com",
                "6-101", 7000, myDate,
                "无始大帝");

        // 输出toString
        System.out.println(person.toString());
        System.out.println(stu.toString());
        System.out.println(emp.toString());
        System.out.println(faculty.toString());
        System.out.println(faculty.getName() + "的受聘日期： "
                + faculty.getApptDate()); // 获取受聘日期
        System.out.println(staff.toString());
    }

}
