/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package bankmanagementsystem;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class BalanceEnquiry extends JFrame  implements ActionListener{
    JButton back;
    String pinumber;
    
    BalanceEnquiry(String pinumber){
        this.pinumber = pinumber;
        setLayout(null);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        back = new JButton("BACK");
        back.setBounds(355, 520, 150, 30);
        back.addActionListener(this);
        image.add(back);
        
        Conn c =  new Conn();
         int balance = 0;
            try{
               ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinumber+"'");
              
               while(rs.next()){
                   if (rs.getString("type").equals("Deposit")){
                       balance += Integer.parseInt(rs.getString("amount"));
                   }else{
                       balance -= Integer.parseInt(rs.getString("amount"));
                   }
               }
            }catch (Exception e){
                System.out.println(e);
            }
            
            JLabel text = new JLabel("Your Current Account Baance is Rs "+ balance);
            text.setForeground(Color.WHITE);
            text.setBounds(170, 300, 400, 30);
            image.add(text);
        
        
        
        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);  
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new transaction(pinumber).setVisible(true);
        
    }
   
    public static void main(String args[]) {
       new BalanceEnquiry("");
    }
}
