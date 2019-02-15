package __deprecated.lab.lab1;

/*
 * 骆金?
 * Java programming Autumn 2016
 * Lab 6-4 Student?  继承Person?
 */

public class Student extends Person {
    // 班级状?? 定义为常?
    // 能用  但不能被继承
    private final static int FRESHMAN = 1;
    private final static int SOPHOMORE = 2;
    private final static int JUNIOR = 3;
    private final static int SENIOR = 4;

    Student(String name, String address, String phoneNum, String email) {
        super(name, address, phoneNum, email);

    }

    @Override
    public String toString() {
        return "Student类： " + this.getName();
    }

    public String getInfo() {
        return FRESHMAN + " "
                + SOPHOMORE + " "
                + JUNIOR + " "
                + SENIOR;
    }
}
