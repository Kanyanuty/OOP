package Lab4;

import java.util.Scanner;
public class Test5_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String x ="M",y;

        System.out.println("Welcome to the Game");
        do{
            System.out.print("Ente your Charector : ");
            y = scan.nextLine();
        }while(!y.equals(x));
    }
}
