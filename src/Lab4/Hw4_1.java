package Lab4;

import java.util.Scanner;
public class Hw4_1 {
    int score;
    String grade;

    public Hw4_1(int score){
        if ((score >= 0) && (score <= 100)) {
            String grade;

            if (score >= 80) grade = "A";
            else if (score >= 75) grade = "B+";
            else if (score >= 70) grade = "B";
            else if (score >= 65) grade = "C+";
            else if (score >= 60) grade = "C";
            else if (score >= 55) grade = "D+";
            else if (score >= 50) grade = "D";
            else grade = "F";
           
        }
        else {
            System.out.println("Invalid student score.");
        }
    }
    public static void main(String[] args) {
        int sc;
        String grade;
        Scanner scan = new Scanner(System.in);

        System.out.println("Program Calculate grade.");
        System.out.println("Enter student score : ");
        sc = scan.nextInt();

        Hw4_1 s = new Hw4_1(sc);
        //System.out.println("Student gradde is " + grade );
        System.out.println("End Program.");
    }
}
