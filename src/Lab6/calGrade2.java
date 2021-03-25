import javax.swing.JOptionPane;

public class calGrade2 extends calGrade1 
{
    public static void main(String[] args) {

        getScore();

    }
    public static void getScore() 
    {
        int score ,mid,fin ,hw , cp ;
        String s1 ,s2 ,s3 ,s4 ;
        
        s1 = JOptionPane.showInputDialog("Enter Mid score : ");
        mid= Integer.parseInt(s1);
        s2 = JOptionPane.showInputDialog("Enter Final score : ");
        fin = Integer.parseInt(s2);
        s3 = JOptionPane.showInputDialog("Enter Homework score : ");
        hw = Integer.parseInt(s3);
        s4 = JOptionPane.showInputDialog("Enter Class Paticipation score : ");
        cp= Integer.parseInt(s4);
        
        score = mid + fin + hw + cp;

        calGrade(score) ; 
    }

}



    