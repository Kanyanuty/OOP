import javax.swing.*;
import java.awt.*;

public class RectangleJFrame extends javax.swing.JFrame {
    int x, y;
    Rectangle r;

    public RectangleJFrame() {
        super("Program Inheritance Rectangle");
        String input; // user's input
        // obtain user's choice
        input = JOptionPane.showInputDialog("Enter value x of left point : ");
        x = Integer.parseInt(input); // convert input to int
        input = JOptionPane.showInputDialog("Enter value y of left point : ");
        y = Integer.parseInt(input); // convert input to int
        int w = 10 + (int) (Math.random() * 280);
        int h = 10 + (int) (Math.random() * 180);
        r = new Rectangle(x, y, w, h);
    } // end method init

    public void paint(Graphics g) {
        super.paint(g); // call paint method inherited
        // set color
        g.setColor(Color.ORANGE);
        g.drawRect(r.getX(), r.getY(), r.getWidth(), r.getHeight());
        g.setColor(Color.BLUE);
        g.drawString("Point Left : " + r.getX() + ", " + r.getY(), r.getX(), r.getY());
        g.drawString("Width : " + r.getWidth(), r.getX(), r.getY() + 15);
        g.drawString("Height : " + r.getHeight(), r.getX(), r.getY() + 30);
        g.drawString("Area : " + r.getArea(), r.getX(), r.getY() + 45);
    } // end method paint

    public static void main(String[] args) {
        RectangleJFrame test = new RectangleJFrame();
        test.setSize(640, 480);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.setVisible(true);
    }
}
