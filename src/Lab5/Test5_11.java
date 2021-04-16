//99,45, 36 , 21 , 87 , 65, 34, 1,93,77
import javax.swing.*;

public class Test5_11 {
    public static void main(String[] args) {
        int[] array={99,45,36,21,87,65,34,1,93,77};
        String str;
        boolean done = true;
        //array = new int[20];
        //setData(array);
        do {
            str = JOptionPane.showInputDialog("Enter value to search :");
            int key = Integer.parseInt(str);
            int result = linearSearch(array, key);
            if (key != -1) {
                if (result != -1)
                    JOptionPane.showMessageDialog(null, "Value found in element " + result, "Linear Search",
                            JOptionPane.INFORMATION_MESSAGE);
                else
                    JOptionPane.showMessageDialog(null, "Value not found.", "Linear Search",
                            JOptionPane.INFORMATION_MESSAGE);
            } else
                done = false;
        } while (done);
    }

    /*public static void setData(int a[]) {
        for (int c = 0; c < a.length; c++)
            a[c] = rnd(1, 100);
    }*/

    public static int linearSearch(int a[], int key) {
        for (int c = 0; c < a.length; c++)
            if (a[c] == key)
                return (c);
        return (-1);
    }

    public static int rnd(int st, int ed) {
        int offset = ed - st + 1;
        return (st + (int) (Math.random() * offset));
    }
}