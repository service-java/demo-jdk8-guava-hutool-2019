package _ch1_lab.lab1;
/*
 * 骆金?
 * Java programming Autumn 2016
 * Lab 6-1 Employee?  继承Person?
 */

public class Employee extends Person {
    private String officeRoom;
    private int salary;
    private MyDate apptDate = new MyDate(); // 受聘日期

    Employee(String name, String address, String phoneNum, String email,
             String officeRoom, int salary, MyDate apptDate) {
        super(name, address, phoneNum, email);
        this.officeRoom = officeRoom;
        this.salary = salary;
        this.apptDate = apptDate;
    }

    public String getApptDate() {
        return apptDate.getYear() + "?"
                + apptDate.getMonth() + "?"
                + apptDate.getDay() + "?";
    }

    @Override
    public String toString() {
        return "Employee类： " + this.getName();
    }

    public String getInfo() {
        return officeRoom + salary;
    }
}
