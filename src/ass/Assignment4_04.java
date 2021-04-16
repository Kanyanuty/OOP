
/* Id   :   63-060216-2109-0
 * Name :   Oranong Boonpipat
 * Room :   1 RB
 * File Name :  Assignment4_04.java
 */ 

/* Id   :   63-060216-2109-0
 * Name :   Oranong Boonpipat
 * Room :   1 RB
 * File Name :  Assignment4_04.java
 */

import java.util.Scanner;

class Asm4_4 {

    public static void main(String[] args) {
        new Asm4_4().MainMenu();
    }
    
    
    void MainMenu() {
        
        String  strMenu =   ("::\tMain Menu\t::\n") +
                            ("==========================\n") +
                            (" 1. Circle\n") +
                            (" 2. Rectangle\n") +
                            (" 3. Triangle\n") +
                            (" 4. Exit\n");
        int choice, radius, width, length, height, base;
        
        Scanner scan = new Scanner(System.in); 
        Asm4_4 calc = new Asm4_4();
        
        while (true) {
            System.out.print(strMenu + "Enter Choice : ");
            choice = scan.nextInt();
                        
            while (choice < 1 || choice > 4) {
                System.out.print("Input menu number incorrectly, try again! : ");
                choice = scan.nextInt();
            }
            
            switch(choice) {

                case 1 :
                    System.out.print("\nEnter radius : ");
                    radius = scan.nextInt();
                    calc.Area(radius);
                    break;
                case 2 :
                    System.out.print("\nEnter width : ");
                    width = scan.nextInt();
                    System.out.print("Enter length : ");
                    length = scan.nextInt();
                    calc.Area(width, length);
                    break;
                case 3 :
                    System.out.print("\nEnter base : ");
                    base = scan.nextInt();
                    System.out.print("Enter height : ");
                    height = scan.nextInt();
                    calc.Area(base, height);
                    break;
                case 4 :
                    System.out.println("Exit program...");
                    System.exit(0);
                    break;
            }
            
            System.out.println();
        }      
    }
    
    static String str;
    
    void Area(int circle) {
        str = "Calculate area of circle.\n" +
              "Radius of Circle = " + circle + "\n" +
              "Area of Circle = " + (Float)(0f + (circle*circle) * (22/7));
        System.out.println(str);    
    }
    
    void Area(int width, int length) {
        str = "Calculate area of rectangle.\n" +
                    "Width of Rectangle = " + width + "\n" +
                    "Length of Rectangle = " + length + "\n" +
                    "Area of Rectangle = " + (Float)(0f + width * length);
        System.out.println(str);
    }
    
    void Area(long base, long height) {
        str = "Calculate area of triangle.\n" +
                    "Base of triangle = " + base + "\n" +
                    "Height of triangle = " + height + "\n" +
                    "Area of triangle = " + (Float)(0.5f * (base * height));
        System.out.println(str);
    }
}
