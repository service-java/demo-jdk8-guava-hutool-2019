package __deprecated.lab.lab1;

/*
 * 骆金?
 * Java programming Autumn 2016
 * Lab 6-1 Staff?  继承Employee?
 */

public class Staff extends Employee {
    private String postTitle; // 职务称号

    Staff(String name, String address, String phoneNum, String email,
          String officeRoom, int salary, MyDate apptDate, String postTitle) {
        super(name, address, phoneNum, email, officeRoom, salary, apptDate);
        this.postTitle = postTitle;
    }

    @Override
    public String toString() {
        return "Staff?: " + this.getName();
    }

    public String getInfo() {
        return postTitle;
    }
}
