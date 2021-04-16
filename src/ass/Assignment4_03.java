

/* Id   :   63-060216-2109-0
 * Name :   Oranong Boonpipat
 * Room :   1 RB
 * File Name :  Assignment4_03.java
 */ 

import javax.swing.JOptionPane;

public class Assignment4_03 {
    
    public static void main(String[] args) {
    
        String strTimeStart, strTimeEnd;
        Assignment4_03 calc = new Assignment4_03();
        
        strTimeStart = JOptionPane.showInputDialog("Enter start time : ");
        strTimeEnd = JOptionPane.showInputDialog("Enter end time : ");
        
        while(strTimeStart.length() != 8 || strTimeEnd.length() != 8) {
            
            JOptionPane.showMessageDialog(null, "Input incorrect -> format = ##:##:##, Try again!");
            strTimeStart = JOptionPane.showInputDialog("Enter start time : ");
            strTimeEnd = JOptionPane.showInputDialog("Enter end time : ");
        
        }
        
        calc.Caltime(strTimeStart, strTimeEnd);
        
        System.exit(0);
    
    }
    
    void Caltime(String start, String end) {
        
        int start_hour, start_min, start_sec,
            end_hour, end_min, end_sec;
        
        start_hour = Integer.parseInt(start.substring(0, 2));
        start_min = Integer.parseInt(start.substring(3, 5));
        start_sec = Integer.parseInt(start.substring(6, 8));
        end_hour = Integer.parseInt(end.substring(0, 2));
        end_min = Integer.parseInt(end.substring(3, 5));
        end_sec = Integer.parseInt(end.substring(6, 8));
            
        JOptionPane.showMessageDialog(null, "Start Time : " + start + "\nEnd Time : " + end + 
                                            "\nTime used : " + (end_hour - start_hour) + " Hour  " + 
                                            (end_min - start_min) + " minutes  " + (end_sec - start_sec) + " seconds." );    
        
    }
    
}