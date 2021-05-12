package Final_6206021612148_2;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Animation extends JFrame implements KeyListener,ActionListener{
    private int width, height;
    private JButton startBtn, stopBtn; 
    private int xMin, xMax, yMin, yMax;
    Timer swTimer;
    private JButton redBtn, greenBtn, blueBtn, blackBtn, pinkBtn, yellowBtn;
    private int x, y, size, xSpeed, ySpeed;
    private Color color;
    public Animation(){
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
        width = 480;
        height = 320;
        xMin = 1;
        xMax = 475;
        yMin = 30;
        yMax = 320;
        xSpeed = 5;
        ySpeed = 5;
        x = 240;
        y = 160;
        swTimer = new Timer(10, this);
        color = Color.BLACK;
    }
    public void keyPressed(KeyEvent event) {
        if (event.getKeyChar() == 'p')
            swTimer.start();
        else if (event.getKeyChar() == 's')
            swTimer.stop();
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
        }
    }
        public void move(){
            x = x + xSpeed;
            y = y + ySpeed;
        if (x < xMin) {
            x = xMin;
            xSpeed = -xSpeed;
        } else if (x + size > xMax) {
            x = xMax - size;
            xSpeed = -xSpeed;
        }
        if (y < yMin) {
            y = yMin;
            ySpeed = -ySpeed;
        } else if (y + size > yMax) {
            y = yMax - size;
            ySpeed = -ySpeed;
        }
        }
}
