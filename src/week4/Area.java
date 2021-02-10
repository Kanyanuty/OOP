package week4;

import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        float width,length,base,height,area;
        int num;
        Scanner scan = new Scanner(System.in);

        System.out.println("1.Rectangle");
        System.out.println("2.Triangle");
        System.out.print("Enter your number :");
        num = scan.nextInt();

        switch(num){
            case 1 :
                System.out.print("Enter width = ");
                width = scan.nextFloat();
                System.out.print("Enter length = ");
                length = scan.nextFloat();
                area = width * length;
                System.out.print("Rectangle Area = " + area);
                break;
            case 2 :
                System.out.print("Enter base = ");
                base = scan.nextFloat();
                System.out.print("Enter height = ");
                height = scan.nextFloat();
                area = (base * height)/2  ;
                System.out.print("Triangle Area = " + area);
                break;
            default :
                System.out.print("Error");
        }
    }
}
