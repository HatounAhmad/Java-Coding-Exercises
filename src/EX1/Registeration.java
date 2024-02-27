/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX1;

import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;



/**
 *
 * @author htoun
 */
 public class Registeration extends JFrame {
     private JButton b1;
   private JLabel l1,l2,l3;
  private JTextField t1,t2,t3;
  
  public Registeration(String title){
       super(title);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
     
      l1=new JLabel("First name");
      l2=new JLabel("Last Name");
      l3=new JLabel("Exam");
      b1= new JButton("add");
      t1=new JTextField(10);
      t2=new JTextField(10);
      t3=new JTextField(10);
      JPanel p=new JPanel(new FlowLayout(FlowLayout.CENTER));
      p.add(l1);
      p.add(t1);
       JPanel p1=new JPanel(new FlowLayout(FlowLayout.CENTER));
      p1.add(l2);
      p1.add(t2);
       JPanel p2=new JPanel(new FlowLayout(FlowLayout.CENTER));
       p2.add(l3);
       p2.add(t3);
        JPanel p3=new JPanel(new FlowLayout(FlowLayout.CENTER));
        p3.add(b1);
       JPanel pn=(JPanel)this.getContentPane();
       pn.setLayout(new GridLayout(4,1));
       pn.add(p);
       pn.add(p1);
       pn.add(p2);
       pn.add(p3);
       b1.addActionListener(new action1());
       this.pack();
      this.setVisible(true);
     
       
     
 }public class action1 implements ActionListener{
  
        @Override
        public void actionPerformed(ActionEvent ae) {
             JOptionPane.showMessageDialog(null, "a new student is added"," ",JOptionPane.INFORMATION_MESSAGE);
            String fname,name,exam;
         fname=  t1.getText();
         name=t2.getText();
         exam=t3.getText();
            try {
                FileWriter f= new FileWriter("file.txt",true);
                PrintWriter file=new PrintWriter(f);
                file.println(fname+";"+name+";"+exam);
                file.close();
            } catch (IOException ex) {
                Logger.getLogger(Registeration.class.getName()).log(Level.SEVERE, null, ex);
            }
       
        
         
        }
      
  }
 
   public static void main(String []args){
       //  Registeration add=new Registeration("a");
        
           
         
      }
  
  

 
  
  
      
      
  }