package grammar;

import java.util.Scanner;
//import java.text.DecimalFormat;

/**
 * 计算利率
 *
 * @author Luo_0412
 */
public class FutureInvestmentValue {

    private static Scanner kb;

    public static void main(String[] args) {
        // 声名变量
        double investment = 1.0;
        double annualRate = 1.0;
        int years = 1;
        double futureInvestment = 1.0;
        double monthlyRate = 1.0;

        // 输入本金，年利率，年限
        System.out.print("Enter investment amount:");
        investment = kb.nextDouble();

        System.out.print("Enter yearinterest rate:");
        annualRate = kb.nextDouble();
        monthlyRate = annualRate / 1200;

        System.out.print("Enter number of  years:");
        years = kb.nextInt();

        // 计算回报
        futureInvestment = investment * Math.pow((1 + monthlyRate),
                12 * years);

        // 输出投资回报
//		DecimalFormat df = new DecimalFormat( "0.00");   
//	    System.out.println("Accumulated value is "+df.format(futureInvestment));
        System.out.println("Accumulated value is " + (String.format("%.2f", futureInvestment)));
    }

}
