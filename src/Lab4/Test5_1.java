package Lab4;

import java.util.Scanner;
public class Test5_1 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int n,x = 1;
       
       System.out.print("Enter Number : ");
       n = scan.nextInt();

       for(int i = 1;i <= n ;i++){
           x *= i;
            if(i==1){
                System.out.print(i);
            }
            else{
                System.out.print("*" + i );  
            }
           
       }
       System.out.print(" = "+ x);
    }
}
