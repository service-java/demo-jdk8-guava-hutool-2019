package _lab.lab2;

/*
 * < 骆金? >
 * Java programing Autumn 2016
 * Lab 5-1
 *
 */


import java.util.Date;

public class Account {
    // 私有属??
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated = new Date(System.currentTimeMillis());
    // 直接创建Date对象就是当前时间
    // 获取当前日期

    // 两个构?函?
    public Account() {
        id = 0;
        balance = 0D;
        annualInterestRate = 0D;
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }


    // 公用访问器和修改?
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    // 获取月利?
    public double getMonthlyInterestRate() {
        return this.annualInterestRate / 12;
    }

    // 存取?
    public double deposit(double x) {
        balance = balance + x; // 貌似要这样一下，不能直接return
        return balance;
    }

    public double withDraw(double x) {
        balance = balance - x;
        return balance;
    }

}
