package com.sm.gui;

import javax.swing.*;
import java.awt.*;

public class CalcAreaGUIMain extends JFrame {
  JTextField radiusTf1, areaTf2;
  public CalcAreaGUIMain(){
    JPanel panel = new JPanel(new GridLayout(3,2));
    getContentPane().add(panel);
    JLabel label1 = new JLabel("반 지름");
    JLabel label2 = new JLabel("결과");
    radiusTf1 = new JTextField(10);
    areaTf2 = new JTextField(10);
    JButton b1 = new JButton("");
    JButton b2 = new JButton("취소");
    
    panel.add(label1);
    panel.add(radiusTf1);
    panel.add(label2);
    panel.add(areaTf2);
    panel.add(b1);
    panel.add(b2);
    pack();
    setVisible(true);
  }
  
  public static void main(String[] args){
    CalcAreaGUIMain c = new CalcAreaGUIMain();
    c.setDefaultCloseOperation(EXIT_ON_CLOSE);   
   
  }
}
