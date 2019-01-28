package __deprecated._lab.lab2;

/*
 * < 骆金? >
 * Java programing Autumn 2016
 * Lab 5-1
 *
 */


public class AccountTest {

    public static void main(String[] args) {
        // 声名对象
        Account account = new Account(1112, 20000);

        // 设置年利?
        account.setAnnualInterestRate(4.5);

        // 存取?
        account.withDraw(2500);
        account.deposit(3000);

        // 输出余额，月利率，开户日?
        System.out.println(account.getBalance());
        System.out.println(account.getMonthlyInterestRate());
        System.out.println(account.getDateCreated());

    }

}
