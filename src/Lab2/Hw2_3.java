package Lab2;

import java.util.Scanner;
public class Hw2_3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter Number : ");
        String n = num.nextLine();

        System.out.print(n.substring(0,1) + " " + n.substring(1,2) + " " + n.substring(2,3) + " " + n.substring(3));
    }
}
