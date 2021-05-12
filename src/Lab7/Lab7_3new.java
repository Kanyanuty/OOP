package Lab7;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Lab7_3new implements ActionListener {
    JLabel numberLabel;
    JTextField numberField;
    JButton btn1, btn2, btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnc,btnP,btnCE,btnplus,btnminus,btnmul,btndiv,
    btnEq,btndot,btndelete,btnx,btnx2,btnroot,btnplusmi;
    JFrame window;
    int num1 = 0,num2 = 0;
    String opr = "";
    public Lab7_3new(){
        window = new JFrame("Programm Show Text");
        Container container = window.getContentPane();
        container.setLayout(new FlowLayout());
        // create numberLabel and attach it to content pane
        //numberLabel = new JLabel("Show Number : ");
        //container.add(numberLabel);
        numberField = new JTextField(20);
        // numberField.setEditable( false );
        container.add(numberField);
        btnP = new JButton(" % ");
        btnP.addActionListener(this);
        container.add(btnP);
        btnCE = new JButton(" CE ");
        btnCE.addActionListener(this);
        container.add(btnCE);
        btnc = new JButton("  C  ");
        btnc.addActionListener(this);
        container.add(btnc);
        btndelete = new JButton("  D  ");
        btndelete.addActionListener(this);
        container.add(btndelete);
        btnx = new JButton("1/x");
        btnx.addActionListener(this);
        container.add(btnx);
        btnx2 = new JButton("x^2");
        btnx2.addActionListener(this);
        container.add(btnx2);
        btnroot = new JButton("√x2");
        btnroot.addActionListener(this);
        container.add(btnroot);
        btndiv = new JButton("  / ");
        btndiv.addActionListener(this);
        container.add(btndiv);
        btn7 = new JButton("  7  ");
        btn7.addActionListener(this);
        container.add(btn7);
        btn8 = new JButton("  8  ");
        btn8.addActionListener(this);
        container.add(btn8);
        btn9 = new JButton("  9  ");
        btn9.addActionListener(this);
        container.add(btn9);
        btnmul = new JButton("  *  ");
        btnmul.addActionListener(this);
        container.add(btnmul);
        btn4 = new JButton("  4  ");
        btn4.addActionListener(this);
        container.add(btn4);
        btn5 = new JButton("  5  ");
        btn5.addActionListener(this);
        container.add(btn5);
        btn6 = new JButton("  6  ");
        btn6.addActionListener(this);
        container.add(btn6);
        btnminus = new JButton("  -  ");
        btnminus.addActionListener(this);
        container.add(btnminus);
        btn1 = new JButton("  1  ");
        btn1.addActionListener(this);
        container.add(btn1);
        btn2 = new JButton("  2  ");
        btn2.addActionListener(this);
        container.add(btn2);
        btn3 = new JButton("  3  ");
        btn3.addActionListener(this);
        container.add(btn3);
        btnplus = new JButton("  +  ");
        btnplus.addActionListener(this);
        container.add(btnplus);
        btnplusmi = new JButton(" +/- ");
        btnplusmi.addActionListener(this);
        container.add(btnplusmi);
        btn0 = new JButton("  0  ");
        btn0.addActionListener(this);
        container.add(btn0);
        btndot = new JButton("  .  ");
        btndot.addActionListener(this);
        container.add(btndot);
        btnEq = new JButton("  =  ");
        btnEq.addActionListener(this);
        container.add(btnEq);

        window.setSize(280, 260);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    } 
    public void actionPerformed(ActionEvent event) {
        String str = numberField.getText();
        if (event.getSource() == btn1) {
            str += "1";
            numberField.setText(str);
        } else if (event.getSource() == btn2) {
            str += "2";
            numberField.setText(str);
        } else if (event.getSource() == btn3) {
            str += "3";
            numberField.setText(str);
        }else if (event.getSource() == btn4) {
            str += "4";
            numberField.setText(str);
        }else if (event.getSource() == btn5) {
            str += "5";
            numberField.setText(str);
        }else if (event.getSource() == btn6) {
            str += "6";
            numberField.setText(str);
        }else if (event.getSource() == btn7) {
            str += "7";
            numberField.setText(str);
        }else if (event.getSource() == btn8) {
            str += "8";
            numberField.setText(str);
        }else if (event.getSource() == btn9) {
            str += "9";
            numberField.setText(str);
        }else if (event.getSource() == btn0) {
            str += "0";
            numberField.setText(str);
        }else if (event.getSource() == btnc) {
            numberField.setText(" ");
        }
        else if (event.getSource() == btnplus){
            num1 = num2;
            num2 = Integer.parseInt(str);
            opr = "+";
            str = "";
            numberField.setText(str);
        }
        else if(event.getSource() == btnminus){
            num1 = num2;
            num2 = Integer.parseInt(str);
            opr = "-";
            str = "";
            numberField.setText(str);
        }
        else if(event.getSource() == btnEq ){
            num1 = num2;
            num2 = Integer.parseInt(str);
            if(opr.equals("+")){
                num2 = num1 + num2;
                num1 = 0;
                opr = "";
                numberField.setText(Integer.toString(num2));
            }
            else if(opr.equals("-")){
                num2 = num1 - num2;
                num1 = 0;
                opr = "";
                numberField.setText(Integer.toString(num2));
            }
        }
    } // end method actionPerformed

    public static void main(String[] args) {
        Lab7_3new gui = new Lab7_3new();
    }
}
