package array;

import javax.swing.JOptionPane;
public class Lab6_2 {
    public static void main(String[] args) {
        int score[] = new int[10]; // declare and allocate array
        String output = "";

        //initial value
        for(int n = 0 ; n < score.length ; n++)
            score[n] = rnd(100,500);
        for(int n = 0; n < score.length ; n++)
            output += "Score " + (n+1) + " : " +score[n] + "\n";
        output += "Minimum value is " + getMin(score) + "\n";
        output += "Maximum value is " + getMax(score) + "\n";
        output += "Average value is " + getAverage(score) + "\n";
        JOptionPane.showMessageDialog( null, output ,"Display Score in Array", JOptionPane.INFORMATION_MESSAGE );
    }
    //find Minimum value
    public static int getMin(int score[]) {
        int minValue = score[0]; 
        for(int i=1;i<score.length;i++){ 
            if(score[i] < minValue){ 
                minValue = score[i]; 
            } 
        } 
        return minValue; 
    }
    //find Maximum value
    public static int getMax(int score[]) {
        int maxValue = score[0];
        for(int i = 1 ;i <score.length;i++){
            if(score[i]>maxValue){
                maxValue = score[i];
            }
        }
        return maxValue;
    }
    //find Average 10 value
    public static int getAverage(int score[]) {
        int sum = 0,average = 0;
        for(int i=0;i<10;i++){
            sum += score[i];
        }
        average = sum/10;
        return average ;
    }
    //Random 10 Value
    public static int rnd(int st, int ed) {
        int offset = ed - st +1;
        return (st + (int) (Math.random() * offset));
    }
}
