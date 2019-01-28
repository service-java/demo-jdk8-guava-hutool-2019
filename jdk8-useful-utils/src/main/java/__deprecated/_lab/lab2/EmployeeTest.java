/*
 *  Authur: 骆金?
 *  Date  ? 2016-9-20
 *  Func  : 演示?
 */
package __deprecated._lab.lab2;
// import java.io.*;

public class EmployeeTest {

    public static void main(String args[]) {
        /* 使用构?器创建两个对象 */
        Employee empOne = new Employee("James Smith");
        Employee empTwo = new Employee("Mary Anne");

        // 调用这两个对象的成员方法
        empOne.empAge(26);
        empOne.empDesignation("Senior Software Engineer");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("Software Engineer");
        empTwo.empSalary(500);
        empTwo.printEmployee();
    }
}
