package week4;

import java.util.Scanner;
public class Hw3_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String  FirstName , LastName;
        double salary = 0,discount = 0,bonus=0,total=0,year=0;

        System.out.print("Enter your FirstName : ");
        FirstName = scan.nextLine();
        System.out.print("Enter your LastName : ");
        LastName = scan.nextLine();
        System.out.print("Enter your Salary : ");
        salary = scan.nextDouble();
        
        //Process Salary
        if(salary < 0){
            System.out.println("Error,Try again later ");
        }
        else if(salary <= 15000){
            System.out.println("Sorry,You didn't get a Bonus");
            total = salary;
        }
        else if(salary <= 20000){
            year = salary*12;
            bonus = year*7/100;
            total = year + bonus;
            discount = 7;
        }
        else if(salary <= 30000){
            year = salary*12;
            bonus = year*10/100;
            total = year + bonus;
            discount = 10;
        }
        else if(salary <= 40000){
            year = salary*12;
            bonus = year*12/100;
            total = year + bonus;
            discount = 12;
        }
        else if(salary <= 60000){
            year = salary*12;
            bonus = year*13/100;
            total = year + bonus;
            discount = 13;
        }
        else if(salary <= 70000){
            year = salary*12;
            bonus = year*14/100;
            total = year + bonus;
            discount = 14;
        }
        else{
            year = salary*12;
            bonus = year*15/100;
            total = year + bonus;
            discount = 15;
        }

        System.out.println("|***************************************|");
        System.out.println("|\tYour Bonus this Year\t\t|");
        System.out.println("|***************************************|");
        System.out.println("|   First Name \t\t: " + FirstName + "\t|");
        System.out.println("|   Last Name \t\t: " + LastName + " \t|");
        System.out.println("|   Your Salary \t: " + salary + "\t|");
        System.out.println("|   Percent bonus(%) \t: " + discount + " % \t|" );
        System.out.println("|   Your Bonus \t\t: " + bonus + "\t|");
        System.out.println("|   Total  \t\t: " + total + "\t|" );
        System.out.println("|***************************************|");
    }
}
