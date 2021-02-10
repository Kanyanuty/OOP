package Lab2;

import java.util.Scanner;
public class Hw2_2 {
    public static void main(String[] args) {
        Scanner principal = new Scanner(System.in);
        System.out.print("Principal = ");
        double pr = principal.nextDouble();

        Scanner interate = new Scanner(System.in);
        System.out.print("Interate = ");
        double n = interate.nextDouble();
        //First year
        double d1 = (pr/100)*n;
        double y1 = pr+d1;
        //Second year
        double d2 = (y1/100)*n;
        double y2 = y1+d2;
        //Third year
        double d3 = (y2/100)*n;
        double y3 = y2+d3;
        //Fourth year
        double d4 = (y3/100)*n;
        double y4 = y3+d4;
        //Fifth year
        double d5 = (y4/100)*n;
        double y5 = y4+d5;

        System.out.println("Year 1 = "+ y1 + " bath");
        System.out.println("Year 2 = "+ y2 + " bath");
        System.out.println("Year 3 = "+ y3 + " bath");
        System.out.println("Year 4 = "+ y4 + " bath");
        System.out.println("Year 5 = "+ y5 + " bath");
    }
}
