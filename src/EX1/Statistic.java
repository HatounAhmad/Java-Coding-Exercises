/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author htoun
 */
public class Statistic extends JFrame{
    private JButton b1,b2;
    private JTextField t1,t2;
   
   
    public Statistic(String title){
       super(title);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setLocation(350, 300);
      this.setSize(300, 250);
      b1=new JButton("number of successful students");
     b2= new JButton("  number of failed stusents  ");
      t1=new JTextField(10);
       t2=new JTextField(10);
        JPanel p1=new JPanel(new FlowLayout(FlowLayout.CENTER));
       p1.add(b1);
       p1.add(t1);
         JPanel p2=new JPanel(new FlowLayout(FlowLayout.CENTER));
       p2.add(b2);
       p2.add(t2);
        JPanel pn=(JPanel)this.getContentPane();
        
        pn.add(p1,BorderLayout.NORTH);
        pn.add(p2,BorderLayout.CENTER);
        b1.addActionListener(new action1());
         b2.addActionListener(new action2());
       this.pack();
      this.setVisible(true);
    }
    public class action1 implements ActionListener{
           
        @Override
        public void actionPerformed(ActionEvent ae) {
           FileReader f;
            try {
                f = new FileReader("file.txt");
                BufferedReader rw=new BufferedReader(f);
                String line,array[];
                int sucess=0,fail=0;
                while((line=rw.readLine())!=null){
                    array=line.split(";");
                    int exam=Integer.parseInt(array[2]);
                    if(exam>=10){
                        sucess++;
                    }
                    else
                        fail++;
                }rw.close();
                String a=""+sucess;
                
                t1.setText(a);
            } catch (IOException ex) {
                Logger.getLogger(Statistic.class.getName()).log(Level.SEVERE, null, ex);
            }
       
        }
    }
     public class action2 implements ActionListener{
           
        @Override
        public void actionPerformed(ActionEvent ae) {
           FileReader f;
            try {
                f = new FileReader("file.txt");
                BufferedReader rw=new BufferedReader(f);
                String line,array[];
                int sucess=0,fail=0;
                while((line=rw.readLine())!=null){
                    array=line.split(";");
                    int exam=Integer.parseInt(array[2]);
                    if(exam>=10){
                        sucess++;
                    }
                    else
                        fail++;
                }rw.close();
                String a=""+fail;
                
                t2.setText(a);
            } catch (IOException ex) {
                Logger.getLogger(Statistic.class.getName()).log(Level.SEVERE, null, ex);
            }
       
        }
    }
     public static void main(String []args){
          Statistic s=new Statistic("page");
      
           
         
      }
}
