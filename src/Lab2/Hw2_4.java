package Lab2;

import java.util.Scanner;
public class Hw2_4 {
    String message;
    float salary;

    public Hw2_4(float hours,float rate){
        message = "salary";
        //Calculate
        salary = (hours <= 40) ? (hours*rate) :
        (rate * (1.5f * hours - 20));
    }

    public static void main(String[] args) {
        float h,r;
        //Input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter hours work : ");
        h = scan.nextFloat();
        System.out.print("Enter hourly rate : ");
        r = scan.nextFloat();

        Hw2_4 hr = new Hw2_4(h, r);
        //Output
        System.out.print("Calculate Salary " + hr.message);
        System.out.println(" = " + hr.salary);
    }
}
