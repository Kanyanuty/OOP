package week6method;

import javax.swing.JOptionPane;
public class Lab5_3 {
    public static void main(String[] args) {
        
      num();  
      System.exit( 0 ); // terminate application  
        
    }
    public static void num(){
        String s1, s2;
        int value,number1,number2;
        String output = "";
        
        s1 = JOptionPane.showInputDialog("Enter first value" );

        s2 = JOptionPane.showInputDialog("Enter second value" );

        number1 = Integer.parseInt(s1);
        number2 = Integer.parseInt(s2);
        // loop 20 times
        for ( int counter = 1; counter <= 20; counter++ ) {
            // pick random integer between 1 and 6
            value = (int)(Math.random()*(number2-number1+1)+number1);
            output += value + " "; // append value to output
            // if counter divisible by 5, append newline to String output
            if ( counter % 5 == 0 )
                output += "\n";
        } // end for
        JOptionPane.showMessageDialog( null, output,"20 Random Numbers from " + number1 + " to " + number2 ,JOptionPane.INFORMATION_MESSAGE );
        
    }
}
