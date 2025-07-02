/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package bankmanagementsystem;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;

public class PinChange  extends JFrame implements ActionListener{
    JButton change , back;
    JPasswordField rpin,pin;
    String pinumber;

    PinChange (String pinumber){
        this.pinumber = pinumber;
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        JLabel text = new JLabel("CHANGE YOUR PIN");
        text.setBounds(260, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
        JLabel pintext = new JLabel("New PIN :");
        pintext.setBounds(165, 340, 180, 25);
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font("System",Font.BOLD,16));
        image.add(pintext);
        
        pin = new JPasswordField();
        pin.setFont(new Font("Raleway",Font.BOLD,16));
        pin.setBounds(330, 340, 180, 25);
        image.add(pin);
        
        JLabel repin = new JLabel("Re-Enter New PIN :");
        repin.setBounds(165, 380, 180, 25);
        repin.setForeground(Color.WHITE);
        repin.setFont(new Font("System",Font.BOLD,16));
        image.add(repin);
        
        rpin = new JPasswordField();
        rpin.setFont(new Font("Raleway",Font.BOLD,16));
        rpin.setBounds(330, 380, 180, 25);
        image.add(rpin);
        
        change = new JButton("CHANGE");
        change.setBounds(355, 485, 150, 30);
        change.addActionListener(this);
        image.add(change);
        
        back = new JButton("BACK");
        back.setBounds(355, 520, 150, 30);
        back.addActionListener(this);
        image.add(back);
        
        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == change){
        try{
            String npin = pin.getText();
            String ripin =rpin.getText();
            
            if (!npin.equals(ripin)){
                JOptionPane.showMessageDialog(null, "Enter PIN doesn't match");
                return;
            }
            if (npin.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter new PIN"); 
                return;
            }
            if (ripin.equals("")){
                JOptionPane.showMessageDialog(null, "Please re-enter new PIN"); 
                return;
            }
            Conn conn =new Conn();
            String query1 = "update bank set pin = '"+ripin+"' where pin ='"+pinumber+"'";
            String query2 = "update login set pin = '"+ripin+"' where pin ='"+pinumber+"'";
            String query3 = "update signupthree set pin = '"+ripin+"' where pin ='"+pinumber+"'";
            conn.s.executeUpdate(query1);
            conn.s.executeUpdate(query2);
            conn.s.executeUpdate(query3);
            
            JOptionPane.showMessageDialog(null, "PIN changed successfully");
            setVisible(false);
            new transaction(ripin).setVisible(true);
        
            
        }catch(Exception e){
            System.out.println(e);
        }
    }else{
           setVisible(false);
           new transaction(pinumber).setVisible(true);
        }  
    }
    
    public static void main(String args[]) {
       new PinChange("").setVisible(true);
    }
}
