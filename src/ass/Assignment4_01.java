
/* Id   :   63-060216-2109-0
 * Name :   Oranong Boonpipat
 * Room :   1 RB
 * File Name :  Assignment4_01.java
 */ 

import java.util.Scanner;
import java.text.DecimalFormat;

public class Assignment4_01 {

    public static void main(String[] args) {

        
        float rate = 0.0f,amount,income = 0.0f;

        Scanner scan = new Scanner(System.in);
        DecimalFormat fm = new DecimalFormat("#,###,##0.00");

        while(true) {

            System.out.print("Enter your income( < 0 - exit) : ");
            income = scan.nextFloat();

            
            if (income < 0) break;
            else if (income <= 150000 )  rate = 0f;
            else if (income <= 300000)   rate = 2.5f;
            else if (income <= 500000)   rate = 4.0f;
            else if (income <= 800000)   rate = 5.5f;
            else if (income <= 1000000)  rate = 7.5f;
            else                         rate = 10.0f;

            System.out.println("Net Income : " + fm.format(income));
            System.out.println("Tax Rate(%) : " + rate + "%");

            amount = income * (rate / 100);
            System.out.println("Amount Tax : " + fm.format(amount) );
            System.out.println(" ");
        
        } 

        System.out.println("Exit Program...");
        System.exit(0);

    }
}