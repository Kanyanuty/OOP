package Lab4;

import java.util.Scanner;
public class Test5_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float n,r,result;

        System.out.print("Input Number of ball : ");
        n = scan.nextFloat();
        result = n;
        System.out.print("Pick up the Ball : ");
        r = scan.nextFloat();

        for(float i = 1;i < r;i++){
            result*=(n-i)/(i+1); 
        }
        System.out.println("Chance to Win " + result);
    }
    

    
}
