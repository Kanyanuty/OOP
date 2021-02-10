package Lab4;

import java.util.Scanner;

public class Test5_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 13, player = 1, y = 0;

        while (num > 0) {
            do {
                System.out.print("Player " + player + " Input number 1,2 or 3 : ");
                y = scan.nextInt();
                if ((y > 3 || y <= 0) || y > num) {
                    System.out.println("Error,Input again plz");
                } else {
                    num -= y;
                    System.out.println(num + " Stone left");
                    if (player == 1) {
                        player = 2;
                    } else {
                        player = 1;
                    }
                }
            } while (!(y < 3 || y >= 0));
        }
        if (player == 1) {
            player = 2;
        } else {
            player = 1;
        }
        System.out.println("The Winner is player " + player);
    }
}
