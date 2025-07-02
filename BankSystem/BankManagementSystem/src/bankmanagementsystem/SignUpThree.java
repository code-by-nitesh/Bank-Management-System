
package bankmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignUpThree extends JFrame implements ActionListener{
    
    JRadioButton R1, R2, R3, R4;
    JCheckBox C1, C2, C3, C4, C5, C6, C7;
    JButton Submit, Cancel;
    String formno;

    SignUpThree(String formno){
        this.formno= formno;
        setLayout(null);
        
        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway",Font.BOLD, 22));
        l1.setBounds(280, 40, 400, 40);
        add(l1);
        
        JLabel type = new JLabel("Account Type");
        type.setFont(new Font("Raleway",Font.BOLD, 22));
        type.setBounds(100, 140, 200, 30);
        add(type);
        
        R1 = new JRadioButton("Saving Account");
        R1.setFont(new Font("Raleway",Font.BOLD, 16));
        R1.setBackground(Color.WHITE);
        R1.setBounds(100, 180, 150, 20);
        add(R1);
        
        R2 = new JRadioButton("Fixed Deposit AccounT");
        R2.setFont(new Font("Raleway",Font.BOLD, 16));
        R2.setBackground(Color.WHITE);
        R2.setBounds(350, 180, 250, 20);
        add(R2);
        
        R3 = new JRadioButton("Current Account");
        R3.setFont(new Font("Raleway",Font.BOLD, 16));
        R3.setBackground(Color.WHITE);
        R3.setBounds(100, 220, 150, 20);
        add(R3);
        
        R4 = new JRadioButton("Recurring Deposit Account");
        R4.setFont(new Font("Raleway",Font.BOLD, 16));
        R4.setBackground(Color.WHITE);
        R4.setBounds(350, 220, 250, 20);
        add(R4);
        
        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(R1);
        groupaccount.add(R2);
        groupaccount.add(R3);
        groupaccount.add(R4);
        
        JLabel card = new JLabel("Card and Number");
        card.setFont(new Font("Raleway",Font.BOLD, 22));
        card.setBounds(100, 300, 250, 30);
        add(card);
        
        JLabel number= new JLabel("XXXX-XXXX-XXXX-4134");
        number.setFont(new Font("Raleway",Font.BOLD, 22));
        number.setBounds(330, 300, 300, 30);
        add(number);
        
        JLabel carddetail= new JLabel("Your 16 Digit Card Number");
        carddetail.setFont(new Font("Raleway",Font.BOLD, 12));
        carddetail.setBounds(100, 330, 300, 20);
        add(carddetail);
        
        
        JLabel PIN = new JLabel("PIN");
        PIN.setFont(new Font("Raleway",Font.BOLD, 22));
        PIN.setBounds(100, 370, 200, 30);
        add(PIN);
        
        JLabel passdetail= new JLabel("Your 4 Digit PIN");
        passdetail.setFont(new Font("Raleway",Font.BOLD, 12));
        passdetail.setBounds(100, 400, 300, 20);
        add(passdetail);
        
        JLabel Pnumber= new JLabel("XXXX");
        Pnumber.setFont(new Font("Raleway",Font.BOLD, 22));
        Pnumber.setBounds(330, 370, 300, 30);
        add(Pnumber);
        
        JLabel services = new JLabel("Services Required");
        services.setFont(new Font("Raleway",Font.BOLD, 22));
        services.setBounds(100, 450, 400, 30);
        add(services);
        
        C1 = new JCheckBox("ATM CARD");
        C1.setBackground(Color.WHITE);
        C1.setFont(new Font("Raleway",Font.BOLD, 16));
        C1.setBounds(100, 500, 200, 30);
        add(C1);
       
        C2 = new JCheckBox("Internet Banking");
        C2.setBackground(Color.WHITE);
        C2.setFont(new Font("Raleway",Font.BOLD, 16));
        C2.setBounds(350, 500, 200, 30);
        add(C2);
       
        C3 = new JCheckBox("Mobile Banking");
        C3.setBackground(Color.WHITE);
        C3.setFont(new Font("Raleway",Font.BOLD, 16));
        C3.setBounds(100, 550, 200, 30);
        add(C3);
        
        C4 = new JCheckBox("EMAIL & SMS Alerts");
        C4.setBackground(Color.WHITE);
        C4.setFont(new Font("Raleway",Font.BOLD, 16));
        C4.setBounds(350, 550, 200, 30);
        add(C4);
        
        C5 = new JCheckBox("Cheque Book");
        C5.setBackground(Color.WHITE);
        C5.setFont(new Font("Raleway",Font.BOLD, 16));
        C5.setBounds(100, 600, 200, 30);
        add(C5);
        
        C6 = new JCheckBox("E-Statement");
        C6.setBackground(Color.WHITE);
        C6.setFont(new Font("Raleway",Font.BOLD, 16));
        C6.setBounds(350, 600, 200, 30);
        add(C6); 
        
        C7 = new JCheckBox("I Hereby declares that the above entered details are correct to the best of my knowledge");
        C7.setBackground(Color.WHITE);
        C7.setFont(new Font("Raleway",Font.BOLD, 12));
        C7.setBounds(100, 680, 600, 30);
        add(C7);
        
        Submit = new JButton("Submit");
        Submit.setBackground(Color.BLACK);
        Submit.setForeground(Color.WHITE);
        Submit.setFont(new Font("Raleway",Font.BOLD ,14));
        Submit.setBounds(250, 720, 100, 30);
        Submit.addActionListener(this);
        add(Submit);
        
        
        Cancel = new JButton("Cancel");
        Cancel.setBackground(Color.BLACK);
        Cancel.setForeground(Color.WHITE);
        Cancel.setFont(new Font("Raleway",Font.BOLD ,14));
        Cancel.setBounds(420, 720, 100, 30);
        Cancel.addActionListener(this);
        add(Cancel);
        
        
        getContentPane().setBackground(Color.WHITE);
        
        
       
        setSize(850, 820); 
        setLocation(350, 0);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == Submit){
            String accountType = null;
            if (R1.isSelected()){
                accountType = "Saving Account";
            }else if (R2.isSelected()){
                accountType = "Fixed Deposit Account";
            }else if (R3.isSelected()){
                accountType = "Current Account";
            }
             else if (R4.isSelected()){
                accountType = "Recurring Deposit Account";
            }
            Random random = new Random();
            String cardnumber = "" + Math.abs ((random.nextLong() % 90000000L) + 5040936000000000L);
            
            String pinnumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);
            
            String facility = "";
            if(C1.isSelected()){
                facility = facility + " ATM Card";
            }else if (C2.isSelected()){
                facility = facility + " Internet Banking";
            }else if (C3.isSelected()){
                facility = facility + " Mobile Banking";
            }else if (C4.isSelected()){
                facility = facility + " EMAIL & SMS Alerts";
            }else if (C5.isSelected()){
                facility = facility + " Cheque Book";
            }else if (C6.isSelected()){
                facility = facility + " E-Statement";
            }
            
            try{
                if (accountType.equals("")){
                    JOptionPane.showMessageDialog(null, "Account Type is Required--");
                }else {
                    Conn conn = new Conn();
                    String query1 = "insert into signupthree values('"+formno+"', '"+accountType+"', '"+cardnumber+"', '"+pinnumber+"', '"+facility+"' )";
                    String query2 = "insert into login values('"+formno+"', '"+cardnumber+"', '"+pinnumber+"')";
                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);
                    
                    JOptionPane.showMessageDialog(null, "Card Number: " + cardnumber + "\n Pin:" +pinnumber);
                    setVisible(false);
                    new Deposit(pinnumber).setVisible(false);
                }
                
            }catch(Exception e) {
                System.out.println(e);
            }
            
        }else if(ae.getSource() == Cancel){
            setVisible(false);
            new Login().setVisible(true);
            
        }
    }
    public static void main(String args[]) {
       new SignUpThree("");
    }
}
 
