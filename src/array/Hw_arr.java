package array;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Dimension;
public class Hw_arr {
    public static void main(String[] args) {
        int [] Classroom = new int[40];
        int [] Homework = new int[40];
        int [] Assignment = new int[40];
        int [] Midterm = new int[40];
        int [] Final = new int[40];
        int [] studen = new int[40];
        String [] grade = new String[40];
        
        for(int i=0 ;i<40; i++){
            Classroom[i] = ScoreRandom(0,5);
            Homework[i] = ScoreRandom(0,15);
            Assignment[i] = ScoreRandom(0,10);
            Midterm[i] = ScoreRandom(0,35);
            Final[i] = ScoreRandom(0,35);
            grade[i] = " ";
        }
        
        for(int i = 0 ; i < 40 ;i++){
            studen[i] = Classroom[i]+Homework[i]+Assignment[i]+Midterm[i]+Final[i];
            if(studen[i] >= 80){
                grade[i] = "A";
            }
            else if(studen[i] >= 75){
                grade[i] = "B+";
            }
            else if(studen[i] >= 70){
                grade[i] = "B";
            }
            else if(studen[i] >= 65){
                grade[i] = "C+";
            }
            else if(studen[i] >= 60){
                grade[i] = "C";
            }
            else if(studen[i] >= 55){
                grade[i] = "D+";
            }
            else if(studen[i] >= 50){
                grade[i] = "D";
            }
            else{
                grade[i] = "F";
            }
            
        }
        String result = "";
        
        result += "============================" + "\n";
        result += "=       Grade Report       =" + "\n";
        
        // Show Result
        for(int i = 0; i < 40 ; i++) {
            result += "============================" + "\n";
            result += "Student " + (i + 1) + "\n";
            result += "============================" + "\n";
            result += "Class Attendance : " + Classroom[i] + "\n";
            result += "Homework : " + Homework[i] + "\n";
            result += "Exam : " + Assignment[i] + "\n";
            result += "Mid Exam : " + Midterm[i] + "\n";
            result += "Final Exam : " + Final[i] + "\n";
            result += "Total : " + studen[i] + "\n";
            result += "Grade : " + grade[i] + "\n";
        }

        JTextArea textArea = new JTextArea(result);
        JScrollPane scrollPane = new JScrollPane(textArea);  
        textArea.setLineWrap(true);  
        textArea.setWrapStyleWord(true); 
        scrollPane.setPreferredSize( new Dimension( 500, 500 ) );
        JOptionPane.showMessageDialog(null, scrollPane, "The Grade", JOptionPane.PLAIN_MESSAGE);

    }
    public static int ScoreRandom(int min,int max) {
        int score ;
        score = (int)(Math.random() * ((max - min)+1)) + min;
        return score;
    }
}
