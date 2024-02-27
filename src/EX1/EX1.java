/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author htoun
 */
public class EX1 extends JFrame{
  private JLabel l1;
  private JButton b1,b2;
  public EX1(String title){
      super(title);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      l1=new JLabel("welcome to the main page ");
      b1=new JButton("Registeration");
      b2= new JButton("Statistic");
      JPanel p=new JPanel(new FlowLayout(FlowLayout.CENTER));
       JPanel p1=new JPanel(new FlowLayout(FlowLayout.CENTER));
      p.add(b1);
      p.add(b2);
      JPanel p2=(JPanel)this.getContentPane();
      p2.setLayout(new GridLayout(2,1));
      p1.add(l1);
      p2.add(p1);
      p2.add(p);
      b1.addActionListener(new action1());
      b2.addActionListener(new action2());
     
              
      this.pack();
     
      this.setVisible(true);
  }
  public class action1 extends JFrame implements ActionListener{
  
        @Override
        public void actionPerformed(ActionEvent ae) {
            Registeration add=new Registeration("Registeration page");
        }
      
  }
  public class action2 extends JFrame implements ActionListener{
  
        @Override
        public void actionPerformed(ActionEvent ae) {
            Statistic add=new Statistic("Statistic page");
        }
      
  }
    public static void main(String[] args) {
      EX1 a=new EX1("main page");
    }
    
}
