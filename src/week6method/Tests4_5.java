package week6method;

public class Tests4_5 {
    public static void main(String[] args)
    {
        int num = 10;
        System.out.print("This value " + num );
        System.out.println(" is " + CheckValue(num) + " number.");
    }
    public static String CheckValue(int number)
    {
        String message;
        if (number == 0) message = "Zero";
        else if(number < 0) message = "Negative";
        else message = "Positive";
        return message;
    }
}
