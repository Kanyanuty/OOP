package week4;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
public class Restaurant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int person,discount=0;
        float food,x = 0,fdiscount = 0,lastprice;

        System.out.print("Number of People : ");
        person = scan.nextInt();
        System.out.print("Food price : ");
        food = scan.nextFloat();
        if(person <=0){
            System.out.println("Try again later");
            //no person
        }
        else if(person <= 2){
            System.out.println(" Did'n get discount ");
            //<2person no discount
        }
        //discount    
        else if(person <= 5){
            x = (food*5)/100;
            fdiscount = food-x;
            discount = 5;
        }
        else if(person <= 10){
            x = (food*12)/100;
            fdiscount = food-x;
            discount = 12;
        }
        else if(person <= 14){
            x = (food*13)/100;
            fdiscount = food-x;
            discount = 13;
        }
        else if(person <= 17){
            x = (food*20)/100;
            fdiscount = food-x;
            discount = 20;
        }
        else if(person <= 20){
            x = (food*30)/100;
            fdiscount = food-x;
            discount = 30;
        }
        else if(person <= 22){
            x = (food*35)/100;
            fdiscount = food-x;
            discount = 35;
        }
        else{
            x = (food*40)/100;
            fdiscount = food-x;
            discount = 40;
        }
        //last price
        if(fdiscount == 0){
            lastprice = (food * 107 )/100 ;
        }
        else{
            lastprice = (fdiscount * 107 )/100 ;
        }
        
        System.out.println("Number People is " + person);
        System.out.println("Food Price is " + food);
        System.out.println("Discount is " + discount +" %");
        System.out.println("Price Discount is " + x);
        System.out.println("Food discount is " + fdiscount);
        System.out.println("Last Expenses is " + lastprice);

    }
}
