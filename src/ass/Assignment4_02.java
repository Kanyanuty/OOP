

/* Id   :   63-060216-2109-0
 * Name :   Oranong Boonpipat
 * Room :   1 RB
 * File Name :  Assignment4_02.java
 */ 

import java.util.Scanner;

public class Assignment4_02 {
    
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        MainMenu();
    }
    
    
    static String MainMenu() {
        
        String choice = null,    
               Menu =   ("::\tMain Menu\t::\n") +
                        ("===========================\n") +
                        (" A. Get Integer Number\n") +
                        (" B. Summation of Digit\n") +
                        (" C. Print Reverse Number\n") +
                        (" D. Count Digit\n") +
                        (" E. Exit\n");
        Long number = 0L;
        
        while (true) {
        
            System.out.print(Menu);
            System.out.print("Enter Choice : ");
            choice = scan.next();
            choice = choice.toUpperCase();
            
            if (!choice.isBlank()) {
                if (!choice.isEmpty() && choice.length() == 1 && (choice.charAt(0) >= 'A' && choice.charAt(0) <= 'E')) {
                    
                    if (choice.equals("A"))      number = GetNumber();
                    else if (choice.equals("B")) SumDigit(number);
                    else if (choice.equals("C")) Reverse(number);
                    else if (choice.equals("D")) CountDigit(number);
                    else if (choice.equals("E")) {
                        System.out.println("Exit Program...");
                        System.exit(0);
                    }
                    
                } else {
                    System.out.println("Input entered is not in the choice, Try again!");
                }
            } else {
                System.out.println("Input is blank, Try again!");
            }
            
            System.out.println();
        }

    }
    
    
    static Long GetNumber() {
        System.out.print("Enter long number : ");
        return scan.nextLong();
    }
    
    
    static void SumDigit(long number) {
        String strNum = Long.toString(number);
        int sum = 0;
        
        for (int i = 0; i < strNum.length(); i++) {
              sum += Character.getNumericValue(strNum.charAt(i));
        }
        
        System.out.println("Your enter number : " + number);        
        System.out.println("Summation of digit : " + sum);
    }


    static void Reverse(long number) {
        String strNum = Long.toString(number),
               reverse = "";
        // "0123" >> "3210"
        for (int i = strNum.length()-1; i >= 0; i--) {
            reverse += strNum.charAt(i);
        }
        System.out.println("Your enter number : " + number);        
        System.out.println("Reverse number : " + reverse);    
    }
    
    
    static void CountDigit(long number) {
        System.out.println("Your enter number : " + number);        
        System.out.println("This number has " + Long.toString(number).length() + " digits.");    
    }


}
