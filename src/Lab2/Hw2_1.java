package Lab2;

import java.util.Scanner;
public class Hw2_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double c,f;
        System.out.print("Enter Celsius : ");
        c = scan.nextDouble();
        f = c * 1.8 + 32 ;
        System.out.print("Your Fahrenheit : " + f);
    }
}
