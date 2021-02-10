package week4;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
public class Hw3_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int last;
        System.out.print("Enter Your Number(only:28,29,30,31):  ");
        last = scan.nextInt();

        if(last == 28 ){
            System.out.println("|-------------------------------|");
            System.out.println("|\tA month with 28 days.\t|");
            System.out.println("|-------------------------------|");
            System.out.println("|\t February has 28 days.\t|");
            System.out.println("|-------------------------------|");
        }
        else if(last == 29 ){
            System.out.println("|-------------------------------|");
            System.out.println("|\tA month with 29 days.\t|");
            System.out.println("|-------------------------------|");
            System.out.println("|\t February has 29 days.\t|");
            System.out.println("|-------------------------------|");
        }
        else if(last == 30){
            System.out.println("|-------------------------------|");
            System.out.println("|\tA month with 30 days.\t|");
            System.out.println("|-------------------------------|");
            System.out.println("|\t April has 30 days.\t|");
            System.out.println("|\t June has 30 days.\t|");
            System.out.println("|\t September has 30 days.\t|");
            System.out.println("|\t November has 30 days.\t|");
            System.out.println("|-------------------------------|");
        }
        else if(last == 31){
            System.out.println("|-------------------------------|");
            System.out.println("|\tA month with 31 days.\t|");
            System.out.println("|-------------------------------|");
            System.out.println("|\t January has 31 days.\t|");
            System.out.println("|\t March has 31 days.\t|");
            System.out.println("|\t May has 31 days.\t|");
            System.out.println("|\t July has 31 days.\t|");
            System.out.println("|\t August has 31 days.\t|");
            System.out.println("|\t October has 31 days.\t|");
            System.out.println("|\t December has 31 days.\t|");
            System.out.println("|-------------------------------|");
        }
        else{
            System.out.println("|---------------------------------------------------------------|");
            System.out.println("|\tError,Cannot be displayed Invalid information provided\t|");
            System.out.println("|---------------------------------------------------------------|");

        }
    }
}
