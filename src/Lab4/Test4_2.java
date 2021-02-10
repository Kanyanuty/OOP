package Lab4;

import java.util.Scanner;
public class Test4_2 {
    public static void main(String[] args) {
        long num = 0;
        long odd = 0;
        long even = 0;
        long zero = 0;
        long checknum;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive number : ");
        num = scan.nextLong();

        while(num > 0){
            checknum = num % 10;
            if(checknum % 2 == 0 && checknum > 0){
                even++;
            }
            else if (checknum % 2 != 0 && checknum > 0){
                odd++;
            }
            else if(checknum == 0){
                zero++;
            }
            num = num / 10;
        }

        System.out.println("Odd digit : " + odd);
        System.out.println("Even digit : " + even);
        System.out.println("Zero digit : " + zero);
    }
}
