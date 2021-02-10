package week4;

import java.util.Scanner;
public class Hw3_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int distance = 0, Time = 0;
        double pay = 0,value = 0,Timeper = 0;

        System.out.print("Enter distance(km.) : ");
        distance = scan.nextInt();
        System.out.print("Enter time(hr.) : ");
        Time = scan.nextInt();

        //calculate
        if(distance <= 1 ){
            value = 35;
        }
        else if(distance <= 12){
            value = (distance * 5)+35;
        }
        else if(distance <= 20){
            value = (distance * 5.50)+35;
        }
        else if(distance <= 40){
            value = (distance * 6)+35;
        }
        else if(distance <=60){
            value = (distance * 6.50)+35;
        }
        else if(distance <= 80){
            value = (distance * 7.50)+35;
        }
        else{
            value = (distance * 8.50)+35;
        }
        Timeper = Time * 2;
        pay = value + Timeper;

        //Output
        System.out.println("Time is \t: " + Time +" \tHour");
        System.out.println("Distance is \t: " + distance + " \tKilometer");
        System.out.println("Time * 2 \t= " + Timeper + " \tbaht");
        System.out.println("value + Timeper = " + pay + " baht");
        System.out.println("to be paid \t: " + pay + " baht");
    }
}
