package Lab4;

import java.util.Scanner;

public class Test4_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number, sum;

        System.out.print("Enter positive number : ");
        number = scan.nextInt();
        if (number == 0 || number == 1) {
            System.out.print("Number " + number + " is not prime number.");
        } else {
            sum = number / 2;
            boolean x = true;
            for (int i = 2; i < sum; i++) {
                if (number % i == 0) {
                    System.out.print("Number " + number + " is not prime number.");
                    x = false;
                    break;
                }
            }
            if( x ){
                System.out.print("Number " + number + " is prime number." );
            }
        }
    }
}
