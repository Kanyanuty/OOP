package week7;

import javax.swing.JOptionPane;
public class Test5_1 {
    public static void main(String[] args) {
        int num;
        String s1;

        s1 = JOptionPane.showInputDialog("Enter number of score :" );
        num = Integer.parseInt(s1);
        int score = getScore(num);
        float average = average(num,score);
        
        String output = "Average scoer is " + average ;
        JOptionPane.showMessageDialog( null, output,"average", JOptionPane.INFORMATION_MESSAGE );
        System.exit(0);
    }
    public static int getScore(int n) {
        int sum = 0;
        String s2;
        for(int i = 1;i<=n;i++){
            s2 = JOptionPane.showInputDialog("Enter score "+ i +":" );
            sum +=  Integer.parseInt(s2);       
        }
        return(sum); 
    }
    public static float average(float n,float s) {
        float total;
        total = s/n;
        return(total);
    }
}
