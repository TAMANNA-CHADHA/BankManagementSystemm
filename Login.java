
package bankmanagementsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener{
    
   // we will define them gloabally so we can use it outsode the constructor
    JButton login,clear,signup;
    JTextField cardTextField;
    JPasswordField PinTextField;
    Login(){
          
        
        setTitle("AUTOMATED TELLER MACHINE");
        
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        
        Image i2= i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        //We can't pass Image from Jlabel so  we need to convert it into the  ImageIcon
        ImageIcon i3 = new ImageIcon(i2);
        
        //we can't directly put imageicon on frame that's why we have passed it's variable from jlabel
        JLabel label =new JLabel(i3);
        
        label.setBounds(70,10,100,100);
        //use add function show image on frame by  passing object of jlabel from it
        add(label);
        
        //USING JLabel we can write any content on the frame-->Major Use of JLabel
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward",Font.BOLD, 38));
        text.setBounds(200, 40,400,40);
        add(text);
        
        JLabel cardno = new JLabel("Card NO:");
        cardno.setFont(new Font("Raleway",Font.BOLD, 28));
        cardno.setBounds(120, 150,150,30);
        add(cardno);
        
        cardTextField = new JTextField();
        cardTextField.setBounds(300,150,230,30);
        cardTextField.setFont(new Font("Arial",Font.BOLD, 14));
        add(cardTextField);
        
        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway",Font.BOLD, 28));
        pin.setBounds(120, 220,250,40);
        add(pin);
        PinTextField = new  JPasswordField();
        PinTextField.setBounds(300,220,230,30);
        PinTextField.setFont(new Font("Arial",Font.BOLD, 14));

        add(PinTextField);
        
          login = new JButton("SIGN IN");
         login.setBounds(300,300,100,30);
         login.setBackground(Color.BLACK);
         login.setForeground(Color.WHITE);
         login.addActionListener(this);
         add(login);
         
         
         clear = new JButton("CLEAR");
         clear .setBounds(430,300,100,30);
         clear .setBackground(Color.BLACK);
         clear .setForeground(Color.WHITE);
         clear.addActionListener(this);
         add(clear );
         
         signup= new JButton("SIGN UP");
         signup.setBounds(300,350,230,30);
         signup.setBackground(Color.BLACK);
         signup.setForeground(Color.WHITE);
         signup.addActionListener(this);
         add(signup);
        
        //USE GETcONTENT TO GET THE ENTIRE FRAME AND THEN USING SETBACKGROUND WE CAN CHANGE IT'S COLOUR
        getContentPane().setBackground(Color.WHITE);
        //setsize define the dimensions of frame 
        setSize(800,480);
        
        //by default frame is hidden to user to mae it visible we need setvisble
        setVisible(true);
        //setloaction to set the position of frame
        setLocation(350,200);
    }
    
    //Here we have ovverridden the mehod of actionListener
    public void actionPerformed(ActionEvent ae){
        //using action event class 
        if(ae.getSource()==clear){
            cardTextField.setText("");
            PinTextField.setText("");
            
        }
        else if(ae.getSource()==login){
            Conn c = new Conn();
            String cardnumber = cardTextField.getText();
            String pinnumber = PinTextField.getText();
            String query = "select * from login where cardnumber= '"+cardnumber+"' and pin = '"+pinnumber+"'";
            try{
                ResultSet rs =c.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Transaction(pinnumber).setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or Pin");
                
            }} catch(Exception e){
                System.out.println(e);
            }
        }
        else if(ae.getSource()==signup){
            setVisible(false);
            new SignUpOne().setVisible(true);
            
        }
        
    }
    
    public static void main(String args[]){
        
        new Login();
        
    }
    
}
