package Final_6206021612148_1;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.event.*;

public class Draw_6206021612148 extends JFrame  implements ActionListener {
    private JButton TriangleBtn, StarBtn, BoxBtn, clearBtn;
    private JPanel area1, area2;
    public Draw_6206021612148() {
        super("");
        Container c = getContentPane();
        c.setLayout( new FlowLayout());
        area1 = new JPanel();
        area1.setPreferredSize(new Dimension(750, 45));
        area1.setBorder(BorderFactory.createLineBorder(Color.BLUE, 3));

        TriangleBtn = new JButton("Triangle");
        TriangleBtn.addActionListener(this);

        StarBtn = new JButton("Star");
        StarBtn.addActionListener(this);

        BoxBtn = new JButton("Box");
        BoxBtn.addActionListener(this);

        clearBtn = new JButton("Clear");
        clearBtn.addActionListener(this);
        area1.add( TriangleBtn);
        area1.add( StarBtn);
        area1.add( BoxBtn);
        area1.add( clearBtn);
        area2 = new JPanel();
        area2.setPreferredSize(new Dimension(750, 500));
        area2.setBorder(BorderFactory.createLineBorder(Color.BLUE, 3));
        c.add( area1 );
        c.add( area2 );
    }
    public void paint( Graphics g ) {
        super.paint(g);
    }
    public void clearArea(JPanel area) {
        area.paint( area.getGraphics() );
    }
    public void draw(Graphics g, int type) {
        switch(type) {
            case 1 :
                clearArea( area2 );
                g.drawLine(120, 430, 380, 80);
                g.drawString("[120,430]",120, 430);
                g.drawLine(620, 430,380 , 80);
                g.drawString("[620, 430]",620, 430);
                g.drawLine(120, 430, 620 , 430);
                g.drawString("[430,120]",380, 80);
               
                break;

            case 2 :
            clearArea( area2 );
            g.setColor(Color.BLACK);
            g.drawLine(300, 50, 450, 350);
            g.drawString("[300, 50]",300, 50);
                g.drawLine(450, 350, 100, 150);
                g.drawString("[450, 350]",450, 350);
                g.drawLine(100, 150, 500, 150);
                g.drawString("[100, 150]",100, 150);
                g.drawLine(500, 150, 150, 350);
                g.drawString("[500, 150]",500, 150);
                g.drawLine(150, 350, 300, 50);
                g.drawString("[150, 350]",150, 350);
                break;

            case 3 :
                clearArea( area2 );
                g.drawRect(100,150,200,200);
                g.drawString("[100,150]",100,150);
                g.drawRect(250,75,200,200);
                g.drawString("[250,75]",250,75);
                g.drawLine(100,150,250,75);
                g.drawLine(300,150,450,75);
                g.drawString("[450,75]",450,75);
                g.drawString("[300,150]",300,150);
                g.drawLine(100,350,250,275);
                g.drawString("[100,350]",100,350);
                g.drawString("[250,275]",250,275);
                g.drawLine(300,350,450,275);  
                g.drawString("[300,350]",300,350);
                g.drawString("[450,275]",450,275);
                break;
        }
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == TriangleBtn)
        draw( area2.getGraphics() , 1);

        else if (e.getSource() == StarBtn)
        draw( area2.getGraphics() , 2);

        else if (e.getSource() == BoxBtn)
        draw( area2.getGraphics() , 3);

        else if (e.getSource() == clearBtn)
            clearArea( area2 );
        }
     
    
    public static void main(String[] args) {
        Draw_6206021612148 window = new Draw_6206021612148();
        window.setSize( 800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
