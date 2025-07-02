/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package bankmanagementsystem;
import javax.swing.*;
import java.awt.*;

import java.awt.event.*;


public class SignUpTwo extends JFrame  implements ActionListener {
    
   
    JTextField panTextField , AdharTextField;
    JButton next;
    JRadioButton eyes,eno,sno,syes;
    JComboBox religion, Vcategory,Occupation ,Vincome,VEdu;
    String formno;
    SignUpTwo(String formno)
    {
        this.formno = formno;
       
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        
        JLabel additionalDetails= new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);  
        
        JLabel name= new JLabel("Religion:");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100, 140, 100, 30);
        add(name); 
        
        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian","Other"};
        religion = new JComboBox(valReligion);
        religion.setFont(new Font("Raleway",Font.BOLD,14));
        religion.setBackground(Color.WHITE);
        religion.setBounds(300, 140, 400, 30);
        add(religion);
        
        JLabel category= new JLabel("Category:");
        category.setFont(new Font("Raleway",Font.BOLD,20));
        category.setBounds(100, 190, 200, 30);
        add(category);  
        
        String valCategory[] = {"General", "OBC", "SC", "ST","Other"};
        Vcategory = new JComboBox(valCategory);
        Vcategory.setFont(new Font("Raleway",Font.BOLD,14));
        Vcategory.setBackground(Color.WHITE);
        Vcategory.setBounds(300, 190, 400, 30);
        add(Vcategory);
        
               
        JLabel income= new JLabel("Income:");
        income.setFont(new Font("Raleway",Font.BOLD,20));
        income.setBounds(100, 240, 200, 30);
        add(income);  
        
        String valIncome[] = {"Null", "1,50,000", "2,50,0000", "5,00,000","10,00,000"};
        Vincome = new JComboBox(valIncome);
        Vincome.setFont(new Font("Raleway",Font.BOLD,14));
        Vincome.setBackground(Color.WHITE);
        Vincome.setBounds(300, 240, 400, 30);
        add(Vincome);        
        
        
        JLabel education= new JLabel("Educational");
        education.setFont(new Font("Raleway",Font.BOLD,20));
        education.setBounds(100, 290, 200, 30);
        add(education);
        
        JLabel qualification= new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway",Font.BOLD,20));
        qualification.setBounds(100, 315, 200, 30);
        add(qualification);  
        
        String valEdu[] = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctrate","Others"};
        VEdu = new JComboBox(valEdu);
        VEdu.setFont(new Font("Raleway",Font.BOLD,14));
        VEdu.setBackground(Color.WHITE);
        VEdu.setBounds(300, 315, 400, 30);
        add(VEdu);    
        
        
        JLabel occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway",Font.BOLD,20));
        occupation.setBounds(100, 390 , 200, 30);
        add(occupation);  
        
        
        String valOccupation[] = {"Salaried", "Self-Employed", "Businessman", "Student","Retired","Others"};
        Occupation = new JComboBox(valOccupation);
        Occupation.setFont(new Font("Raleway",Font.BOLD,14));
        Occupation.setBackground(Color.WHITE);
        Occupation.setBounds(300, 390, 100, 30);
        add(Occupation);    
        
        JLabel pan= new JLabel("PAN Number:");
        pan.setFont(new Font("Raleway",Font.BOLD,20));
        pan.setBounds(100, 440, 200, 30);
        add(pan); 
        
        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway",Font.BOLD,14));
        panTextField.setBounds(300, 440, 400, 30);
        add(panTextField);
        
        
        JLabel adhar= new JLabel("Adhar Number:");
        adhar.setFont(new Font("Raleway",Font.BOLD,20));
        adhar.setBounds(100, 490, 200, 30);
        add(adhar);
        
        AdharTextField = new JTextField();
        AdharTextField.setFont(new Font("Raleway",Font.BOLD,14));
        AdharTextField.setBounds(300, 490, 400, 30);
        add(AdharTextField);
        
        JLabel SCitizen= new JLabel("Senior Citizen:");
        SCitizen.setFont(new Font("Raleway",Font.BOLD,20));
        SCitizen.setBounds(100, 540, 200, 30);
        add(SCitizen); 
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup seniorgroup = new ButtonGroup();
        seniorgroup.add(eyes);
        seniorgroup.add(eno);
        
     
        
       
        
        JLabel EAccount= new JLabel("Existing Account:");
        EAccount.setFont(new Font("Raleway",Font.BOLD,20));
        EAccount.setBounds(100, 590, 200, 30);
        add(EAccount);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup exgroup = new ButtonGroup();
        exgroup.add(eyes);
        exgroup.add(eno);
      
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
        
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true); 
        
       
        
    }
    public void actionPerformed(ActionEvent ae){
     
        String sreligion = (String)religion.getSelectedItem();
        String scategory =  (String)Vcategory.getSelectedItem();
        String sincome = (String) Vincome.getSelectedItem();
        String seducation =(String)VEdu.getSelectedItem();
        String soccupation =(String)Occupation.getSelectedItem();
        
        String seniorcitizen = null;
        if(syes.isSelected()){
           seniorcitizen = "Yes";
        }else if(sno.isSelected()){
            seniorcitizen= "No";
        }
     
        String existingaccount = null;
        if(eyes.isSelected()){
            existingaccount  = "Yes";
        }else if(eno.isSelected()){
            existingaccount = "No";
        }
        String span= panTextField.getText();
        String sadhar = AdharTextField.getText();
        
        
        try{
             Conn c = new Conn();
             String query = "insert into signuptwo values('"+formno+"', '"+sreligion+"', '"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+sadhar+"','"+existingaccount+"','"+seniorcitizen+"')";
             c.s.executeUpdate(query);
             
            //SignUpThree OBJECT
            
            setVisible(false);
            new SignUpThree(formno).setVisible(true);
            
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    
   
    public static void main(String args[]) {
        new SignUpTwo("");
        
    }
}
