import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Calci implements ActionListener{
    JFrame frame;
    JTextField screen;
    JButton ntbtn[] = new JButton[10];
    JButton btnPlus,btnMinus,btnDiv,btnMult,btnZero,btn2Zero,btnEq,btnAC,btnDel,btnDec,btnRem;
    Font f = new Font("Ink.Free",Font.BOLD,35);
    Font f1 = new Font("Ink.Free",Font.BOLD,20);
    JPanel panel;
    char opr;
    double num1,num2,result;
    
public  Calci(){
    frame = new JFrame();
    frame.setSize(400,530);
    frame.setLocationRelativeTo(null);
    frame.setTitle("CALCULATOR");
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setBackground(new Color(200,56,78));

    screen = new JTextField("0");
    screen.setBounds(25,25,335,50);
    screen.setFont(f);
    screen.setEditable(false);
    screen.setHorizontalAlignment(JTextField.RIGHT);
    frame.add(screen);

    panel = new JPanel();
    panel.setBounds(25,100,333,370);
    panel.setLayout(new GridLayout(5,4));
    frame.add(panel);

    for(int i=1;i<10;i++) {
        ntbtn[i] = new JButton(String.valueOf(i));
        panel.add(ntbtn[i]);
        ntbtn[i].setFont(f1);
        ntbtn[i].setBackground(new Color(100,23,39));
        ntbtn[i].setForeground(Color.WHITE);
        ntbtn[i].addActionListener(this);
    }
    btnPlus = new JButton("+");
    btnPlus.setFont(f1);
    btnPlus.setBackground(new Color(100,23,39));
    btnPlus.setForeground(Color.GREEN);

    btnMinus = new JButton("-");
    btnMinus.setFont(f1);
    btnMinus.setBackground(new Color(100,23,39));
    btnMinus.setForeground(Color.GREEN);

    btnDiv = new JButton("/");
    btnDiv.setFont(f1);
    btnDiv.setBackground(new Color(100,23,39));
    btnDiv.setForeground(Color.GREEN);

    btnMult = new JButton("*");
    btnMult.setFont(f1);
    btnMult.setBackground(new Color(100,23,39));
    btnMult.setForeground(Color.GREEN);

    btnZero = new JButton("0");
    btnZero.setFont(f1);
    btnZero.setBackground(new Color(100,23,39));
    btnZero.setForeground(Color.WHITE);

    btn2Zero = new JButton("00");
    btn2Zero.setFont(f1);
    btn2Zero.setBackground(new Color(100,23,39));
    btn2Zero.setForeground(Color.WHITE);

    btnDec = new JButton(".");
    btnDec.setFont(f1);
    btnDec.setBackground(new Color(100,23,39));
    btnDec.setForeground(Color.WHITE);

    btnDel = new JButton("DL");
    btnDel.setFont(f1);
    btnDel.setBackground(new Color(100,23,39));
    btnDel.setForeground(Color.GREEN);

    btnAC = new JButton("AC");
    btnAC.setFont(f1);
    btnAC.setBackground(new Color(100,23,39));
    btnAC.setForeground(Color.GREEN);

    btnEq = new JButton("=");
    btnEq.setFont(f1);
    btnEq.setBackground(new Color(100,23,39));
    btnEq.setForeground(Color.YELLOW);

    btnRem = new JButton("%");
    btnRem.setFont(f1);
    btnRem.setBackground(new Color(100,23,39));
    btnRem.setForeground(Color.GREEN);

    panel.add(btnAC);
    panel.add(btnDel);
    panel.add(btnRem);
    panel.add(btnDiv);
    panel.add(ntbtn[7]);
    panel.add(ntbtn[8]);
    panel.add(ntbtn[9]);
    panel.add(btnMult);
    panel.add(ntbtn[4]);
    panel.add(ntbtn[5]);
    panel.add(ntbtn[6]);
    panel.add(btnMinus);
    panel.add(ntbtn[1]);
    panel.add(ntbtn[2]);
    panel.add(ntbtn[3]);
    panel.add(btnPlus);
    panel.add(btn2Zero);
    panel.add(btnZero);
    panel.add(btnDec);
    panel.add(btnEq);

    btnZero.addActionListener(this);
    btn2Zero.addActionListener(this);
    btnDec.addActionListener(this);
    btnEq.addActionListener(this);
    btnPlus.addActionListener(this);
    btnMinus.addActionListener(this);
    btnMult.addActionListener(this);
    btnDiv.addActionListener(this);
    btnAC.addActionListener(this);
    btnDel.addActionListener(this);
    btnRem.addActionListener(this);


    frame.setLayout(null);
    frame.setVisible(true);
    
}

public void actionPerformed(ActionEvent e) {
    for(int i=1;i<10;i++) {
        if(e.getSource()==ntbtn[i]) {
            screen.setText(screen.getText().concat(String.valueOf(i)));
        }
    }
    if(e.getSource()==btnZero) {
        screen.setText(screen.getText().concat("0"));
    }
    if(e.getSource()==btn2Zero) {
        screen.setText(screen.getText().concat("00"));
    }
    if(e.getSource()==btnDec) {
        screen.setText(screen.getText().concat("."));
    }
    if(e.getSource()==btnEq) {
       num2=Double.parseDouble(screen.getText());
       switch (opr) {
        case '+':
            result = num1+num2;
            screen.setText(String.valueOf(result));
            break;
            case '-':
            result = num1-num2;
            screen.setText(String.valueOf(result));
            break;
            case '*':
            result = num1*num2;
            screen.setText(String.valueOf(result));
            break;
            case '/':
            result = num1/num2;
            screen.setText(String.valueOf(result));
            break;
            case '%':
            result = num1%num2;
            screen.setText(String.valueOf(result));
            break;
        default:
            break;
       }
    }
    if(e.getSource()==btnPlus) {
        num1 = Double.parseDouble(screen.getText());
        opr = '+';
        screen.setText("");
    }
    if(e.getSource()==btnMinus) {
        num1 = Double.parseDouble(screen.getText());
        opr = '-';
        screen.setText("");
    }
    if(e.getSource()==btnMult) {
        num1 = Double.parseDouble(screen.getText());
        opr = '*';
        screen.setText("");
    }
    if(e.getSource()==btnDiv) {
        num1 = Double.parseDouble(screen.getText());
        opr = '/';
        screen.setText("");
    }
    if(e.getSource()==btnAC) {
        screen.setText("");
    }
    if(e.getSource()==btnRem) {
        num1 = Double.parseDouble(screen.getText());
        opr = '%';
        screen.setText("");
    }
    if(e.getSource()==btnEq){
        num2=Double.parseDouble(screen.getName());
        switch(opr){
            case '+':
            result = num1+num2;
            screen.setText(String.valueOf(result));
            break;
            case '-':
            result = num1-num2;
            screen.setText(String.valueOf(result));
            break;
            case '*':
            result = num1*num2;
            screen.setText(String.valueOf(result));
            break;
            case '/':
            result = num1/num2;
            screen.setText(String.valueOf(result));
            break;
            case '%':
            result = num1%num2;
            screen.setText(String.valueOf(result));
            break;

        }
    }

    if(e.getSource()==btnDel) {
      String backSpace=null;
      if(screen.getText().length()>0) {
        StringBuilder str = new StringBuilder(screen.getText());
        str.deleteCharAt(screen.getText().length()-1);
        backSpace = str.toString();
        screen.setText(backSpace);
       }
     }
 }
public static void main(String[] args) {
   new Calci();


    
    
}
    
} 