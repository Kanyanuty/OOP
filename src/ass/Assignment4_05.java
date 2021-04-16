

/* Id   :   63-060216-2109-0
 * Name :   Oranong Boonpipat
 * Room :   1 RB
 * File Name :  Assignment4_05.java
 */ 

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.util.Random;

public class Assignment4_05 {
    
    public static void main(String[] args) {
        new Assignment4_05().input();
    }
    
    
    void input() {
        int unitStd = Integer.parseInt(JOptionPane.showInputDialog("Enter number student : "));
        
        while (unitStd > 20) {
            JOptionPane.showMessageDialog(null, "Students must not exceed 20 people, try again!");
            unitStd = Integer.parseInt(JOptionPane.showInputDialog("Enter number student : "));
        }
        new Assignment4_05().random(unitStd);
    }
    
    
    void random(int unitStd) {
        int score[] = new int[4];
        int mid, fn, hw, total;
        
        String Table = "No\tMidterm\tFinat\tHomework\tTotal\tGrade\t\n";
        for (int i = 0; i < 65; i++) Table += "=";
        
        Assignment4_05 calcGPA = new Assignment4_05();
        JTextArea textArea = new JTextArea();
        Random rnd = new Random();
        
        textArea.append(Table);
        textArea.setEditable(false);
        
        for (int i = 0; i < unitStd; i++) {
            mid = rnd.nextInt(31);
            fn = rnd.nextInt(41);
            hw = rnd.nextInt(31);
            total = mid + fn + hw;
            textArea.append("\n " + (i+1) + "\t" + mid + "\t" + fn + "\t" + hw + "\t" + total + "\t" + ((mid + fn < 30) ? "F" : calcGPA.checkGrade(total)) + " ");
        }
        
        JOptionPane.showMessageDialog(null, textArea);
        
    }
    
    String checkGrade(int gpa) {
        String result = new String();
        if (gpa < 60)  result = "D";
        else if (gpa < 70)  result = "C";
        else if (gpa < 80)  result = "B";
        else if (gpa < 100) result = "A";
        return result;
    }
    
}
