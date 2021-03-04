package Lab4;

import java.util.Scanner;
public class Test4_1 {
    public static void main(String[] args) {
        final int PER_LINE = 5 ;
        int fnumber,lnumber,divide = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter start number : ");
        fnumber = scan.nextInt();
        System.out.print("Enter end number : ");
        lnumber = scan.nextInt();

        System.out.println();
        int i = 0;
        for(i = fnumber;i <= lnumber;i++){
            if((i % 3 == 0 )&&( i % 5 == 0)){
                System.out.print( i +"\t");
                divide++;
                if(divide % PER_LINE == 0)
                    System.out.println();
            }
        }
    }
}
