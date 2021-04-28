import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Lab12_05 extends JFrame implements KeyListener, ActionListener {
    private int width, height;
    private JButton startBtn, stopBtn;
    private int xMin1, xMax1, yMin1, yMax1,xMin2, xMax2, yMin2, yMax2;
    private int x1, y1,x2,y2, size, xSpeed1, ySpeed1,xSpeed2, ySpeed2;
    Timer swTimer;
    private Color color;
    private JButton redBtn, greenBtn, blueBtn, blackBtn, pinkBtn, yellowBtn;

    public Lab12_05() {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        //ปุ่ม
        startBtn = new JButton("Play");
        startBtn.addActionListener(this);
        startBtn.addKeyListener(this);
        c.add(startBtn);
        stopBtn = new JButton("Stop");
        stopBtn.addActionListener(this);
        stopBtn.addKeyListener(this);
        c.add(stopBtn);
        redBtn = new JButton("Red");
        redBtn.addActionListener(this);
        redBtn.addKeyListener(this);
        c.add(redBtn);

        greenBtn = new JButton("Green");
        greenBtn.addActionListener(this);
        greenBtn.addKeyListener(this);
        c.add(greenBtn);

        blueBtn = new JButton("Blue");
        blueBtn.addActionListener(this);
        blueBtn.addKeyListener(this);
        c.add(blueBtn);

        blackBtn = new JButton("Black");
        blackBtn.addActionListener(this);
        blackBtn.addKeyListener(this);
        c.add(blackBtn);

        pinkBtn = new JButton("Pink");
        pinkBtn.addActionListener(this);
        pinkBtn.addKeyListener(this);
        c.add(pinkBtn);

        yellowBtn = new JButton("Yellow");
        yellowBtn.addActionListener(this);
        yellowBtn.addKeyListener(this);
        c.add(yellowBtn);
        //ปุ่ม
        width = 480;
        height = 320;
        xMin1 = 1;
        xMax1 = 475;
        yMin1 = 30;
        yMax1 = 320;
        xSpeed1 = 5;
        ySpeed1 = 5;
        x1 = 240;
        y1 = 160;
        

        xMin2 = 1;
        xMax2 = 475;
        yMin2 = 30;
        yMax2 = 320;
        xSpeed2 = 5;
        ySpeed2 = 5;
        x2 = 140;
        y2 = 100;
        size = 40;
        swTimer = new Timer(10, this);
        color = Color.BLUE;
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);
        g.drawRect(4, 30, 471, 285);
        g.setColor(color);
        g.fillOval(x1, y1, size, size);
        g.setColor(color);
        g.fillRect(x2, y2, size, size);
    }

    public void keyPressed(KeyEvent event) {
        if (event.getKeyChar() == 'p')
            swTimer.start();
        else if (event.getKeyChar() == 's')
            swTimer.stop();
    }

    public void keyReleased(KeyEvent event) {
    }

    public void keyTyped(KeyEvent event) {
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startBtn)
            swTimer.start();
        else if (e.getSource() == stopBtn)
            swTimer.stop();
        else if (e.getSource() == redBtn)
            color = Color.RED;
        else if (e.getSource() == greenBtn)
            color = Color.GREEN;
        else if (e.getSource() == blueBtn)
            color = Color.BLUE;
        else if (e.getSource() == blackBtn)
            color = Color.BLACK;
        else if (e.getSource() == pinkBtn)
            color = Color.PINK;
        else if (e.getSource() == yellowBtn)
            color = Color.YELLOW;
        else {
            move();
            repaint();
        }
    }

    public void move() {
        x1 = x1 + xSpeed1;
        y1 = y1 + ySpeed1;
        if (x1 < xMin1) {
            x1 = xMin1;
            xSpeed1 = -xSpeed1;
        } else if (x1 + size > xMax1) {
            x1 = xMax1 - size;
            xSpeed1 = -xSpeed1;
        }
        if (y1 < yMin1) {
            y1 = yMin1;
            ySpeed1 = -ySpeed1;
        } else if (y1 + size > yMax1) {
            y1 = yMax1 - size;
            ySpeed1 = -ySpeed1;
        }
        x2 = x2 + xSpeed2;
        y2 = y2 + ySpeed2;
        if (x2 < xMin2) {
            x2 = xMin2;
            xSpeed2 = -xSpeed2;
        } else if (x2 + size > xMax2) {
            x2 = xMax2 - size;
            xSpeed2 = -xSpeed2;
        }
        if (y2 < yMin2) {
            y2 = yMin2;
            ySpeed2 = -ySpeed2;
        } else if (y2 + size > yMax2) {
            y2 = yMax2 - size;
            ySpeed2 = -ySpeed2;
        }
    }

    public static void main(String[] args) {
        Lab12_05 window = new Lab12_05();
        window.setSize(500, 370);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
