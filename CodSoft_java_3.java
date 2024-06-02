import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;
class balanNum{
    static int balan = 100000;
    static int Pin = 1234;
    static int accNo = 123456;
    static int count = 1;
}
public class CodSoft_java_3 {
    public static int Verified(int PIN){
        if(PIN==balanNum.Pin){
            return 1;
        }else{
            return 0;
        }
    }
    public static int verifyAccountno(int No){
        if(No==balanNum.accNo){
            return 1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args){
        LocalDate today = LocalDate.now();
        Border etchedBorder = BorderFactory.createEtchedBorder();
        //Check Balance interface
        JFrame f2 = new JFrame("Check Balance");
        f2.setSize(500,400);
        f2.setLayout(null);
        JButton back1 = new JButton("Back"); //button for going back to previous Menu interface
        back1.setBounds(185,200,100,50);
        JLabel cbLabel = new JLabel("Current Balance");
        cbLabel.setBounds(190,80,160,50);
        f2.add(cbLabel);
        JTextField cbtf = new JTextField();
        cbtf.setBounds(160,130,160,50);
        f2.add(cbtf);
        cbtf.setEditable(false); //Read only text field just show the current balance
        cbtf.setFocusable(false); //Cursor removed
        cbtf.setHorizontalAlignment(JTextField.CENTER); 
        cbtf.setBorder(etchedBorder);
        cbtf.setBackground(Color.white);

        //Deposit Amount Interface
        JFrame f3 = new JFrame("Deposit Amount");
        f3.setSize(500,400);
        f3.setLayout(null);
        JLabel deplb1 = new JLabel("Enter Amount:");
        deplb1.setBounds(90,70,160,40);
        f3.add(deplb1);
        JTextField deptf1 = new JTextField(); //Textfield for entering the amount to be depositted
        deptf1.setBounds(200,75,160,40);
        f3.add(deptf1);
        JButton depb1 = new JButton("Submit");
        depb1.setBounds(185,140,90,30);
        f3.add(depb1);
        JTextField deptf2 = new JTextField();
        deptf2.setEditable(false); //Read only text field just show the current balance
        deptf2.setFocusable(false); //Cursor removed
        deptf2.setBorder(etchedBorder);
        deptf2.setBackground(Color.white); 
        deptf2.setHorizontalAlignment(JTextField.CENTER);
        deptf2.setBounds(200,190,160,40);
        JLabel deplb2 = new JLabel("Current Balance:");
        deplb2.setBounds(90,190,160,40);
        f3.add(deplb2);
        //Setting the initital balance in the textfield
        String deptext = String.valueOf(balanNum.balan);
        deptf2.setText(deptext);
        f3.add(deptf2);
        //Action listener for submitting the amount
        depb1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int amt = Integer.parseInt(deptf1.getText());

                balanNum.balan = balanNum.balan + amt;
                JOptionPane.showMessageDialog(f3,"Dear Customer, we received a deposit of INR "+amt+" in your account on "+today);
                String amt1 = String.valueOf(balanNum.balan);
                deptf2.setText(amt1);
                deptf1.setText(String.valueOf(""));
            }
        });

        //Second interface (Menu)
        JFrame f1 = new JFrame("Menu");
        f1.setSize(500,400);
        f1.setLayout(null);
        JButton cb = new JButton("Check Balance");  //cb stands for "Check Balance"
        cb.setBounds(160,20,160,50);
        
        
        // JLabel cblb = new JLabel("Account no  has balance of INR "+balanNum.balan);
        // cblb.setBounds(160,40,270,50);
        // f2.add(cblb);
        // cblb.setVisible(false);
        // JButton cbbutton = new JButton("Show");
        // cbbutton.setBounds(160,80,90,40);
        // f2.add(cbbutton);
        // cbbutton.addActionListener(new ActionListener(){
        //     public void actionPerformed(ActionEvent e){
        //         cblb.setVisible(true);
        //     }
        // });
        // //

        //Action Listener for going to the check balance interface
        cb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f1.dispose();
                f2.setVisible(true);
                //For showing the current balance
                String text = String.valueOf(balanNum.balan);
                cbtf.setText(text);
            }
        });
    
        //Action Listener for going back from Check Balance interface to the menu interface
        back1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f2.dispose();
                f1.setVisible(true);
                // cblb.setVisible(false);
            }
        });
        f2.add(back1);
        f1.add(cb);

        //deposit
        JButton dep = new JButton("Deposit Amount"); //dep stands for Deposit
        dep.setBounds(160,80,160,50);
        dep.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
              f1.dispose();
              f3.setVisible(true);  
            }
        }); 

        f1.add(dep);
        //Button for returning back from Deposit to the menu
        JButton back2 = new JButton("Back");
        back2.setBounds(185,250,100,50);
        f3.add(back2);
        //Action listener for returning back from Deposit to the menu
        back2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f3.dispose();
                f1.setVisible(true);
            }
        });

        //withdraw 
        JButton wd = new JButton("Withdraw Amount"); //wd stands for withdraw
        wd.setBounds(160,140,160,50);
        f1.add(wd);
        JFrame f4 = new JFrame("Withdraw Amount");
        f4.setSize(500,400);
        f4.setLayout(null);
        JButton back3 = new JButton("Back");
        back3.setBounds(185,250,100,50);
        //Back button for returning back from withdraw interface to menu interface
        back3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f4.dispose();
                f1.setVisible(true);
            }
        }); 
        f4.add(back3);
        JLabel wdlb1 = new JLabel("Enter Amount:");
        wdlb1.setBounds(90,70,160,40);
        f4.add(wdlb1);
        JTextField wdtf1 = new JTextField(); //Textfield for entering the amount to be depositted
        wdtf1.setBounds(200,75,160,40);
        f4.add(wdtf1);
        JButton wdb1 = new JButton("Submit"); //need actionListener for this Button
        wdb1.setBounds(185,140,90,30);
        f4.add(wdb1);
        JTextField wdtf2 = new JTextField();
        wdtf2.setBounds(200,190,160,40);
        wdtf2.setEditable(false);
        JLabel wdlb2 = new JLabel("Current Balance:");
        wdlb2.setBounds(90,190,160,40);
        f4.add(wdlb2);
        //textfield for showing the current balance
        f4.add(wdtf2);
        wdtf2.setBorder(etchedBorder);
        wdtf2.setBackground(Color.white);
        wdtf2.setHorizontalAlignment(JTextField.CENTER);
        wdtf2.setEditable(false);
        wdtf2.setFocusable(false);
        wdb1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int wdamt = Integer.parseInt(wdtf1.getText());
                if(balanNum.balan==10000){
                    JOptionPane.showMessageDialog(f4,"Insufficient Balance");
                    wdtf1.setText(String.valueOf(""));
                }else if(wdamt>20000){
                    JOptionPane.showMessageDialog(f4,"The maximum cash withdrawal limit is INR 20,000");
                    wdtf1.setText(String.valueOf(""));
                }else{
                balanNum.balan = balanNum.balan - wdamt;
                JOptionPane.showMessageDialog(f4,"Dear Customer,your Account has been debited with INR "+wdamt+" on "+today+".\nThe Available Balance is INR "+balanNum.balan);
                wdtf2.setText(String.valueOf(balanNum.balan));
                wdtf1.setText(String.valueOf(""));
            }
            }
        });
        

        //Action listener for going from menu interface to withdraw interface
        wd.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f1.dispose();
                f4.setVisible(true);
                //Setting the initital balance in the textfield
                String wdtext = String.valueOf(balanNum.balan);
                wdtf2.setText(wdtext);
            }
        });

        //PIN change interface
        JButton ChPin = new JButton("Change PIN");
        ChPin.setBounds(160,200,160,50);
        f1.add(ChPin);
        JFrame f5 = new JFrame("Change PIN");
        f5.setSize(500,400);
        f5.setLayout(null);
        ChPin.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f1.dispose();
                f5.setVisible(true);
            }
        });
        JButton back4 = new JButton("Back");
        back4.setBounds(185,280,100,50);
        f5.add(back4);
        back4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f5.dispose();
                f1.setVisible(true);
            }
        });

        JLabel chlb1 = new JLabel("Old PIN:");
        chlb1.setBounds(150,30,60,50);
        f5.add(chlb1);
        JPasswordField chtf1 = new JPasswordField();
        chtf1.setBounds(150,66,190,30);
        chtf1.setEchoChar('*');
        JLabel info1 = new JLabel("PIN does not match");
        info1.setBounds(150,76,190,30);
        f5.add(info1);
        info1.setVisible(false);
        f5.add(chtf1);
        JLabel chlb2 = new JLabel("New PIN:");
        chlb2.setBounds(150,96,60,50);
        f5.add(chlb2);
        JPasswordField chtf2 = new JPasswordField();
        chtf2.setBounds(150,132,190,30);
        chtf2.setEchoChar('*');
        JLabel permit = new JLabel("Show PIN");
        permit.setBounds(280,96,60,50);
        f5.add(permit);
        
        permit.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                balanNum.count++;
                if(balanNum.count%2==0){
                chtf2.setEchoChar((char)(0));
                }else{
                    chtf2.setEchoChar('*');
                }
            }
        });
        JFrame f = new JFrame("ATM INTERFACE");
        f5.add(chtf2);
        JLabel chlb3 = new JLabel("Re-type PIN:");
        chlb3.setBounds(150,152,100,50);
        f5.add(chlb3);
        JPasswordField chtf3 = new JPasswordField();
        chtf3.setBounds(150,188,190,30);
        chtf3.setEchoChar('*');
        f5.add(chtf3);
        JButton chb = new JButton("Save");
        chb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                // String p1 = new String(chtf2.getPassword());
                // String p2 = new String(chtf3.getPassword());
                // JLabel info = new JLabel("PIN does not match");
                //     info.setBounds(150,200,190,30);
                //     info.setVisible(false);
                //     f5.add(info);
                // if(p1!=p2){
                //     info.setVisible(true);
                // }else{
                    String newpin = new String(chtf2.getPassword());
                    int np = Integer.parseInt(newpin);
                    balanNum.Pin = np;
                    JOptionPane.showMessageDialog(f5,"ATM PIN has been updated successfully");
                    chtf1.setText("");
                    chtf2.setText("");
                    chtf3.setText("");
                    JOptionPane.showMessageDialog(f5,"Login again");
                    f5.dispose();
                    f.setVisible(true);
                // }
                // info.setVisible(false);
            }
        });
        chb.setBounds(195,225,80,30);
        f5.add(chb);
        
        
        //Return button of menu interface
        JButton ret = new JButton("Return"); //ret stands for return
        ret.setBounds(160,260,160,50);
        f1.add(ret);
        
        //1st interface
        // JFrame f = new JFrame("ATM INTERFACE");
        JLabel l1 = new JLabel("Enter Account No:");
        l1.setBounds(100,50,160,40);
        JLabel l2 = new JLabel("Enter PIN:");
        l2.setBounds(100,100,160,40);
        JTextField tf1 = new JTextField();
        tf1.setBounds(210,50,160,40);
        JPasswordField tf2 = new JPasswordField(4);
        tf2.setBounds(210,100,160,40);
        tf2.setEchoChar('*');
        JButton b1 = new JButton("Submit"); //Submit Button
        b1.setBounds(190,180,100,40);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int pin = Integer.parseInt(tf2.getText());
                int no = Integer.parseInt(tf1.getText());
                if(Verified(pin)==1 && verifyAccountno(no)==1){
                    JOptionPane.showMessageDialog(f,"Login Successful!!");
                    f.dispose();
                    f1.setVisible(true); //Transition to the next interface
                }else{
                    JOptionPane.showMessageDialog(f,"Wrong PIN 0r Account no!!Try again");
                }
            }
        });
        JButton b2 = new JButton("Close");
        b2.setBounds(190,250,100,40);
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(f,"Thank you for using ATM INTERFACE");
                f.dispose();
            } 
        });
        f.add(l1);
        f.add(l2);
        f.add(tf1);
        f.add(tf2);
        f.add(b1);
        f.add(b2);
        f.setSize(500,400);
        f.setLayout(null);
        f.setVisible(true);
        ret.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f1.dispose();
                f.setVisible(true);
            }
        });
        f.setLocationRelativeTo(null);
        f1.setLocationRelativeTo(null);
        f2.setLocationRelativeTo(null);
        f3.setLocationRelativeTo(null);
        f4.setLocationRelativeTo(null);
        f5.setLocationRelativeTo(null);
    }
}
