package Final_6206021612148_2;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Square extends Animation{
    private int width, height;
    private Color color;
    private int x2,y2,size;
    public Square() {
        x2 = 140;
        y2 = 100;
        size = 40;
    }
    public void paint(Graphics g){
        //super.paint(g);
        g.setColor(Color.BLACK);
        g.drawRect(4, 30, 471, 285);
        g.setColor(color);
        g.fillRect(x2, y2, size, size);
    }
}
