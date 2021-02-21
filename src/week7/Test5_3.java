package week7;

import javax.swing.JOptionPane;
public class Test5_3 {
    public static void main(String[] args) {
        int number;

        char p = printChar(number);
        String output = " "  ;
        JOptionPane.showMessageDialog( null, output,"Histogram", JOptionPane.INFORMATION_MESSAGE );
        System.exit(0);

    }
    public static String printChar() {
        int num;
        String s1;
        do{
            s1 = JOptionPane.showInputDialog("Enter number :" );
            num = Integer.parseInt(s1);
        }while(n != -1);
        
    }
}
