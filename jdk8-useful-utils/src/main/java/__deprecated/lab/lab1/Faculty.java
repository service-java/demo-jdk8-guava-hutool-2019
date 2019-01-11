package __deprecated.lab.lab1;

/*
 * 骆金?
 * Java programming Autumn 2016
 * Lab 6-1 Faculty?  继承Employee?
 */

public class Faculty extends Employee {
    private String officeHour;
    private String rank;

    Faculty(String name, String address, String phoneNum, String email,
            String officeRoom, int salary, MyDate apptDate,
            String officeHour, String rank) {

        super(name, address, phoneNum, email,
                officeRoom, salary, apptDate);

        this.officeHour = officeHour;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty? " + this.getName();
    }

    public String getInfo() {
        return officeHour + rank;
    }
}
