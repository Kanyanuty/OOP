package Final_6206021612148_1;
import javax.swing.*;
import java.awt.*;
import java.awt.*;
import java.io.*;

public class Draw_6206021612148 extends JFrame implements ActionListener,MouseListener{
    private JButton trBtn, stBtn, boBtn, clearBtn;
    private Color color;

    public Draw_6206021612148() {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        trBtn = new JButton("Triangle");
        trBtn.addActionListener(this);
        c.add(trBtn);
        stBtn = new JButton("Star");
        stBtn.addActionListener(this);
        c.add(stBtn);
        boBtn = new JButton("Box");
        boBtn.addActionListener(this);
        c.add(boBtn);
        clearBtn = new JButton("Clear");
        clearBtn.addActionListener(this);
        c.add(clearBtn);
        addMouseListener(this);
    }
    public void paint(Graphics g) {
        super.paint(g);

    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == trBtn)
            color = Color.RED;
        else if (e.getSource() == stBtn)
            color = Color.GREEN;
        else if (e.getSource() == boBtn)
            color = Color.BLUE;
        else if (e.getSource() == clearBtn) {
            color = Color.BLACK;
            Graphics g = getGraphics();
            clear(g);
        }
    }
    public void clear(Graphics g) {
        repaint();
        g.setColor(this.getBackground());
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
    }
   public static void main(String[] args) {
        Draw_6206021612148 window = new Draw_6206021612148();
        window.setSize(400,400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    } 
}
