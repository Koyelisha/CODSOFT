import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CodSoft_java_4 {
    public static void Converter(){
        //Frame for the currency converter
        JFrame f = new JFrame("Currency Converter");
        //Labels for Dollar and Rupees
        JLabel l1 = new JLabel("Rupees");
        l1.setBounds(20,50,60,30);
        JLabel l2 = new JLabel("Dollars");
        l2.setBounds(170,50,60,30);
        //TextFields for entering the currencies
        JTextField t1 = new JTextField("0"); //Textfield for INR
        t1.setBounds(80,50,50,30);
        JTextField t2 = new JTextField("0"); //TextField for Dollar
        t2.setBounds(240,50,60,30);
        //# buttons for INR,Dollar and close
        JButton b1 = new JButton("INR");
        b1.setBounds(50,100,80,15);
        JButton b2 = new JButton("Dollar");
        b2.setBounds(190,100,80,15);
        JButton b3 = new JButton("Close");
        b3.setBounds(150,150,80,30);
        //Action listener for converting into Dollar 
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            double d = Double.parseDouble(t1.getText());
            float d1 = (float)(d/65.25);
            String str1 = String.valueOf(d1);
            t2.setText(str1);
            }
        });
        //Action Listener for converting into Rupees
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                double d2 = Double.parseDouble(t2.getText());
                float d3 = (float)(d2*(65.25));
                String str2 = String.valueOf(d3);
                t1.setText(str2);
            }
        });
        //Action listener for closing the form
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f.dispose();
            }
        });
        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(t2);
        f.add(b1);
        f.add(b2);
        f.add(b3);
       f.setLayout(null);
        f.setSize(400,300);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        Converter();
    }
}
