import java.awt.*;
import javax.swing.*;

public class Thesun extends JFrame{
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.BLUE);
        g.fillRect( 0, 0, 300, 300 );

        g.setColor(Color.ORANGE);
        g.fillArc(90, 90, 120, 120, 0, 360);

        g.setColor(Color.ORANGE);
        g.drawLine(150, 50, 150, 250);

        g.setColor(Color.ORANGE);
        g.drawLine(50, 150, 250, 150);

        g.setColor(Color.ORANGE);
        g.drawLine(75, 75, 225, 225);

        g.setColor(Color.ORANGE);
        g.drawLine(75, 225, 225, 75);

    } 
    public static void main(String[] args) {
        Thesun obj = new Thesun();
        obj.setSize(300, 300);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setVisible(true);
    }
}